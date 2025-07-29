package stage_2.task_8;

public class Main {
    public static void main(String[] args) {
        TaskStatus doneStatus = TaskStatus.DONE;
        TaskStatus newStatus = TaskStatus.NEW;

        System.out.println(doneStatus.canStart());
        System.out.println(newStatus.canStart());


    }
}
