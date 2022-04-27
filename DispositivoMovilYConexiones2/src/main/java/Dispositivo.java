
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
	
	public void changeConnection() {
		this.connection.changeConnection();
	}
	
	public String send(String data) {
		return connection.sendData(data, crcCalculator.crcFor(data));
	}
	
	protected void showSymbol(String aSymbol) {
		Display.showBanner(aSymbol);
	}
	
	protected String changeConnection(String aGraphic) {
		Ringer.ring();
		return Display.showBanner(aGraphic);
	}
	
	protected String changeToWifi(String aPict) {
		return this.changeConnection(aPict);
	}
	
	protected String changeTo4G(String aSymb) {
		return this.changeConnection(aSymb);
	}
}
