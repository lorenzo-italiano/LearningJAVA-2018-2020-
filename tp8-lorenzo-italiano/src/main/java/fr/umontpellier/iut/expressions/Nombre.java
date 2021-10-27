package fr.umontpellier.iut.expressions;

public class Nombre implements Expression {

    private double nombre;

    public Nombre(double valeur) {
        this.nombre = valeur;
    }

    @Override
    public double calculerValeur() {
        return nombre;
    }

    @Override
    public String toString() {
        return String.valueOf(nombre);
    }
}
