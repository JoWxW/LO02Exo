package programmationParEvenements;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CompteurGraphique extends Compteur{
	private JFrame fenetre;
	private JLabel texte;
	private JButton demarrer;
	
	public CompteurGraphique() {
		super();
		this.texte = new JLabel("Compteur: " + super.getValeur());
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
				compter();
			}
		});
	}
	
	public void compter() {
		while(super.compte) {
			super.compteur++;
			texte.setText("Compteur : " + super.getValeur());
			super.attendre();;
		}
	}
}
