package main;
import java.time.LocalDate;
import java.util.*;

public class Enseignant extends Utilisateur {


    public Enseignant(String nom, String prenom, String adressePostale, String adresseMail,String numHarpege, String numNumem) {
        super(nom, prenom, adressePostale, adresseMail);
        this.numHarpege = numHarpege;
        this.numNumem = numNumem;
    }

    private String numHarpege;
    private String numNumem;


    public Devoir creerDevoir(String nom, String desc, LocalDate deadline, float nbpoints, float malus, Fichier documentDevoir) {
        return new Devoir(nom,desc,deadline,nbpoints,malus,documentDevoir);
    }

    public void attribuerNote(Rendu r, float note) {
        r.setNote(note);
    }

    public void attribuerAvis(Rendu r, String avis) {
        r.setAvis(avis);
    }

    public String getNumHarpege() {
        return numHarpege;
    }

    public String getNumNumem() {
        return numNumem;
    }
}