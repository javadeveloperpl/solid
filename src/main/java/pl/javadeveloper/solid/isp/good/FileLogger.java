package pl.javadeveloper.solid.isp.good;

import java.util.ArrayList;
import java.util.Collection;

public class FileLogger implements PersistenceLogger {

    @Override
    public void writeMessage(String message) {
        // write message to file
    }

    @Override
    public Collection<String> getMessages() {
        // get messages from logger file
        return new ArrayList<>();
    }
}
