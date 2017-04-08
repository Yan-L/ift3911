package Voyages;

public class AeroportCreator extends InstallationCreator {

	private static AeroportCreator instance;

	private AeroportCreator() {}

	public static AeroportCreator getInstance() {
		if(instance == null) {
			instance = new AeroportCreator();
		}
		return instance;
	}

	@Override
	protected Installation factoryMethod(String id, String ville, String nom) {
		return new Aeroport(id, ville, nom);
	}
}