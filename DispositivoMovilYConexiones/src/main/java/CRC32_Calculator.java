import java.util.zip.CRC32;

public class CRC32_Calculator implements CrcCalculator{

	public Integer crcFor(String data) {
		CRC32 crc = new CRC32();
		crc.update(data.getBytes());
		long result = crc.getValue();
		return Math.toIntExact(result);
	}

}
