package pl.javadeveloper.solid.dip.good;

public class MySqlRepository implements Repository {

    @Override
    public void saveTask(Task task) {
        // store task in TASK table
    }

    @Override
    public void deleteTask(String taskId) {
        // delete task from TASK table
    }
}
