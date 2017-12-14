package ForDelight;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FenetreForDelight implements Observer{
	private ForDelightV1 fd;
	private JFrame fenetre;
	private JLabel texte;
	private JButton demarrer;
	
	public FenetreForDelight(ForDelightV1 fd) {
		this.fd = fd;
		fd.addObserver(this);
		this.texte = new JLabel("For Dear Delight");
		this.demarrer = new JButton("click");
		this.fenetre = new JFrame("For Delight");
		
		Container reservoir = fenetre.getContentPane();
		reservoir.add(texte, BorderLayout.NORTH);
		
		reservoir.add(demarrer, BorderLayout.SOUTH);
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.pack();
		fenetre.setVisible(true);
		
		
		demarrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				fd.changerContenu();
			}
		});

	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.texte.setText(this.fd.getStrAct());
	}
}
