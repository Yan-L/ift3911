package Voyages;

import Modele.Unite;

import java.util.ArrayList;
import java.util.List;

public class UniteParVoyage implements IVisitable{

	private String section;

	private EtatUPV etat;

	private ArrayList<EtatUPV> allState = new ArrayList<EtatUPV>();

	private Voyage voyage;

	private Unite unite;

	public UniteParVoyage(String section, Voyage voyage, Unite unite) {
		this.section = section;
		this.voyage = voyage;
		this.unite = unite;
		etat = new EtatLibreUPV();
		allState.add(etat);
		allState.add(new EtatReserverUPV());
		allState.add(new EtatConfirmerUPV());
	}

	public ArrayList<EtatUPV> getAllState() {
		return allState;
	}

	public String getSection() {
		return section;
	}

	public EtatUPV getEtat() {
		return etat;
	}

	public double getPrix() {
		return this.unite.getPrix();
	}

	/**
	 * 
	 * @param etat
	 */
	public void setEtat(EtatUPV etat) {
		this.etat = etat;
	}

	/**
	 * 
	 * @param e peut etre liberer, reserver ou confirmer
	 */
	public void event(String e) {
		etat.event(e,this);
	}

	/**
	 * 
	 * @param next
	 */
	public EtatUPV getNextEtat(String next) {
		if(next.equals("liberer")){
			return allState.get(0);
		}else if(next.equals("reserver")){
			return allState.get(1);
		}else{
			return allState.get(2);
		}
	}
	public List<String> accept(Visiteur v){
		
		return v.Visite(this);
	}
}