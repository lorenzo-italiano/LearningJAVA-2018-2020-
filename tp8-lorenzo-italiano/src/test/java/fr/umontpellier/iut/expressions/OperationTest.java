package fr.umontpellier.iut.expressions;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperationTest {

    @Disabled
    @Test
    void calculerValeur_10_fois_5() {
        Expression e = new Operation('*', new Nombre(10), new Nombre(5));
        assertEquals(50, e.calculerValeur());
    }

    @Disabled
    @Test
    void calculerValeur_10_plus_5() {
        Expression e = new Operation('+', new Nombre(10), new Nombre(5));
        assertEquals(15, e.calculerValeur());
    }

    @Disabled
    @Test
    void calculerValeur_10_moins_5() {
        Expression e = new Operation('-', new Nombre(10), new Nombre(5));
        assertEquals(5, e.calculerValeur());
    }

    @Disabled
    @Test
    void calculerValeur_10_divisepar_5() {
        Expression e = new Operation('/', new Nombre(10), new Nombre(5));
        assertEquals(2, e.calculerValeur());
    }

    @Disabled
    @Test
    void calculerValeur_divisionparzero() {
        Expression e = new Operation('/', new Nombre(10), new Nombre(0));
        assertThrows(ArithmeticException.class, e::calculerValeur);
    }

    @Disabled
    @Test
    void calculerValeur_expression_fois_expression() {
        Expression e = new Operation('*', new Operation('/', new Nombre(10), new Nombre(5)), new Operation('*', new Nombre(10), new Nombre(5)));
        assertEquals(100, e.calculerValeur());
    }

    @Disabled
    @Test
    public void toStringValeur_expression() {
        assertEquals("((3.0*5.0)+(6.0/2.0))", new Operation('+',new Operation('*', new Nombre(3),new Nombre(5)),new Operation('/', new Nombre(6),new Nombre(2))).toString());
    }
}

