package pl.javadeveloper.solid.ocp.good;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class FileLogger implements MessageLogger {
    @Override
    public void log(String message) throws Exception {
        Files.write(Paths.get("file.log"),
                Arrays.asList(message),
                StandardOpenOption.APPEND);
    }
}
