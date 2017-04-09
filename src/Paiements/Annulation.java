package Paiements;

import java.util.*;

public class Annulation {

	private Date date;
	private double montant;
	public Annulation(Date date, double montant) {
		// TODO Auto-generated constructor stub
		this.date = date;
		this.montant =montant;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		date = date;
	}
	public double getMontant() {
		return this.montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}

}