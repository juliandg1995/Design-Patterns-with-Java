package ar.edu.unlp.info.oo2.Jira;

import java.time.Duration;

public class Finished extends State {

	public Finished(ToDoItem anItem) {
		super(anItem);
	}

	@Override
	protected void start() {
		throw new RuntimeException("This Item was already finished");
	}

	@Override
	protected void togglePause() {
		throw new RuntimeException("This Item was already finished");
	}

	@Override
	protected void finish() {
		throw new RuntimeException("This Item was already finished");
	}

	@Override
	protected Duration workedTime() {
		return item.workedTime(item.getFinishDate());
	}

}
