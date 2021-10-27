package fr.umontpellier.iut.exo1;

import java.util.ArrayList;

public class Departement {
    private String specialite;
    private String adresse;
    private ArrayList<Etudiant> listeetudiant;

    public Departement(String specialite, String adresse, ArrayList<Etudiant> listeetudiant) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.listeetudiant = listeetudiant;
    }

    public void inscrire(Etudiant etudiant){
        listeetudiant.add(etudiant);
    }

    public void desinscrire(Etudiant etudiant){
        listeetudiant.remove(etudiant);
    }

    @Override
    public String toString() {
        String Str = "";
        for(int i=0; i<listeetudiant.size(); i++){
            Str += listeetudiant.get(i);
        }
        return Str;
    }
}
