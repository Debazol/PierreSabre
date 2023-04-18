package personnages;

public class Humain {
	protected int argent;
	protected String nom;
	protected String boisson;
	protected int nbConnaissance=0;
	private Humain[] memoire = new Humain[30];
	
	public Humain(String nom, String boisson,int argent  ) {
		this.argent=argent;
		this.boisson=boisson;
		this.nom=nom;
	}
	
	public int getArgent() {
		return argent;
	}
	public String getNom() {
		return nom;
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
	private void memoriser(Humain humain) {
		 if (nbConnaissance<30){
		 memoire[nbConnaissance]=humain;
		nbConnaissance+=1;
		 }
		 else {
			for (int i=0;i<nbConnaissance;i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[29]=humain;
		}
		
	}
	
	
	private void repondre(Humain humain) {
		humain.direBonjour();
	}
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		repondre(autreHumain);
		memoriser(autreHumain);
		autreHumain.memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		String message = "Je connais beaucoup de monde dont: ";
		parler(message);
		for (int i=0;i<nbConnaissance;i++) {
			 System.out.println(memoire[i].getNom());
		}
		
	}

}
