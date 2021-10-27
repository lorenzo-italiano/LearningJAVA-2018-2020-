package fr.umontpellier.iut;

public class Representant extends Commercial {
    private Technicien salaireTechnicien;

    public Representant(String nrINSEE, String nom, int echelon, double base, double nbHeures, double chiffreAffaires, double tauxCommission){
        super(nrINSEE,nom,echelon,base,nbHeures,chiffreAffaires,tauxCommission);
        this.salaireTechnicien = new Technicien(nrINSEE,nom,echelon,base,nbHeures);
    }

    @Override
    public double getSalaireBrut() {
        return salaireTechnicien.getSalaireBrut() ;
    }

    public void representerEntreprise(){
        System.out.println("je represente mon entreprise");
    }
}
