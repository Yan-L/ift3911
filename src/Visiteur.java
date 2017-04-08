
import Voyages.Compagnie;
import Voyages.DetailsVoyage;
import Voyages.UniteParVoyage;
import Voyages.Voyage;

public interface Visiteur {

	/**
	 * 
	 * @param Voyage
	 */
	void VisiteVoyage(Voyage v);

	/**
	 * 
	 * @param Compagnie
	 */
	void VisiteCompagnie(Compagnie c);

	/**
	 * 
	 * @param DetailsVoyage
	 */
	void VisiteDetailsVoyage(DetailsVoyage d);

	/**
	 * 
	 * @param UniteParVoyage
	 */
	void VisiteUniteParVoyage(UniteParVoyage u);

}