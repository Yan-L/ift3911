package Administration;

import Voyages.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;

import Client.Observateur;
import Client.ReservState;
import Client.Sujet;

public class Administrateur implements Observateur{

	private String nom;
	private String userNam;
	private String password;
	private Sujet sujet;
	//private State state;
	private VoyageState state;


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
	public void creerItineraire(String cieNom, String idDetail, List<String> lieux, Time hDep, Time hArr, Date date, double prix) {
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
	public void CreerVoyage(String cieNom, String idDetail, List<String> lieux, Time hDep, Time hArr, Date date, double prix) {
		// TODO - implement Administrateur.CreerVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param ville
	 * @param nom
	 */
	public void CreerInstallation(String id, String ville, String nom) {
		// TODO - implement Administrateur.CreerInstallation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param nom
	 * @param idVoyage
	 */
	public void CreerCie(String id, String nom, String idVoyage) {
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
	public void ModifierInstallation(String id, String ville, String nom) {
		// TODO - implement Administrateur.ModifierInstallation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nom
	 * @param idVoyage
	 */
	public void ModifierCie(String nom, String idVoyage) {
		// TODO - implement Administrateur.ModifierCie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idvoyage
	 */
	public void SupprimerVoyage(String idvoyage) {
		// TODO - implement Administrateur.SupprimerVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idinstallation
	 */
	public void SupprimerInstallation(String idinstallation) {
		// TODO - implement Administrateur.SupprimerInstallation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idCie
	 */
	public void SupprimerCie(String idCie) {
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
	public void CreerEscale(String idCie, String idVoyage, String Instalation, Date Arrive, Date Depart) {
		// TODO - implement Administrateur.CreerEscale
		throw new UnsupportedOperationException();
	}

	public void update() {
		this.state = (VoyageState) this.sujet.getUpdate(this);
		ModifierVoyage(this.state.getHeureDepart(),this.state.getHeureArrivee(),this.state.getDateDepart(),this.state.getPrix());
	}

	public void setSubject(Sujet sujet) {
		this.sujet = sujet;
		
	}

}