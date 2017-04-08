package Voyages;

public class CieCroisiereCreator extends CieCreator {

	private static CieCroisiereCreator instance;

	private CieCroisiereCreator() {}

	public static CieCroisiereCreator getInstance() {
		if(instance==null){
			instance = new CieCroisiereCreator();
		}
		return instance;
	}


	@Override
	protected Compagnie factoryMethod(String id, String nom, String idVoyage) {
		return new CompagnieCroisiere(id, nom, idVoyage);
	}
}