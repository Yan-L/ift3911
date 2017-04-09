package Voyages;
import java.util.List;

import Modele.Vehicule;;
public interface Visiteur {

	/**
	 * 
	 * @param Voyage
	 */
	public List<String> Visite(Voyage v);

	/**
	 * 
	 * @param Compagnie
	 */
	public List<String> Visite(Compagnie c);

	/**
	 * 
	 * @param DetailsVoyage
	 */
	public List<String> Visite(DetailsVoyage d);

	/**
	 * 
	 * @param UniteParVoyage
	 */
	public List<String> Visite(UniteParVoyage u);
	
	/**
	 * 
	 * @param Vehicule
	 */
	public List<String> Visite(Vehicule u);
	

}