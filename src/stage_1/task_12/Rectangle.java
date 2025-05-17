package stage_1.task_12;

public class Rectangle {
    private int side;

    public Rectangle(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side=" + side +
                '}';
    }

    public int getSide() {
        return side;
    }

    public int area(Rectangle rectangle) {
        return rectangle.getSide() * rectangle.getSide();
    }
}
