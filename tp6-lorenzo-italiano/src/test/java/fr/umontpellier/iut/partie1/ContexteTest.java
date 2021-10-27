package fr.umontpellier.iut.partie1;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ContexteTest {
    @Test
    public void test_no_exception() {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 8, 0}};
        Contexte c = new Contexte(new Taquin(data));
        assertDoesNotThrow(() -> c.resoudre());
    }
    @Test
    public void test_resoudre_soluble_simple() {
        int[][] data = {{1, 2, 3}, {4, 5, 6}, {7, 0, 8}};
        Contexte c = new Contexte(new Taquin(data));
        c.resoudre();
        assertTrue(c.getSolution().size() > 0);
    }

    @Test
    public void test_resoudre_soluble_simple2() {
        int[][] data = {{1, 0, 3}, {4, 2, 6}, {7, 5, 8}};
        Contexte c = new Contexte(new Taquin(data));
        c.resoudre();
        assertTrue(c.getSolution().size() > 0);
    }

    @Test
    public void test_resoudre_soluble_simple3() {
        int[][] data = {{4, 1, 3}, {0, 2, 6}, {7, 5, 8}};
        Contexte c = new Contexte(new Taquin(data));
        c.resoudre();
        assertTrue(c.getSolution().size() > 0);
    }

    @Test
    public void test_resoudre_soluble_simple4() {
        int[][] data = {{4, 1, 3}, {7, 2, 6}, {5, 8, 0}};
        Contexte c = new Contexte(new Taquin(data));
        c.resoudre();
        assertTrue(c.getSolution().size() > 0);
    }
}