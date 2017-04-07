package Administration;

import Voyages.*;

public class Administrateur {

	private string nom;
	private string userNam;
	private string password;
	private State state;

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
	public void creerItineraire(string cieNom, string idDetail, List<string> lieux, Time hDep, Time hArr, Date date, double prix) {
		// TODO - implement Administrateur.creerItineraire
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param a
	 */
	public void consultationAeroport(Aeroport a) {
		// TODO - implement Administrateur.consultationAeroport
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param c
	 */
	public void consultationCie(Compagnie c) {
		// TODO - implement Administrateur.consultationCie
		throw new UnsupportedOperationException();
	}

	public void administrationAerienne() {
		// TODO - implement Administrateur.administrationAerienne
		throw new UnsupportedOperationException();
	}

	public void administrationCroisiere() {
		// TODO - implement Administrateur.administrationCroisiere
		throw new UnsupportedOperationException();
	}

	public void administrationTrajet() {
		// TODO - implement Administrateur.administrationTrajet
		throw new UnsupportedOperationException();
	}

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
	public void CreerVoyage(string cieNom, string idDetail, List<string> lieux, Time hDep, Time hArr, Date date, double prix) {
		// TODO - implement Administrateur.CreerVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param ville
	 * @param nom
	 */
	public void CreerInstallation(string id, string ville, string nom) {
		// TODO - implement Administrateur.CreerInstallation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param nom
	 * @param idVoyage
	 */
	public void CreerCie(string id, string nom, string idVoyage) {
		// TODO - implement Administrateur.CreerCie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param hdep
	 * @param hArr
	 * @param date
	 * @param prix
	 */
	public void ModifierVoyage(Time hdep, Time hArr, Date date, double prix) {
		// TODO - implement Administrateur.ModifierVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param ville
	 * @param nom
	 */
	public void ModifierInstallation(string id, string ville, string nom) {
		// TODO - implement Administrateur.ModifierInstallation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nom
	 * @param idVoyage
	 */
	public void ModifierCie(string nom, string idVoyage) {
		// TODO - implement Administrateur.ModifierCie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idvoyage
	 */
	public void SupprimerVoyage(string idvoyage) {
		// TODO - implement Administrateur.SupprimerVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idinstallation
	 */
	public void SupprimerInstallation(string idinstallation) {
		// TODO - implement Administrateur.SupprimerInstallation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCie
	 */
	public void SupprimerCie(string idCie) {
		// TODO - implement Administrateur.SupprimerCie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCie
	 * @param idVoyage
	 * @param Instalation
	 * @param Arrive
	 * @param Depart
	 */
	public void CreerEscale(String idCie, string idVoyage, string Instalation, Date Arrive, Date Depart) {
		// TODO - implement Administrateur.CreerEscale
		throw new UnsupportedOperationException();
	}

	public void update() {
		// TODO - implement Administrateur.update
		throw new UnsupportedOperationException();
	}

}