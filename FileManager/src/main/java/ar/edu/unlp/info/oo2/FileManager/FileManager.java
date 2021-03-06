package ar.edu.unlp.info.oo2.FileManager;
import java.util.*;

public class FileManager {
	
	private List<File> files;
	
	public FileManager() {
		files = new ArrayList<File>();
	}
	
	public String prettyPrint(File aFile) {
		if (files.contains(aFile)){
			return aFile.prettyPrint();
		}
		throw new RuntimeException("File not found");
	}
	
	public boolean addFile(File aFile ) {
		if (files.contains(aFile)) {
			return false;
		}
		return files.add(aFile);
	}
	
	public File getFileAtIndex(int index) {
		return files.get(index);
	}
	
	
}
