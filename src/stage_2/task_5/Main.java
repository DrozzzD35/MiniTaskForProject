package stage_2.task_5;

public class Main {
    public static void main(String[] args) {

        Task task1 = new Task(1, "a");
        Task task2 = new Task(1, "a");
        Task task3 = new Task(1, "с");
        Task task4 = new Task(2, "a");

        System.out.println(task1.equals(task2));
        System.out.println(task1.hashCode() == task2.hashCode());
        System.out.println(task1.hashCode() == task3.hashCode());
        System.out.println(task1.hashCode() == task4.hashCode());
        System.out.println(task3.hashCode() == task4.hashCode());


    }
}
