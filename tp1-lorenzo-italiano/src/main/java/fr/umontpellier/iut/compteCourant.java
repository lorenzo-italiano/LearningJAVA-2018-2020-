package fr.umontpellier.iut;

import java.util.*;


public class compteCourant extends Compte {


    public compteCourant(float solde, String iban, String nomClient, String noInsee) {
        super(solde,iban,nomClient);
        this.noInsee=noInsee;
    }


    private String noInsee;

    @Override
    public String toString() {
        return super.toString() + "compteCourant{" +
                "noInsee='" + noInsee + '\'' +
                '}';
    }
}