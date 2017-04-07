package Reservations;

public class Reservation implements IReservation {

	private double Montant;
	private String noReservation;
	private boolean Confirmer = false;
	private State state;

	public State getState() {
		return this.state;
	}

	/**
	 * 
	 * @param State
	 */
	public void setState(int State) {
		// TODO - implement Reservation.setState
		throw new UnsupportedOperationException();
	}

}