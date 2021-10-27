package fr.umontpellier.iut;

import java.util.Scanner;

public class IBaille {
    public static void main(String[] args) {

        Produit table = new Produit("1","tres pratique pour poser des trucs", 120, 10);
        Compte c1 = new Compte("bibi", "bibi@bibi.com", "1 rue", 1000f);
        Compte c2 = new Compte("baba", "baba@bibi.com", "2 rue", 2000f);
        Compte c3 = new Compte("bobo", "bobo@bibi.com", "3 rue", 1500f);

        Scanner saisie = new Scanner(System.in);
        System.out.println("Veuillez écrire quelque chose :");

        Scanner saisie2 = new Scanner(System.in);
        System.out.println("Veuillez écrire quelque chose :");

        c1.creerOffre(table, saisie, saisie2, );

        // on attache un objet Scanner au flux d'entrée associée à la console
        Scanner saisie = new Scanner(System.in);
        System.out.println("Veuillez écrire quelque chose :");

        // récupération de la chaîne de caractères saisie par l'utilisateur
        String reponse = saisie.next();

        // récupération de la chaîne de caractères saisie par l'utilisateur sous forme d'un nombre entier
        int entier = saisie.nextInt();



        }
    }
