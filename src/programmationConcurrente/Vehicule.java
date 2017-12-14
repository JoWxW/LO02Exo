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
public abstract class Vehicule implements Pilotable, Orientable{
	private int id;
    private int capaciteReservoie;
    private int comsommation;
    private int essence;
    private boolean roule;
    private Moteur moteur;

    public Vehicule(int id, int capaciteReservoie, int comsommation, int essence, int kilometre) {
        this.id = id;
    	this.capaciteReservoie = capaciteReservoie;
        this.comsommation = comsommation;
        this.essence = essence;
        this.roule = false;
        this.moteur = new Moteur(kilometre);
    }
    
    public Vehicule() {
    }

    public boolean isRouler() {
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

    public int getComsommation() {
        return comsommation;
    }

    public void setComsommation(int comsommation) {
        this.comsommation = comsommation;
    }

    public int getEssence() {
        return essence;
    }

    public void setEssence(int essence) {
        this.essence = essence;
    }
    
    public void rouler(int km){
        System.out.println("Veicule roule ид " + km + " km/h.");
    }
    public void stopper(){
    	this.roule = false;
    }
    public abstract void rouler();

    @Override
    public void accelerer(int v) {
        this.moteur.vitesse += v;
    }

    @Override
    public void ralentir(int v) {
        this.moteur.vitesse -= v;
    }

    @Override
    public void tournerGauche() {
        System.out.println(string[0] + " " + string[1]);
    }

    @Override
    public void tournerDroite() {
        System.out.println(string[0] + " " + string[2]);
    }
    
    public Moteur getMoteur(){
    	return this.moteur;
    }
    
    public String toString(){
    	return "la voiture " + this.id;
    }
    
    class Moteur{
        private int kilometre;
        private int vitesse;

        public Moteur(int kilometre) {
            this.kilometre = kilometre;
        }

        public int getKilometre() {
            return kilometre;
        }
        
        public int getVitesse() {
            return vitesse;
        }

        public void setKilometre(int kilometre) {
            this.kilometre = kilometre;
        }
        
        public void setVitesse(int vitesse) {
            this.vitesse = vitesse;
        }
        
        public void afficher(){
            System.out.println(this.kilometre);
        }
        
        public void ajouterKm(int km){
        	this.kilometre += km;
        } 
    }
}
