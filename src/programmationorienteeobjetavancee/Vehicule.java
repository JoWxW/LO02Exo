/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmationorienteeobjetavancee;

/**
 *
 * @author wangxian
 */
public class Vehicule implements Pilotable, Orientable{
    private int capaciteReservoie;
    private double comsommation;
    private int km;
    private double essence;
    private boolean roule;

    public Vehicule(int capaciteReservoie, double comsommation, int km, double essence, boolean roule) {
        this.capaciteReservoie = capaciteReservoie;
        this.comsommation = comsommation;
        this.km = km;
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


    public int getCapaciteReservoie() {
        return capaciteReservoie;
    }

    public void setCapaciteReservoie(int capaciteReservoie) {
        this.capaciteReservoie = capaciteReservoie;
    }

    public double getComsommation() {
        return comsommation;
    }

    public void setComsommation(double comsommation) {
        this.comsommation = comsommation;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

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
        this.km++;
    }

    @Override
    public void ralentir() {
        this.km--;
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
