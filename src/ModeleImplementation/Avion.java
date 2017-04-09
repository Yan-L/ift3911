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
	public void creerSection(String type,  String typeDispo, int nbRangees) {
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
		Disposition dispo;
		if(typeDispo.equals("L")){
			dispo = new Large(nbRangees);
		}else if (typeDispo.equals("M")){
			dispo = new Moyen(nbRangees);
		}else if(typeDispo.equals("C")){
			dispo = new Confort(nbRangees);
		}else{
			dispo = new Etroit(nbRangees);
		}
		section.setDisposition(dispo);
		section.creerUnites();
		super.addSection(section);
	}


}