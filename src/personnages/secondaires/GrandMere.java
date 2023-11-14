package tp1.personnages.secondaires;

import tp1.personnages.Humain;

public class GrandMere extends Humain {
    private Humain[] memoire = new Humain [30];
    public GrandMere(String nom, int argent) {
        super(nom, argent, "tisane");
    }

}
