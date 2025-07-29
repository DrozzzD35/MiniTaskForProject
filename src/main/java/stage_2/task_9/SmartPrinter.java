package stage_2.task_9;

public class SmartPrinter implements Scannable {
    @Override
    public void scan(String string) {
        System.out.println("реализую метод scan " + string);
    }

    @Override
    public void print(String string) {
        System.out.println("реализую метод print " + string);
    }
}
