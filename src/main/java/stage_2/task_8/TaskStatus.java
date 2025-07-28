package stage_2.task_8;


public enum TaskStatus {
    NEW,
    IN_PROGRESS,
    DONE,
    BLOCKED;

    public boolean canStart() {
        switch (this){
            case NEW -> {
                return true;
            }
            default -> {
                return false;
            }
        }
//        return this.equals(NEW);
    }

}
