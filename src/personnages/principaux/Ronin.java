package tp1.personnages.principaux;

import tp1.personnages.Humain;

public class Ronin extends Humain {
    private int honneur;
    public Ronin(String nom, int argent, String boisson) {
        super(nom, argent, boisson);
        this.honneur = 1;
    }

    public void donner(int montant, Commercant c) {
        this.parler("Tiens " + c.getNom() + " voilà " + montant + " sous.");
        this.perdreArgent(montant);
        c.recevoir(montant);
    }

    public void provoquer(Yakusa y){
        if (2*this.honneur > y.getReputation()) {
            int monnaie = y.getArgent();
            y.perdreDuel();
            this.gagnerArgent(monnaie);
            this.honneur += 1;
            this.parler("Je t'ai eu petit yakusa !");
        } else {
            this.honneur -= 1;
            this.parler("J'ai perdu. Sayonara.");
        }
    }
}
