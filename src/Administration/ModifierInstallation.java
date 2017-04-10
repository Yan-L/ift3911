package Administration;

import Voyages.*;

public class ModifierInstallation extends Command {

	private Installation idInstallation;
	private String iden;
	private String city;
	private String name;

	public ModifierInstallation(Installation i,String id, String ville, String nom){
		idInstallation = i;
		iden = id;
		city = ville;
		name = nom;
	}

	public void execute() {
		idInstallation.modifier(iden,city,name);
	}

	public void unexecute() {
		idInstallation.modifier(iden,city,name);
	}

}