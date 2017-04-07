package Voyages;

public class IDVoyageGenerator {

	private IDVoyageGenerator instance;

	/**
	 * 
	 * @param IDprefix
	 */
	public string generate(string IDprefix) {
		// TODO - implement IDVoyageGenerator.generate
		throw new UnsupportedOperationException();
	}

	private IDVoyageGenerator() {
		// TODO - implement IDVoyageGenerator.IDVoyageGenerator
		throw new UnsupportedOperationException();
	}

	public static IDVoyageGenerator getInstance() {
		return this.instance;
	}

}