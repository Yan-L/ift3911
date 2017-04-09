package Modele;

public abstract class Disposition {

	private char Symbole;
	private String Description;
	private int nbRangees;
	private int nbColonnes;

	public Disposition(char symbole, String description, int nbRangees, int nbColonnes) {
		Symbole = symbole;
		Description = description;
		this.nbRangees = nbRangees;
		this.nbColonnes = nbColonnes;
	}

	public int getNbRangees() {
		return nbRangees;
	}

	public int getNbColonnes() {
		return nbColonnes;
	}

}