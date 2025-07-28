package stage_1.task_9;

public class Main {
    public static void main(String[] args) {


        Rectangle rectangle1 = new Rectangle(15, 24);
        Rectangle rectangle2 = new Rectangle(-15, 24);
        Rectangle rectangle3 = new Rectangle(15, -24);


        System.out.println("rectangle 1 Height - " + rectangle1.getHeight());
        System.out.println("rectangle 1 Width - " + rectangle1.getWidth());

        System.out.println("rectangle 2 Height - " + rectangle2.getHeight());
        System.out.println("rectangle 2 Width - " + rectangle2.getWidth());

        System.out.println("rectangle 3 Height - " + rectangle3.getHeight());
        System.out.println("rectangle 3 Width - " + rectangle3.getWidth());
        System.out.println();
        System.out.println("После исправления: ");
        rectangle2.setWidth(15);
        rectangle3.setHeight(24);
        System.out.println("rectangle 3 Height - " + rectangle3.getHeight());
        System.out.println("rectangle 2 Width - " + rectangle2.getWidth());


    }
}
