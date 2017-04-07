package Voyages;

public class GareCreator extends InstallationCreator {

	private GareCreator instance;

	private GareCreator() {
		// TODO - implement GareCreator.GareCreator
		throw new UnsupportedOperationException();
	}

	public static GareCreator getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param id
	 * @param ville
	 * @param nom
	 */
	protected Installation factoryMethod(string id, string ville, string nom) {
		// TODO - implement GareCreator.factoryMethod
		throw new UnsupportedOperationException();
	}

}