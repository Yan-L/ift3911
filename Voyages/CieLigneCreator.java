package Voyages;

public class CieLigneCreator extends CieCreator {

	private CieLigneCreator instance;

	private CieLigneCreator() {
		// TODO - implement CieLigneCreator.CieLigneCreator
		throw new UnsupportedOperationException();
	}

	public static CieLigneCreator getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param id
	 * @param nom
	 * @param idVoyage
	 */
	protected Compagnie factoryMethod(string id, string nom, string idVoyage) {
		// TODO - implement CieLigneCreator.factoryMethod
		throw new UnsupportedOperationException();
	}

}