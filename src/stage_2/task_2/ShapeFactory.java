package stage_2.task_2;

public class ShapeFactory {
    private double w;
    private double h;

    private ShapeFactory(double w, double h) {
        this.w = w;
        this.h = h;
    }

    public static ShapeFactory ofSquare(double side) {
        return new ShapeFactory(side + side, side + side);
    }

    public static ShapeFactory ofRectangle(double w, double h) {
        return new ShapeFactory(w * 2, h * 2);
    }

    @Override
    public String toString() {
        return "ShapeFactory{" +
                "w=" + w +
                ", h=" + h +
                '}';
    }
}
