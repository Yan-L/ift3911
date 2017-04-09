package Paiements;

import java.util.Date;

public class PaiementCredit extends Paiement {
	
	private String noCarte;
	private Date exp;
	public PaiementCredit(String noCarte, Date exp, double montant) {
		// TODO Auto-generated constructor stub
		this.montant=montant;
		this.noCarte=noCarte;
		this.exp=exp;
	}
	public String transaction() {
		return "complete";
	}
	public boolean getConfirmation(){
		return true;
		//Normalement, ici il devrait vérifier si la carte est valide en communicant avec la banque, ce qu'on ne peut pas faire.
	}
	public void annuler() {
		this.annulation = new Annulation(this.getTodayDate(), montant);
	}
	public Date getTodayDate(){
		return null;
	}
	/**
	 * 
	 * @param montant
	 */
	public void rembourser(double montant) {
		//remboursement
	}
}