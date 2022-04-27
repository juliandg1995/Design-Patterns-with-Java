package ar.edu.unlp.info.oo2.FileManager;

public class NameDecorator extends FileDecorator {
	
	private String name;
	
	public NameDecorator(File aFileToDecorate, String aName) {
		super(aFileToDecorate);
		name = aName;
	}


}
