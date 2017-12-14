/**
 * 
 */
package programmationOrienteObjet;


/**
 * @author wxw
 *
 */
public class Complexe {
	private double reelle;
	private double imaginaire;
	
	public Complexe(double r, double i){
		this.reelle = r;
		this.imaginaire = i;
	}
	
	public double getReelle(){
		return this.reelle;
	}
	public double getImaginaire(){
		return this.imaginaire;
	}
	public void setReelle(double r){
		this.reelle = r;
	}
	public void setImaginaire(double i){
		this.reelle = i;
	}
	
	public Complexe conjuguer(){
		return new Complexe(this.reelle, -this.imaginaire);
	}
	
	public double calculerModule(){
		return Math.sqrt(reelle*reelle + imaginaire*imaginaire);
	}
	
	//Le paramètre doit être un instance de Complexe 
	//mais pas deux "doubles" qui représentent 
	//la partie réelle et imaginaire respectivement
	public void multiplier(Complexe c){
		this.reelle = this.reelle*c.reelle - this.imaginaire*c.imaginaire;
		this.imaginaire = this.reelle*c.imaginaire + this.imaginaire*c.reelle;
	}
	
	public void ajouter(Complexe c){
		this.reelle += c.reelle;
		this.imaginaire += c.imaginaire;
	}
	
	public String toString(){
		if(this.imaginaire > 0){
			return new String("le complexe " + this.reelle + "+" + this.imaginaire + "i");
		}else if(this.imaginaire == 0){
			return new String("le complexe est " + this.reelle);
		}else{
			return new String("le complexe est " + this.reelle + this.imaginaire + "i");
		}
	}
	
	//直接判断o == this的话，比的是address de memoire，永远不会一样
	public boolean equal(Complexe o){
		if((o.reelle == this.reelle) && (o.imaginaire == this.imaginaire)){
			return true;
		}else{
			return false;
		}
	}
	
	public void ajouterReference(Complexe c){
		c.reelle = this.reelle + c.reelle;
		c.imaginaire = this.imaginaire + c.imaginaire;
	}
	public void ajouterReference(int pr, int pi){
		pr += this.reelle;
		pi += this.imaginaire;
	}
	
	public static void main(String[] args){
		Complexe c1, c2, c3;
		c1 = new Complexe(1, 1);
		c2 = new Complexe(1, 2);
		c3 = c1.conjuguer();
		System.out.println(c3.toString());
		//System.out.println(c1.calculerModule());
		//c1.multiplier(c2);
		//System.out.println(c1.toString());
		//c1.ajouter(c2);
		//System.out.println(c1);
		//System.out.println(c1.toString());
		System.out.println(c1.equal(c2));
	}
}
