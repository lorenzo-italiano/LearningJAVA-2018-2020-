package fr.umontpellier.iut;

import java.time.LocalDate;
import java.util.*;

public class Entreprise {
    private double bonusTotal;
    private Collection<Employe> lePersonnel;
    private class ComparateurAnciennete implements Comparator<Employe> {
        @Override
        public int compare(Employe employe1, Employe employe2) {
            return employe2.getMoisAnciennete() - employe1.getMoisAnciennete();
        }
    }
    private class ComparateurAncienneteinverse implements Comparator<Employe> {
        @Override
        public int compare(Employe employe1, Employe employe2) {
            return employe1.getMoisAnciennete() - employe2.getMoisAnciennete();
        }
    }

    public Entreprise(){
        this.lePersonnel = new ArrayList<>();
    }

    public Collection<Employe> getEmployesOrdonnes() {
        return new TreeSet<>(lePersonnel);
    }

    public Collection<Employe> getEmployesDansDesordre() {
        return new HashSet<>(lePersonnel);
    }

    public void setBonusTotal(double bonusTotal) {
        this.bonusTotal = bonusTotal;
    }

    public void distribuerBonus() {
        ComparateurAnciennete comparateurAnciennete = new ComparateurAnciennete();
        PriorityQueue<Employe> listeanciennete = new PriorityQueue<>(comparateurAnciennete);
        listeanciennete.addAll(lePersonnel);
        Employe courant = listeanciennete.poll();
        while (courant!=null) {
            if(this.bonusTotal>courant.getMoisAnciennete()*3) {
                courant.setBonus(courant.getMoisAnciennete() * 3);
                setBonusTotal(bonusTotal - (courant.getMoisAnciennete() * 3));
                courant = listeanciennete.poll();
            }
            else{
                courant.setBonus(bonusTotal);
                setBonusTotal(0);
                courant = null;
            }
        }
    }

    public void embaucher(Employe e, LocalDate dateEmbauche){
            this.lePersonnel.add(e);
            e.setDateEmbauche(dateEmbauche);
    }

    public void licencier(Employe e){
        this.lePersonnel.remove(e);
    }

    public void remercier(int n){
        ComparateurAncienneteinverse comparateurAnciennete = new ComparateurAncienneteinverse();
        PriorityQueue<Employe> listeanciennete = new PriorityQueue<>(comparateurAnciennete);
        listeanciennete.addAll(lePersonnel);
        Employe courant = listeanciennete.poll();
        int compteur = 0;
        while(n>compteur && courant!=null){
            this.licencier(courant);
            compteur++;
            courant = listeanciennete.poll();
        }
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "bonusTotal=" + bonusTotal +
                ", lePersonnel=" + lePersonnel +
                '}';
    }


}
