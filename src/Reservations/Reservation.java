package Reservations;

import java.util.Date;
import java.util.List;

import Client.Observateur;
import Client.ReservState;
import Client.Sujet;
import Paiements.Paiement;
import Paiements.PaiementCredit;
import Voyages.UniteParVoyage;

public class Reservation implements IReservation, Sujet {

	private double montant;
	private String noReservation;
	private boolean confirmer = false;
	private ReservState state;
	private List<Observateur> observers;
	private boolean changed;
	private PaiementCredit paiement;
	private Passager passager = null;
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
			obj.setSubject(this);
		}
	}

///Test sdafsad
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
	public ReservState getUpdate(Observateur obj){
		return this.state;
	}
	public double modifier(UniteParVoyage unitee){ //here
		this.changed = true;
		this.state.setMessage(unitee);
		this.state.setNoReserv(this.noReservation);
		this.notify();
		//todo : La fonction de modification
		
		return 0;
	}

	public double calculerFrais() {
		return montant;
	}

	public void annuler() {
		this.paiement.annuler();
	}

	public void addPassager(String nom, String prenom, String adresse, String courriel, String telephone,  //here
		Date naissance, String passeport, Date exp) {
			this.passager = new Passager(nom, prenom, adresse, courriel,  telephone, naissance);
			this.passager.setPasseport(new Passeport(passeport,exp));
		
	}

	public String paiementReservation(String noCarte, Date exp) {
		// TODO Auto-generated method stub
		this.paiement = new PaiementCredit(noCarte, exp, this.montant);
		if(paiement.getConfirmation()){
			this.confirmer = true;
			String message = paiement.transaction();
			return message;
		}
		else return "Carte invalide ou fond insufisant";
	}

	public String getNoReservation() {
		return noReservation;
	}

	public void setNoReservation(String noReservation) {
		this.noReservation = noReservation;
	}

}