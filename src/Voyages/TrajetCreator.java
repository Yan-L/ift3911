package Voyages;

import java.sql.Time;
import java.util.Date;

public class TrajetCreator extends VoyageCreator {

	private static TrajetCreator instance;

	private TrajetCreator() {}

	public static TrajetCreator getInstance() {
		if(instance == null){
			instance = new TrajetCreator();
		}
		return instance;
	}


	@Override
	protected Voyage factoryMethod(String id, Time hDep, Time hArr, Date date) {
		return new Trajet(id, hDep, hArr, date);
	}
}