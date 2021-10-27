package fr.umontpellier.iut;

import java.util.*;


public class livretEpargne extends Livret {


    public livretEpargne(float solde, String iban, String nomClient, float tauxInteret, float tauxImposition) {
        super(solde,iban,nomClient,tauxInteret);
        this.tauxImposition=tauxImposition;
    }

    /**
     * 
     */
    private float tauxImposition;

    @Override
    public float getSolde() {
        return super.getSolde() - (super.getSolde() * tauxImposition);
    }

    @Override
    public String toString() {
        return super.toString() + "livretEpargne{" +
                "tauxImposition=" + tauxImposition +
                '}';
    }
}