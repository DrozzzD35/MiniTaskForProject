package stage_1.task_7;

public class Rectangle {
    private int width = 14;
    private int height = 17;
    private static int counter;

    public Rectangle(){}

    public int area() {
        return width * height;
    }

    public int perimeter() {
        return (width + height) * 2;
    }


}
