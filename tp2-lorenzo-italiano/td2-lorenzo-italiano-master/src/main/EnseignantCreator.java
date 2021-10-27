package main;
import java.util.*;

/**
 * 
 */
public class EnseignantCreator extends UtilisateurCreator {

    public EnseignantCreator() {
    }

    public Enseignant createEnseignant(String nom, String prenom, String adressePostale, String adresseMail,String numHarpege, String numNumem){
        return new Enseignant(nom, prenom, adressePostale, adresseMail, numHarpege, numNumem);
    }

}