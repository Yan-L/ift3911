package Voyages;

public abstract class VoyageCreator {

	/**
	 * 
	 * @param id
	 * @param hDep
	 * @param hArr
	 * @param date
	 */
	public Voyage makeVoyage(string id, Time hDep, Time hArr, Date date) {
		// TODO - implement VoyageCreator.makeVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param hDep
	 * @param hArr
	 * @param date
	 */
	protected abstract Voyage factoryMethod(string id, Time hDep, Time hArr, Date date);

}