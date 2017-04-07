package Voyages;

public class CieCroisiereCreator extends CieCreator {

	private CieCroisiereCreator instance;

	private CieCroisiereCreator() {
		// TODO - implement CieCroisiereCreator.CieCroisiereCreator
		throw new UnsupportedOperationException();
	}

	public static CieCroisiereCreator getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param id
	 * @param nom
	 * @param idVoyage
	 */
	protected Compagnie factoryMethod(string id, string nom, string idVoyage) {
		// TODO - implement CieCroisiereCreator.factoryMethod
		throw new UnsupportedOperationException();
	}

}