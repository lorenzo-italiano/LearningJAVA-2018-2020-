package main;
import java.util.ArrayList;

public class Cours {


    public Cours(chargeCours chargeCours, Fichier documentCours) {
        this.chargeCours = chargeCours;
        this.listeEnseigants = new ArrayList<>();
        this.documentCours = documentCours;
    }

    private chargeCours chargeCours;
    private ArrayList<Enseignant> listeEnseigants;
    private Fichier documentCours;

    public chargeCours getChargeCours() {
        return chargeCours;
    }

    public ArrayList<Enseignant> getListeEnseigants() {
        return listeEnseigants;
    }

    public Fichier getDocumentCours(){return documentCours;}

    public void setChargeCours(main.chargeCours chargeCours) {
        this.chargeCours = chargeCours;
    }
}