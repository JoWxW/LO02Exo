/**
 * 
 */
package lesCollections;
import java.util.*;
/**
 * @author wxw
 *
 */
public class Joueur {
	
	private String nom;
	private LinkedList<Carte> main;
	
	private Carte derniereCarteJouee;
	
	public Joueur(String nom){
		this.nom = nom;
		main = new LinkedList<Carte>();
	}
	
	public Carte getDerniereCarteJouee(){
		return this.derniereCarteJouee;
	}
	
	public String getNom(){
		return this.nom;
	}
	
	public void setNom(String nom){
		this.nom = nom;
	}
	
	public void prendreCarte(Carte c){
		this.main.add(c);
	}
	
	public Carte jouerCarte(){
		this.derniereCarteJouee = this.main.pop();
		return this.derniereCarteJouee;
	}
	
	public boolean aGagne(){
		if(this.main.size() == JeuDeCartes.nbCarte)
		{
			return true;
		} else {
			return false;
		}
	}
	
	public boolean aPerdu(){
		if(this.main.size() == 0){
			return true;
		} else{
			return false;
		}
	}
	
	public String toString(){
		//StringBuffer和String的区别： 前者长度和内容可变，后者不可变。
		StringBuffer sb = new StringBuffer();
		sb.append(this.nom);
		sb.append(" : ");
		sb.append(this.main);
		sb.append("\n");
		return sb.toString();
	}
}
