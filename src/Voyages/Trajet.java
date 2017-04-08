package Voyages;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Trajet extends Voyage {

	private ArrayList<Gare> parcours;

	public Trajet(String id, Time hDep, Time hArr, Date date) {
		super(id, hDep, hArr, date);
	}
}