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
<<<<<<< HEAD
		// TODO - implement GestionnaireAdministration.recupereCie
		Compagnie test = cieLts.get(0);
		//throw new UnsupportedOperationException();
		
		return test;
=======
		for (Compagnie c : cieLts) {
			if (c.getNom() == nom){
				return c;
			}
		}
		System.out.println("Compagnie not found");
		return null;
>>>>>>> f8f4792b4a42346ad2cee5b84e1a795dfe7814f2
	}

	/**
	 * 
	 * @param id
	 */
	public Installation recupereInstallation(String id) {
<<<<<<< HEAD
		// TODO - implement GestionnaireAdministration.recupereInstallation
		Installation test=installationsLts.get(0);
		//throw new UnsupportedOperationException();
		return test;
=======
		for (Installation i : installationsLts) {
			if (i.getId() == id){
				return i;
			}
		}
		System.out.println("Installation not found");
		return null;
>>>>>>> f8f4792b4a42346ad2cee5b84e1a795dfe7814f2
	}

	public List<Voyage> getVoyagesLst() {
		return voyagesLst;
	}

	
	
}