package tp1.histoires;

import tp1.personnages.*;
import tp1.personnages.principaux.*;

public class MonHistoire {
    public static void main(String [] args) {
        Humain humain = new Humain("Prof", 10, "Porto");
        humain.direBonjour();
        humain.boire();
        Commercant commercant = new Commercant("Marchand", 35);
        commercant.direBonjour();
        Yakusa yakusa = new Yakusa("Yaku le noir", 42,
                "biere", "WarSong");
        yakusa.direBonjour();
        yakusa.extorquer(commercant);
        Ronin ronin = new Ronin("Roro", 61, "sake");
        ronin.donner(10, commercant );
        ronin.provoquer(yakusa);
        ronin.direBonjour();
    }
}
