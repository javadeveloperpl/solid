package pl.javadeveloper.solid.dip.good;

public interface Repository {

    void saveTask(Task task);

    void deleteTask(String taskId);
}
