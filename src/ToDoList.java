import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

// a class representing a list of tasks
class ToDoList {
    private List<Task> tasks;// a private list of tasks

    // a class representing a list of tasks
    public ToDoList() {
        tasks = new ArrayList<>();
    }

    // a method that adds a given task to the list of tasks
    public void addTask(Task task) {
        tasks.add(task);
    }

    // a method that creates a new task with a given title, description and date
    // and adds it to the list of tasks
    public void addTaskByUser(String title, String description, LocalDate date) {
        Task task = new Task(title, description, date);
        addTask(task);
    }

    // a method that returns a list of all incomplete tasks
    public List<Task> getIncompleteTasks() {
        List<Task> incompleteTasks = new ArrayList<>(); // create an empty list of incomplete tasks
        for (Task task : tasks) {  // iterate over all tasks in the list of tasks
            if (!task.isCompleted()) {  // if the task is not completed, add it to the list of incomplete tasks
                incompleteTasks.add(task);
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks; // return the list of incomplete tasks
    }
}


