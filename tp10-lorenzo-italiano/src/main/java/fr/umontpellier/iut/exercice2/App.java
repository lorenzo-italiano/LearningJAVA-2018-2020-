package fr.umontpellier.iut.exercice2;

import fr.umontpellier.iut.exercice2.exceptions.SalleCapaciteLimiteeException;
import fr.umontpellier.iut.exercice2.exceptions.SalleVideException;

public class App {
    public static void main(String[] args) {
        SalleCapaciteLimitee salleCapaciteLimitee = new SalleCapaciteLimitee(2);
            try{
                salleCapaciteLimitee.entrer(new Personne("Michel"),1);
                salleCapaciteLimitee.entrer(new Personne("Thierry"),2);
                salleCapaciteLimitee.entrer(new Personne("Didier"),1);
            }
            catch(SalleCapaciteLimiteeException s){
                System.out.println(s.getMessage());
            }
            SalleCapaciteLimitee salleCapaciteLimitee1 = new SalleCapaciteLimitee(2);
            try{
                salleCapaciteLimitee1.personneSuivante();
            }
            catch (SalleVideException s){
                System.out.println(s.getMessage());
            }
    }
}
