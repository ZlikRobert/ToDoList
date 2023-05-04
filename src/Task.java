import java.time.LocalDate;
import java.util.ArrayList;

// Task class to represent a single task
class Task {
    private String title;// Title of the task
    private String description;// Description of the task
    private LocalDate dueDate;// Due date of the task
    private boolean isCompleted; // Completion status of the task

    // Constructor to create a new task object
    public Task(String title, String description, LocalDate dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.isCompleted = false;// Initialize the task as incomplete
    }

    // Getter method to retrieve the title of the task
    public String getTitle() {
        return title;
    }

    // Setter method to set the title of the task
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method to retrieve the description of the task
    public String getDescription() {
        return description;
    }

    // Setter method to set the description of the task
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter method to retrieve the due date of the task
    public LocalDate getDueDate() {
        return dueDate;
    }

    // Setter method to set the due date of the task
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    // Getter method to retrieve the completion status of the task
    public boolean isCompleted() {
        return isCompleted;
    }

    // Setter method to set the completion status of the task
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
