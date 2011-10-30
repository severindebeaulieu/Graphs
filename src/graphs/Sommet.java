package graphs;

import java.util.Set;

public class Sommet implements Comparable{
	private String nom;
	private int date;

	public Sommet(String nn) {
		this.nom = nn;
		this.date = 0;
	}
	

	public String toString() {
		return "" + nom;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int getDate() {
		return this.date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public Set<Sommet> getVoisins() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
