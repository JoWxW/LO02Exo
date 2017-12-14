/**
 * 
 */
package programmationOrienteObjet;

/**
 * @author wxw
 *
 */
public class PolynomeDegreDeux {
	private double[] polynome;
	
	public PolynomeDegreDeux(double x2, double x1, double x0){
		polynome = new double[3];
		polynome[0] = x2;
		polynome[1] = x1;
		polynome[2] = x0;
	}
	
	public double getDelta(){
		return this.polynome[1]*this.polynome[1] - 4*this.polynome[0]*this.polynome[2];
	}
	
	public double getMoinsBSurDeuxA(){
		return -this.polynome[1]/(2*this.polynome[0]);
	}
	
	public double getRacinePartiel(){
		return Math.sqrt(Math.abs(this.getDelta()))/(2*this.polynome[0]);
	}
	
	public Complexe[] getRoot(){
		Complexe[] racines;
		if(this.getDelta() > 0){
			racines = new Complexe[2];
			racines[0] = new Complexe(this.getMoinsBSurDeuxA() + this.getRacinePartiel(), 0);
			racines[1] =new Complexe(this.getMoinsBSurDeuxA() - this.getRacinePartiel(), 0);
		}else if(this.getDelta() == 0){
			racines = new Complexe[1];
			racines[0] = new Complexe(this.getMoinsBSurDeuxA(), 0);
		}else{
			racines = new Complexe[2];
			racines[0] = new Complexe(this.getMoinsBSurDeuxA(), this.getRacinePartiel());
			//racines[1] = new Complexe(this.getMoinsBSurDeuxA(), -this.getRacinePartiel());
			racines[1] = racines[0].conjuguer();
		}
		return racines;
	}
	
	public String toString(){
		return new String(this.polynome[0] + "x2 + " + this.polynome[1] + "x + " + this.polynome[2]);
	}
	
	public boolean equal(Double[] d){
		if(d.length == this.polynome.length && d[0]==this.polynome[0] && d[1]==this.polynome[1] && d[2]==this.polynome[2]){
			return true;
		}else{
			return false;
		}
	}
}
