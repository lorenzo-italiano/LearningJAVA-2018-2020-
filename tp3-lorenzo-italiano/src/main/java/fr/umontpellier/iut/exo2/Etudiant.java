package fr.umontpellier.iut.exo2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Etudiant {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private String adresseMail;
    private String adressePostale;
    private ArrayList<Note> listenotes;

    public Etudiant(String nom, String prenom, LocalDate dateNaissance, String adresseMail, String adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresseMail = adresseMail;
        this.adressePostale = adressePostale;
        listenotes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void noter(Matiere matiere, float note){
        listenotes.add(new Note(matiere, note));
    }

    public float calculerMoyenne(){
        float moyenne = 0;
        float coef = 0;
        for (int i=0; i < listenotes.size(); i++) {
            moyenne += listenotes.get(i).getMatiere().getCoeficient() * listenotes.get(i).getNote();
            coef += listenotes.get(i).getMatiere().getCoeficient();
        }
        if(coef==0){
            coef = 1;
        }
        return moyenne / coef;
    }

    public void setListenotes(ArrayList<Note> listenotes) {
        this.listenotes = listenotes;
    }

    public String toString(){
        return "L'Etudiant " + nom + " " + prenom + "est ne(e) " + dateNaissance + "reside a " + adressePostale +
                "et son adresse mail est" + adresseMail;
    }

}
