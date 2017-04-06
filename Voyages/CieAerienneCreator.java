package Voyages;

public class CieAerienneCreator extends CieCreator {

	private CieAerienneCreator instance;

	private CieAerienneCreator() {
		// TODO - implement CieAerienneCreator.CieAerienneCreator
		throw new UnsupportedOperationException();
	}

	public static CieAerienneCreator getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param id
	 * @param nom
	 * @param idVoyage
	 */
	protected Compagnie factoryMethod(string id, string nom, string idVoyage) {
		// TODO - implement CieAerienneCreator.factoryMethod
		throw new UnsupportedOperationException();
	}

}