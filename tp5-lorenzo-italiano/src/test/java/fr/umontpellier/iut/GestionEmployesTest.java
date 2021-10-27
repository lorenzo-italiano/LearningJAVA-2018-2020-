package fr.umontpellier.iut;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestionEmployesTest {
    Employe Michel = new EmployeBuilder().setNom("Michel").setBase(10.0).setEchelon(10).setNbHeures(5).setNrINSEE("1414029515").createEmploye();

    @Disabled
    @Test
    public void test_salairebrut(){
        assertEquals(50.0, Michel.getSalaireBrut());
    }

    @Disabled
    @Test
    public void test_salairenet() {
        assertEquals(40.0,Michel.getSalaireNet());
    }

    Technicien Thierry = new Technicien("9846","Thierry",3,5.0,10.0);

    @Disabled
    @Test
    public void test_salairebrutTech(){ assertEquals(350,Thierry.getSalaireBrut());}

    Vendeur Paul = new Vendeur("954846","Paul",3,5.0,10.0,100.0,0.5);

    @Disabled
    @Test
    public void test_salairebrutVendeur(){ assertEquals(55,Paul.getSalaireBrut());}

    Representant Luc = new Representant("945846","Luc",3,5.0,10.0,100.0,0.5);

    @Disabled
    @Test
    public void test_salairebrutRep(){ assertEquals(350,Luc.getSalaireBrut());}

    Fabricant Fabien = new Fabricant("945846","Luc",3,5.0,10.0,100,0.5);

    @Disabled
    @Test
    public void test_salairebrutFab(){ assertEquals(100,Fabien.getSalaireBrut());}


}