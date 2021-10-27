package fr.umontpellier.iut;

public class Technicien extends Employe {

    public Technicien(String nrINSEE, String nom, int echelon, double base, double nbHeures){
        super(nrINSEE, nom, echelon, base, nbHeures);
    }

    @Override
    public double getSalaireBrut() {
        return super.getSalaireBrut() + this.echelon * 100;
    }

    public void effectuerTacheTechnique(){
        System.out.println("j'effectue une tâche technique");
    }
}
