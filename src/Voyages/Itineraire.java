package Voyages;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Itineraire extends Voyage {

	Port destination;
	Port depart;
	private static int MaxDays = 21;
	private Date DateArrivee;
	private ArrayList<Port> Parcours;

	public Itineraire(String id, Time hDep, Time hArr, Date date) {
		super(id, hDep, hArr, date);
	}
}