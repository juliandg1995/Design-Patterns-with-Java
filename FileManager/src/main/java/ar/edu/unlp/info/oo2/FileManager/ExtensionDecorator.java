package ar.edu.unlp.info.oo2.FileManager;

public class ExtensionDecorator extends FileDecorator {
	
	private String extension;
	
	public ExtensionDecorator(File aFileToDecorate, String anExtension) {
		super(aFileToDecorate);
		extension = anExtension;
	}

}
