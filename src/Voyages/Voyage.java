package Voyages;

import Modele.*;

public abstract class Voyage implements IVisitable, IVisitable {

	private double Prix;
	private Time HeureDepart;
	private Time HeureArrivee;
	private Date DateDepart;
	private Installation LieuDepart;
	private Installation LieuDarrivee;
	private List<Installation> Visites;
	private Vehicule Vehicule;
	private string Id;
	private State state;

	/**
	 * 
	 * @param hdep
	 * @param hArr
	 * @param date
	 * @param prix
	 */
	public void modifier(Time hdep, Time hArr, Date date, double prix) {
		// TODO - implement Voyage.modifier
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sectionType
	 */
	public List<Unite> uniteeDisponible(string sectionType) {
		// TODO - implement Voyage.uniteeDisponible
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param section
	 */
	public int nbUniteesDispo(string section) {
		// TODO - implement Voyage.nbUniteesDispo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param LieuDepart
	 */
	public void setLieuDepart(Installation LieuDepart) {
		// TODO - implement Voyage.setLieuDepart
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param LieuDarrivee
	 */
	public void setLieuDarrivee(Installation LieuDarrivee) {
		// TODO - implement Voyage.setLieuDarrivee
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Visite
	 */
	public void addVisites(Installation Visite) {
		// TODO - implement Voyage.addVisites
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param vehicule
	 */
	public void addVehicule(Vehicule vehicule) {
		// TODO - implement Voyage.addVehicule
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Vehicule
	 */
	public void setVehicule(Vehicule Vehicule) {
		// TODO - implement Voyage.setVehicule
		throw new UnsupportedOperationException();
	}

	public State getState() {
		return this.state;
	}

	/**
	 * 
	 * @param State
	 */
	public void setState(int State) {
		// TODO - implement Voyage.setState
		throw new UnsupportedOperationException();
	}

}