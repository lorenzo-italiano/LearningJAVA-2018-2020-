package fr.umontpellier.iut;

public class Employe {
    private String nrINSEE;
    private String nom;
    protected int echelon;
    protected double base;
    private double nbHeures;
    private double SalaireBrut;
    private double SalaireNet;
    protected double bonus;

    public Employe(){}

    public Employe(String nrINSEE, String nom, int echelon, double base, double nbHeures) {
        this.nrINSEE = nrINSEE;
        this.nom = nom;
        this.echelon = echelon;
        this.base = base;
        this.nbHeures = nbHeures;
        this.SalaireBrut = base * nbHeures;
        this.SalaireNet = SalaireBrut * 0.8;
        this.bonus = 0.0;
    }

    public double getSalaireBrut() {
        return this.SalaireBrut+bonus;
    }


    public double getSalaireNet() {
        this.SalaireNet = this.SalaireBrut * 0.8;
        return this.SalaireNet;
    }

    public void setSalaireBrut(double nouveaumontant) {
        this.SalaireBrut = nouveaumontant;
    }

    public void setSalaireBrut(float multiplicateur) {
        this.SalaireBrut *= multiplicateur;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nrINSEE='" + nrINSEE + '\'' +
                ", nom='" + nom + '\'' +
                ", echelon=" + echelon +
                ", base=" + base +
                ", nbHeures=" + nbHeures +
                ", SalaireBrut=" + SalaireBrut +
                ", SalaireNet=" + SalaireNet +
                '}';
    }
}
