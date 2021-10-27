package fr.umontpellier.iut;

import java.util.*;

/**
 * 
 */
public class livretA extends Livret {

    /**
     * Default constructor
     */
    public livretA(float solde, String iban, String nomClient, float tauxInteret, float plafond) {
        super(solde,iban,nomClient,tauxInteret);
        this.plafond=plafond;
    }

    /**
     * 
     */
    private float plafond;

    @Override
    public String toString() {
        return super.toString() + "livretA{" +
                "plafond=" + plafond +
                '}';
    }
}