package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public interface DatabaseAccess {
	
    abstract Collection<String> getSearchResults(String queryString);

    abstract int insertNewRow(List<String> rowData);
    
    
}