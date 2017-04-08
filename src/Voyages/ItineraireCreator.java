package Voyages;

import java.sql.Time;
import java.util.Date;

public class ItineraireCreator extends VoyageCreator {

	private static ItineraireCreator instance;

	private ItineraireCreator() {}

	public static ItineraireCreator getInstance() {
		if(instance == null){
			instance = new ItineraireCreator();
		}
		return instance;
	}


	@Override
	protected Voyage factoryMethod(String id, Time hDep, Time hArr, Date date) {
		return new Itineraire(id, hDep, hArr, date);
	}
}