package fr.umontpellier.iut.partie2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

@SuppressWarnings("Duplicates")

public class Couple {

    private Hanoi hanoi;
    private Couple predecesseur;

    public Couple(Hanoi hanoi, Couple predecesseur) {
        this.hanoi = hanoi;
        this.predecesseur = predecesseur;
    }

    public Hanoi getHanoi() {
        return hanoi;
    }

    public Couple getPredecesseur() {
        return predecesseur;
    }

    public void mettreAJour(ArrayList<Couple> frontiere, ArrayList<Hanoi> dejaVus) {
        for(int i=0;i<hanoi.genererFils().size();i++){
            if(!dejaVus.contains(hanoi.genererFils().get(i))){
                frontiere.add(new Couple(hanoi.genererFils().get(i),this));
                dejaVus.add(hanoi.genererFils().get(i));
            }
        }
    }

    public ArrayList<JeuPuzzle> getListeDeMouvements() {
        ArrayList<JeuPuzzle> listemouvements = new ArrayList<>();
        Couple courant = this;
        listemouvements.add(this.getHanoi());
        while(courant.predecesseur != null){
            courant = courant.getPredecesseur();
            listemouvements.add(courant.getHanoi());
        }
        Collections.reverse(listemouvements);
        return listemouvements;
    }


}
