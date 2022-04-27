
public class Connection4G {

	private String symb;
	
	public Connection4G() {
		symb = "4G.png";
	}
	
	public String transmit(String data, int crc) {
		return "Data succesfully sent";
	}
	
	public String symb() {
		return symb;
	}

}
