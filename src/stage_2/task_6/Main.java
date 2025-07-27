package stage_2.task_6;


import org.apache.commons.io.FileUtils;
import stage_1.task_25.Rectangle;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        String s = "src/Documents/dontHaveFile";

        File file = new File(s);

        try {
            FileUtils.readFileToString(file);
        } catch (Exception e) {
            System.out.println("Собственное исключение");
        }

    }


}
