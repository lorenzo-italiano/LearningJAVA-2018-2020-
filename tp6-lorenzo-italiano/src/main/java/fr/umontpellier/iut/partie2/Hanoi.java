package fr.umontpellier.iut.partie2;

import java.util.ArrayList;
import java.util.Arrays;

public class Hanoi implements JeuPuzzle{
    private ArrayList<Integer> poteau1;
    private ArrayList<Integer> poteau2;
    private ArrayList<Integer> poteau3;
    private int taille;

    public Hanoi(int taille) {
        poteau1 = new ArrayList<>();
        poteau2 = new ArrayList<>();
        poteau3 = new ArrayList<>();
        this.taille = taille;
        for(int i=1; i<=taille;i++){
            poteau1.add(taille-i+1);
        }
    }


    public Hanoi(ArrayList<Integer> tour1, ArrayList<Integer> tour2, ArrayList<Integer> tour3, int taille) {
        this.poteau1 = tour1;
        this.poteau2 = tour2;
        this.poteau3 = tour3;
        this.taille = taille;
    }

    @Override
    public boolean estGagnant() {
        for(int i=0; i<taille-1;i++){
            if (poteau3.size()!=taille){
                return false;
            }
            else if(poteau3.get(i)<=poteau3.get(i+1)){
                return false;
            }
        }
        return true;
    }

    private ArrayList<Integer> copieListe(ArrayList<Integer> liste){
        ArrayList<Integer> copie = new ArrayList<>();
        copie.addAll(liste);
        return copie;
    }

    @Override
    public ArrayList<Hanoi> genererFils() {
        ArrayList<Hanoi> listefils = new ArrayList<>();

        ArrayList<Integer> tour1 = copieListe(this.poteau1);
        ArrayList<Integer> tour2 = copieListe(this.poteau2);
        ArrayList<Integer> tour3 = copieListe(this.poteau3);

        if(tour1.size() != 0 && tour1.get(tour1.size()-1) < ((tour2.size() != 0) ? tour2.get(tour2.size() -1) : taille+1)){

            tour2.add(tour1.get(tour1.size()-1));
            tour1.remove(tour1.size()-1);

            listefils.add(new Hanoi(tour1, tour2, tour3, taille));
        }
        tour1 = copieListe(this.poteau1);
        tour2 = copieListe(this.poteau2);
        tour3 = copieListe(this.poteau3);
        if(tour2.size() != 0 && tour2.get(tour2.size()-1) < ((tour3.size() != 0) ? tour3.get(tour3.size() -1) : taille+1)){

            tour3.add(tour2.get(tour2.size()-1));
            tour2.remove(tour2.size()-1);

            listefils.add(new Hanoi(tour1, tour2, tour3, taille));
        }
        tour1 = copieListe(this.poteau1);
        tour2 = copieListe(this.poteau2);
        tour3 = copieListe(this.poteau3);
        if(tour3.size() != 0 && tour3.get(tour3.size()-1) < ((tour2.size() != 0) ? tour2.get(tour2.size() -1) : taille+1)){

            tour2.add(tour3.get(tour3.size()-1));
            tour3.remove(tour3.size()-1);

            listefils.add(new Hanoi(tour1, tour2, tour3, taille));
        }
        tour1 = copieListe(this.poteau1);
        tour2 = copieListe(this.poteau2);
        tour3 = copieListe(this.poteau3);
        if(tour2.size() != 0 && tour2.get(tour2.size()-1) < ((tour1.size() != 0) ? tour1.get(tour1.size() -1) : taille+1)){

            tour1.add(tour2.get(tour2.size()-1));
            tour2.remove(tour2.size()-1);

            listefils.add(new Hanoi(tour1, tour2, tour3, taille));
        }
        tour1 = copieListe(this.poteau1);
        tour2 = copieListe(this.poteau2);
        tour3 = copieListe(this.poteau3);
        if(tour1.size() != 0 && tour1.get(tour1.size()-1) < ((tour3.size() != 0) ? tour3.get(tour3.size() -1) : taille+1)){

            tour3.add(tour1.get(tour1.size()-1));
            tour1.remove(tour1.size()-1);

            listefils.add(new Hanoi(tour1, tour2, tour3, taille));
        }
        tour1 = copieListe(this.poteau1);
        tour2 = copieListe(this.poteau2);
        tour3 = copieListe(this.poteau3);
        if(tour3.size() != 0 && tour3.get(tour3.size()-1) < ((tour1.size() != 0) ? tour1.get(tour1.size() -1) : taille+1)){

            tour1.add(tour3.get(tour3.size()-1));
            tour3.remove(tour3.size()-1);

            listefils.add(new Hanoi(tour1, tour2, tour3, taille));
        }
        return listefils;
    }
    @Override
    public String toString() {
        return "Hanoi{" +
                "\nPoteau1=" + Arrays.toString(poteau1.toArray()) +
                "\nPoteau2=" + Arrays.toString(poteau2.toArray()) +
                "\nPoteau3=" + Arrays.toString(poteau3.toArray()) +
                "\n}";
    }
}

