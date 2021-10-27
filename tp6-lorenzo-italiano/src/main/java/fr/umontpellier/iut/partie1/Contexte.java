package fr.umontpellier.iut.partie1;

import java.util.ArrayList;

public class Contexte {

    private Taquin taquinInitial;
    private ArrayList<Taquin> solution;

    public Contexte(Taquin taquinInitial) {
        this.taquinInitial = taquinInitial;
        solution = new ArrayList<>();
    }

    public void resoudre() {
        Couple racine = new Couple(taquinInitial, null);
        ArrayList<Couple> frontiere = new ArrayList<>();
        ArrayList<Taquin> dejaVus = new ArrayList<>();
        racine.mettreAJour(frontiere,dejaVus);
        while(frontiere.size() > 0){
            racine.mettreAJour(frontiere, dejaVus);
            if(racine.getTaquin().estGagnant()){
                solution = racine.getListeDeMouvements();
                return;
            }
            else if(dejaVus.contains(racine.getTaquin())){
                frontiere.remove(racine);
                racine = frontiere.get(0);
            }
            else{
                dejaVus.add(racine.getTaquin());
                frontiere.remove(racine);
                racine = frontiere.get(0);
            }
            System.out.println(frontiere.size());
        }
        System.out.println("Ce taquin n'a pas de solution.");
    }


    public ArrayList<Taquin> getSolution() {
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
