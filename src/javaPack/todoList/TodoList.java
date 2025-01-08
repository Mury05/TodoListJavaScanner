package javaPack.todoList;

import java.util.ArrayList;
import java.util.List;
import javaPack.task.Task;

public class TodoList {
    private List<Task> tasksList = new ArrayList<>();

    public List<Task> getTasksList() {
        return tasksList;
    }

    public void setTasksList(List<Task> tasksList) {
        this.tasksList = tasksList;
    }

    public void addTask(String description) {
        Task task = new Task(description);
        tasksList.add(task);
        System.out.println("Tâche ajoutée avec succès !");
    }

    public String displayTasksList() {
        StringBuilder tasksDisplay = new StringBuilder();

        for (int i = 0; i < tasksList.size(); i++) {
            Task task = tasksList.get(i);
            tasksDisplay.append((i + 1)).append("- ").append(task.getDescription()).append("[").append(task.isStatut() ? "Terminée" : "En cours").append("]").append("\n");
        }

        return tasksDisplay.toString();
    }
}
