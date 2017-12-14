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
public class ProgrammationOrienteeObjetAvancee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicule vehicule1 = new Vehicule();
        Voiture voiture1 = new Voiture();
        Train train1 = new Train();
        
        Vehicule vehicule2 = new Voiture();
        new Vehicule(){
            public void roulerAbstraite(){
                System.out.println("Rouler Abstraite");
            }
        }.roulerAbstraite();
        
        
        Vehicule vehicule11 = new Vehicule(1, 1.2, 1, 1.2, true);
        Voiture voiture11 = new Voiture(2, 2.2, 2, 2.2, false);
        System.out.println(voiture11.getCapaciteReservoie());
        voiture11.accelerer();
        System.out.println("Voiture11 km: " + voiture11.getKm());
        train1.tournerDroite();
        Voiture.Moteur moteur1 = voiture1.new Moteur();
        voiture11.tournerDroite();
        
        Voiture UniqueV = new Voiture(){
            public void rouler(){
                System.out.println("Voiture unique roule.");
            }
        };
    }
    
}
