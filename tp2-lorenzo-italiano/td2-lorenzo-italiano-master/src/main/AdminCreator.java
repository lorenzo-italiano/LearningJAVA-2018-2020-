package main;
import java.util.*;

/**
 * 
 */
public class AdminCreator extends UtilisateurCreator {


    public AdminCreator() {
    }

    public Administrateur createAdmin(String nom, String prenom, String adressePostale, String adresseMail){
        return new Administrateur(nom, prenom, adressePostale, adresseMail);
    }
}