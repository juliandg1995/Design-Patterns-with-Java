package ar.edu.unlp.info.oo2.Jira;
import java.time.Duration;

public abstract class State {
	
	protected ToDoItem item;
	
	public State(ToDoItem anItem) {
		item = anItem;
	}
	
	protected abstract void start();
	protected abstract void togglePause();
	protected abstract void finish();
	protected abstract Duration workedTime();
	protected void addComment(String aComment) {
		this.item.comment(aComment);
	}
	
}
