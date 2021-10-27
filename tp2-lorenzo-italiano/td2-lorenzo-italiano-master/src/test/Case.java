import main.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class Case {

    UtilisateurCreator utilisateurCreator = new UtilisateurCreator();
    Administrateur administrateur = new Administrateur("Dupond", "Michel", "15 rue Oui", "michel.dupond@myspace.com");
    chargeCours chargeCours = new chargeCours("Dardaillon", "Enzo","830 rue de salaison", "enzo.dardaillon@gmail.com","12345","54321");
    Enseignant enseignant = new Enseignant("Dupont","Albert","21 avenue du pain","albert.dupond@arobase.fr","654432","9876543");
    Etudiant etudiant = new Etudiant("Matarise","Loan","940 avenue du pain","loan.matarise@omail.fr","543255");

    @Test
    void createAdminTest(){
        assertTrue(utilisateurCreator.createUtilisateur("Dupond", "Michel", "15 rue Oui", "michel.dupond@myspace.com") instanceof Administrateur);
    }

    @Test
    void createEnseignantTest(){
        assertTrue(utilisateurCreator.createUtilisateur("Enseignant","Dupont","Albert","21 avenue du pain","albert.dupond@arobase.fr","654432","9876543") instanceof Enseignant);
    }

    @Test
    void createChargeCoursTest(){
        assertTrue(utilisateurCreator.createUtilisateur("Dardaillon", "Enzo","830 rue de salaison", "enzo.dardaillon@gmail.com","12345","54321") instanceof chargeCours) ;
    }

    @Test
    void createEtudiantTest(){
        assertTrue(utilisateurCreator.createUtilisateur("Italiano","Lorenzo","15 impasse nord","oui.oui@ouimail.com","245664") instanceof Etudiant);
    }

    @Test
    void creerCoursTest(){
        chargeCours chargeCours = new chargeCours("Dardaillon", "Enzo","830 rue de salaison", "enzo.dardaillon@gmail.com","12345","54321");
        Fichier fichier = new Fichier("Cours Maths");
        Cours c = administrateur.creerCours(chargeCours,fichier);
        assertTrue(c instanceof Cours);
        assertTrue(Administrateur.getListecours().contains(c));
    }

    @Test
    void supprimerCoursTest(){
        chargeCours chargeCours = new chargeCours("Dardaillon", "Enzo","830 rue de salaison", "enzo.dardaillon@gmail.com","12345","54321");
        Fichier fichier = new Fichier("Cours Maths");
        Cours c = administrateur.creerCours(chargeCours,fichier);
        assertTrue(c instanceof Cours);
        assertTrue(Administrateur.getListecours().contains(c));
        administrateur.supprimerCours(c);
        assertFalse(Administrateur.getListecours().contains(c));
    }

    @Test
    void affecterCoursTest(){
        Cours c = new Cours(chargeCours,new Fichier("Cours"));
        chargeCours.affecterCour(c,enseignant);
        assertEquals(c.getListeEnseigants().get(0),enseignant);
    }

    @Test
    void desaffecterProfTest(){
        Cours c = new Cours(chargeCours,new Fichier("Cours"));
        chargeCours.affecterCour(c,enseignant);
        assertEquals(c.getListeEnseigants().get(0),enseignant);
        chargeCours.desaffecterProf(c,enseignant);
        assertFalse(c.getListeEnseigants().contains(enseignant));
    }

    @Test
    void delivrerCertificatTest(){
        certificatParticipation c = chargeCours.delivrerCertificat(10,"Très bien",etudiant.getNumEtudiant());
        assertTrue(c.isEstDelivre());
    }

    @Test
    void estRetardTest(){
        Devoir devoir = new Devoir("Devoir Maths", "DM n°2", LocalDate.of(2020,11,5), 20, 3,new Fichier("Devoir n°2"));
        Rendu rendu = new Rendu(devoir, etudiant.getNumEtudiant());
        assertFalse(rendu.estRetard());
    }
}