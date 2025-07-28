package stage_1.task_26;

public class Circle extends Figure {
    @Override
    public double area() {
        double radius = 12;
        return Math.PI * (radius * radius);
    }
}
