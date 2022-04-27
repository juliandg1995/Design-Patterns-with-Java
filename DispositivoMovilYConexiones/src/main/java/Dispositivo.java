
public class Dispositivo {
	
	private Connection connection;
	private CrcCalculator crcCalculator;
	private Ringer ringer;
	private Display display;
	
	public Dispositivo(Connection aConnection,Ringer aRinger,Display aDisplay,CrcCalculator aCrcCalculator) {
		connection = aConnection;
		ringer = aRinger;
		display = aDisplay;
		crcCalculator = aCrcCalculator;
	}
	
	public void setCalculator(CrcCalculator calculator) {
		crcCalculator = calculator;
	}
	
	public void changeConnection(Connection connection) {
		
	}
	
	public String send(String data) {
		return connection.sendData(data, crcCalculator.crcFor(data));
	}
}
