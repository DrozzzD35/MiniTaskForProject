package stage_1.task_15;

public class Square extends Rectangle {

    public Square(int side) {
        super(side);
    }

    @Override
    public String toString() {
        return "Square(" + getSide() + ")";
    }
}
