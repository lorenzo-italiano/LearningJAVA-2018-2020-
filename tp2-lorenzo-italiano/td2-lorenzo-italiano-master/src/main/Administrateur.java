package main;
import java.util.*;


public class Administrateur extends Utilisateur {
    private static ArrayList<Cours> listecours;
    static{
        listecours = new ArrayList<>();
    }
    public Administrateur(String nom, String prenom, String adressePostale, String adresseMail) {
        super(nom, prenom, adressePostale, adresseMail);
    }

    public Cours creerCours(chargeCours c, Fichier fichier) {
        Cours nouveau = new Cours(c, fichier);
        listecours.add(nouveau);
        return nouveau;
    }


    public void supprimerCours(Cours c) {
        listecours.remove(c);
    }

    public static ArrayList<Cours> getListecours() {
        return listecours;
    }
}