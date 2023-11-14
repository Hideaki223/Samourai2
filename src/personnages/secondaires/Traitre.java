package tp1.personnages.secondaires;

import tp1.personnages.Humain;
import tp1.personnages.principaux.Commercant;
import tp1.personnages.principaux.Samourai;

public class Traitre extends Samourai {

    private int traitrise;
    public Traitre(String nom, int argent, String boisson, String seigneur) {
        super(nom, argent, boisson, seigneur);
        this.traitrise = 0;
    }

    public void extorquer(Commercant c){
        if (this.traitrise < 3) {
            int monnaie = c.seFaireExtorquer();
            this.gagnerArgent(monnaie);
            this.traitrise += 1;
            this.parler("J'ai piqué le fric de " + c.getNom());
        } else {
            this.parler("Je ne peut pas l'extorquer, j'ai atteint une niveau de traitrise trop élevé !");
        }
    }

    @Override
    public void direBonjour() {
        super.direBonjour();
        this.parler("Mon niveau de traitrise est de " + this.traitrise + ".");
    }

    public void faireLeGentil(Humain h, int argent) {
        this.perdreArgent(argent);
        h.gagnerArgent(argent);
        this.traitrise -= (1/10*argent);
        this.parler("Tiens " + h.getNom() + " je te donne " + argent + " sous.");
    }
}
