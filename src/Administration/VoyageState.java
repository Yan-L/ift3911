package Administration;

import java.sql.Time;
import java.util.Date;

import Voyages.UniteParVoyage;

public class VoyageState {
	private double Prix;
	private Time HeureDepart;
	private Time HeureArrivee;
	private Date DateDepart;
	public double getPrix() {
		return Prix;
	}
	public void setPrix(double prix) {
		Prix = prix;
	}
	public Time getHeureDepart() {
		return HeureDepart;
	}
	public void setHeureDepart(Time heureDepart) {
		HeureDepart = heureDepart;
	}
	public Time getHeureArrivee() {
		return HeureArrivee;
	}
	public void setHeureArrivee(Time heureArrivee) {
		HeureArrivee = heureArrivee;
	}
	public Date getDateDepart() {
		return DateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		DateDepart = dateDepart;
	}

}
