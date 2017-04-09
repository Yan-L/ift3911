package Paiements;

import java.util.Date;

public abstract class Paiement {

	protected double montant;
	private String noConfirmation;
	protected Annulation annulation;
	public String transaction() {
		return null;
	}

	public void annuler() {
	}
	public Date getTodayDate(){
		return null;
	}
	/**
	 * 
	 * @param montant
	 */
	public void rembourser(double montant) {
		// TODO - implement Paiement.rembourcer
		throw new UnsupportedOperationException();
	}

}