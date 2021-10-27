package fr.umontpellier.iut;

import java.util.ArrayList;

public class Compte {
    private String pseudo;
    private String email;
    private String adresse;
    private float soldecompte;
    private ArrayList<OffreEnchere> listeoffres;

    public Compte(String pseudo, String email, String adresse, float soldecompte) {
        this.pseudo = pseudo;
        this.email = email;
        this.adresse = adresse;
        this.soldecompte = soldecompte;
        this.listeoffres = new ArrayList<>();
    }

    public String getPseudo() {
        return pseudo;
    }

    public void crediter(float sommeacrediter){
        this.soldecompte += sommeacrediter;
    }

    public void creerOffre(Produit produit, float prixcourant, float prixmax, Compte compte){
        listeoffres.add(new OffreEnchere(produit, prixcourant, prixmax, this));
        soldecompte -= produit.getCoutparticipation();
    }

    @Override
    public String toString() {
        return "Compte{" +
                "pseudo='" + pseudo + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", soldecompte=" + soldecompte +
                '}';
    }
}
