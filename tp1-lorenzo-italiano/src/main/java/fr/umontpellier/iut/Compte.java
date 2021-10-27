package fr.umontpellier.iut;

import java.util.*;

public abstract class Compte {

    public Compte(float solde, String iban, String nomClient) {
        this.solde = solde;
        this.iban=iban;
        this.nomClient=nomClient;
    }

    private float plafondDecouvert;

    private float solde;

    private String iban;

    private String nomClient;

    public void setNom(String nomClient) {
        this.nomClient=nomClient;
    }

    public float getSolde() {
        return this.solde;
    }

    public void setPlafondDecouvert(float plafondDecouvert) {
        this.plafondDecouvert = plafondDecouvert;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "solde=" + solde +
                ", iban='" + iban + '\'' +
                ", nomClient='" + nomClient + '\'' +
                ", plafondDecouvert=" + plafondDecouvert + "}";
    }
}