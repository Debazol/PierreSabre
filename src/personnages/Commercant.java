package personnages;

public class Commercant extends Humain{

	public Commercant(String nom, String boisson, int argent ) {
		super(nom,boisson,argent);
	}
	public int sefaireextorquer() {
		if (argent>0) {
			argent=0;
			String message="J'ai tout perdu le monde est trop injuste";
			parler(message);
			
		}
		return argent;
	}
	public int getargent() {
		return argent;
	}
	public void recevoir(int argent) {
		this.argent=this.argent+argent;
		String message = argent+" sous ! Je te remercie genereux donateur!";
		parler(message);
	}

}
