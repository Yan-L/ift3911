package Voyages;

public abstract class InstallationCreator {

	/**
	 * 
	 * @param id
	 * @param ville
	 * @param nom
	 */
	public Installation makeInstallation(String id, String ville, String nom) {
		return factoryMethod(id, ville, nom);
	}

	/**
	 * 
	 * @param id
	 * @param ville
	 * @param nom
	 */
	protected abstract Installation factoryMethod(String id, String ville, String nom);

}