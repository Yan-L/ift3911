public interface Visiteur {

	/**
	 * 
	 * @param Voyage
	 */
	void VisiteVoyage(v Voyage);

	/**
	 * 
	 * @param Compagnie
	 */
	void VisiteCompagnie(c Compagnie);

	/**
	 * 
	 * @param DetailsVoyage
	 */
	void VisiteDetailsVoyage(v DetailsVoyage);

	/**
	 * 
	 * @param UniteParVoyage
	 */
	void VisiteUniteParVoyage(u UniteParVoyage);

}