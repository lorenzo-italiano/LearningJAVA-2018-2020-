package fr.umontpellier.iut.exercice3;

public class SalleAttenteGenerique<T> {
    private FilePriorite filePriorite;

    public SalleAttenteGenerique(){
        this.filePriorite = new FilePriorite();
    }

    public void entrer(T t, int priorite){
        ObjetPriorise<T> objetPriorise = new ObjetPriorise<>(t,priorite);
        filePriorite.ajouter(objetPriorise);
    }

    public String sortir(){
        return filePriorite.enlever().toString();
    }

    public FilePriorite getFilePriorite() {
        return filePriorite;
    }
}
