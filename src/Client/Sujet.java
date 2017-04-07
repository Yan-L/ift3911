package Client;

public interface Sujet {

	/**
	 * 
	 * @param Observer
	 */
	void attach(int Observer);

	/**
	 * 
	 * @param Observer
	 */
	void detach(int Observer);

	void notify();

}