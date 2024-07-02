import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nTask List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View Tasks");
            System.out.println("5. View Statistics");
            System.out.println("6. Sort Tasks by Completion Status");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    Task task = new Task(description);
                    taskList.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    taskList.removeTask(removeIndex);
                    scanner.nextLine();  // Consume newline
                    break;
                case 3:
                    System.out.print("Enter task number to mark as completed: ");
                    int completeIndex = scanner.nextInt() - 1;
                    taskList.markTaskAsCompleted(completeIndex);
                    scanner.nextLine();  // Consume newline
                    break;
                case 4:
                    taskList.viewTasks();
                    break;
                case 5:
                    taskList.viewStatistics();
                    break;
                case 6:
                    taskList.sortTasksByCompletionStatus();
                    System.out.println("Tasks sorted by completion status.");
                    break;
                case 7:
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
