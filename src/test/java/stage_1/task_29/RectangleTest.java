package stage_1.task_29;

import org.junit.jupiter.api.*;

class RectangleTest {


    @BeforeEach
    void useBeforeEach() {
        System.out.println("Тестируем метод BeforeEach");
    }

    @Test
    void area() {
        Rectangle rectangle = new Rectangle();

        double result = rectangle.area(4);
        Assertions.assertEquals(16, result);
        name();
    }

    @DisplayName("Привет")
    void name() {
        System.out.println("Здравствуйте");
    }

    @AfterEach
    void useAfterEach() {
        System.out.println("Тестируем метод AfterEach");
    }

}