package Voyages;

import java.sql.Time;
import java.util.Date;

public class VolCreator extends VoyageCreator {

	private static VolCreator instance;

	private VolCreator() {}

	public static VolCreator getInstance() {
		if (instance == null) {
			instance = new VolCreator();
		}
		return instance;
	}


	@Override
	protected Voyage factoryMethod(String id, Time hDep, Time hArr, Date date) {
		return new Vol(id, hDep, hArr, date);
	}
}