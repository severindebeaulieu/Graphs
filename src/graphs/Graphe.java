package graphs;

import java.util.Set;
import java.util.Stack;

public class Graphe {

	private Set<Sommet> sommets;

	public void ajouterSommet(Sommet s) {
		this.sommets.add(s);
	}

	public boolean existeArc(Sommet s, Sommet t) {
		Arc a = new Arc(s, t);
		return false;
	}

	public void ajouterArc(Sommet s, Sommet t, int val) {
	}

	public int valeurArc(Sommet s, Sommet t) {
		return 0;
	}

	public void enleverArc(Sommet s, Sommet t) {
	}

	public void cfc() {
		int date = 0;
		for (Sommet s : sommets) {
			if (s.getDate() == 0) {
				this.visiter(s, date);
			}
		}
	}

	public int visiter(Sommet s, int date) {

		int minimum = date;
		int m;
		Stack<Sommet> pile = new Stack<Sommet>();

		// On indique le niveau de parcours (date de début du sommet). Cela indique égaement que le sommet est visité
		s.setDate(date);

		date += 1;

		// On empile le sommet courant
		pile.push(s);

		// Pour chaque sommet voisin du sommet courant
		for (Sommet sVoisin : s.getVoisins()) {

			// Si le sommet voisin n'est pas visité
			if (sVoisin.getDate() == 0) {
				//On visite le sommet voisin et on affecte le résultat de cette visite à la variable locale m
				m = visiter(sVoisin, date);
			} else {
				//On affecte la valeur de dateDeb du sommet voisin à m
				m = sVoisin.getDate();
			}
			
			//On affecte la valeur minimum entre m et dateDeb à dateDeb
			if (m < date) {
				date = m;
			}
		}
		
		if (date == s.getDate()) {
			
		}
		
		//Si dateDeb de s est égal a la 
		
		return date;
	}
}
