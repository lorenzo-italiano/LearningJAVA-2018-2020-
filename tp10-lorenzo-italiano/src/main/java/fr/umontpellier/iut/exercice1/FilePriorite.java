package fr.umontpellier.iut.exercice1;

import java.util.ArrayList;

public class FilePriorite {

    private ArrayList<TypePriorise> filepriorite;

    public FilePriorite(){
        this.filepriorite = new ArrayList<>();
    }

    public void ajouter(TypePriorise d){
        filepriorite.add(d);
    }

    public TypePriorise enlever(){
        int pluspetit = filepriorite.get(0).getIndicePriorite();
        int index = 0;
        TypePriorise retour;
        if (filepriorite.size()==0){
            throw new ArrayIndexOutOfBoundsException("La liste est vide");
        }
        else{
            for(int i = 0; i < filepriorite.size();i++){
                if (pluspetit>filepriorite.get(i).getIndicePriorite()){
                    pluspetit = filepriorite.get(i).getIndicePriorite();
                    index = i;
                }
            }
            retour = filepriorite.get(index);
            filepriorite.remove(index);
            return retour;
        }
    }
}
