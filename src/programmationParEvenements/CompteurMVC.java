package programmationParEvenements;

public class CompteurMVC extends Observable{
	public final static int TEMPORISATION = 500;
	protected int compteur;
	protected boolean compte;
	
	public CompteurMVC() {
		this.compte = false;
		this.compteur = 0;
	}
	
	public void compter() {
		this.compte = true;
		while(this.compte && this.compteur<51) {
			this.compteur++;
			this.setChanged();
			this.notifyObservers();
			this.attendre();
			System.out.println(this.compteur);
		}
	}
	
	public void arreter() {
		this.compte = false;
	}
	
	public int getValeur() {
		return this.compteur;
	}
	
	public void attendre() {
		try {
			Thread.sleep(Compteur.TEMPORISATION);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
