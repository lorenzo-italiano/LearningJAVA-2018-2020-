package main;
import java.util.*;


public class certificatParticipation {


    public certificatParticipation(float totalPoints, String appreciation, String numEtud) {
        this.totalPoints = totalPoints;
        this.appreciation = appreciation;
        this.numEtud = numEtud;
        this.estDelivre = false;
    }

    private float totalPoints;
    private String appreciation;
    private String numEtud;
    private boolean estDelivre;

    public boolean isEstDelivre() {
        return estDelivre;
    }

    public void Delivrer() {
        this.estDelivre = true;
    }

}