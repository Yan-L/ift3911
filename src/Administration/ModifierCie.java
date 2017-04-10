package Administration;

import Voyages.*;

import java.sql.Time;
import java.util.Date;

public class ModifierCie extends Command {

	private Compagnie idCie;
	private String nomCie;
	private String idVoy;

	public ModifierCie(Compagnie c, String nom, String idVoyage){
		idCie = c;
		nomCie = nom;
		idVoy = idVoyage;
	}

	public void execute() {
		idCie.modifier(nomCie, idVoy);
	}

	public void unexecute() {
		idCie.modifier(nomCie, idVoy);
	}
}