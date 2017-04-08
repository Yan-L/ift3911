package Voyages;

public abstract class CieCreator {

	/**
	 * create a Compagnie
	 * @param id id of the object
	 * @param nom compagny's name
	 * @param idVoyage id for all Voyage
	 */
	public Compagnie makeCie(String id, String nom, String idVoyage) {
		return factoryMethod(id, nom, idVoyage);
	}

	/**
	 * 
	 * @param id id of the object
	 * @param nom compagny's name
	 * @param idVoyage id for all Voyage
	 */
	protected abstract Compagnie factoryMethod(String id, String nom, String idVoyage);

}