package Modele;

import java.util.ArrayList;

public abstract class Section {

	private double Ratio;
	private char Symbole;
	private String Description;
	private ArrayList<Unite> unites;
	private String type;

	public String getType(){
		return type;
	}

	public ArrayList<Unite> getUnites(){
		return unites;
	}

	public double calculerPrix() {
		// TODO - implement Section.calculerPrix
		throw new UnsupportedOperationException();
	}

}