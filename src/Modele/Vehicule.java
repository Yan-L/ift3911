package Modele;

import Voyages.IVisitable.*;

public abstract class Vehicule implements accept, Voyages.IVisitable {

	private String Id;
	private String nomModel;

	/**
	 * 
	 * @param type
	 */
	public void creerSection(String type) {
		// TODO - implement Vehicule.creerSection
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param type
	 * @param nbRangees
	 */
	public void creerDisposition(String type, int nbRangees) {
		// TODO - implement Vehicule.creerDisposition
		throw new UnsupportedOperationException();
	}

}