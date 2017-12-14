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
public class Train extends Vehicule{

    
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
