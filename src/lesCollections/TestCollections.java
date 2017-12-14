/**
 * 
 */
package lesCollections;
import java.util.*;
/**
 * @author wxw
 *
 */
public class TestCollections {
	public static void main(String[] args){
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(2);
		Integer i3 = new Integer(3);
		String s1 = new String("Un");
		String s2 = new String("Deux");
		String s3 = new String("Trois");
		
		//Interface de collection <Set>
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(i1);
		hs.add(i2);
		hs.add(i3);
		//afficher false
		System.out.println("HashSet:" + hs.add(i1));
		Iterator<Integer> it = hs.iterator();
		System.out.println(hs.toString());
		System.out.println("-------HashSet------");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("-------/HashSet------");
		
		//Inteface de collection <List>
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(i1);
		al.add(i2);
		al.add(i3);
		//System.out.println("ArrayList:" + al.add(i1));
		al.add(1, 4);
		Iterator<Integer> itAl = al.iterator();
		System.out.println(al.toString());
		System.out.println("-------ArrayList------");
		while(itAl.hasNext()){
			System.out.println(itAl.next());
		}
		System.out.println("-------/ArrayList------");
		
		//Inteface de collection <HashMap>
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(i1, s1);
		hm.put(i2, s2);
		hm.put(i3, s3);
		System.out.println("HashMap:" + hm.put(i1, s1));
		Iterator<Integer> itHm = hm.keySet().iterator();
		System.out.println(hm.toString());
		System.out.println("-------HashMap------");
		while(itHm.hasNext()){
			Integer cle = itHm.next();
			System.out.println(cle + ": " + hm.get(cle));
		}
		System.out.println("-------/HashMap------");
		
		//Interface de collection <Queue>
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(i1);
		ll.add(i2);
		ll.add(i3);
		ll.add(1, i1);
		System.out.println(ll.toString());
		//System.out.println(ll.element());
		Iterator<Integer> itLl = ll.iterator();
		System.out.println("-------LinkedList------");
		while(itLl.hasNext()){
			System.out.println(itLl.next());
		}
		System.out.println("-------/LinkedList------");
		
		//System.out.println(al);
	}
}
