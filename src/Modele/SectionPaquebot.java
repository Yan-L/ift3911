package Modele;

public abstract class SectionPaquebot extends Section {

	private int capacitePersonne;

	public SectionPaquebot(double ratio, String description, String type, int capacite) {
		super(ratio, description, type);
		capacitePersonne = capacite;
	}
}