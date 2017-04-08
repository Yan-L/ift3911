package Voyages;

import Modele.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public abstract class Voyage implements IVisitable {

	private double Prix;
	private Time HeureDepart;
	private Time HeureArrivee;
	private Date DateDepart;
	private Installation LieuDepart;
	private Installation LieuDarrivee;
	private ArrayList<Installation> Visites;
	private Vehicule Vehicule;
	private String Id;
	private String state;

	public Voyage(String id, Time hDep, Time hArr, Date date) {
		HeureDepart = hDep;
		HeureArrivee = hArr;
		DateDepart = date;
		Id = id;
		Visites = new ArrayList<Installation>();
	}

	public double getPrix() {
		return Prix;
	}

	public Time getHeureDepart() {
		return HeureDepart;
	}

	public Time getHeureArrivee() {
		return HeureArrivee;
	}

	public Date getDateDepart() {
		return DateDepart;
	}

	public Installation getLieuDepart() {
		return LieuDepart;
	}

	public Installation getLieuDarrivee() {
		return LieuDarrivee;
	}

	public ArrayList<Installation> getVisites() {
		return Visites;
	}

	public Modele.Vehicule getVehicule() {
		return Vehicule;
	}

	public String getId() {
		return Id;
	}

	public void setPrix(double prix) {
		Prix = prix;
	}

	public void setHeureDepart(Time heureDepart) {
		HeureDepart = heureDepart;
	}

	public void setHeureArrivee(Time heureArrivee) {
		HeureArrivee = heureArrivee;
	}

	public void setDateDepart(Date dateDepart) {
		DateDepart = dateDepart;
	}

	public void setVisites(ArrayList<Installation> visites) {
		Visites = visites;
	}

	public void setId(String id) {
		Id = id;
	}

	public void setState(String state) {
		this.state = state;
	}

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
	public ArrayList<Unite> uniteeDisponible(String sectionType) {
		// TODO - implement Voyage.uniteeDisponible
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param section
	 */
	public int nbUniteesDispo(String section) {
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

	public String getState() {
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