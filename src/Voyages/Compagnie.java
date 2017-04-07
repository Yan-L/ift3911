package Voyages;

public abstract class Compagnie {

	private string Id;
	private string nom;
	private string idVoyagePrefix;

	public List<Voyage> consulteVoyages() {
		// TODO - implement Compagnie.consulteVoyages
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nom
	 * @param idVoyage
	 */
	public void modifier(string nom, string idVoyage) {
		// TODO - implement Compagnie.modifier
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param voyage
	 * @param idVoyage
	 */
	public void addVoyage(Voyage voyage, string idVoyage) {
		// TODO - implement Compagnie.addVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param voyageId
	 * @param prix
	 */
	public void addPrice(string voyageId, double prix) {
		// TODO - implement Compagnie.addPrice
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param hDep
	 * @param hArr
	 */
	public void creerDetailVoyage(Time hDep, Time hArr) {
		// TODO - implement Compagnie.creerDetailVoyage
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param idDetail
	 * @param voyage
	 */
	public void addDetail(string idDetail, Voyage voyage) {
		// TODO - implement Compagnie.addDetail
		throw new UnsupportedOperationException();
	}

}