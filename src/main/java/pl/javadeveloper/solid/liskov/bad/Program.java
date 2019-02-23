package pl.javadeveloper.solid.liskov.bad;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<File> files = new ArrayList<>();
        files.add(new RegularFile());
        files.add(new ReadOnlyFile()); //read only file

        files.forEach(file -> file.read());
        files.forEach(file -> file.write(new byte[0]));
    }
}
