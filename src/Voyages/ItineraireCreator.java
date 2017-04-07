package Voyages;

public class ItineraireCreator extends VoyageCreator {

	private ItineraireCreator instance;

	private ItineraireCreator() {
		// TODO - implement ItineraireCreator.ItineraireCreator
		throw new UnsupportedOperationException();
	}

	public static ItineraireCreator getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param id
	 * @param hDep
	 * @param hArr
	 * @param date
	 */
	protected Voyage factoryMethod(string id, Time hDep, Time hArr, Date date) {
		// TODO - implement ItineraireCreator.factoryMethod
		throw new UnsupportedOperationException();
	}

}