package fr.umontpellier.iut.partie2;

import java.util.ArrayList;

public interface JeuPuzzle<T> {
    boolean estGagnant();
    ArrayList<?> genererFils();
}
