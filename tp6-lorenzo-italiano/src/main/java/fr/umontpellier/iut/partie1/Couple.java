package fr.umontpellier.iut.partie1;

import java.util.ArrayList;
import java.util.Collections;

public class Couple {

    private Taquin taquin;
    private Couple predecesseur;

    public Couple(Taquin taquin, Couple predecesseur) {
        this.taquin = taquin;
        this.predecesseur = predecesseur;
    }

    public Taquin getTaquin() {
        return taquin;
    }

    public Couple getPredecesseur() {
        return predecesseur;
    }

    public void mettreAJour(ArrayList<Couple> frontiere, ArrayList<Taquin> dejaVus) {
        for(int i=0;taquin.genererFils().size() > i;i++){
            if(!dejaVus.contains(taquin.genererFils().get(i))){
                frontiere.add(new Couple(taquin.genererFils().get(i),this));
                dejaVus.add(taquin.genererFils().get(i));
            }
        }
    }

    public ArrayList<Taquin> getListeDeMouvements() {
        ArrayList<Taquin> listemouvements = new ArrayList<>();
        Couple courant = this;
        listemouvements.add(this.getTaquin());
        while(courant.predecesseur != null){
            courant = courant.getPredecesseur();
            listemouvements.add(courant.getTaquin());
        }
        Collections.reverse(listemouvements);
        return listemouvements;
    }


}
