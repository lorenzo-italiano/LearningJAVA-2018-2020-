package main;
import java.time.LocalDate;
import java.util.*;

public class Devoir {


    public Devoir(String nomDevoir, String description, LocalDate deadline, float nbPoints, float malusRendu, Fichier documentDevoir) {
        this.nomDevoir = nomDevoir;
        this.description = description;
        this.deadline = deadline;
        this.nbPoints = nbPoints;
        this.estpublie = false;
        this.malusRendu = malusRendu;
        this.documentDevoir = documentDevoir;
    }


    private String nomDevoir;
    private String description;
    private LocalDate deadline;
    private float nbPoints;
    private boolean estpublie;
    private float malusRendu;
    private Fichier documentDevoir;

    public LocalDate getDeadline() {
        return deadline;
    }

    public float getMalusRendu() {
        return malusRendu;
    }

    public void publier() {
        if(estpublie){
            System.out.println("Ce devoir est déjà publié");
        }
        else{
            this.estpublie = true;
        }
    }

    public Fichier getDocumentDevoir(){
        return documentDevoir;
    }

}