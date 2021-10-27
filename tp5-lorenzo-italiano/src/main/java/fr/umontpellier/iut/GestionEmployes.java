package fr.umontpellier.iut;

public class GestionEmployes {

    public static void main(String[] args) {
        Employe Michel = new EmployeBuilder().setNom("Michel").setBase(10.0).setEchelon(10).setNbHeures(5).setNrINSEE("1414029515").createEmploye();
        Employe Thierry = new EmployeBuilder().setNom("Thierry").createEmploye();
        System.out.println(Michel);
        System.out.println(Thierry);
        //Commercial Joe = new Commercial("12141441","Joe",2,10.0,8.0,150.0,0.25);
        //Joe.negocierTransaction();
        Fabricant John = new FabricantBuilder().setNrINSEE("155125").setNom("John").setEchelon(4).setBase(8.0).setNbHeures(10.0).setNbUnitesProduites(5).setTauxCommissionUnite(0.2).createFabricant();
        John.fabriquerProduit();
        Technicien Jack = new TechnicienBuilder().setNrINSEE("918129").setNom("Jack").setEchelon(3).setBase(15.0).setNbHeures(12.0).createTechnicien();
        Jack.effectuerTacheTechnique();
        Employe Enzo = new FabricantBuilder().setNrINSEE("5215").setNom("Enzo").setEchelon(5).setBase(12.0).setNbHeures(8.0).setNbUnitesProduites(80).setTauxCommissionUnite(0.8).createFabricant();
        Vendeur Germain = new Vendeur("598643","Germain",6,6.0,8.0,50.0,0.5);
        Germain.vendreProduit();
        Germain.negocierTransaction();
        Representant Maxime = new Representant("3565","Maxime",6,10.0,10.0,150.0,0.6);
        Maxime.representerEntreprise();
        Maxime.negocierTransaction();
    }
}
