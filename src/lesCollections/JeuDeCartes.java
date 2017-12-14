/**
 * 
 */
package lesCollections;
import java.util.*;
/**
 * @author wxw
 *
 */
public class JeuDeCartes {
	public final static int nbCarte = Carte.VALEURS.length * Carte.COULEURS.length;
	
	private LinkedList<Carte> tasDeCarte;
	
	public JeuDeCartes(){
		tasDeCarte = new LinkedList<Carte>();
		
		for(int c = Carte.PIC; c <= Carte.TREFLE; c++){
			for(int v = Carte.SEPT; v <= Carte.AS; v++){
				Carte carte = new Carte(v, c);
				tasDeCarte.add(carte);
			}
		}
	}
	
	public void melanger(){
		for (int i=0; i < JeuDeCartes.nbCarte; i++){
			int position = (int)Math.round((JeuDeCartes.nbCarte - 1) * Math.random());
			Carte carte = tasDeCarte.pop();
			tasDeCarte.add(position, carte);
		}
	}
	
	public Carte tirerCarteDeDessus(){
		return this.tasDeCarte.pop();
	}
	
	public Carte tirerCarte(){
		int position = (int)((JeuDeCartes.nbCarte - 1) * Math.random());
		return tasDeCarte.remove(position);
	}
	
	public boolean estVide(){
		return tasDeCarte.isEmpty();
	}
	
	public String toString(){
		return tasDeCarte.toString();
	}
}
