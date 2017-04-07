package Voyages;

public class UniteParVoyage implements IVisitable, IVisitable {

	private string section;
	private EtatUPV etat;

	public double getPrix() {
		// TODO - implement UniteParVoyage.getPrix
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param etat
	 */
	public void setEtat(EtatUPV etat) {
		this.etat = etat;
	}

	/**
	 * 
	 * @param e
	 */
	public void event(string e) {
		// TODO - implement UniteParVoyage.event
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param next
	 */
	public EtatUPV getNextEtat(String next) {
		// TODO - implement UniteParVoyage.getNextEtat
		throw new UnsupportedOperationException();
	}

}