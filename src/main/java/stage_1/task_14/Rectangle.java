package stage_1.task_14;

public class Rectangle {
    private int side;
    private double width;
    private double high;

    public Rectangle(double width, double high) {
        this.width = width;
        this.high = high;
    }

    public Rectangle(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", high=" + high +
                '}';
    }


}
