package fr.umontpellier.iut;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Employe implements Comparable<Employe>{
    private String nrINSEE;
    private String nom;
    private double base;

    private LocalDate dateEmbauche;

    private double bonus; // pour exo3

    private String adresse; // pour exo4

    public Employe(String nrINSEE, String nom, double base) {
        this.nrINSEE = nrINSEE;
        this.nom = nom;
        this.base = base;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public double getIndemniteTransport() {
        return GestionDistances.getDistance(adresse)*base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return nrINSEE.equals(employe.nrINSEE) &&
                nom.equals(employe.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrINSEE, nom);
    }

    @Override
    public int compareTo(Employe employe) {
        if(nom.compareTo(employe.nom)==0){
            return -nrINSEE.compareTo(employe.nrINSEE);
        }
        else{
            return nom.compareTo(employe.nom);
        }
    }

    public int getMoisAnciennete(){
        long nbMois = ChronoUnit.MONTHS.between(this.dateEmbauche, LocalDate.now());
        return Math.toIntExact(nbMois);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nrINSEE='" + nrINSEE + '\'' +
                ", nom='" + nom + '\'' +
                ", base=" + base +
                ", dateEmbauche=" + dateEmbauche +
                "son bonus est" + bonus +"}\n";
        }
    }

