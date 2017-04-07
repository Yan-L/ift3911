package Voyages;

public class AeroportCreator extends InstallationCreator {

	private AeroportCreator instance;

	private AeroportCreator() {
		// TODO - implement AeroportCreator.AeroportCreator
		throw new UnsupportedOperationException();
	}

	public static AeroportCreator getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param id
	 * @param ville
	 * @param nom
	 */
	protected Installation factoryMethod(string id, string ville, string nom) {
		// TODO - implement AeroportCreator.factoryMethod
		throw new UnsupportedOperationException();
	}

}