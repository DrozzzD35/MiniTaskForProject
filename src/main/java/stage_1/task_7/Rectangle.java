package stage_1.task_7;

public class Rectangle {
    private int width;
    private int height;
    private static int counter;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        counter++;

    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
