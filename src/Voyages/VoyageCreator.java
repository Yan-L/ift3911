package Voyages;

import java.sql.Time;
import java.util.Date;

public abstract class VoyageCreator {

	/**
	 * 
	 * @param id
	 * @param hDep
	 * @param hArr
	 * @param date
	 */
	public Voyage makeVoyage(String id, Time hDep, Time hArr, Date date) {
		return factoryMethod(id, hDep, hArr, date);
	}

	/**
	 * 
	 * @param id
	 * @param hDep
	 * @param hArr
	 * @param date
	 */
	protected abstract Voyage factoryMethod(String id, Time hDep, Time hArr, Date date);

}