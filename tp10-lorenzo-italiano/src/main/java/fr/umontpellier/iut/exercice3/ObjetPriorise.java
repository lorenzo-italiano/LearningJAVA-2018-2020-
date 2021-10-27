package fr.umontpellier.iut.exercice3;

public class ObjetPriorise<T> implements TypePriorise {
    private T t;
    private int indicePriorite;

    public ObjetPriorise(T t, int indicePriorite){
        this.t = t;
        this.indicePriorite = indicePriorite;
    }

    @Override
    public int getIndicePriorite() {
        return indicePriorite;
    }

    @Override
    public String toString() {
        return "ObjetPriorise{" +
                "objet=" + t +
                ", indicePriorite=" + indicePriorite +
                '}';
    }
}
