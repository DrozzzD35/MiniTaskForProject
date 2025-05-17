package stage_1.task_15;

public class Rectangle {
    private int side;
    private int width;
    private int high;

    public Rectangle(int width, int high) {
        this.width = width;
        this.high = high;
    }

    public Rectangle(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Rectangle(" + width + "x" + high + ")";
    }

    public int getSide() {
        return side;
    }
}
