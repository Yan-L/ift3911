package Voyages;

public class PortCreator extends InstallationCreator {

	private static PortCreator instance;

	private PortCreator() {}

	public static PortCreator getInstance() {
		if(instance == null){
			instance = new PortCreator();
		}
		return instance;
	}


	@Override
	protected Installation factoryMethod(String id, String ville, String nom) {
		return new Port(id, ville, nom);
	}
}