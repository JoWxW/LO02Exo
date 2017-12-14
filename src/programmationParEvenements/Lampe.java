package programmationParEvenements;

public class Lampe extends Observable{

    public final static int PUISSANCE_STANDARD = 100;
    private int puissance;
    //private boolean allumee;

    public Lampe(int puissance) {
    		this.puissance = puissance;
    }

    public int getPuissance() {
    		return this.puissance;
    }
    
    public void setPuissance(int puissance) {
    		if(this.puissance != puissance) {
    			this.puissance = puissance;
    			this.setChanged();
    			System.out.println("Lampe: la puissance a changé.");
    		}
    		this.notifyObservers();
    }
    
    public void eteindre() {
    		this.puissance = 0;
    		this.setChanged();
    		this.notifyObservers();
    }
}
