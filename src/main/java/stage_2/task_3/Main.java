package stage_2.task_3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> test = new HashMap<>(Map.of("раз", 1, "два", 2));
        System.out.println(test);
        test.put("Четыре", 4);
        Grades grades = new Grades();
        Map<String, Integer> testMap = grades.UnmodifiableGrades(test);

        System.out.println(testMap);
        testMap.remove("раз");
//        testMap.put("three", 3);
        System.out.println(testMap);

    }
}
