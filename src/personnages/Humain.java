package personnages;

public class Humain {
	protected int argent;
	protected String nom;
	protected String boisson;
	public Humain(int argent , String nom, String boisson) {
		this.argent=argent;
		this.boisson=boisson;
		this.nom=nom;
	}
	public void gagnerArgent(int monnaie) {
		argent+=monnaie;
	}
	
	public void perdreArgent(int perte) {
		if (argent>0) {
			argent-=perte;
		}
		if ((argent<0) || (perte>=argent)) {
			argent=0;
		}
	}
	protected void parler(String texte) {
		System.out.println(texte);
	}
	public void direBonjour() {
		String message="Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boisson;
		parler(message);
	}
	public void boire() {
		String message= "Mmmm, un bon verre de "+boisson+" ! GLOUPS!";
		parler(message);
	}
	public void acheter(int prix, String produit) {
		if (argent>prix) {
			String message="J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir une boisson a "+prix+" sous";
			parler(message);
			perdreArgent(prix);
			
		}
		else {
			String message="Je n'ai plus que "+argent+" sous en poche."
					+ " Je ne peux meme pas m'offrir un "+produit+" à "+prix+" sous.";
			parler(message);
		}
	}

}
