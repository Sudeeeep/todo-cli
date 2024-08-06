package TodoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList todo = new TodoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("==== TODO LIST ====");
            System.out.println("");
            System.out.println("Please use the below commands to edit your Todo List");
            System.out.println("Commands: add, remove, complete, display, exit");
            System.out.println("Please Enter a Command");
            String command = scanner.nextLine().toLowerCase().trim();

            switch (command) {
                case "add":
                    System.out.println("Enter Task Description");
                    String desc = scanner.nextLine();
                    todo.addTask(desc);
                    break;

                case "remove":
                    System.out.println("Please Enter Task Number To Remove");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine();
                    todo.removeTask(removeIndex);
                    break;

                case "complete":
                    System.out.println("Please Enter Task Number To Mark as Complete");
                    int completeIndex = scanner.nextInt();
                    scanner.nextLine();
                    todo.completeTask(completeIndex);
                    break;

                case "display":
                    todo.displayList();
                    break;

                case "exit":
                    System.out.println("Exiting the Application.....");
                    return;

                default:
                    System.out.println("Invalid Command! Try Again");
                    break;
            }
        }

    }
}
