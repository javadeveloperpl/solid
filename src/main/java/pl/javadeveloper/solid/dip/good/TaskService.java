package pl.javadeveloper.solid.dip.good;

public class TaskService {

    private Repository repository;

    public TaskService(Repository repository) {
        this.repository = repository;
    }

    public void addTask(Task task) {
        repository.saveTask(task);
    }

    public void removeTask(String taskId) {
        repository.deleteTask(taskId);
    }

}
