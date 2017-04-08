package Client;

public interface Sujet {

	/**
	 * 
	 * @param Observer
	 */
	public void attach(Observateur obs);

	/**
	 * 
	 * @param Observer
	 */
	public void detach(Observateur obs);

	public void notifyObs();
	
	public Object getUpdate(Observateur obs);

}