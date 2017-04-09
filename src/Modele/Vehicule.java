package Modele;

import Voyages.IVisitable;
import Voyages.Visiteur;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicule implements IVisitable {

	private String Id;
	private String nomModel;
	private ArrayList<Section> sections;

	public ArrayList<Section> getSections(){
		return sections;
	}

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
	public List<String> accept(Visiteur v){
		
		return v.Visite(this);
	}


	public String getNomModel() {
		return nomModel;
	}

	public void setNomModel(String nomModel) {
		this.nomModel = nomModel;
	}

}