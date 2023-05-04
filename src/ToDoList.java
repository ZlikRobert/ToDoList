import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
class ToDoList {
    private List<Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }
    public void addTaskByUser(String title, String description, LocalDate date) {
        Task task = new Task(title, description, date);
        addTask(task);
    }

    public List<Task> getIncompleteTasks() {
        List<Task> incompleteTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks;
    }
}


