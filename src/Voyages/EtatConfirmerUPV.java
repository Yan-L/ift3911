package Voyages;

public class EtatConfirmerUPV extends EtatUPV {

	/**
	 * 
	 * @param e
	 * @param upv
	 */
	public void event(String e, UniteParVoyage upv) {
		upv.setEtat(upv.getNextEtat(e));
	}

}