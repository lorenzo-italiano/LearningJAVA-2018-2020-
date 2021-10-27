package fr.umontpellier.iut.exercice3;

import fr.umontpellier.iut.exercice3.exceptions.CapaciteMaximaleAtteinteException;
import fr.umontpellier.iut.exercice3.exceptions.SalleVideException;

public class SalleCapaciteLimitee {
    private SalleAttenteGenerique salleAttenteGenerique;
    private int capacitemax;
    private int compteur;

    public SalleCapaciteLimitee(int capacitemax){
        this.capacitemax = capacitemax;
        this.salleAttenteGenerique = new SalleAttenteGenerique();
        compteur = 0;
    }

    public void entrer(T p, int priorite) throws CapaciteMaximaleAtteinteException {
        compteur ++;
        if(compteur<capacitemax){
            salleAttenteGenerique.entrer(p, priorite);
        }
        else{
            throw new CapaciteMaximaleAtteinteException(capacitemax);
        }
    }

    public String personneSuivante() throws SalleVideException {
        try{
            return salleAttenteGenerique.sortir();
        }
        catch (IndexOutOfBoundsException a){
            throw new SalleVideException();
        }
    }
}
