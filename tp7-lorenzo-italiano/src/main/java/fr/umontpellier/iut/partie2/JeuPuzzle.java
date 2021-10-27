package fr.umontpellier.iut.partie2;

import java.util.ArrayList;

public interface JeuPuzzle {
    boolean estGagnant();
    ArrayList<?> genererFils();
}
