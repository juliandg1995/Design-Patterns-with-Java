import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.Jira.InProgress;
import ar.edu.unlp.info.oo2.Jira.Pending;
import ar.edu.unlp.info.oo2.Jira.ToDoItem;

class ToDoItemTest {

	ToDoItem toDoItem;
	
	@BeforeEach
	void setup() {
		toDoItem = new ToDoItem("Jira issue");
	}
	
	@Test
	void pendingTest() {
		assertEquals(Pending.class, toDoItem.getState().getClass());
	}
	
	@Test
	void startTest() {
		toDoItem.start();
		assertEquals(InProgress.class, toDoItem.getState().getClass());
	}

}
