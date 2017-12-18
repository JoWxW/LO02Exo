package entreesSorties;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Console {
	private final static  String COMMANDE_QUITTER = "quitter";
	
	private InputStream input;
	private PrintStream output;
	
	public Console(InputStream input, PrintStream output) {
		this.input = input;
		this.output = new PrintStream(output);
	}
	public Console() {
		this.input = System.in;
		this.output = System.out;
	}
	
	public void afficher(String message) {
		this.output.println(message);
	}
	
	public int lireInt() {
		String chaine = this.lireChaine();
		
		int resultat = Integer.parseInt(chaine);
		return resultat;
	}
	public String lireChaine() {
		BufferedReader br = new BufferedReader(new InputStreamReader(this.input));
		String chaine = null;
		try {
			chaine = br.readLine();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return chaine;
	}
	
	public void echo() {
		this.afficher("------CONSOLE-------");
		String saisie = null;
		do {
			this.afficher("Veuillez saisir une chaine de caracteres, tapez " + Console.COMMANDE_QUITTER + " pour quitter.");
			saisie = this.lireChaine();
			
			if(saisie != null) {
				this.afficher("Vous avez saisi : " + saisie);
			}else {
				this.afficher("Vous n'avez rien saisi.");
			}
		}while(saisie.equals(Console.COMMANDE_QUITTER) == false);
		this.afficher("------/CONSOLE-------");
	}
	
	public static void main(String[] args) {
		Console c = new Console();
		System.out.println(c.lireInt());
		
		c.echo();
	}
}
