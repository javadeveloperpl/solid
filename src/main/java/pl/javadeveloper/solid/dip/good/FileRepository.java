package pl.javadeveloper.solid.dip.good;

public class FileRepository implements Repository {

    @Override
    public void saveTask(Task task) {
        // logic responsible for saving task to file
    }

    @Override
    public void deleteTask(String taskId) {
        // logic responsible for deleting task from file
    }
}
