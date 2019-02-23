package pl.javadeveloper.solid.liskov.good;

public class RegularFile implements Readable, Writable {

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
