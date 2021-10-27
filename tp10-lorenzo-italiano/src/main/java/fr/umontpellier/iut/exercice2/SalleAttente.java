package fr.umontpellier.iut.exercice2;

public class SalleAttente {
    private FilePriorite filePriorite;

    public SalleAttente(){
        this.filePriorite = new FilePriorite();
    }

    public void entrer(Personne p, int priorite){
        PersonnePriorisee personnePriorisee = new PersonnePriorisee(p,priorite);
        filePriorite.ajouter(personnePriorisee);
    }

    public String sortir(){
        return filePriorite.enlever().toString();
    }

    public FilePriorite getFilePriorite() {
        return filePriorite;
    }
}
