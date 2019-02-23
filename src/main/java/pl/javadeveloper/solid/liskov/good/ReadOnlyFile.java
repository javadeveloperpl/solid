package pl.javadeveloper.solid.liskov.good;

public class ReadOnlyFile implements Readable {

    @Override
    public byte[] read() {
        // reads data
        return new byte[0];
    }
}
