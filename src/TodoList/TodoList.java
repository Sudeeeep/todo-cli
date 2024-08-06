package TodoList;

import java.util.ArrayList;

public class TodoList {

    private ArrayList<Task> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        this.tasks.add(new Task(description));
    }

    public void completeTask(int index) {
        if (index < 0 || index > tasks.size()) {
            System.out.println("Oops!! Invalid Task number");
        } else {
            this.tasks.get(index - 1).complete();
        }
    }

    public void removeTask(int index) {
        if (index < 0 || index > tasks.size()) {
            System.out.println("Oops!! Invalid Task number");
        } else {
            this.tasks.remove(index - 1);
        }
    }

    public void displayList() {
        if (tasks.isEmpty()) {
            System.out.println("Your List is empty!");
            System.out.println("Type add command to start adding tasks to your list");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println("(" + (i + 1) + ") " + tasks.get(i));
            }
        }
    }

}