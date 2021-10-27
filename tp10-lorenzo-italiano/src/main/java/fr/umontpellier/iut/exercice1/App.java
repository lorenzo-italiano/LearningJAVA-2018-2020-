package fr.umontpellier.iut.exercice1;

public class App {
    public static void main(String[] args) {
        SalleAttente salle = new SalleAttente();
        Personne p1 = new Personne("p1");
        Personne p2 = new Personne("p2");
        salle.entrer(p1,4);
        salle.entrer(p2,3);
        System.out.println(salle.sortir() + " est sorti");
        System.out.println(salle.sortir() + " est sorti");
    }
}
