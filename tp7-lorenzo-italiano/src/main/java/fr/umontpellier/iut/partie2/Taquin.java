package fr.umontpellier.iut.partie2;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("Duplicates")

public class Taquin implements JeuPuzzle {

    private int[][] tableau;

    private int[][] copieTableau(int[][] tab){
        int[][] tableaucopie = new int[tableau.length][tableau[0].length];
        for(int i = 0;i<this.tableau.length;i++){
            for(int j = 0;j<this.tableau[i].length;j++) {
                tableaucopie[i][j] = tab[i][j];
            }
        }
        return tableaucopie;
    }

    public Taquin(int[][] tableau) {
        this.tableau = tableau;
    }

    public boolean estGagnant() {
        for(int i = 0;i<this.tableau.length;i++){
            for(int j = 0;j<this.tableau[i].length;j++) {
                if (i == 0 && j == 0) {
                    if (this.tableau[i][j] != 1) {
                        return false;
                    }
                }
                else if(i == this.tableau.length-1 && j == this.tableau[i].length-1){
                    if (this.tableau[i][j] != 0) {
                        return false;
                    }
                }else if (j == 0) {
                    if (this.tableau[i][j] != this.tableau[i-1][this.tableau.length - 1] + 1) {
                        return false;
                    }
                }
                else{
                    if(this.tableau[i][j] != this.tableau[i][j-1] + 1){
                        return false;
                        }
                }
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taquin taquin = (Taquin) o;
        return Arrays.deepEquals(tableau, taquin.tableau);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(tableau);
    }

    @Override
    public ArrayList<JeuPuzzle> genererFils() {
        ArrayList<JeuPuzzle> listefils = new ArrayList<>();
        int[] tab = this.trouverTrou();
        if(tab[0] != 0){
            int[][] fils1 = copieTableau(tableau);
            int stock = fils1[tab[0]-1][tab[1]];
            fils1[tab[0]][tab[1]] = stock;
            fils1[tab[0]-1][tab[1]] = 0;
            listefils.add(new Taquin(fils1));
        }
        if(tab[0] != tableau.length-1){
            int[][] fils2 = copieTableau(tableau);
            int stock = fils2[tab[0]+1][tab[1]];
            fils2[tab[0]][tab[1]] = stock;
            fils2[tab[0]+1][tab[1]] = 0;
            listefils.add(new Taquin(fils2));
        }
        if(tab[1] != 0){
            int[][] fils3 = copieTableau(tableau);
            int stock = fils3[tab[0]][tab[1]-1];
            fils3[tab[0]][tab[1]] = stock;
            fils3[tab[0]][tab[1]-1] = 0;
            listefils.add(new Taquin(fils3));
        }
        if(tab[1] != tableau.length-1){
            int[][] fils4 = copieTableau(tableau);
            int stock = fils4[tab[0]][tab[1]+1];
            fils4[tab[0]][tab[1]] = stock;
            fils4[tab[0]][tab[1]+1] = 0;
            listefils.add(new Taquin(fils4));
        }
        return listefils;
    }

    //retourne un tableau [i,j] si tableau[i][j]==0
    public int[] trouverTrou() {
        int[] tab = new int[2];
        for(int i = 0;i<this.tableau.length;i++){
            for(int j = 0;j<this.tableau[i].length;j++) {
                if(this.tableau[i][j]==0){
                    tab[0] = i;
                    tab[1] = j;
                }
            }
        }
        return tab;
    }

    @Override
    public String toString() {
        String plateau = "";
        if(this.tableau.length==this.tableau[0].length) {
            plateau += "+";
            for (int o = 0;o<this.tableau.length*2+1;o++){
                plateau += "-";
            }
            plateau += "+" + "\n";
            for(int i = 0;i<this.tableau.length;i++){
                for(int j = 0;j<this.tableau[i].length;j++){
                    plateau += " " + this.tableau[i][j] + " ";
                    if((j+1) % this.tableau.length == 0 && i != 3){
                        //plateau += "|" +"\n" + "|";
                        plateau += "\n" ;
                    }
                }
            }
            //plateau += "|" + "\n" + "+---------------+" + "\n";
            //plateau += "\n" + "+---------------+" + "\n";
            plateau += "\n" + "+";
            for (int o = 0;o<this.tableau.length*2+1;o++){
                plateau += "-";
            }
            plateau += "+" + "\n";
        }

        return plateau;
    }
}
