package pl.javadeveloper.solid.isp.good;

import java.util.Collection;

public interface PersistenceLogger extends Logger {
    Collection<String> getMessages();
}
