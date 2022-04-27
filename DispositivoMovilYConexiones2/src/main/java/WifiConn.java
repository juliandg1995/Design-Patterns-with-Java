
public class WifiConn extends Connection{

	private String pict;
	
	public WifiConn() {
		pict = "WIFI.jpg";
	}
	
	public String sendData(String data, Integer crc) {
		return "Data succesfully sent";
	}

	public String pict() {
		return pict;
	}
	
	protected void changeConnection(){
		this.device.changeTo4G(this.pict());
	}
}
