package Client;

import java.util.Date;
import java.util.List;

import Voyages.Installation;
import Voyages.UniteParVoyage;
import Voyages.Voyage;

public class GestionnaireReservation implements ServiceReservation {

	public List<Voyage> verificationDisponibilite(String typeVoyage, Installation ori, Installation dest, Date date,
			String section) {
		// TODO Auto-generated method stub
		return null;
	}

	public void annulerReservation(String noReservation) {
		// TODO Auto-generated method stub
		
	}

	public String reserverUnitee(UniteParVoyage unitee) {
		// TODO Auto-generated method stub
		return "";
	}

	public void infoPersonnel(String noReservation, String nom, String prenom, String adresse, String courriel,
			String telephone, Date naissance, String passeport, Date exp) {
		// TODO Auto-generated method stub
		
	}

	public String paiementReservation(String noReservation, String noCarte, Date exp) {
		// TODO Auto-generated method stub
		return null;
	}

	public double modifierReservation(String noReservation, UniteParVoyage unitee) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double etatReservation(String noReservation) {
		// TODO Auto-generated method stub
		return 0;
	}
}