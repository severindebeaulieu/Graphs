package graphs;

public class Arc {
	private Sommet sOrigine, sDestination;

	public Arc(Sommet s1, Sommet s2) {
		this.sOrigine = s1;
		this.sDestination = s2;
	}

	public Sommet destination() {
		return this.sDestination;
	}

	public Sommet origine() {
		return this.sOrigine;
	}

	public String toString() {
		return "(" + this.sOrigine + ", " + this.sDestination + ")";
	}
}