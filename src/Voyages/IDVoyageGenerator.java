package Voyages;

public class IDVoyageGenerator {

	private static IDVoyageGenerator instance;
	private int counter = 0;
	private String[] padding = {"","00000","0000","000", "00", "0"};

	/**
	 * 
	 * @param IDprefix
	 */
	public String generate(String IDprefix) {
		String id = "" + counter;
		id = IDprefix + padding[id.length()%6] + id;
		counter++;
		return id;
	}

	private IDVoyageGenerator() {}

	public static IDVoyageGenerator getInstance() {
		if(instance == null){
			instance = new IDVoyageGenerator();
		}
		return instance;
	}

}