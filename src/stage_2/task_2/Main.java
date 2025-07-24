package stage_2.task_2;

public class Main {
    public static void main(String[] args) {
        ShapeFactory square = ShapeFactory.ofSquare(2);
        ShapeFactory rectangle = ShapeFactory.ofRectangle(4.5, 5.5);

        System.out.println(square);
        System.out.println(rectangle);


    }
}
