
public class WifiConn implements Connection{

	private String pict;
	
	public String sendData(String data, Integer crc) {
		Ringer.ring();
		return Display.showBanner(pict);
	}

	public String pict() {
		return pict;
	}

}
