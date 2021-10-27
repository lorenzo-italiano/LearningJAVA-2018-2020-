package main;
import java.util.*;

public class Utilisateur {

    public Utilisateur(String nom, String prenom, String adressePostale, String adresseMail) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
        this.adresseMail = adresseMail;

    }

    private String nom;
    private String prenom;
    private String adressePostale;
    private String adresseMail;


    public void telechargerDevoir(Devoir d) {
        System.out.println(d.getDocumentDevoir());
    }


    public String getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public void consulterRendu(Rendu r) {
        System.out.println(r.toString());
    }


    public void afficherCours(Cours c) {
        System.out.println(c.getDocumentCours().toString());
    }


    public void afficherPointsObtenus(Rendu r) {
        System.out.println(r.getNote());
    }

}