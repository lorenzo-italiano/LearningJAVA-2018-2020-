package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class OffreEnchere {
    private LocalDate dateenchere;
    private LocalTime heureenchere;
    private float prixcourrant;
    private float prixmax;
    private Produit produit;
    private Compte compte;

    public OffreEnchere(Produit produit, float prixcourrant, float prixmax, Compte compte) {
        this.prixcourrant = prixcourrant;
        this.prixmax = prixmax;
        this.produit = produit;
        this.dateenchere = LocalDate.now();
        this.heureenchere = LocalTime.now();
        this.compte = compte;
    }

    public Compte getCompte() {
        return compte;
    }

    public float getPrixcourrant() {
        return prixcourrant;
    }

    public float getPrixmax() {
        return prixmax;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setPrixcourrant(float prixcourrant) {
        this.prixcourrant = prixcourrant;
    }

    @Override
    public String toString() {
        return "OffreEnchere{" +
                "dateenchere=" + dateenchere +
                ", heureenchere=" + heureenchere +
                ", prixcourrant=" + prixcourrant +
                ", prixmax=" + prixmax +
                ", produit=" + produit +
                '}';
    }
}
