package personnages;

public class Ronin extends Humain {
	private int honneur=1;
	

	public Ronin(String nom, String boisson,int argent  ) {
		// TODO Auto-generated constructor stub
		super(nom,boisson,argent);
	}
	
	public int getargent() {
		return argent;
	}
	public void donner(Commercant beneficiaire) {
		int don=(argent/10);
		String message=beneficiaire.nom+" prend ces "+don+" sous.";
		parler(message);
		beneficiaire.recevoir(don);
		argent-=don;
	
	}
	public void provoquer(Yakuza adversaire) {
		int force = honneur*2;
		String message1="Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre\r\n"
				+ "marchand!";
		parler(message1);
		if (force>=adversaire.getforce()) {	
			String message2=" Je t’ai eu petit yakusa!";
			parler(message2);
			argent+=adversaire.argent;
			adversaire.perdre();
		}
		else {
			honneur-=1;
			
			String message3="J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup";
			parler(message3);
			adversaire.gagner(argent);
			argent=0;
		}
	}

}
