package fr.umontpellier.iut;

import java.util.HashMap;

public class GestionDistances {
    private static HashMap<String, Integer> distance;

    static {
        distance = new HashMap<>();
        distance.put("Montpellier", 0);
        distance.put("Sète", 36);
        distance.put("Sommières", 30);
        distance.put("Nîmes", 58);
        distance.put("Lunel", 30);
        distance.put("Béziers", 80);
    }

    public static int getDistance(String ville) {
        if(distance.get(ville)==null){
            throw new IllegalArgumentException("L'adresse rentrée n'est pas valide");
        }
        return distance.get(ville);
    }
}
