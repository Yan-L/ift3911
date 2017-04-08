package Administration;

public class IDGenerator {

	private IDGenerator instance;

	private IDGenerator() {
		// TODO - implement IDGenerator.IDGenerator
		throw new UnsupportedOperationException();
	}

	public static IDGenerator getInstance() {
		return this.instance;
	}

	public String generate() {
		// TODO - implement IDGenerator.generate
		throw new UnsupportedOperationException();
	}

}