package stage_2.task_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShapeFactory square = ShapeFactory.ofSquare(2);
        ShapeFactory rectangle = ShapeFactory.ofRectangle(4.5, 5.5);

        System.out.println(square);
        System.out.println(rectangle);

    }
}
