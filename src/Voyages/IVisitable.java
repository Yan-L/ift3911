package Voyages;

import java.util.List;

public interface IVisitable {

	/**
	 * 
	 * @param v
	 */
	
	public List<String> accept(Visiteur v);

}