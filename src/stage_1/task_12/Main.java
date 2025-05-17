package stage_1.task_12;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        manager.addRectangle(manager.createRectangle(15));
        manager.addRectangle(manager.createRectangle(27));
        manager.addRectangle(manager.createRectangle(6));

        manager.addRectangle(manager.createSquare(13));
        manager.addRectangle(manager.createSquare(32));

        manager.printAreaByRectangle();


    }

}
