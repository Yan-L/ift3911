package Voyages;

public abstract class CieCreator {

	/**
	 * 
	 * @param id
	 * @param nom
	 * @param idVoyage
	 */
	public Compagnie makeCie(string id, string nom, string idVoyage) {
		// TODO - implement CieCreator.makeCie
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param nom
	 * @param idVoyage
	 */
	protected abstract Compagnie factoryMethod(string id, string nom, string idVoyage);

}