package ar.edu.unlp.info.oo2.Jira;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class NotPendingOrFinished extends State{

	public NotPendingOrFinished(ToDoItem anItem) {
		super(anItem);
	}

	protected Duration workedTime() {
		return item.workedTime(LocalDateTime.now());
	}
	
	protected void start() {
		throw new RuntimeException("This Item was already started");
	}
	
	protected void finish() {
		this.item.setEndingDate(LocalDateTime.now());
		this.item.changeState(new Finished(item));	
	}
}
