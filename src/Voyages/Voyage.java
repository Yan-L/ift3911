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
	private ArrayList<Observateur> observers;
	private ArrayList<UniteParVoyage> unites;
	private boolean changed;

	public Voyage(String id, Time hDep, Time hArr, Date date) {
		HeureDepart = hDep;
		HeureArrivee = hArr;
		DateDepart = date;
		Id = id;
		Visites = new ArrayList<Installation>();
		unites = new ArrayList<UniteParVoyage>();
	}

	public void setPrix(double prix) {
		Prix = prix;
	}

	public double getPrix(){
		return Prix;
	}

	/**
	 * 
	 * @param hdep
	 * @param hArr
	 * @param date
	 * @param prix
	 */
	public void modifier(Time hdep, Time hArr, Date date, double prix) {
		HeureDepart = hdep;
		HeureArrivee = hArr;
		DateDepart = date;
		Prix = prix;
	}

	/**
	 * retourne les unitees libre d'une section donnee
	 * @param sectionType
	 */
	public ArrayList<UniteParVoyage> uniteeDisponible(String sectionType) {
		ArrayList<UniteParVoyage> libre = new ArrayList<UniteParVoyage>();
		for(int i = 0; i<unites.size(); i++){
			UniteParVoyage uPV = unites.get(i);
			if(uPV.getEtat() instanceof EtatLibreUPV && uPV.getSection().equals(sectionType)){
				libre.add(uPV);
			}
		}
		return libre;
	}

	/**
	 * retourne le nb d'unitee dispo pour une section donnee
	 * @param section
	 */
	public int nbUniteesDispo(String section) {
		return uniteeDisponible(section).size();
	}

	/**
	 * 
	 * @param LieuDepart
	 */
	public void setLieuDepart(Installation LieuDepart) {
		this.LieuDepart = LieuDepart;
	}

	/**
	 * 
	 * @param LieuDarrivee
	 */
	public void setLieuDarrivee(Installation LieuDarrivee) {
		this.LieuDarrivee = LieuDarrivee;
	}

	/**
	 * 
	 * @param Visite
	 */
	public void addVisites(Installation Visite) {
		Visites.add(Visite);
	}

	/**
	 * 
	 * @param Vehicule
	 */
	public void setVehicule(Vehicule Vehicule) {
		this.Vehicule = Vehicule;
		for (int i = 0; i<Vehicule.getSections().size();i++){
			Section section = Vehicule.getSections().get(i);
			for (int j = 0; j<section.getUnites().size();j++){
				UniteParVoyage upv = new UniteParVoyage(section.getType(),this, section.getUnites().get(i));
				unites.add(upv);
			}
		}
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