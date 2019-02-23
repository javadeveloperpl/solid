package pl.javadeveloper.solid.liskov.bad;

public class RegularFile implements File {
    @Override
    public byte[] read() {
        // reads data
        return new byte[0];
    }

    @Override
    public void write(byte[] data) {
        // writes data
    }
}
