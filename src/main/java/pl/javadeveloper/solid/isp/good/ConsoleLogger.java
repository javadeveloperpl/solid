package pl.javadeveloper.solid.isp.good;

public class ConsoleLogger implements Logger {

    @Override
    public void writeMessage(String message) {
        System.out.println(message);
    }
}
