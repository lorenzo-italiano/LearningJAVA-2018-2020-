package main;
import java.util.*;

/**
 * 
 */
public class Fichier {

    public Fichier(String contenu) {
        this.contenu = contenu;
    }

    private String contenu;

    @Override
    public String toString() {
        return "Fichier{" +
                "contenu='" + contenu + '\'' +
                '}';
    }
}