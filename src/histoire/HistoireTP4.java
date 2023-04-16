package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain Prof= new Humain(54,"Prof","kombucha");
		Prof.direBonjour();
		Prof.acheter(12, "boisson");
		Prof.boire();
		Prof.acheter(2, "jeu");
		Prof.acheter(50, "kimono");
		
		Commercant Marco=new Commercant(20,"Marco","thé");
		Marco.direBonjour();
		Marco.sefaireextorquer();
		Marco.recevoir(15);
		Marco.boire();
		
		Yakuza YakuLeNoir= new Yakuza("Warsong", 30, "Yaku Le Noir", "whisky");
		YakuLeNoir.direBonjour();
		YakuLeNoir.extorquer(Marco);
		
		Ronin  Roro=new Ronin(60,"Roro","shochu");
		Roro.direBonjour();
		Roro.donner(Marco);
		
		Roro.provoquer(YakuLeNoir);
		
		
	
	}

}
