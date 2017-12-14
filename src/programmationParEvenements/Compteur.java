package programmationParEvenements;

public class Compteur {
	public final static int TEMPORISATION = 500;
	protected int compteur;
	protected boolean compte;
	
	public Compteur() {
		this.compte = false;
		this.compteur = 0;
	}
	
	public void compter() {
		this.compte = true;
		while(this.compte) {
			this.compteur++;
			this.attendre();
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
