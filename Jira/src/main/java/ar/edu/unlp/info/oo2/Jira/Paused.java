package ar.edu.unlp.info.oo2.Jira;

public class Paused extends NotPendingOrFinished {

	public Paused(ToDoItem anItem) {
		super(anItem);
	}

	@Override
	protected void togglePause() {
		throw new RuntimeException("This Item was already paused");
	}


}
