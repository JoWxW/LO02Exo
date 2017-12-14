/**
 * 
 */
package baseDuLangageJava;

/**
 * @author wxw
 *
 */
public class Exo1Racines {
	public static void main(String[] args){
		double[] coefficients = {1, -1, 1};
		
		double delta = coefficients[1]*coefficients[1] - 4*coefficients[0]*coefficients[2];
		
		double moinsBSurDeuxA = -coefficients[1]/(2*coefficients[0]);
		
		if(delta > 0){
			double racinePartiel = Math.sqrt(delta)/(2*coefficients[0]);
			double racine1 = moinsBSurDeuxA + racinePartiel;
			double racine2 = moinsBSurDeuxA - racinePartiel;
			System.out.println("L'¨¦quation poss¨¨de deux racines r¨¦elles. La premi¨¨me est " + racine1 + ", la deuxi¨¨me est " + racine2 + ".");
		}else if(delta == 0){
			System.out.println("L'¨¦quation poss¨¨de une racine r¨¦elle. Elle est " + moinsBSurDeuxA);
		}else{
			double racinePartiel = Math.sqrt(Math.abs(delta))/(2*coefficients[0]);
			System.out.println("L'¨¦quation poss¨¨de deux racines complexes.");
			System.out.println("La premi¨¨re est " + moinsBSurDeuxA + "+" + racinePartiel + "i");
			System.out.println("La premi¨¨re est " + moinsBSurDeuxA + "-" + racinePartiel + "i");
		}
	}
}
