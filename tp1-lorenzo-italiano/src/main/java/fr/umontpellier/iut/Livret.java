package fr.umontpellier.iut;

import java.util.*;

/**
 * 
 */
public abstract class Livret extends Compte {

    /**
     * Default constructor
     */
    public Livret(float solde, String iban, String nomClient,float tauxInteret) {
        super(solde,iban,nomClient);
        this.tauxInteret=tauxInteret;
    }

    /**
     * 
     */
    private float tauxInteret;


    /**
     * 
     */
    public float getSolde() {
        return super.getSolde() + (super.getSolde() * tauxInteret);
    }

    @Override
    public String toString() {
        return super.toString() + "Livret{" +
                "tauxInteret=" + tauxInteret +
                '}';
    }
}