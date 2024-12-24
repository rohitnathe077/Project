// Make a to-do list application using ArrayList. The application should have the following features:
// 1. Add a task
// 2. Delete a task
// 3. Update a task
// 4. Show all tasks
// The application should keep running until the user decides to exit.
// The tasks should be stored in an ArrayList.
// The user should be able to perform the following operations:

import java.util.*;
public class ToDoApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice;
        List<String> tasks = new ArrayList<>();
        do {
            System.out.println("Select operation:");
            System.out.println("1. Add a task");
            System.out.println("2. Delete a task");
            System.out.println("3. Update a task");
            System.out.println("4. Show all tasks");
            System.out.print("Enter your choice (1-4): ");
            int operation = in.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Enter the task to add: ");
                    in.nextLine();
                    String task = in.nextLine();
                    tasks.add(task);
                    break;
                case 2:
                    System.out.println("Enter the task number to delete: ");
                    int taskNumber = in.nextInt();
                    if (taskNumber >= 1 && taskNumber <= tasks.size()) {
                        tasks.remove(taskNumber - 1);
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;
                case 3:
                    System.out.println("Enter the task number to update: ");
                    int taskNumber1 = in.nextInt();
                    if (taskNumber1 >= 1 && taskNumber1 <= tasks.size()) {
                        System.out.println("Enter the new task: ");
                        in.nextLine();
                        String newTask = in.nextLine();
                        tasks.set(taskNumber1 - 1, newTask);
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;
                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks added yet!");
                    } else {
                        System.out.println("Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            System.out.println("Do you want to perform another operation? (yes/no): ");
            choice = in.next();
        } while (choice.equals("yes"));
        in.close();
    }
    
}
