package ModeleImplementation;

import Modele.*;

public class Avion extends Vehicule {

	private static int maxRangees = 100;
	private static int maxColonnes = 10;

	public Avion(String id, String nomModel) {
		super(id, nomModel);
	}

	/**
	 *
	 * @param type F, A, P, E
	 * @return
	 */
	@Override
	public Section creerSection(String type) {
		Section section;
		if(type.equals("F")){
			section = new Premiere();
		}else if(type.equals("A")){
			section= new Affaire();
		}else if(type.equals("P")){
			section = new EconomiquePremium();
		}else{
			section = new Economique();
		}
		return section;
	}

	@Override
	public void creerDisposition(String type, int nbRangees) {

	}
}