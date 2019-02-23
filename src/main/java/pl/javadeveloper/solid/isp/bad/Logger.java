package pl.javadeveloper.solid.isp.bad;

import java.util.Collection;

public interface Logger {
    void writeMessage(String message);
    Collection<String> getMessages();
}
