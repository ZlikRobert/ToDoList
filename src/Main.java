import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a new ToDoList object
        ToDoList toDoList = new ToDoList();

        // create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // print the menu options for the user
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Wyświetl listę zadań do zrobienia");
            System.out.println("2. Wybierz zadanie do wykonania");
            System.out.println("3. Dodaj nowe zadanie");
            System.out.println("4. Wyjdź");

            // get the user's choice from the scanner
            int choice = scanner.nextInt();
            scanner.nextLine();

            // check the user's choice and perform the appropriate action
            if (choice == 1) {
                // display the incomplete tasks in the toDoList object
                System.out.println("Lista zadań do zrobienia:");
                List<Task> incompleteTasks = toDoList.getIncompleteTasks();
                for (int i = 0; i < incompleteTasks.size(); i++) {
                    Task task = incompleteTasks.get(i);
                    System.out.println((i + 1) + ". " + task.getTitle());
                }
            } else if (choice == 2) {
                // allow the user to mark a task as completed
                System.out.println("Które zadanie chcesz wykonać? Podaj numer:");
                int taskIndex = scanner.nextInt() - 1;
                scanner.nextLine();
                List<Task> incompleteTasks = toDoList.getIncompleteTasks();
                if (taskIndex >= 0 && taskIndex < incompleteTasks.size()) {
                    Task selectedTask = incompleteTasks.get(taskIndex);
                    selectedTask.setCompleted(true);
                    System.out.println("Zadanie \"" + selectedTask.getTitle() + "\" zostało oznaczone jako wykonane.");
                } else {
                    System.out.println("Nieprawidłowy numer zadania.");
                }
            } else if (choice == 3) {
                // allow the user to add a new task to the toDoList object
                System.out.println("Podaj tytuł zadania:");
                String title = scanner.nextLine();
                System.out.println("Podaj opis zadania:");
                String description = scanner.nextLine();
                System.out.println("Podaj datę wykonania zadania w formacie dd.MM.yyyy:");
                String dateStr = scanner.nextLine();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                LocalDate date = LocalDate.parse(dateStr, formatter);
                Task task = new Task(title, description, date);
                toDoList.addTask(task);
                System.out.println("Zadanie \"" + title + "\" zostało dodane do listy.");
            } else if (choice == 4) {
                // exit the program
                break;
            } else {
                System.out.println("Nieprawidłowa opcja.");
                // handle invalid input from the user
            }
        }

    }
}

