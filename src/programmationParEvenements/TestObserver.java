package programmationParEvenements;

import ForDelight.FenetreForDelight;

public class TestObserver {
	public static void main(String[] args) {
		Lampe lampe = new Lampe(50);
		ObserverDeLampe observerDeLampe = new ObserverDeLampe();
		lampe.addObserver(observerDeLampe);
		
		lampe.setPuissance(100);
		lampe.eteindre();
		
		//Compteur c = new Compteur();
		//c.compter();
		CompteurGraphique cg = new CompteurGraphique();
		cg.compter();
		//FenetreForDelight fd = new FenetreForDelight();
		//fd.compter();
		//fd.initialiser();
	}
}
