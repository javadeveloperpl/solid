package pl.javadeveloper.solid.liskov.bad;

public interface File {
    byte[] read();
    void write(byte[] data);
}
