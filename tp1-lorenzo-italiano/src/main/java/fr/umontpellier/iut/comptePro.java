package fr.umontpellier.iut;

import java.util.*;

/**
 * 
 */
public class comptePro extends Compte {

    /**
     * Default constructor
     */
    public comptePro(float solde, String iban, String nomClient, String siren) {
        super(solde,iban,nomClient);
        this.siren=siren;
    }

    /**
     * 
     */
    private String siren;

    @Override
    public String toString() {
        return super.toString() + "comptePro{" +
                "siren='" + siren + '\'' +
                '}';
    }
}