package fr.umontpellier.iut.expressions;


public class AppExpression {

    public static void main(String[] args) {
        Expression e1 = new Nombre(1);
        Expression e2 = new Nombre(2);
        Operation operation = new Operation('+',e1,e2);
        double resultat = operation.calculerValeur();
        System.out.println(resultat);

        Expression monExpr = new Operation('+',new Operation('*', new Nombre(3),new Nombre(5)),new Operation('/', new Nombre(6),new Nombre(2)));
        System.out.println(monExpr);
    }
}
