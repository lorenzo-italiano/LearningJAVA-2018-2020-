package fr.umontpellier.iut.expressions;

public class Operation implements Expression {

    private char operateur;
    private Expression expressionGauche;
    private Expression expressionDroite;

    public Operation(char operateur, Expression expressionGauche, Expression expressionDroite){
        this.operateur = operateur;
        this.expressionGauche = expressionGauche;
        this.expressionDroite = expressionDroite;
    }

    @Override
    public double calculerValeur() {
        double valeurgauche = expressionGauche.calculerValeur();
        double valeurdroite = expressionDroite.calculerValeur();

        if (operateur == '*'){
            return valeurgauche * valeurdroite;
        }
        else if (operateur == '+'){
            return valeurgauche + valeurdroite;
        }
        else if (operateur == '-'){
            return valeurgauche - valeurdroite;
        }
        else{
            if (valeurdroite == 0){
                throw new ArithmeticException("Division par zéro");
            }
            else{
                return valeurgauche / valeurdroite;
            }
        }
    }
    
    @Override
    public String toString() {
        return "(" + expressionGauche + operateur + expressionDroite + ")";
    }
}
