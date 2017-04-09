package Administration;

import Voyages.*;

public class ModifierVoyage implements Command {

	private Voyage idvoyage;

	public ModifierVoyage(Voyage modVoyage){
		idvoyage = modVoyage;
	}

	public void execute() {
		//idvoyage.modifier(Time hdep, Time hArr, Date date, double prix);
	}

	public void unexecute() {
		// TODO - implement ModifierVoyage.unexecute
		throw new UnsupportedOperationException();
	}

}