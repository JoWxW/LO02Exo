package entreesSorties;

import java.io.*;

public class Vehicule implements Pilotable, Orientable{
	
    public final int capaciteReservoie = 50;
    public final double comsommation = 0.1;

    private double essence;
    private boolean roule;

    public Vehicule(double essence, boolean roule) {
        this.essence = essence;
        this.roule = roule;
    }
    
    public Vehicule() {
    }

    public boolean isRoule() {
        return roule;
    }

    public void setRoule(boolean roule) {
        this.roule = roule;
    }



    /*public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }*/

    public double getEssence() {
        return essence;
    }

    public void setEssence(double essence) {
        this.essence = essence;
    }
    
    public void rouler(){
        System.out.println("Vehicule roule.");
    }
    
    public void rouler(int km){
        System.out.println("Veicule roule à " + km + " km/h.");
    }

    @Override
    public void accelerer() {
       // this.km++;
    }

    @Override
    public void ralentir() {
       // this.km--;
    }

    @Override
    public void tournerGauche() {
        System.out.println(string[0] + " " + string[1]);
    }

    @Override
    public void tournerDroite() {
        System.out.println(string[0] + " " + string[2]);
    }
}
