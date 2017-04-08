package Voyages;

public class CieLigneCreator extends CieCreator {

	private static CieLigneCreator instance;

	private CieLigneCreator() {
	}

	public static CieLigneCreator getInstance() {
		if(instance == null){
			instance = new CieLigneCreator();
		}
		return instance;
	}

	/**
	 * 
	 * @param id
	 * @param nom
	 * @param idVoyage
	 */
	@Override
	protected Compagnie factoryMethod(String id, String nom, String idVoyage) {
		return new CompagnieLigne(id,nom,idVoyage);
	}
}