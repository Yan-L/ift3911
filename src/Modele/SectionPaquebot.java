package Modele;

import ModeleImplementation.Cabine;

public abstract class SectionPaquebot extends Section {

	private int capacitePersonne;

	public SectionPaquebot(double ratio, String description, String type, int capacite) {
		super(ratio, description, type);
		capacitePersonne = capacite;
	}

	@Override
	public void creerUnites() {
		String type = getType();
		Unite unite = new Cabine(type);
		super.addUnites(unite);
	}
}