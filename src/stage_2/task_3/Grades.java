package stage_2.task_3;

import java.util.Collections;
import java.util.Map;

public class Grades {

    public Map<String, Integer> UnmodifiableGrades(Map<String, Integer> grades) {
        return Collections.unmodifiableMap(grades);
    }

}
