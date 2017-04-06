package Voyages;

public class PortCreator extends InstallationCreator {

	private PortCreator instance;

	private PortCreator() {
		// TODO - implement PortCreator.PortCreator
		throw new UnsupportedOperationException();
	}

	public static PortCreator getInstance() {
		return this.instance;
	}

	/**
	 * 
	 * @param id
	 * @param ville
	 * @param nom
	 */
	protected Installation factoryMethod(string id, string ville, string nom) {
		// TODO - implement PortCreator.factoryMethod
		throw new UnsupportedOperationException();
	}

}