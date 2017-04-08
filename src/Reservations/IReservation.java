package Reservations;

import java.util.Date;

import Voyages.*;

public interface IReservation {

	/**
	 * 
	 * @param unitee
	 */
	double modifier(UniteParVoyage unitee);

	double calculerFrais();

	void annuler();

	/**
	 * 
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param courriel
	 * @param telephone
	 * @param naissance
	 * @param passeport
	 * @param exp
	 */
	void addPassager(String nom, String prenom, String adresse, String courriel, String telephone, Date naissance, String passeport, Date exp);

	/**
	 * 
	 * @param noCarte
	 * @param exp
	 */
	String paiementReservation(String noCarte, Date exp);

}