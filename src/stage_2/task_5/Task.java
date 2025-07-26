package stage_2.task_5;

public class Task {
    int id;
    String name;

    public Task(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Task newObj = (Task) obj;
        return id == newObj.id;
    }

    @Override
    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + id;
//        return result;

        return 31 * id;
    }
}
