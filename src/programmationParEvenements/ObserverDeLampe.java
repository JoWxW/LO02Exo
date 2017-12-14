package programmationParEvenements;

public class ObserverDeLampe implements Observer {
	public ObserverDeLampe() {
	}
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("L'observer de lampe: la puissance a changé à " +( (Lampe)o).getPuissance());
		//System.out.println("arg: " + arg);
	}
	
}
