

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskCreationTest {

    @Test
    void testAddTask() {
        TaskCreation creation = new TaskCreation();
        creation.addTask("Learn DevOps");

        assertEquals(1, creation.getTaskCount());
    }
}
    

