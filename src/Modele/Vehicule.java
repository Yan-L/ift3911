package Modele;

import Voyages.IVisitable;
import Voyages.Visiteur;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicule implements IVisitable {

	private String Id;
	private String nomModel;
	private ArrayList<Section> sections;

	public Vehicule(String id, String nomModel) {
		Id = id;
		this.nomModel = nomModel;
		sections = new ArrayList<Section>();
	}

	public ArrayList<Section> getSections(){
		return sections;
	}

	public void addSection(Section section){
		sections.add(section);
	}

	/**
	 * 
	 * @param type F, A, P, E, I, O, S, F, D
	 */
	public abstract Section creerSection(String type);

	/**
	 * 
	 * @param type
	 * @param nbRangees
	 */
	public abstract void creerDisposition(String type, int nbRangees);

	public List<String> accept(Visiteur v){
		
		return v.Visite(this);
	}


	public String getNomModel() {
		return nomModel;
	}

}