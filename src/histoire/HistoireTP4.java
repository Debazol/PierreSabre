package histoire;

import personnages.Humain;

import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain Prof= new Humain("Prof","kombucha",54);
		Prof.direBonjour();
		Prof.acheter(12, "boisson");
		Prof.boire();
		Prof.acheter(2, "jeu");
		Prof.acheter(50, "kimono");
		
		Commercant Marco=new Commercant("Marco","thé",20);
		Marco.direBonjour();
		Marco.sefaireextorquer();
		Marco.recevoir(15);
		Marco.boire();
		
		Yakuza YakuLeNoir= new Yakuza("Yaku Le Noir", "whisky", 30,"Warsong" );
		YakuLeNoir.direBonjour();
		YakuLeNoir.extorquer(Marco);
		
		Ronin  Roro=new Ronin("Roro","shochu",60);
		Roro.direBonjour();
		Roro.donner(Marco);
		
		Roro.provoquer(YakuLeNoir);
		
		
	
	}

}
