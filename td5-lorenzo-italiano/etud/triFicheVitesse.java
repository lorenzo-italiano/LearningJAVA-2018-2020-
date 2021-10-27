public class triFicheVitesse extends Fiche implements Comparable<triFicheVitesse> {


    public triFicheVitesse(Voiture voiture) {
        super(voiture);
    }

    @Override
    public int compareTo(triFicheVitesse autre) {
        if(this.getVitesseMax() - autre.getVitesseMax() > 0){
            return 1;
        }
        else if(this.getVitesseMax() - autre.getVitesseMax() < 0){
        return -1;
        }
        else{
        return 0;
        }

    }
}
