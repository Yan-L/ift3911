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
		for (Compagnie c : cieLts) {
			if (c.getNom() == nom){
				return c;
			}
		}
		System.out.println("Compagnie not found");
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	public Installation recupereInstallation(String id) {
		for (Installation i : installationsLts) {
			if (i.getId() == id){
				return i;
			}
		}
		System.out.println("Installation not found");
		return null;
	}

	public List<Voyage> getVoyagesLst() {
		return voyagesLst;
	}

	
	
}