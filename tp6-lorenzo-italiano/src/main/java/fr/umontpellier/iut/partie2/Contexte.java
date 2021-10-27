package fr.umontpellier.iut.partie2;

import java.util.ArrayList;

@SuppressWarnings("Duplicates")

public class Contexte<T extends JeuPuzzle<T>>{

    private T jeuInitial;
    private ArrayList<JeuPuzzle<T>> solution;

    public Contexte(T jeuInitial) {
        this.jeuInitial = jeuInitial;
        solution = new ArrayList<>();
    }

    public void resoudre() {
        Couple<T> racine = new Couple<T>(jeuInitial, null);
        ArrayList<Couple<T>> frontiere = new ArrayList<>();
        ArrayList<JeuPuzzle<T>> dejaVus = new ArrayList<>();
        racine.mettreAJour(frontiere,dejaVus);
        while(frontiere.size() > 0){
            racine.mettreAJour(frontiere, dejaVus);
            if(racine.getJeu().estGagnant()){
                solution = racine.getListeDeMouvements();
                return;
            }
            else if(dejaVus.contains(racine.getJeu())){
                frontiere.remove(racine);
                racine = frontiere.get(0);
            }
            else{
                dejaVus.add(racine.getJeu());
                frontiere.remove(racine);
                racine = frontiere.get(0);
            }
            System.out.println(frontiere.size());
        }
        System.out.println("Ce jeu n'a pas de solution.");
    }


    public ArrayList<JeuPuzzle<T>> getSolution() {
        return solution;
    }

    @Override
    public String toString() {
        String retour = "";
        for(int i=0; solution.size()>i;i++){
            retour += solution.get(i).toString();
        }
        return retour;
    }
}
