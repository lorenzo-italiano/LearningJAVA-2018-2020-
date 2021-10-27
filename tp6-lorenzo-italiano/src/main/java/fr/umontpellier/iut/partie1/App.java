package fr.umontpellier.iut.partie1;

public class App {
    public static void main(String[] args) {
        /*int[][] tab = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,0,15}};*/
        //int[][] tab = {{3, 8, 7}, {4, 1, 2}, {6, 5, 0}};
        int[][] tab = {{1, 0, 3}, {4, 2, 6}, {7, 5, 8}};
        Taquin plt = new Taquin(tab);
        Contexte resol = new Contexte(plt);
        resol.resoudre();
        System.out.println(resol);
        //System.out.println(plt);
        //System.out.println(plt.estGagnant());
        //System.out.println(plt.trouverTrou()[0] + " " + plt.trouverTrou()[1]);

        //System.out.println(plt.genererFils().get(0));
        //System.out.println(plt.genererFils().get(1));
    }
}
