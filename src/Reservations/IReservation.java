package Reservations;

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
	void addPassager(string nom, string prenom, string adresse, string courriel, string telephone, Date naissance, string passeport, Date exp);

	/**
	 * 
	 * @param noCarte
	 * @param exp
	 */
	string paiementReservation(string noCarte, Date exp);

}