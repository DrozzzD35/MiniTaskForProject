package stage_2.task_8;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TaskStatusTest {


    boolean canStart(TaskStatus status) {
        return status == TaskStatus.NEW;

    }


    @ParameterizedTest
    @CsvSource({"NEW, true", "IN_PROGRESS, false", "DONE, false", "BLOCKED, false"})
    void testCanStart(TaskStatus status, boolean expectResult) {
        boolean testStatus = canStart(status);
        Assertions.assertEquals(expectResult, testStatus);


    }

}

