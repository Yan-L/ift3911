package Voyages;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
public class DetailsVoyage implements IVisitable {

	private String Id;
	private long duree;
	private ArrayList<Voyage> voyages;
	private String cieName;

	public DetailsVoyage(String id, Time hDep, Time hArr, String nom) {
		Id = id;
		duree = calculDuree(hDep, hArr);
		voyages = new ArrayList<Voyage>();
		cieName = nom;
	}

	public ArrayList<Voyage> getVoyages() {
		return voyages;
	}

	public long getDuree() {
		return duree;
	}

	public String getCieName() {
		return cieName;
	}

	public String getId() {
		return Id;
	}

	/**
	 * ajoute un voyage
	 * @param voyage
	 */
	public void addVoyage(Voyage voyage) {
		this.voyages.add(voyage);
	}

	/**
	 * juste le prix pou tous les vols
	 * @param prix
	 */
	public void addPrice(double prix) {
		for(int i = 0; i<this.voyages.size(); i++){
			voyages.get(i).setPrix(prix);
		}
	}

	/**
	 * calcul la duree d'un voyage
	 * @param hDep
	 * @param hArr
	 */
	private long calculDuree(Time hDep, Time hArr) {
		return hArr.getTime() - hDep.getTime();
	}
	public List<String> accept(Visiteur v){
		
		return v.Visite(this);
	}
}