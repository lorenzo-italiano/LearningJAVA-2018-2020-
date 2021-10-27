package main;
import java.util.*;

public class UtilisateurCreator {

    public UtilisateurCreator() {
    }

    public Administrateur createUtilisateur(String nom, String prenom, String adressePostale, String adresseMail){
            return new AdminCreator().createAdmin(nom, prenom, adressePostale, adresseMail);
    }
    public Enseignant createUtilisateur(String type, String nom, String prenom, String adressePostale, String adresseMail,String numHarpege, String numNumem) {
        if (type.equals("Enseignant")) {
            return new EnseignantCreator().createEnseignant(nom, prenom, adressePostale, adresseMail, numHarpege, numNumem);
        }
        else return createUtilisateur(nom, prenom, adressePostale, adresseMail,numHarpege, numNumem);
    }
    public chargeCours createUtilisateur(String nom, String prenom, String adressePostale, String adresseMail,String numHarpege, String numNumem){

            return new chargeCoursCreator().createChargeCours(nom, prenom, adressePostale, adresseMail,numHarpege, numNumem);
        }

    public Etudiant createUtilisateur(String nom, String prenom, String adressePostale, String adresseMail, String numEtudiant){
        return new EtudiantCreator().createEtudiant(nom, prenom, adressePostale, adresseMail, numEtudiant);
    }
}