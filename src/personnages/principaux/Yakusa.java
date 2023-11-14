package tp1.personnages.principaux;

import tp1.personnages.Humain;

public class Yakusa extends Humain {
    private final String clan;
    private int reputation;
    public Yakusa(String nom, int argent, String boisson, String clan) {
        super(nom, argent, boisson);
        this.clan = clan;
        this.reputation = 0;
    }

    public String getClan() {
        return clan;
    }

    public int getReputation() {
        return reputation;
    }

    public void extorquer(Commercant c){
        int monnaie = c.seFaireExtorquer();
        this.gagnerArgent(monnaie);
        this.reputation += 1;
        this.parler("J'ai piqué le fric de " + c.getNom());
    }

    public void gagnerDuel(){
        this.reputation += 1;
        this.parler("J'ai gagné sale ronin !");
    }

    public void perdreDuel() {
        this.parler("J'ai perdu mon duel et mes " + this.getArgent() + " sous, snif...");
        this.perdreArgent(this.getArgent());
        this.reputation -= 1;
    }

    public void direBonjour(){
        super.direBonjour();
        this.parler("Mon clan est celui de " + this.clan + ".");
    }
}
