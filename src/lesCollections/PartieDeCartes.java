/**
 * 
 */
package lesCollections;
import java.util.*;
/**
 * @author wxw
 *
 */
public class PartieDeCartes {
	private ArrayList<Joueur> joueurs;
	private JeuDeCartes cartes;
	private boolean partieEnCours;
	
	public PartieDeCartes(){
		joueurs = new ArrayList<Joueur>();
		cartes = new JeuDeCartes();
		cartes.melanger();
		partieEnCours = false;
	}
	
	public void ajouterJoueur(Joueur joueur){
		if(this.partieEnCours == false){
			this.joueurs.add(joueur);
		}
	}
	
	public void retirerJoueur(Joueur joueur){
		this.joueurs.remove(joueur);
	}
	
	//牌数不能被游戏人数整除则报错
	public void distribuerCarte(){
		this.partieEnCours = true;
		while(this.cartes.estVide() == false){
			Iterator<Joueur> it = this.joueurs.iterator();
			while(it.hasNext()){
				Joueur j = (Joueur)it.next();
				j.prendreCarte(this.cartes.tirerCarteDeDessus());
				//System.out.println("ok");
			}
		}
	}
	
	public void jouer(){
		ArrayList<Carte> cartesJouees = this.jouerCartes();
		System.out.println("Cartes jouées : " + cartesJouees);
		
		Carte cg = this.carteGagnante(cartesJouees);
		Joueur jg = this.joueurGagnant(cg);
		System.out.println(jg.getNom() + "remporte le tour avec " + cg);
		
		this.recupererCarteJouees(jg, cartesJouees);
		this.retirerPerdant();
	}
	
	/*<Methods utilisees internes>*/
	private ArrayList<Carte> jouerCartes(){
		ArrayList<Carte> carteJouees = new ArrayList<Carte>();
		Iterator<Joueur> itDepot = this.joueurs.iterator();
		while(itDepot.hasNext()){
			Joueur j = (Joueur)itDepot.next();
			carteJouees.add(j.jouerCarte());
		}
		return carteJouees;
	}
	
	private Carte carteGagnante(ArrayList<Carte> cl){
		Carte carteGagnante = null;
		Iterator<Carte> it = cl.iterator();
		while(it.hasNext()){
			Carte c = (Carte)it.next();
			if(carteGagnante == null){
				carteGagnante = c;
			} else {
				if(c.getValeur() > carteGagnante.getValeur()){
					carteGagnante = c;
				}
			}
		}
		return carteGagnante;
	}
	
	private Joueur joueurGagnant(Carte carte){
		Joueur joueurGagnant = null;
		Iterator<Joueur> it = this.joueurs.iterator();
		while(it.hasNext() && joueurGagnant == null){
			Joueur j = (Joueur)it.next();
			Carte c = j.getDerniereCarteJouee();
			if(carte.equals(c)){
				joueurGagnant = j;
			}
		}
		return joueurGagnant;
	}
	
	private void recupererCarteJouees(Joueur j, ArrayList<Carte> carteJouees){
		Iterator<Carte> it = carteJouees.iterator();
		while(it.hasNext()){
			j.prendreCarte((Carte)it.next());
		}
	}
	
	private void retirerPerdant(){
		Iterator<Joueur> it = this.joueurs.iterator();
		while(it.hasNext()){
			Joueur j = it.next();
			if(j.aPerdu()){
				//this.joueurs.remove(j);
				it.remove();
				System.out.println(j.getNom() + " a perdu!");
			}
		}
	}
	/*</Methods utilisees internes>*/
	
	public boolean estTerminer(){
		Iterator<Joueur> it = this.joueurs.iterator();
		boolean estTerminee = false;
		while(it.hasNext() && estTerminee == false){
			Joueur j = it.next();
			estTerminee = j.aGagne();
		}
		return estTerminee;
	}
	
	public String toString(){
		return joueurs.toString();
	}
	
	public static void main(String[] args){
		PartieDeCartes pdc = new PartieDeCartes();
		Joueur j1 = new Joueur("j1");
		Joueur j2 = new Joueur("j2");
		Joueur j3 = new Joueur("j3");
		Joueur j4 = new Joueur("j4");
		
		pdc.ajouterJoueur(j3);
		pdc.ajouterJoueur(j2);
		pdc.ajouterJoueur(j1);
		pdc.ajouterJoueur(j4);
		
		pdc.distribuerCarte();
		System.out.println(pdc);
		
		while(pdc.estTerminer() == false){
			pdc.jouer();
			System.out.println(pdc);
			/*<Gestion des exceptions>*/
			try{
				Thread.sleep(1000);
			} catch (InterruptedException e){
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*</Gestion des exceptions>*/
		}
	}
}
