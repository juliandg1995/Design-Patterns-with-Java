package ar.edu.unlp.info.oo2.Jira;

import java.time.Duration;

public class Pending extends State {
	
	public Pending(ToDoItem anItem) {
		super(anItem);
	}
	
	@Override
	protected void start() {
		item.setStartingDate();
		this.item.changeState(new InProgress(item));	
	}

	@Override
	protected void togglePause() {
		throw new RuntimeException("This Item has not been started yet");
		
	}

	@Override
	protected void finish() {
		throw new RuntimeException("This Item has not been started yet");
		
	}

	@Override
	protected Duration workedTime() {
		throw new RuntimeException("This Item has not been started yet");
	}
	
	
}
