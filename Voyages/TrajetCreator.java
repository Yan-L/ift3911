package Voyages;

public class TrajetCreator extends VoyageCreator {

	private TrajetCreator instance;

	private TrajetCreator() {
		// TODO - implement TrajetCreator.TrajetCreator
		throw new UnsupportedOperationException();
	}

	public static TrajetCreator getInstance() {
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
		// TODO - implement TrajetCreator.factoryMethod
		throw new UnsupportedOperationException();
	}

}