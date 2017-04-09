package Modele;

import java.util.ArrayList;

public abstract class Section {

	private double Ratio;
	private String Description;
	private ArrayList<Unite> unites;
	private String type;
	private Disposition disposition;

	public Section(double ratio, String description, String type) {
		Ratio = ratio;
		Description = description;
		this.type = type;
		unites = new ArrayList<Unite>();
	}

	public double getRatio() {
		return Ratio;
	}

	public void setDisposition(Disposition disposition) {
		this.disposition = disposition;
	}

	public Disposition getDisposition() {
		return disposition;
	}

	public String getType(){
		return type;
	}

	public ArrayList<Unite> getUnites(){
		return unites;
	}

	public void addUnites(Unite unite){
		unites.add(unite);
	}

	public abstract void creerUnites();

	public void calculerPrix(double tarif) {
		for (int i = 0; i<unites.size(); i++){
			unites.get(i).setPrix(tarif*Ratio);
		}
	}

}