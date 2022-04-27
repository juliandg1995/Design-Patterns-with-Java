
public abstract class Connection {
	
	protected Dispositivo device;
	
	protected abstract String sendData(String data, Integer crc);
	protected abstract String pict();
	protected abstract void changeConnection();

}
