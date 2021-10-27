package fr.umontpellier.iut.exercice2;

public class Personne {
    private String nom;

    public Personne(String s) {
        nom = s;
    }

    @Override
    public String toString() {
        return nom;
    }
}