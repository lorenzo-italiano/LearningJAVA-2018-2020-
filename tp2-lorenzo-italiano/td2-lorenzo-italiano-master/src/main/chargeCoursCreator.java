package main;
import java.util.*;

public class chargeCoursCreator extends UtilisateurCreator{

    public chargeCoursCreator() {
    }

    public chargeCours createChargeCours(String nom, String prenom, String adressePostale, String adresseMail,String numHarpege, String numNumem){
        return new chargeCours(nom, prenom, adressePostale, adresseMail, numHarpege,numNumem);
    }

}