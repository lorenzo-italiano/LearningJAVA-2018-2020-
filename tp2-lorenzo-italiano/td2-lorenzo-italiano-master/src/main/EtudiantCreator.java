package main;
import java.util.*;

/**
 * 
 */
public class EtudiantCreator extends UtilisateurCreator {


    public EtudiantCreator() {
    }

    public Etudiant createEtudiant(String nom, String prenom, String adressePostale, String adresseMail, String numEtudiant){
        return new Etudiant(nom, prenom, adressePostale, adresseMail, numEtudiant);
    }

}