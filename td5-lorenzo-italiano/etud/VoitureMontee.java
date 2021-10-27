public abstract class VoitureMontee implements Voiture {

    private Voiture voiture;

    public VoitureMontee(Voiture voiture) {
        this.voiture = voiture;
    }


    public float getPrix() {
        return voiture.getPrix();
    }


    public float getMasse() {
        return voiture.getMasse();
    }


    public float getPuissanceMoteur() {
        return voiture.getPuissanceMoteur();
    }


    public float getRegimeOptimal() {
        return voiture.getRegimeOptimal();
    }


    public float getForceFreinageCst() {
        return voiture.getForceFreinageCst();
    }


    public float getCoeffFreinageProp() {
        return voiture.getCoeffFreinageProp();
    }


    public float getRapportRouesMoteur() {
        return voiture.getRapportRouesMoteur();
    }


    public float getRayonRoues() {
        return voiture.getRayonRoues();
    }


    public String toString() {
        return voiture.toString();

    }
}
