package fr.umontpellier.iut.exercice2;

import fr.umontpellier.iut.exercice2.exceptions.CapaciteMaximaleAtteinteException;
import fr.umontpellier.iut.exercice2.exceptions.SalleCapaciteLimiteeException;
import fr.umontpellier.iut.exercice2.exceptions.SalleVideException;

import java.util.Queue;

public class SalleCapaciteLimitee {
    private SalleAttente salleAttente;
    private int capacitemax;
    private int compteur;

    public SalleCapaciteLimitee(int capacitemax){
        this.capacitemax = capacitemax;
        this.salleAttente = new SalleAttente();
        compteur = 0;
    }

    public void entrer(Personne p, int priorite) throws CapaciteMaximaleAtteinteException{
        compteur ++;
        if(compteur<capacitemax){
            salleAttente.entrer(p, priorite);
        }
        else{
            throw new CapaciteMaximaleAtteinteException(capacitemax);
        }
    }

    public String personneSuivante() throws SalleVideException {
        try{
            return salleAttente.sortir();
        }
        catch (IndexOutOfBoundsException a){
            throw new SalleVideException();
        }
    }
}
