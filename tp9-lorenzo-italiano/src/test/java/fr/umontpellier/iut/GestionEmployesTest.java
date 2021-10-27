package fr.umontpellier.iut;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class GestionEmployesTest {

    @Disabled
    @Test
    public void test_if_main_method_was_implemented() {
        assertDoesNotThrow(() -> GestionEmployes.main(new String[1]));
    }

    @Disabled
    @Test
    public void test_get_employeordonne(){
        Entreprise ubisoft = new Entreprise();
        Employe enzo = new Employe("1200","Dardaillon", 50);
        ubisoft.embaucher(enzo, LocalDate.now());
        Employe lorenzo = new Employe("1300","Italiano", 50);
        ubisoft.embaucher(lorenzo, LocalDate.now());
        Employe john = new Employe("1400","Johnson", 25);
        ubisoft.embaucher(john, LocalDate.now());
        Employe jeanne = new Employe("1100","Johnson", 25);
        ubisoft.embaucher(jeanne, LocalDate.now());
        Collection<Employe> listemploye = ubisoft.getEmployesOrdonnes();
        Iterator it = listemploye.iterator();
        assertEquals(enzo, it.next());
        assertEquals(lorenzo, it.next());
        assertEquals(john, it.next());
        assertEquals(jeanne, it.next());
    }

    @Disabled
    @Test
    public void test_get_employedesordonne(){
        Entreprise ubisoft = new Entreprise();
        Employe enzo = new Employe("1200","Dardaillon", 50);
        ubisoft.embaucher(enzo, LocalDate.now());
        Employe lorenzo = new Employe("1300","Italiano", 50);
        ubisoft.embaucher(lorenzo, LocalDate.now());
        Employe john = new Employe("1400","Johnson", 25);
        ubisoft.embaucher(john, LocalDate.now());
        Employe jeanne = new Employe("1100","Johnson", 25);
        ubisoft.embaucher(jeanne, LocalDate.now());
        Collection<Employe> listemploye = ubisoft.getEmployesDansDesordre();
        Iterator it = listemploye.iterator();
        assertNotEquals(enzo, it.next());
        assertNotEquals(lorenzo, it.next());
        assertNotEquals(john, it.next());
        assertNotEquals(jeanne, it.next());
    }

    @Disabled
    @Test
    public void test_taillelist_getordonne_egale_getdesordonne(){
        Entreprise ubisoft = new Entreprise();
        Employe enzo = new Employe("1200","Dardaillon", 50);
        ubisoft.embaucher(enzo, LocalDate.now());
        Employe lorenzo = new Employe("1300","Italiano", 50);
        ubisoft.embaucher(lorenzo, LocalDate.now());
        Employe john = new Employe("1400","Johnson", 25);
        ubisoft.embaucher(john, LocalDate.now());
        Employe jeanne = new Employe("1100","Johnson", 25);
        ubisoft.embaucher(jeanne, LocalDate.now());
        assertTrue(ubisoft.getEmployesDansDesordre().size()==ubisoft.getEmployesOrdonnes().size());
    }

    @Disabled
    @Test
    public void test_getMoisanciennete(){
        Entreprise ubisoft = new Entreprise();
        Employe enzo = new Employe("1200","Dardaillon", 50);
        ubisoft.embaucher(enzo, LocalDate.of(2020,2,1));
        assertEquals(2, enzo.getMoisAnciennete());
    }

    @Disabled
    @Test
    public void test_getMoisanciennete_egalite_deux_employe_jours_differents(){
        Entreprise ubisoft = new Entreprise();
        Employe enzo = new Employe("1200","Dardaillon", 50);
        ubisoft.embaucher(enzo, LocalDate.of(2020,2,3));
        Employe lorenzo = new Employe("1300","Italiano", 50);
        ubisoft.embaucher(lorenzo, LocalDate.of(2020,2,23));
        assertEquals(lorenzo.getMoisAnciennete(), enzo.getMoisAnciennete());
    }

    @Disabled
    @Test
    public void test_distribuerbonus(){
        Entreprise ubisoft = new Entreprise();
        ubisoft.setBonusTotal(100);
        Employe enzo = new Employe("1200","Dardaillon", 50);
        ubisoft.embaucher(enzo, LocalDate.of(2020,2,1));
        Employe lorenzo = new Employe("1300","Italiano", 50);
        ubisoft.embaucher(lorenzo, LocalDate.of(2019,12,27));
        ubisoft.distribuerBonus();
        assertEquals(6, enzo.getBonus());
        assertEquals(9,lorenzo.getBonus());
    }

    @Disabled
    @Test
    public void test_distribuerbonus_ordre_priorityqueue(){
        Entreprise ubisoft = new Entreprise();
        ubisoft.setBonusTotal(10);
        Employe enzo = new Employe("1200","Dardaillon", 50);
        ubisoft.embaucher(enzo, LocalDate.of(2020,2,1));
        Employe lorenzo = new Employe("1300","Italiano", 50);
        ubisoft.embaucher(lorenzo, LocalDate.of(2019,12,27));
        ubisoft.distribuerBonus();
        assertEquals(1, enzo.getBonus());
        assertEquals(9,lorenzo.getBonus());
    }

    @Disabled
    @Test
    public void test_remercier(){
        Entreprise ubisoft = new Entreprise();
        ubisoft.setBonusTotal(10);
        Employe enzo = new Employe("1200","Dardaillon", 50);
        ubisoft.embaucher(enzo, LocalDate.of(2020,2,1));
        Employe lorenzo = new Employe("1300","Italiano", 50);
        ubisoft.embaucher(lorenzo, LocalDate.of(2019,12,27));
        ubisoft.remercier(1);
        assertEquals(1, ubisoft.getEmployesDansDesordre().size());
        assertTrue(!ubisoft.getEmployesDansDesordre().contains(enzo));
    }

    @Disabled
    @Test
    public void test_remercier2(){
        Entreprise ubisoft = new Entreprise();
        ubisoft.setBonusTotal(10);
        Employe enzo = new Employe("1200","Dardaillon", 50);
        ubisoft.embaucher(enzo, LocalDate.of(2020,2,1));
        Employe lorenzo = new Employe("1300","Italiano", 50);
        ubisoft.embaucher(lorenzo, LocalDate.of(2019,12,27));
        ubisoft.remercier(2);
        assertEquals(0, ubisoft.getEmployesDansDesordre().size());
    }

    @Disabled
    @Test
    public void test_getindemnitétransport(){
        Entreprise ubisoft = new Entreprise();
        ubisoft.setBonusTotal(10);
        Employe enzo = new Employe("1200","Dardaillon", 50);
        ubisoft.embaucher(enzo, LocalDate.of(2020,2,1));
        Employe lorenzo = new Employe("1300","Italiano", 50);
        ubisoft.embaucher(lorenzo, LocalDate.of(2019,12,27));
        lorenzo.setAdresse("Montpellier");
        enzo.setAdresse("Sète");
        assertEquals(0, lorenzo.getIndemniteTransport());
        assertEquals(1800, enzo.getIndemniteTransport());
    }

    @Disabled
    @Test
    public void test_getindemnitétransportexception(){
        Entreprise ubisoft = new Entreprise();
        ubisoft.setBonusTotal(10);
        Employe enzo = new Employe("1200","Dardaillon", 50);
        ubisoft.embaucher(enzo, LocalDate.of(2020,2,1));
        Employe lorenzo = new Employe("1300","Italiano", 50);
        ubisoft.embaucher(lorenzo, LocalDate.of(2019,12,27));
        lorenzo.setAdresse("Toulouse");
        lorenzo.getIndemniteTransport();
        assertThrows(IllegalArgumentException.class, () -> {GestionDistances.getDistance(lorenzo.getAdresse());});
    }
}