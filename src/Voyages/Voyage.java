package Voyages;

import java.sql.Time;
import java.util.Date;

import Administration.VoyageState;
import Client.Observateur;
import Client.Sujet;
import Modele.*;
import java.util.ArrayList;

public abstract class Voyage implements IVisitable, Sujet {

	private double Prix;
	private Time HeureDepart;
	private Time HeureArrivee;
	private Date DateDepart;
	private Installation LieuDepart;
	private Installation LieuDarrivee;
	private ArrayList<Installation> Visites;
	private Vehicule Vehicule;
	private String Id;
	private VoyageState state;
	private List<Observateur> observers;
	private boolean changed;

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
	public void attach(Observateur obj){
		if(obj == null){
			throw new  NullPointerException("Null Observer");
		}
		if(!observers.contains(obj)){
			observers.add(obj);
			obj.setSubject(this);
		}
	}

	public void detach(Observateur obj){
		if(obj == null){
			throw new  NullPointerException("Null Observer");
		}
		observers.remove(obj);
	}

	public void notifyObs(){
		if(!changed){
			return;
		}
		this.changed = false;
		for(Observateur obj : this.observers){
			obj.update();
		}
	}
	public VoyageState getUpdate(Observateur obj){
		return this.state;
	}

}