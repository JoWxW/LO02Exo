package ForDelight;

import java.util.Observable;
import java.util.LinkedList;

public class ForDelightV1 extends Observable{
	private String strAct;
	private LinkedList<String> db;
	
	public ForDelightV1() {
		this.strAct = "For Dear Delight";
		this.db = new LinkedList<String>();
	}
	
	public void changerContenu() {
		int position = (int)Math.round(Math.random()*(this.db.size()-1));
		this.strAct = this.db.get(position);
		this.setChanged();
		this.notifyObservers();
	}
	
	public String getStrAct() {
		return this.strAct;
	}
	public void addContenu(String s){
		this.db.add(s);
	}
}
