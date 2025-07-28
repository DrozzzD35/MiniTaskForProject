package stage_1.task_29;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void area() {
        Rectangle rectangle = new Rectangle();

        double result = rectangle.area(4);
        Assertions.assertEquals(16, result);
    }
}