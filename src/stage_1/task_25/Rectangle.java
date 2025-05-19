package stage_1.task_25;

public class Rectangle implements Movable {

    @Override
    public int move(int dx, int dy) {
        return (dx + dy) * 2;
    }
}
