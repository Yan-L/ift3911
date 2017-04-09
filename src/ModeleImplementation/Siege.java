package ModeleImplementation;

import Modele.*;

public class Siege extends Unite {

	private int Rangee;
	private String Colonne;

	public Siege(String section, int rangee, String colonne) {
		super(section);
		Rangee = rangee;
		Colonne = colonne;
	}
}