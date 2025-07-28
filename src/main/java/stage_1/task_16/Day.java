package stage_1.task_16;

public enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend(Day day) {
        if (day == SATURDAY || day == SUNDAY) {
            return true;
        }
        return false;
    }


}
