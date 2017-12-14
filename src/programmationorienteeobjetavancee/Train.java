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
public class Train extends Vehicule{

    public Train() {
    }
    
    public Train(int capaciteReservoie, double comsommation, int km, double essence, boolean roule) {
        super(capaciteReservoie, comsommation, km, essence, roule);
    }

    @Override
    public void rouler(int km) {
        super.rouler(km); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEssence(double essence) {
        super.setEssence(essence); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getEssence() {
        return super.getEssence(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setKm(int km) {
        super.setKm(km); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getKm() {
        return super.getKm(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setComsommation(double comsommation) {
        super.setComsommation(comsommation); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getComsommation() {
        return super.getComsommation(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCapaciteReservoie(int capaciteReservoie) {
        super.setCapaciteReservoie(capaciteReservoie); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCapaciteReservoie() {
        return super.getCapaciteReservoie(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRoule(boolean roule) {
        super.setRoule(roule); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isRoule() {
        return super.isRoule(); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void rouler(){
        System.out.println("Train roule.");
    }
    
    public void tournerGauche() {
        System.out.println("Ne pas pouvoir tourner");
    }

    @Override
    public void tournerDroite() {
        System.out.println("Ne pas pouvoir tourner");
    }
}
