package fr.umontpellier.iut.partie2;

import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("Duplicates")

public class Couple<T extends JeuPuzzle<T>> {

    private JeuPuzzle<T> jeu;
    private Couple<T> predecesseur;

    public Couple(JeuPuzzle<T> jeu, Couple<T> predecesseur) {
        this.jeu = jeu;
        this.predecesseur = predecesseur;
    }

    public JeuPuzzle<T> getJeu() {
        return jeu;
    }

    public Couple<T> getPredecesseur() {
        return predecesseur;
    }

    public void mettreAJour(ArrayList<Couple<T>> frontiere, ArrayList<JeuPuzzle<T>> dejaVus) {
        Couple<T> coupleCourant = new Couple<T>(frontiere.get(0).getJeu(), this);
        frontiere.remove(coupleCourant);
        for(int i = 0; i < frontiere.size()-1;i++){
            if(!dejaVus.contains(t)){
                frontiere.add(new Couple<T>(t,this));
                dejaVus.add(coupleCourant.jeu);
            }
        }
    }

    public ArrayList<JeuPuzzle<T>> getListeDeMouvements() {
        ArrayList<JeuPuzzle<T>> listemouvements = new ArrayList<>();
        Couple<T> courant = this;
        listemouvements.add(this.getJeu());
        while(courant.predecesseur != null){
            courant = courant.getPredecesseur();
            listemouvements.add(courant.getJeu());
        }
        Collections.reverse(listemouvements);
        return listemouvements;
    }


}
