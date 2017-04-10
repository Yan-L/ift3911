package Administration;

public class IDGenerator {

	private static IDGenerator instance;
	private int counter = 0;
	private String[] padding = {"","00000","0000","000", "00", "0"};

	private IDGenerator() {}

	public static IDGenerator getInstance() {
		if(instance == null){
			instance = new IDGenerator();
		}
		return instance;
	}

	public String generate() {
		String id = "" + counter;
		id = padding[id.length()%6] + id;
		counter++;
		return id;
	}

}