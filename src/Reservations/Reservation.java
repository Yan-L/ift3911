package Reservations;

import java.util.Date;
import java.util.List;

import Client.Observateur;
import Client.Sujet;
import Voyages.UniteParVoyage;

public class Reservation implements IReservation, Sujet {

	private double Montant;
	private String noReservation;
	private boolean Confirmer = false;
	//private State state;
	private List<Observateur> observers;
	private UniteParVoyage message;
	private boolean changed;

	/*
	 * J'ai rajouté les fonctions pour attacher les observers, les détacher et les notifier. ça les notifie automatiquement lorsqu'il
	 * y a changement.
	 */

	public void attach(Observateur obj){
		if(obj == null){
			throw new  NullPointerException("Null Observer");
		}
		if(!observers.contains(obj)){
			observers.add(obj);
			//obj.setSubject(this);
		}
	}

///Test
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
	public UniteParVoyage getUpdate(Observateur obj){
		return this.message;
	}
	public double modifier(UniteParVoyage unitee){
		this.changed = true;
		this.message = unitee;
		this.notify();
		//todo : La fonction de modification
		return Montant;
	}


	public double calculerFrais() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void annuler() {
		// TODO Auto-generated method stub
		
	}

	public void addPassager(String nom, String prenom, String adresse, String courriel, String telephone,
			Date naissance, String passeport, Date exp) {
		// TODO Auto-generated method stub
		
	}

	public String paiementReservation(String noCarte, Date exp) {
		// TODO Auto-generated method stub
		return null;
	}

}