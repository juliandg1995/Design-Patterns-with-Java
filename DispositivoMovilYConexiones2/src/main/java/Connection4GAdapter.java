
public class Connection4GAdapter extends Connection {
	
	private Connection4G a4GConnection;
	
	public Connection4GAdapter() {
		a4GConnection = new Connection4G();
	}

	@Override
	protected String sendData(String data, Integer crc) {
		return a4GConnection.transmit(data,crc);
	}

	@Override
	protected String pict() {
		return a4GConnection.symb();
	}
	
	protected void changeConnection() {
		this.device.changeToWifi(this.pict());
	}
	
}
