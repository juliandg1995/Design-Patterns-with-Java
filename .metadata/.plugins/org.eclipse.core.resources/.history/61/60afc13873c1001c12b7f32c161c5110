package ar.edu.unlp.info.oo2.accesobd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DatabaseRealAccessProxy implements DatabaseAccess{

	private DatabaseRealAccess databaseRealAccess;
	
	public DatabaseRealAccessProxy(DatabaseRealAccess databaseRealAccess) {
		this.databaseRealAccess = databaseRealAccess;
	}
	
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if(!checkAccess(databaseRealAccess.getCurrentId())) {
			throw new RuntimeException("accesso denegado");
		}
		return databaseRealAccess.getSearchResults(queryString);			
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if(!checkAccess(databaseRealAccess.getCurrentId())) {
			throw new RuntimeException("accesso denegado");
		}
		return databaseRealAccess.insertNewRow(rowData);
	}

	public boolean checkAccess(int currentId) {
		return databaseRealAccess.isAllowed(currentId);
	}
	

}
