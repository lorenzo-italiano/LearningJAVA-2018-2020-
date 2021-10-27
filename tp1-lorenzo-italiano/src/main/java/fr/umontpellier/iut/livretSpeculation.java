package fr.umontpellier.iut;

import java.util.*;

/**
 * 
 */
public class livretSpeculation extends Livret {

    /**
     * Default constructor
     */
    public livretSpeculation(float solde, String iban, String nomClient, float taxe, float tauxInteret, int nbTransaction) {
        super(solde,iban,nomClient,tauxInteret);
        this.taxe=taxe;
        this.nbTransaction=nbTransaction;
    }

    /**
     * 
     */
    private float taxe;

    /**
     * 
     */
    private int nbTransaction;

    @Override
    public float getSolde() {
        return super.getSolde() - ( taxe * nbTransaction);
    }

    @Override
    public String toString() {
        return super.toString() + "livretSpeculation{" +
                "taxe=" + taxe +
                ", nbTransaction=" + nbTransaction +
                '}';
    }
}