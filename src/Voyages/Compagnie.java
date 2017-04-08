package Voyages;

import java.sql.Time;
import java.util.ArrayList;

public abstract class Compagnie {


	private String id;
	private String nom;
	private String idVoyagePrefix;
	private ArrayList<DetailsVoyage> detailsVoyages;
	
	public Compagnie(String id, String nom, String idVoyagePrefix){
		this.id = id;
		this.nom = nom;
		this.idVoyagePrefix = idVoyagePrefix;
		this.detailsVoyages = new ArrayList<DetailsVoyage>();
	}

	public String getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getIdVoyagePrefix() {
		return idVoyagePrefix;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setIdVoyagePrefix(String idVoyagePrefix) {
		this.idVoyagePrefix = idVoyagePrefix;
	}

	/**
	 *
	 * @return tous les voyages que la cie gere
	 */
	public ArrayList<Voyage> consulteVoyages(){
		ArrayList<Voyage> allVoyages = new ArrayList<Voyage>();
		for(int i = 0; i < this.detailsVoyages.size(); i++){
			allVoyages.addAll(this.detailsVoyages.get(i).getVoyages());
		}
		return allVoyages;
	}

	public ArrayList<DetailsVoyage> getDetailsVoyages() {
		return detailsVoyages;
	}

	/**
	 * modifie la compagnie
	 * @param nom
	 * @param idVoyage
	 */
	public void modifier(String nom, String idVoyage){
		this.nom = nom;
		this.idVoyagePrefix = idVoyage;
	}

	/**
	 * ajuste de prix des voyages
	 * @param voyageId
	 * @param prix
	 */
	public void addPrice(String voyageId, double prix){
		for(int i = 0; i < this.detailsVoyages.size(); i++){
			DetailsVoyage target = this.detailsVoyages.get(i);
			if(target.getId().equals(voyageId)){
				target.addPrice(prix);
			}
		}
	}

	/**
	 * construit un detailvoyage
	 * @param hDep
	 * @param hArr
	 */
	public  void creerDetailVoyage(Time hDep, Time hArr){
		String id = IDVoyageGenerator.getInstance().generate(this.idVoyagePrefix);
		DetailsVoyage detailsVoyage = new DetailsVoyage(id, hDep, hArr, nom);
		this.detailsVoyages.add(detailsVoyage);
	}

	/**
	 * ajoute un voyage a un detailvoyage
	 * @param idDetail
	 * @param voyage
	 */
	public void addDetail(String idDetail, Voyage voyage){
		for(int i = 0; i < this.detailsVoyages.size(); i++){
			DetailsVoyage target = this.detailsVoyages.get(i);
			if(target.getId().equals(idDetail)){
				target.addVoyage(voyage);
			}
		}
	}

}