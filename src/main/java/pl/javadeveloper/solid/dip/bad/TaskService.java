package pl.javadeveloper.solid.dip.bad;

public class TaskService {

    private FileRepository repository = new FileRepository();

    public void addTask(Task task) {
        repository.saveTask(task);
    }

    public void removeTask(String taskId) {
        repository.deleteTask(taskId);
    }
}
