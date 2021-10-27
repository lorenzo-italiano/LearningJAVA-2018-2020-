package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Produit {
    private String numeroproduit;
    private String description;
    private float prixcourant;
    private LocalDate datedebutenchere;
    private LocalTime heuredebutenchere;
    private LocalDate datefinenchere;
    private LocalTime heurefinenchere;
    private static float pasenchere;
    private float coutparticipation;
    private ArrayList<OffreEnchere> listeoffres;

    public Produit(String numeroproduit, String description, float prixcourant, float coutparticipation) {
        this.numeroproduit = numeroproduit;
        this.description = description;
        this.prixcourant = prixcourant;
        this.coutparticipation = coutparticipation;
        this.listeoffres = new ArrayList<>();
    }

    public float getCoutparticipation() {
        return coutparticipation;
    }

    public static void setPasenchere(float pasenchere) {
        Produit.pasenchere = pasenchere;
    }

    public void demarrerEnchere(){
        this.datedebutenchere = LocalDate.now();
        this.heuredebutenchere = LocalTime.now();
    }

    public void arreterEnchere(){
        this.datefinenchere = LocalDate.now();
        this.heurefinenchere = LocalTime.now();
    }

    public void ajouterOffre(OffreEnchere offreenchere){
        if(listeoffres.size() == 0 && offreenchere.getPrixcourrant() >= prixcourant && this == offreenchere.getProduit() && offreenchere.getPrixmax() >= offreenchere.getPrixcourrant()){
            listeoffres.add(offreenchere);
            prixcourant = offreenchere.getPrixcourrant();
        }
        else if(datefinenchere.isBefore(LocalDate.now()) && datedebutenchere.isAfter(LocalDate.now())  && this == offreenchere.getProduit()
                && listeoffres.get(listeoffres.size()-1).getPrixcourrant() + pasenchere < offreenchere.getPrixcourrant() && offreenchere.getPrixmax() >= offreenchere.getPrixcourrant()){
            listeoffres.add(offreenchere);
            prixcourant = offreenchere.getPrixcourrant();
        }
    }

    public void getGagnant(){
        System.out.println("l'enchere gagnante est celle de :" + listeoffres.get(listeoffres.size()-1).getCompte().getPseudo());
    }

    @Override
    public String toString() {
        return "Produit{" +
                "numeroproduit='" + numeroproduit + '\'' +
                ", description='" + description + '\'' +
                ", prixcourant=" + prixcourant +
                ", datedebutenchere=" + datedebutenchere +
                ", heuredebutenchere=" + heuredebutenchere +
                ", datefinenchere=" + datefinenchere +
                ", heurefinenchere=" + heurefinenchere +
                ", coutparticipation=" + coutparticipation +
                '}';
    }
}
