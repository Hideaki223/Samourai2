package tp1.personnages.principaux;

import tp1.personnages.Humain;

public class Commercant extends Humain {


    public Commercant(String nom, int argent){
        super(nom,argent,"thé");
    }

    public int seFaireExtorquer(){
        int monnaie = getArgent();
        this.perdreArgent(monnaie);
        this.parler("J'ai tout perdu ! Le monde est trop injuste...");
        return monnaie;
    }

    public void recevoir(int argent){
        this.gagnerArgent(argent);
        this.parler("Je te remercie généreux donateur !");
    }
}
