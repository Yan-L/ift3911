package Client;

import Reservations.Reservation;
import Voyages.UniteParVoyage;

public class Client implements Observateur{
	private Sujet sujet;
	private ReservState state;
	private UniteParVoyage unitee;
	private GestionnaireReservation gesRes;
	public void update() {
		this.state = (ReservState) this.sujet.getUpdate(this);
		gesRes.modifierReservation(this.state.getNoReserv(),this.state.getMessage());
	}

	public void setSubject(Sujet sujet) {
		// TODO Auto-generated method stub
		this.sujet = sujet;
	}

}