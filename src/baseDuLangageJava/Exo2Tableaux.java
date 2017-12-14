/**
 * 
 */
package baseDuLangageJava;

/**
 * @author wxw
 *
 */
public class Exo2Tableaux {
	public static void main(String[] args){
		//Note: int tab[][] = new int[5][10] => un tableau de 5 lignes et 10 colonnes
		int tab1[][] = {{1, 2, 3,}, {4, 5, 6}};
		int tab2[][] = {{1, 2}, {3, 4}, {5, 6}};
		
		//Note: check the 2 different dimensions
		int nbColonne1 = tab1[0].length;
		int nbLigne2 = tab2.length;
		//System.out.println(nbLigne2);
		if(nbColonne1 != nbLigne2){
			System.out.println("Ces deux tableaux ne sont pas compatibles");
		}else{
			int tabR[][] = new int[tab1.length][tab2[0].length];
			for(int i=0; i<tab1.length; i++){
				for (int j=0; j<tab2[0].length; j++){
					int somme = 0;
					for(int r=0; r<tab1[0].length; r++){
						somme += tab1[i][r]*tab2[r][j];
					}
					tabR[i][j] = somme;
					System.out.println(tabR[i][j] + " ");
				}
				System.out.println("\n");
			}
		}
	}
}
