package ar.edu.unlp.info.oo2.FileManager;
import java.time.LocalDate;

public class CrDateDecorator extends FileDecorator {

	private LocalDate crDate;
	
	public CrDateDecorator(File aFileToDecorate) {
		super(aFileToDecorate);
//		crDate = LocalDate.now();
	}

}
