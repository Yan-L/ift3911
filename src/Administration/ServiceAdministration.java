package Administration;

import Voyages.*;

public interface ServiceAdministration {

	/**
	 * 
	 * @param ville
	 * @param nom
	 */
	void creerAeroport(string ville, string nom);

	/**
	 * 
	 * @param ville
	 * @param nom
	 */
	void creerPort(string ville, string nom);

	/**
	 * 
	 * @param ville
	 * @param nom
	 */
	void creerGare(string ville, string nom);

	/**
	 * 
	 * @param installationId
	 */
	void supprimerInstallation(string installationId);

	/**
	 * 
	 * @param id
	 * @param ville
	 * @param nom
	 */
	void modifierInstallation(string id, string ville, string nom);

	/**
	 * 
	 * @param installationId
	 */
	List<Voyage> consulteVoyages(string installationId);

	/**
	 * 
	 * @param nom
	 * @param idVoyage
	 */
	void creerCieAerienne(string nom, string idVoyage);

	/**
	 * 
	 * @param nom
	 * @param idVoyage
	 */
	void creerCieLigne(string nom, string idVoyage);

	/**
	 * 
	 * @param nom
	 * @param idVoyage
	 */
	void creerCieCroisiere(string nom, string idVoyage);

	/**
	 * 
	 * @param compagnieId
	 */
	void supprimer(string compagnieId);

	/**
	 * 
	 * @param id
	 * @param nom
	 * @param idVoyage
	 */
	void modifierCompagnie(string id, string nom, string idVoyage);

	/**
	 * 
	 * @param compagnieId
	 */
	List<Voyage> consulterVoyages(string compagnieId);

	/**
	 * 
	 * @param cieNom
	 * @param idDetail
	 * @param lieux
	 * @param hDep
	 * @param hArr
	 * @param date
	 * @param prix
	 */
	void creerVol(string cieNom, string idDetail, List<string> lieux, Time hDep, Time hArr, Date date, double prix);

	/**
	 * 
	 * @param voyageId
	 */
	void supprimerVoyage(string voyageId);

	/**
	 * 
	 * @param id
	 * @param hdep
	 * @param hArr
	 * @param date
	 * @param prix
	 */
	void modifier(string id, Time hdep, Time hArr, Date date, double prix);

	void creerAvion();

	void creerTrain();

	void creerPaquebot();

	/**
	 * 
	 * @param type
	 */
	void creerSection(string type);

	/**
	 * 
	 * @param type
	 * @param nbRangees
	 */
	void creerDisposition(string type, int nbRangees);

	/**
	 * 
	 * @param cieNom
	 * @param hDep
	 * @param hArr
	 */
	void creerDetailVoyage(string cieNom, Time hDep, Time hArr);

	/**
	 * 
	 * @param cieNom
	 * @param idDetail
	 * @param lieux
	 * @param hDep
	 * @param hArr
	 * @param date
	 * @param prix
	 */
	void creerTrajet(string cieNom, string idDetail, List<string> lieux, Time hDep, Time hArr, Date date, double prix);

	/**
	 * 
	 * @param cieNom
	 * @param idDetail
	 * @param lieux
	 * @param hDep
	 * @param hArr
	 * @param date
	 * @param prix
	 */
	void creerItineraire(string cieNom, string idDetail, List<string> lieux, Time hDep, Time hArr, Date date, double prix);

}