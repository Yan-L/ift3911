package Reservations;

import java.util.Date;

public class Passager {
	private String nom;
	private String prenom;
	private String courriel;
	private String telephone;
	private Date dateNaissance;
	private String adresse;
	private Passeport passeport;
	public Passager(String nom, String prenom, String adresse, String courriel, String telephone, Date naissance) {
		// TODO Auto-generated constructor stub
		this.nom=nom;
		this.prenom = prenom;
		this.courriel = courriel;
		this.telephone = telephone;
		this.dateNaissance= naissance;
		this.adresse= adresse;
	}
	public Passeport getPasseport() {
		return passeport;
	}
	public void setPasseport(Passeport passeport) {
		this.passeport = passeport;
	}
	

}