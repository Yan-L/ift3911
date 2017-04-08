package Voyages;

public class GareCreator extends InstallationCreator {

	private static GareCreator instance;

	private GareCreator() {}

	public static GareCreator getInstance() {
		if(instance == null){
			instance = new GareCreator();
		}
		return instance;
	}


	@Override
	protected Installation factoryMethod(String id, String ville, String nom) {
		return new Gare(id, ville, nom);
	}
}