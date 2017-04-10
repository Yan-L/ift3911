package Client;

import java.util.Date;
import java.util.List;

import Voyages.*;

public interface ServiceReservation {

	/**
	 * 
	 *  
	 * @param ori
	 * @param dest
	 * @param date
	 * @param section
	 */
	List<Voyage> verificationDisponibilite( Installation ori, Installation dest, Date date, String section);

	/**
	 * 
	 * @param noReservation
	 */
	void annulerReservation(String noReservation);

	/**
	 * 
	 * @param unitee
	 */
	String reserverUnitee(UniteParVoyage unitee);

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
	void infoPersonnel(String noReservation, String nom, String prenom, String adresse, String courriel, String telephone, Date naissance, String passeport, Date exp);

	/**
	 * 
	 * @param noReservation
	 * @param noCarte
	 * @param exp
	 */
	String paiementReservation(String noReservation, String noCarte, Date exp);

	/**
	 * 
	 * @param noReservation
	 * @param unitee
	 */
	double modifierReservation(String noReservation, UniteParVoyage unitee);

	/**
	 * 
	 * @param noReservation
	 */
	double etatReservation(String noReservation);

}