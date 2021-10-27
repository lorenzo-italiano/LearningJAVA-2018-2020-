package fr.umontpellier.iut.exercice1;

public class PersonnePriorisee implements TypePriorise {
    private Personne personne;
    private int indicePriorite;

    public PersonnePriorisee(Personne personne, int indicePriorite){
        this.personne = personne;
        this.indicePriorite = indicePriorite;
    }

    @Override
    public int getIndicePriorite() {
        return indicePriorite;
    }

    @Override
    public String toString() {
        return "PersonnePriorisee{" +
                "personne=" + personne +
                ", indicePriorite=" + indicePriorite +
                '}';
    }
}
