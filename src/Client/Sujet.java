package Client;

public interface Sujet {

	/**
	 * 
	 * @param Observer
	 */
	void attach(Observateur obs);

	/**
	 * 
	 * @param Observer
	 */
	void detach(Observateur obs);

	void notifyObs();

}