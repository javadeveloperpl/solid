package pl.javadeveloper.solid.liskov.good;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Readable> readablesFiles = new ArrayList<>();
        readablesFiles.add(new ReadOnlyFile());
        readablesFiles.add(new RegularFile());

        List<Writable> writableFiles = new ArrayList<>();
        writableFiles.add(new RegularFile());
        // writableFiles.add(new ReadOnlyFile());   compilation error
    }
}
