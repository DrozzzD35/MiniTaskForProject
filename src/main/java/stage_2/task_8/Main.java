package stage_2.task_8;

public class Main {
    public static void main(String[] args) {
        TaskStatus newStatus = TaskStatus.NEW;
        TaskStatus doneStatus = TaskStatus.DONE;
        TaskStatus inProgressStatus = TaskStatus.IN_PROGRESS;
        TaskStatus blockedStatus = TaskStatus.BLOCKED;

        System.out.println(newStatus.canStart());
        System.out.println(doneStatus.canStart());
        System.out.println(inProgressStatus.canStart());
        System.out.println(blockedStatus.canStart());


    }
}
