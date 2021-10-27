package main;
import java.util.*;

public class chargeCours extends Enseignant {

    public chargeCours(String nom, String prenom, String adressePostale, String adresseMail, String numHarpege, String numNumem) {
        super(nom, prenom, adressePostale, adresseMail, numHarpege, numNumem);
        this.numNumem = numNumem;
        this.numHarpege = numHarpege;
    }

    private String numNumem;
    private String numHarpege;


    public void affecterCour(Cours c, Enseignant e) {
        c.getListeEnseigants().add(e);
    }


    public void desaffecterProf(Cours c, Enseignant e) {
        c.getListeEnseigants().remove(e);
    }


    public certificatParticipation delivrerCertificat(float points, String appreciation, String numEtud) {
        certificatParticipation c = new certificatParticipation(points,appreciation,numEtud);
        c.Delivrer();
        return c;
    }


    public void assignerCorrection(Rendu r,Enseignant E) {
        r.setProfCorrige(E);
    }

}