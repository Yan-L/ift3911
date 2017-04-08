package Voyages;

import java.sql.Time;
import java.util.ArrayList;

public abstract class Compagnie {


	private String id;
	private String nom;
	private String idVoyagePrefix;
	private ArrayList<Voyage> voyages;
	
	public Compagnie(String id, String nom, String idVoyagePrefix){
		this.id = id;
		this.nom = nom;
		this.idVoyagePrefix = idVoyagePrefix;
		this.voyages = new ArrayList<Voyage>();
	}

	public String getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getIdVoyagePrefix() {
		return idVoyagePrefix;
	}

	public ArrayList<Voyage> getVoyages() {
		return voyages;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setIdVoyagePrefix(String idVoyagePrefix) {
		this.idVoyagePrefix = idVoyagePrefix;
	}

	public void setVoyages(ArrayList<Voyage> voyages) {
		this.voyages = voyages;
	}

	public abstract ArrayList<Voyage> consulteVoyages();

	/**
	 * 
	 * @param nom
	 * @param idVoyage
	 */
	public abstract void modifier(String nom, String idVoyage);

	/**
	 * 
	 * @param voyage
	 * @param idVoyage
	 */
	public abstract void addVoyage(Voyage voyage, String idVoyage);

	/**
	 * 
	 * @param voyageId
	 * @param prix
	 */
	public abstract void addPrice(String voyageId, double prix);

	/**
	 * 
	 * @param hDep
	 * @param hArr
	 */
	public abstract void creerDetailVoyage(Time hDep, Time hArr);

	/**
	 * 
	 * @param idDetail
	 * @param voyage
	 */
	public abstract void addDetail(String idDetail, Voyage voyage);

}