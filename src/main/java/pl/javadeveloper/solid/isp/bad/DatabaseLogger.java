package pl.javadeveloper.solid.isp.bad;

import java.util.ArrayList;
import java.util.Collection;

public class DatabaseLogger implements Logger {

    @Override
    public void writeMessage(String message) {
        // write message to database
    }

    @Override
    public Collection<String> getMessages() {
        // get all messages from database
        return new ArrayList();
    }
}
