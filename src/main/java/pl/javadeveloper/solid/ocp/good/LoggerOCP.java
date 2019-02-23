package pl.javadeveloper.solid.ocp.good;

public class LoggerOCP {
    private MessageLogger messageLogger;

    public LoggerOCP(MessageLogger messageLogger) {
        this.messageLogger = messageLogger;
    }

    public void log(String message) throws Exception {
        messageLogger.log(message);
    }
}
