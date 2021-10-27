package fr.umontpellier.iut.partie2;

import java.util.ArrayList;

@SuppressWarnings("Duplicates")

public class Contexte {

    private Hanoi taquinInitial;
    private ArrayList<JeuPuzzle> solution;

    public Contexte(Hanoi taquinInitial) {
        this.taquinInitial = taquinInitial;
        solution = new ArrayList<>();
    }

    public void resoudre() {
        Couple racine = new Couple(taquinInitial, null);
        ArrayList<Couple> frontiere = new ArrayList<>();
        ArrayList<Hanoi> dejaVus = new ArrayList<>();
        racine.mettreAJour(frontiere,dejaVus);
        while(frontiere.size() > 0){
            racine.mettreAJour(frontiere, dejaVus);
            if(racine.getHanoi().estGagnant()){
                solution = racine.getListeDeMouvements();
                return;
            }
            else if(dejaVus.contains(racine.getHanoi())){
                frontiere.remove(racine);
                racine = frontiere.get(0);
            }
            else{
                dejaVus.add(racine.getHanoi());
                frontiere.remove(racine);
                racine = frontiere.get(0);
            }
            System.out.println(frontiere.size());
        }
        System.out.println("Ce jeu n'a pas de solution.");
    }


    public ArrayList<JeuPuzzle> getSolution() {
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
