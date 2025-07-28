package stage_2.task_6;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {

        String s = "src/Documents/dontHaveFile";

        File file = new File(s);

        try {
            FileUtils.readFileToString(file, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Поймали исключение " + e);
        }

    }


}
