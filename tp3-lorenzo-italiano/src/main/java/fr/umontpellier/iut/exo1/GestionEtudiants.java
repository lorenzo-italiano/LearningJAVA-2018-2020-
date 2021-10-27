package fr.umontpellier.iut.exo1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GestionEtudiants {
    public static void main(String[] args) {
        LocalDate naissancelolo = LocalDate.of(2001, Month.SEPTEMBER, 21);
        LocalDate naissanceloan = LocalDate.of(2001, Month.DECEMBER, 10);
        LocalDate naissanceenzo = LocalDate.of(2001, Month.MARCH, 22);
        Etudiant lolo = new Etudiant("Poujol", "Maxime", naissancelolo,"maxoupepette@gmail.com","Prades");
        Etudiant toto = lolo;
        Etudiant loan = new Etudiant("Matarise", "Loan", naissanceloan,"loanmata58@gmail.com","Montpellier");
        Etudiant enzo = new Etudiant("Dardaillon", "Enzo", naissanceenzo,"enz.dard@gmail.com","Castelneau");
        ArrayList listetudiant = new ArrayList<Etudiant>();
        Departement monDepInfo = new Departement("Informatique", "Batiment K IUT", listetudiant);
        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(loan);
        monDepInfo.inscrire(enzo);
        monDepInfo.desinscrire(lolo);
        System.out.println(monDepInfo);
    }
}
