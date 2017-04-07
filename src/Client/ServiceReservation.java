package Client;

import Voyages.*;

public interface ServiceReservation {

	/**
	 * 
	 * @param typeVoyage
	 * @param ori
	 * @param dest
	 * @param date
	 * @param section
	 */
	List<Voyage> verificationDisponibilite(string typeVoyage, Installation ori, Installation dest, Date date, string section);

	/**
	 * 
	 * @param noReservation
	 */
	void annulerReservation(string noReservation);

	/**
	 * 
	 * @param unitee
	 */
	string reserverUnitee(UniteParVoyage unitee);

	/**
	 * 
	 * @param noReservation
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param courriel
	 * @param telephone
	 * @param naissance
	 * @param passeport
	 * @param exp
	 */
	void infoPersonnel(string noReservation, string nom, string prenom, string adresse, string courriel, string telephone, Date naissance, string passeport, Date exp);

	/**
	 * 
	 * @param noReservation
	 * @param noCarte
	 * @param exp
	 */
	string paiementReservation(string noReservation, string noCarte, Date exp);

	/**
	 * 
	 * @param noReservation
	 * @param unitee
	 */
	double modifierReservation(string noReservation, UniteParVoyage unitee);

	/**
	 * 
	 * @param noReservation
	 */
	double etatReservation(string noReservation);

}