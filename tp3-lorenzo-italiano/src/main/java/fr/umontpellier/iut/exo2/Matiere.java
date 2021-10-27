package fr.umontpellier.iut.exo2;

public class Matiere {
     private String intitule;
     private float coeficient;
     private Professeur professeurresponsable;

    public Matiere(String intitule, float coeficient, Professeur professeurresponsable) {
        this.intitule = intitule;
        this.coeficient = coeficient;
        this.professeurresponsable = professeurresponsable;
    }

    public float getCoeficient() {
        return coeficient;
    }
}
