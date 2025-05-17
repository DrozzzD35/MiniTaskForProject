package stage_1.task_12;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Rectangle> rectangles = new ArrayList<>();

    public List<Rectangle> getRectangles() {
        return rectangles;
    }

    public void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }

    public Rectangle createRectangle(int side) {
        return new Rectangle(side);
    }

    public Rectangle createSquare(int side) {
        return new Square(side);
    }

    public void printAreaByRectangle() {
        for (Rectangle element : rectangles) {
            System.out.println("Площадь квадрата " + element + " равна: " + element.area(element));
        }
    }


}
