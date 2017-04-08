package Voyages;

public class CieAerienneCreator extends CieCreator {

	private static CieAerienneCreator instance;

	private CieAerienneCreator() {}

	public static CieAerienneCreator getInstance() {
		if(instance == null){
			instance = new CieAerienneCreator();
		}
		return instance;
	}

	@Override
	protected Compagnie factoryMethod(String id, String nom, String idVoyage) {
		return new CompagnieAerienne(id, nom, idVoyage);
	}
}