package ar.edu.unlp.info.oo2.Jira;

public class InProgress extends NotPendingOrFinished {

	public InProgress(ToDoItem anItem) {
		super(anItem);
	}

	@Override
	protected void togglePause() {
		this.item.changeState(new InProgress(item));
	}

}
