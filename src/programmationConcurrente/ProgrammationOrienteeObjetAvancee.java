/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmationConcurrente;
import java.util.*;
/**
 *
 * @author wangxian
 */
public class ProgrammationOrienteeObjetAvancee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	LinkedList<Voiture> voitures = new LinkedList<Voiture>();
    	for(int i=0; i<5; i++){
    		Voiture v = new Voiture(i, 1, 1, 5, 1);
    		voitures.add(v);
    	}
    	System.out.println("Les voitures sont creees.");
    	System.out.println(voitures);
    	
    	Iterator<Voiture> it = voitures.iterator();
    	while(it.hasNext()){
    		//commence les threads
    		Voiture v = it.next();
    		v.rouler();
    	}
    	
    	//the threads are called randomly
    	for(int i=0; i<3; i++){
    		try{
    			Thread.sleep(Voiture.ARRET);
    		}catch(InterruptedException e){
    			e.fillInStackTrace();
    		}
    		System.out.println(voitures);
    	}
    	
    	System.out.println("Les voitures s'arretent");
    	it = voitures.iterator();
    	while(it.hasNext()){
    		Voiture v = it.next();
    		v.stopper();
    	}
    	System.out.println(voitures);
    }
    
}
