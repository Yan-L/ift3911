package Voyages;

import java.util.ArrayList;

public abstract class Installation {

	private String id;
	private String ville;
	private String nom;
	private ArrayList<Voyage> arrivals;
	private ArrayList<Voyage> departures;

	public Installation(String id, String ville, String nom) {
		this.id = id;
		this.ville = ville;
		this.nom = nom;
		arrivals = new ArrayList<Voyage>();
		departures = new ArrayList<Voyage>();
	}

	public String getId() {
		return id;
	}

	public String getVille() {
		return ville;
	}

	public String getNom() {
		return nom;
	}

	public ArrayList<Voyage> getArrivals() {
		return arrivals;
	}

	public ArrayList<Voyage> getDepartures() {
		return departures;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setArrivals(ArrayList<Voyage> arrivals) {
		this.arrivals = arrivals;
	}

	public void setDepartures(ArrayList<Voyage> departures) {
		this.departures = departures;
	}

	/**
	 * 
	 * @param id
	 * @param ville
	 * @param nom
	 */
	public void modifier(String id, String ville, String nom) {
		// TODO - implement Installation.modifier
		throw new UnsupportedOperationException();
	}

	public ArrayList<Voyage> consulteVoyages() {
		// TODO - implement Installation.consulteVoyages
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param voyage
	 */
	public void addArrival(Voyage voyage) {
		// TODO - implement Installation.addArrival
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param voyage
	 */
	public void addDeparture(Voyage voyage) {
		// TODO - implement Installation.addDeparture
		throw new UnsupportedOperationException();
	}

}