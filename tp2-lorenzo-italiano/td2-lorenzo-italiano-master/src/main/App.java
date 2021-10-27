package main;

import java.time.LocalDate;

public class App {

public static void main(String [] args){
    /* Sans utiliser les Creator ni les fonctions
    Administrateur administrateur = new Administrateur("Dupond", "Michel", "15 rue Oui", "michel.dupond@myspace.com");
    chargeCours enseignant1 = new chargeCours("Dardaillon", "Enzo","830 rue de salaison", "enzo.dardaillon@gmail.com","12345","54321");
    Enseignant enseignant2 = new Enseignant("Dupont","Albert","21 avenue du pain","albert.dupond@arobase.fr","654432","9876543");
    Etudiant etudiant1 = new Etudiant("Italiano","Lorenzo","15 impasse nord","oui.oui@ouimail.com","245664");
    Etudiant etudiant2 = new Etudiant("Matarise","Loan","940 avenue du pain","loan.matarise@omail.fr","543255");
    Fichier fichier = new Fichier("ezaezeaez");
    Fichier fichier2 = new Fichier("fierfhrggidg");
    Fichier fichier3 = new Fichier("juyjujfhrggidg");
    Cours cours = new Cours(enseignant1, fichier);
    Devoir devoir1 = new Devoir("Devoir Maths", "DM n°2", LocalDate.now(), 20, 3,fichier2);
    Devoir devoir2 = new Devoir("Devoir Physique", "DM n°1", LocalDate.now(), 20, 3,fichier3);
     */

    UtilisateurCreator utilisateurCreator = new UtilisateurCreator();
    Administrateur administrateur = utilisateurCreator.createUtilisateur("Dupond", "Michel", "15 rue Oui", "michel.dupond@myspace.com");
    chargeCours chargeCours = utilisateurCreator.createUtilisateur("Dardaillon", "Enzo","830 rue de salaison", "enzo.dardaillon@gmail.com","12345","54321");
    Enseignant enseignant = utilisateurCreator.createUtilisateur("Enseignant","Dupont","Albert","21 avenue du pain","albert.dupond@arobase.fr","87655","43534");
    Etudiant etudiant1 = utilisateurCreator.createUtilisateur("Italiano","Lorenzo","15 impasse nord","oui.oui@ouimail.com","245664");
    Etudiant etudiant2 = utilisateurCreator.createUtilisateur("Matarise","Loan","940 avenue du pain","loan.matarise@omail.fr","543255");
    administrateur.creerCours(chargeCours,new Fichier("Cours de Maths"));
    enseignant.creerDevoir("Devoir Maths", "DM n°2", LocalDate.of(2020,11,5), 20, 3,new Fichier("Devoir n°2"));
    enseignant.creerDevoir("Devoir Maths", "DM n°1", LocalDate.of(2020,11,5), 20, 3,new Fichier("Devoir N°1"));
    }
}