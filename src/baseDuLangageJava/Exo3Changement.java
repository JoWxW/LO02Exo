/**
 * 
 */
package baseDuLangageJava;

/**
 * @author wxw
 *
 */
public class Exo3Changement {
	public static void main(String[] args){
		int nombre = 123456;
		int base = 2;
		int reste = 0;
		int ind = 0;
		//System.out.println(nombre);
		int[] resultat = new int[20];
		String result="";
		do{
			reste = nombre%base;
			nombre = (int)nombre/base;
			resultat[ind] = reste;
			ind++;
		}while(nombre != 0);
		for(int i=ind-1; i>=0; i--){
			result += resultat[i];
		}
		System.out.println(result);
	}
}
