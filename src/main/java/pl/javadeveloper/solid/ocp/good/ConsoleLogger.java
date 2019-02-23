package pl.javadeveloper.solid.ocp.good;

public class ConsoleLogger implements MessageLogger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}