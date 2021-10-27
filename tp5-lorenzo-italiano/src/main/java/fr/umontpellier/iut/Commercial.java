package fr.umontpellier.iut;

public abstract class Commercial extends Employe {
    private double chiffreAffaire;
    private double tauxCommission;

    public Commercial(){}

    public Commercial(String nrINSEE, String nom, int echelon, double base, double nbHeures, double chiffreAffaire, double tauxCommission){
        super(nrINSEE, nom, echelon, base, nbHeures);
        this.chiffreAffaire = chiffreAffaire;
        this.tauxCommission = tauxCommission;
    }

    @Override
    public double getSalaireBrut() {
        return base + this.chiffreAffaire * tauxCommission + super.bonus;
    }

    public void negocierTransaction(){
        System.out.println("je négocie une transaction");
    }
}
