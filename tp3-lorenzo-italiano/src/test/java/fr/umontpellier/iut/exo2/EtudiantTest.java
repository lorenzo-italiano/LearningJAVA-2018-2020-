package fr.umontpellier.iut.exo2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class EtudiantTest {
    private LocalDate date = LocalDate.of(2001, Month.SEPTEMBER, 21);
    private Etudiant etudiant = new Etudiant("oui", "oui", date, "j", "i");

    @Test
    void test_calculer_moyenne_retourne_0_Quand_Pas_De_Note() {
        float result = etudiant.calculerMoyenne();
        assertEquals(0, result, 0);
    }

    Professeur ProfMaths = new Professeur("Marie-Jeanne", "Alain");
    Matiere Maths = new Matiere("Mathematiques S2", 2, ProfMaths);
    Matiere Maths2 = new Matiere("Mathematiques S1", 2.5f, ProfMaths);

    @Test
    public void test_calculer_moyenne_retourne_valeur_note_quand_une_seule_note() {
        etudiant.noter(Maths, 12.0f);
        assertEquals(12.0f, etudiant.calculerMoyenne());
    }

    @Test
    public void test_calculer_moyenne_retourne_valeur_note_ponderee_quand_une_seule_note_avec_coefficient() {
        etudiant.noter(Maths, 12.0f);
        assertEquals(12.0f, etudiant.calculerMoyenne());
    }

    @Test
    public void test_calculer_moyenne_retourne_moyenne_quand_plusieurs_notes_avec_differents_coefficients() {
        etudiant.noter(Maths, 12.0f);
        etudiant.noter(Maths2, 14.0f);
        etudiant.noter(Maths, 16.0f);
        assertEquals(14.0f, etudiant.calculerMoyenne(), 0);
    }
}
