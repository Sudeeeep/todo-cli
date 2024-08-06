package TodoList;

public class Task {
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public void complete() {
        this.isCompleted = true;
    }

    public String toString() {
        return this.description + " ===> " + (this.isCompleted ? "[X][COMPLETED]" : "[][PENDING]");
    }
}