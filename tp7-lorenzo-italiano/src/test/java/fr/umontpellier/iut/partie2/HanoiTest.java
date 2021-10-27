package fr.umontpellier.iut.partie2;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HanoiTest {
    @Test
    public void test_est_gagnant_vrai_taille_3() {
        ArrayList<Integer> poteau1 = new ArrayList<>();
        ArrayList<Integer> poteau2 = new ArrayList<>();
        ArrayList<Integer> poteau3 = new ArrayList<>(Arrays.asList(3, 2, 1));
        Hanoi hanoi = new Hanoi(poteau1, poteau2, poteau3, 3);
        assertTrue(hanoi.estGagnant());
    }

    @Test
    public void test_est_gagnant_vrai_taille_4() {
        ArrayList<Integer> poteau1 = new ArrayList<>();
        ArrayList<Integer> poteau2 = new ArrayList<>();
        ArrayList<Integer> poteau3 = new ArrayList<>(Arrays.asList(4,3, 2, 1));
        Hanoi hanoi = new Hanoi(poteau1, poteau2, poteau3, 4);
        assertTrue(hanoi.estGagnant());
    }

    @Test
    public void test_resolution_hanoi_taille_3() {
        Contexte test = new Contexte(new Hanoi(3));
        test.resoudre();
        assertTrue(test.getSolution().get(test.getSolution().size()-1).estGagnant());
    }

    @Test
    public void test_resolution_hanoi_taille_4() {
        Contexte c = new Contexte(new Hanoi(4));
        c.resoudre();

        System.out.println(c.getSolution());
        assertTrue(c.getSolution().get(c.getSolution().size()-1).estGagnant());
    }

}