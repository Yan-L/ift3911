package Administration;

import Voyages.*;

import java.util.ArrayList;

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
	private GestionnaireAdministration BaseDonne;
	private Visiteur visiteurObjet = new VerificationVoyage();
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
	public void consultationInstallation(String a) {
		Installation Endroit=BaseDonne.recupereInstallation(a);
		List<Voyage> listVoyage=BaseDonne.getVoyagesLst();
		List<String> ListeTexte= new ArrayList <String>();
		String Affichage="";
		for(int i=0; i<listVoyage.size();i++)
		{
			if(Endroit==listVoyage.get(i).getLieuDarrivee() || Endroit==listVoyage.get(i).getLieuDarrivee())
			{
				//ici on va chercher les information au sujet du voyage soit l'installation de départ-d'arriver   
				//, la compagnie, le numéro du vol, la date de départ et d'arrivé.
				ListeTexte.addAll(listVoyage.get(i).accept(visiteurObjet));
				Affichage=ListeTexte.get(0)+"-"+ListeTexte.get(1)+":["+ListeTexte.get(2)+"]"+ListeTexte.get(3)
						+"("+ListeTexte.get(4)+"-"+ListeTexte.get(5)+")";
				ListeTexte=(listVoyage.get(i).getVehicule().accept(visiteurObjet));
				for (int j=0 ; j< ListeTexte.size();j++)
				{
					List<String> temporaire = new ArrayList<String>();
					temporaire= visiteurObjet.Visite(listVoyage.get(i),ListeTexte.get(j).toString());
					//Ici on ajoute le texte contenant la classe, le nombre de place réserver/total et le cout
					Affichage+= "|"+ListeTexte.get(j).toString()+"("+temporaire.get(0)+"/"+temporaire.get(1)+")"+temporaire.get(2);
					
				}
				
			}
			System.out.println(Affichage+"\n");
		}
		
	}

	/**
	 * 
	 * @param c
	 */
	public void consultationCie(String c) {
		Compagnie Endroit=BaseDonne.recupereCie(c);
		List<Voyage> listVoyage=BaseDonne.getVoyagesLst();
		List<String> ListeTexte= new ArrayList <String>();
		String Affichage="";
		for(int i=0; i<listVoyage.size();i++)
		{
			if(Endroit==listVoyage.get(i).getCie() || Endroit==listVoyage.get(i).getCie())
			{
				//ici on va chercher les information au sujet du voyage soit l'installation de départ-d'arrive  
				//, la compagnie, le numéro du vol, la date de départ et d'arrivé.
				ListeTexte.addAll(listVoyage.get(i).accept(visiteurObjet));
				Affichage=ListeTexte.get(0)+"-"+ListeTexte.get(1)+":["+ListeTexte.get(2)+"]"+ListeTexte.get(3)
						+"("+ListeTexte.get(4)+"-"+ListeTexte.get(5)+")";
				ListeTexte=(listVoyage.get(i).getVehicule().accept(visiteurObjet));
				for (int j=0 ; j< ListeTexte.size();j++)
				{
					List<String> temporaire = new ArrayList<String>();
					//la seul dérogation a patron du visiteur car nous n'avons pas trouver de moyen facile pour aller chercher le nombre de place dans toutes les sections dans le vol courant.
					temporaire= visiteurObjet.Visite(listVoyage.get(i),ListeTexte.get(j).toString());
					//Ici on ajoute le texte contenant la classe, le nombre de place réserver/total et le cout
					Affichage+= "|"+ListeTexte.get(j).toString()+"("+temporaire.get(0)+"/"+temporaire.get(1)+")"+temporaire.get(2);
					
				}
				
			}
			System.out.println(Affichage+"\n");
		}
		
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