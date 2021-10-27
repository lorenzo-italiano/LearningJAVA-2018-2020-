package fr.umontpellier.iut.partie2;

public class AppJeuxPuzzle {
    public static void main(String[] args) {
        Hanoi n = new Hanoi(3);
        Contexte p = new Contexte(n);
        p.resoudre();
        System.out.println(p.getSolution());
    }
}
