package Administration;

import Voyages.*;
import java.sql.Time;
import java.util.Date;

public class ModifierVoyage extends Command{
	private Voyage voy;
	private Time hdepart;
	private Time harrivee;
	private Date datedep;
	private double leprix;

	public ModifierVoyage(Voyage idVoyage, Time hdep , Time hArr, Date date, double prix){
		voy = idVoyage;
		hdepart= hdep;
		harrivee = hArr;
		datedep = date;
		leprix = prix;
	}

	public void execute() {
		voy.modifier(hdepart,harrivee,datedep,leprix);
	}

	public void unexecute() {
		voy.modifier(hdepart,harrivee,datedep,leprix);
	}

}