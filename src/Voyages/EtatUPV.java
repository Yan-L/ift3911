package Voyages;

public abstract class EtatUPV {

	/**
	 * 
	 * @param e peut etre liberer, reserver ou confirmer
	 * @param upv
	 */
	public abstract void event(String e, UniteParVoyage upv);

}