package Voyages;

public abstract class Installation {

	private string Id;
	private string Ville;
	private string Nom;
	private List<Voyage> Arrivals;
	private List<Voyage> Departures;

	/**
	 * 
	 * @param id
	 * @param ville
	 * @param nom
	 */
	public void modifier(string id, string ville, string nom) {
		// TODO - implement Installation.modifier
		throw new UnsupportedOperationException();
	}

	public List<Voyage> consulteVoyages() {
		// TODO - implement Installation.consulteVoyages
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param voyage
	 */
	public void addArrival(Voyage voyage) {
		// TODO - implement Installation.addArrival
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param voyage
	 */
	public void addDeparture(Voyage voyage) {
		// TODO - implement Installation.addDeparture
		throw new UnsupportedOperationException();
	}

}