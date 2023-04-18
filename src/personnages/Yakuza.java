package personnages;

public class Yakuza extends Humain {
	private int reput=4;
	private String clan;

	public Yakuza( String nom, String boisson, int argent,String clan ){
		super(nom,boisson,argent);
		this.clan=clan;
		
	}
	
	public int getforce() {
		return reput;
	}
	public void extorquer(Commercant Victime) {
		String message1="Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?";
		parler(message1);
		String message2= Victime.getNom()+" , si tu tiens à la vie donne moi ta bourse !";
		parler(message2);
		argent+=Victime.getArgent();
		
		String message3="J'ai piqué les "+Victime.getArgent()+" sous de "+Victime.getArgent()+" , ce qui me fait "+argent+" sous "
				+ "dans ma poche. HI HI!";
		parler(message3);
		//Victime.sefaireextorquer();
		reput+=1;	
	}
	
	public void gagner(int gain) {
		argent+=gain;
		String message="Ce ronin pensait vraiment battre "+nom+" du clan "+clan+" ? Je l'ai dépouillé de ses "+ gain+" sous";
		parler(message);
		reput+=1;
		
		
		
	}
	
	public int perdre() {
		
		reput-=1;
		String message ="J’ai perdu mon duel et mes "+argent+" sous, snif... J'ai déshonoré le clan de "
				+ clan;
		
		parler(message);
		argent=0;
		
		return argent;
		
	}

}
