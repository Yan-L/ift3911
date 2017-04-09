package Administration;

import Voyages.*;
import java.util.List;

public class GestionnaireAdministration {

	private List<Voyage> voyagesLst;
	private List<Installation> installationsLts;
	private List<Compagnie> cieLts;

	/**
	 * 
	 * @param nom
	 */
	public Compagnie recupereCie(String nom) {
		// TODO - implement GestionnaireAdministration.recupereCie
		Compagnie test = cieLts.get(0);
		//throw new UnsupportedOperationException();
		
		return test;
	}

	/**
	 * 
	 * @param id
	 */
	public Installation recupereInstallation(String id) {
		// TODO - implement GestionnaireAdministration.recupereInstallation
		Installation test=installationsLts.get(0);
		//throw new UnsupportedOperationException();
		return test;
	}

	public List<Voyage> getVoyagesLst() {
		return voyagesLst;
	}

	
	
}