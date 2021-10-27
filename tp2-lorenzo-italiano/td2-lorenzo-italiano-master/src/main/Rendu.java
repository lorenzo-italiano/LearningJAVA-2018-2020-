package main;
import java.time.LocalDate;


public class Rendu {

    public Rendu(Devoir devoirConcerne, String numEtudiant) {
        this.devoirConcerne = devoirConcerne;
        this.numEtudiant = numEtudiant;
        this.estRetard = false;
    }

    public Rendu(Devoir devoirConcerne, String numEtudiant, Fichier fichier) {
        this.devoirConcerne = devoirConcerne;
        this.numEtudiant = numEtudiant;
        this.fichier = fichier;
        estRetard();
    }

    private Devoir devoirConcerne;
    private Fichier fichier;
    private float note;
    private String avis;
    private String numEtudiant;
    private boolean estRetard;
    private Enseignant profCorrige;

    public Fichier getFichier() {
        return fichier;
    }

    public float getNote() {
        return note;
    }

    public void setFichier(Fichier fichier) {
        this.fichier = fichier;
        estRetard();
    }

    public void setProfCorrige(Enseignant profCorrige) {
        this.profCorrige = profCorrige;
    }

    public boolean estRetard(){
        this.estRetard = LocalDate.now().isAfter(devoirConcerne.getDeadline());
        return estRetard;
    }
    public void setNote(float note) {
        this.note = note;
    }

    public void setAvis(String avis) {
        this.avis = avis;
    }

    @Override
    public String toString() {
        return "Rendu{" +
                "devoirConcerne=" + devoirConcerne +
                ", fichier=" + fichier +
                ", note=" + note +
                ", avis='" + avis + '\'' +
                ", numEtudiant='" + numEtudiant + '\'' +
                ", estRetard=" + estRetard +
                '}';
    }
}