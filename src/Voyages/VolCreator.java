package Voyages;

public class VolCreator extends VoyageCreator {

	private VolCreator instance;

	private VolCreator() {
		// TODO - implement VolCreator.VolCreator
		throw new UnsupportedOperationException();
	}

	public static VolCreator getInstance() {
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
		// TODO - implement VolCreator.factoryMethod
		throw new UnsupportedOperationException();
	}

}