package main;
import java.util.*;

/**
 * 
 */
public class Etudiant extends Utilisateur {


    public Etudiant(String nom, String prenom, String adressePostale, String adresseMail, String numEtudiant) {
        super(nom, prenom, adressePostale, adresseMail);
        this.numEtudiant = numEtudiant;
        this.coursSuivi = new ArrayList<>();
    }

    private String numEtudiant;
    private ArrayList<Cours> coursSuivi;


    public String getNumEtudiant() {
        return numEtudiant;
    }

    public ArrayList<Cours> getCoursSuivi() {
        return coursSuivi;
    }

    public void suivreCours(Cours c) {
        this.coursSuivi.add(c);
    }

    public Rendu creerRendu(Devoir d) {
        return new Rendu(d,this.numEtudiant);
    }


    public void uploadFichier(Rendu r,Fichier fichier) {
        r.setFichier(fichier);
    }


    public Rendu creerRendu(Devoir d, Fichier f) {
        return new Rendu(d,this.numEtudiant,f);
    }

}