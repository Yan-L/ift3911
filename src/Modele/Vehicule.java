package Modele;

import IVisitable.*;

public abstract class Vehicule implements accept, IVisitable {

	private string Id;
	private string nomModel;

	/**
	 * 
	 * @param type
	 */
	public void creerSection(string type) {
		// TODO - implement Vehicule.creerSection
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param type
	 * @param nbRangees
	 */
	public void creerDisposition(string type, int nbRangees) {
		// TODO - implement Vehicule.creerDisposition
		throw new UnsupportedOperationException();
	}

}