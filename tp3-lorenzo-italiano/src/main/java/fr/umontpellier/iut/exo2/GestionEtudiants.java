package fr.umontpellier.iut.exo2;

import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiants {
    public static void main(String[] args){
        LocalDate n = LocalDate.of(2001, Month.SEPTEMBER, 21);
        Etudiant etu = new Etudiant("oui", "oui", n, "j", "i");
        Professeur prof = new Professeur("m","n");
        Matiere a = new Matiere("a",2, prof);
        System.out.println(etu.calculerMoyenne());
        etu.noter(a, 12.0f);
    }
}
