/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmationConcurrente;

/**
 *
 * @author wangxian
 */
public class Voiture extends Vehicule implements Runnable{

    public static final int ARRET = 1000;
	private Thread theardRouler;

    
	
	/**
	 * @param capaciteReservoie
	 * @param comsommation
	 * @param essence
	 * @param kilometre
	 */
	public Voiture(int id, int capaciteReservoie, int comsommation, int essence, int kilometre) {
		super(id, capaciteReservoie, comsommation, essence, kilometre);
	}

	public void rouler(){
        this.setRoule(true);
        this.theardRouler = new Thread(this);
        this.theardRouler.start();
    }
    
    public void run(){
    	System.out.println("la voiture demarre");
    	while(this.isRouler() && this.getEssence()>0){
    		this.getMoteur().ajouterKm(this.getMoteur().getVitesse());
    		int essence = this.getEssence();
    		this.setEssence(essence-this.getComsommation() * this.getMoteur().getVitesse());
    		try{
        		Thread.sleep(Voiture.ARRET);
        	}catch(InterruptedException e){
        		e.printStackTrace();
        	}
    		System.out.println(this);
    	}
    	System.out.println("la voiture arrete");
    }
}
