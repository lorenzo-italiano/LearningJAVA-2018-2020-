package fr.umontpellier.iut;

public class Fabricant extends Employe {
    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Fabricant(String nrINSEE, String nom, int echelon, double base, double nbHeures, int nbUnitesProduites, double tauxCommissionUnite){
        super(nrINSEE, nom, echelon, base, nbHeures);
        this.nbUnitesProduites = nbUnitesProduites;
        this.tauxCommissionUnite = tauxCommissionUnite;
    }

    @Override
    public double getSalaireBrut() {
        return super.getSalaireBrut()+ nbUnitesProduites * tauxCommissionUnite;
    }

    public void fabriquerProduit(){
        System.out.println("je fabrique un produit");
    }
}
