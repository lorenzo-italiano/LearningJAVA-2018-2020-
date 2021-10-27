package fr.umontpellier.iut;

public class App {
    public static void main(String[] args) {
        compteGroupe compteGroupe = new compteGroupe("FR80MP09F", "Tintin Duchmolle", 10000);

        compteCourant A = new compteCourant(100,"FR8002ME","Monsieur A", "09768568");
        compteGroupe.ajouterCompte(A);

        compteGroupe B = new compteGroupe("FR80DZFQF","Monsieur B", 10000);
        livretA livretA = new livretA(200, "FR80GDSEG","Madame A", 0.2f, 1000);
        livretPlusPlus livretPlusPlus = new livretPlusPlus(300,"FR80FOFES", "Monsieur X", 0.2f);
        livretSpeculation livretSpeculation = new livretSpeculation(200,"FR80OPFLS","Madame X",20, 0.2f,0);
        B.ajouterCompte(livretA);
        B.ajouterCompte(livretPlusPlus);
        B.ajouterCompte(livretSpeculation);

        compteGroupe.ajouterCompte(B);

        System.out.println("solde total : " + compteGroupe.getSolde());
        System.out.println(compteGroupe.toString());


    }
}
