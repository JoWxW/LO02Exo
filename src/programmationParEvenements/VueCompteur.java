package programmationParEvenements;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VueCompteur implements Observer{
	private CompteurMVC compteur;
	private JFrame fenetre;
	private JLabel texte;
	private JButton demarrer;
	
	public VueCompteur(CompteurMVC c) {
		this.compteur = c;
		this.compteur.addObserver(this);
		this.texte = new JLabel("Compteur: " + c.getValeur());
		this.demarrer = new JButton("Demarrer");
		this.fenetre = new JFrame("Un compteur");
		
		Container reservoir = fenetre.getContentPane();
		reservoir.add(texte, BorderLayout.NORTH);
		reservoir.add(demarrer, BorderLayout.SOUTH);
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.pack();
		fenetre.setVisible(true);
		
		demarrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				compteur.compter();
			}
		});
	}
	
	public void update(Observable o, Object arg) {
		texte.setText("Compteur : " + compteur.getValeur());
	}
	
	public static void main(String[] args) {
		CompteurMVC c = new CompteurMVC();
		VueCompteur vc = new VueCompteur(c);
	}
}
