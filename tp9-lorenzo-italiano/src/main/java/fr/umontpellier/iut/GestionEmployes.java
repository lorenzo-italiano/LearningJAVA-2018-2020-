package fr.umontpellier.iut;

import java.time.LocalDate;

public class GestionEmployes {

    public static void main(String[] args) {
        Entreprise microsoft = new Entreprise();
        System.out.println(microsoft.toString());
        Employe Enzo = new Employe("1200","Dardaillon", 2500);
        microsoft.embaucher(Enzo, LocalDate.now());
        System.out.println(microsoft.toString());
        Employe Lorenzo = new Employe("1300","Italiano", 2500);
        microsoft.embaucher(Lorenzo, LocalDate.now());
        System.out.println(microsoft.toString());
    }

}
