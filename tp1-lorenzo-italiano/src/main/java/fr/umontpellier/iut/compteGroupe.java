package fr.umontpellier.iut;

import java.util.ArrayList;

public class compteGroupe extends Compte {

    public compteGroupe(String iban, String nomClient, float prixPlafond) {
        super(0, iban, nomClient);
        this.prixPlafond = prixPlafond;
        this.comptes = new ArrayList<>();
    }

    private ArrayList<Compte> comptes;

    private float prixPlafond;

    public void ajouterCompte(Compte compte){
        comptes.add(compte);
    }
    @Override
    public float getSolde() {
        float solde=0;
        for (Compte compte:comptes) {
            solde+=compte.getSolde();
        }
        return solde;
    }

    @Override
    public String toString() {
        String string = "compteGroupe{" +
                "prixPlafond=" + prixPlafond +
                ", solde " + getSolde() + "\n" + "informations sur les comptes : ";
        for (Compte c: comptes) {
            string += "\n" + c.toString();
        }
        string+= '}';
        return string;
    }
}
