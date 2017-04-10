package Administration;

import Voyages.*;
import java.sql.Time;
import java.util.Date;

public class ModifierVoyage extends Command{


	public void execute(Voyage idVoyage, Time hdep , Time hArr, Date date, double prix) {
		idVoyage.modifier(hdep,hArr,date,prix);
	}

	public void unexecute(Voyage idVoyage, Time hdep , Time hArr, Date date, double prix) {
		idVoyage.modifier(hdep,hArr,date,prix);
	}

}