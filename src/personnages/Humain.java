package tp1.personnages;

public class Humain {

    private final String nom;
    private int argent;
    private final String boisson;

    public Humain(String nom, int argent, String boisson) {
        this.nom = nom;
        this.argent = argent;
        this.boisson = boisson;
    }

    public void parler(String message) {
        System.out.println(message);
    }

    public void direBonjour() {
        this.parler("Bonjour ! Je m'appelle " + this.nom + ", j'aime boire du " + this.boisson + " et j'ai " + this.argent + " sous en poche. ");
    }

    public void boire() {
        this.parler("Mmmm ! Un bon verre de " + this.boisson + " ! GLOUPS !");
    }

    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return argent;
    }

    public String getBoisson() {
        return boisson;
    }

    public void gagnerArgent(int montant) {
        this.argent += montant;
    }

    public void perdreArgent(int montant) {
        this.argent -= montant;
    }

}
