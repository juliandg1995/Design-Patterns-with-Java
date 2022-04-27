package ar.edu.unlp.info.oo2.FileManager;

public class SizeDecorator extends FileDecorator {

	private double size;
	
	public SizeDecorator(File aFileToDecorate, double aSize) {
		super(aFileToDecorate);
		size = aSize;
	}
	
}
