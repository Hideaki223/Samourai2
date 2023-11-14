package tp1.personnages.principaux;

public class Samourai extends Ronin{

    private String seigneur;

    public Samourai(String nom, int argent, String boisson, String seigneur) {
        super(nom, argent, boisson);
        this.seigneur = seigneur;
    }

    public void boire(String boisson) {
        super.parler("Mmmm, un bon verre de" + boisson);
    }

    @Override
    public void direBonjour() {
        this.direBonjour();
        this.parler("Mon seigneur est " + this.seigneur);
    }
}
