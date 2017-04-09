package Modele;

public abstract class Unite {

	private double Prix;
	private String Section;

	public Unite(String section) {
		Section = section;
	}

	public double getPrix() {
		return Prix;
	}

	public void setPrix(double prix) {
		Prix = prix;
	}

}