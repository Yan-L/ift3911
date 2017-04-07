package Voyages;

public abstract class InstallationCreator {

	/**
	 * 
	 * @param id
	 * @param ville
	 * @param nom
	 */
	public Installation makeInstallation(string id, string ville, string nom) {
		// TODO - implement InstallationCreator.makeInstallation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param ville
	 * @param nom
	 */
	protected abstract Installation factoryMethod(string id, string ville, string nom);

}