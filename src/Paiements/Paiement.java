package Paiements;

public abstract class Paiement {

	private double Montant;
	private String NoConfirmation;

	public String transaction() {
		// TODO - implement Paiement.transaction
		throw new UnsupportedOperationException();
	}

	public void annuler() {
		// TODO - implement Paiement.annuler
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param montant
	 */
	public void rembourcer(double montant) {
		// TODO - implement Paiement.rembourcer
		throw new UnsupportedOperationException();
	}

}