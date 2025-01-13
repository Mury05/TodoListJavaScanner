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
        if (description.trim() != "") {
            Task task = new Task(description);
            tasksList.add(task);
            System.out.println("Tâche ajoutée avec succès !");
        }else System.out.println("Entrez une description valide !");
    }

    public void deleteTask(int id) {
            Task checkTask = null;
            int removeId = -1;
            for (Task task : tasksList) {
                if (task.getId() == id) {
                    checkTask = task;
                    removeId = tasksList.indexOf(checkTask);
                }
            }
            if (checkTask != null && removeId != -1) {
                tasksList.remove(removeId);
                System.out.println("Tâche supprimée avec succès !");

            } else
                System.out.println("Tâche inexistante !");
    }

    public void checkStatut(int id){
        Task checkTask = null;
        int editId = -1;
        for (Task task : tasksList) {
            if (task.getId() == id) {
                checkTask = task;
                editId = tasksList.indexOf(checkTask);
            }
        }
        if (checkTask != null && editId != -1) {
            checkTask.setStatut(!checkTask.isStatut());
            System.out.println("Statut de la tâche modifiée avec succès !");

        } else
        System.out.println("Tâche inexistante !");
    }

    public void editTask(int id, String newDescription){
        Task checkTask = null;
        int editId = -1;
        for (Task task : tasksList) {
            if (task.getId() == id) {
                checkTask = task;
                editId = tasksList.indexOf(checkTask);
            }
        }
        if (checkTask != null && editId != -1) {
            checkTask.setDescription(newDescription);
            System.out.println("Tâche modifiée avec succès !");

        } else
        System.out.println("Tâche inexistante !");
    }
    public void affTask(int id){
        Task checkTask = null;
        int editId = -1;
        for (Task task : tasksList) {
            if (task.getId() == id) {
                checkTask = task;
                editId = tasksList.indexOf(checkTask);
            }
        }
        if (checkTask != null && editId != -1) {
            System.out.println(checkTask.getDescription());

        } else
        System.out.println("Tâche inexistante !");
    }



    public String displayTasksList() {
        StringBuilder tasksDisplay = new StringBuilder();

        for (int i = 0; i < tasksList.size(); i++) {
            Task task = tasksList.get(i);
            tasksDisplay.append((i+1)).append("- ").append(task.getDescription()).append("[")
                    .append(task.isStatut() ? "Terminée" : "En cours").append("]").append("\n");
        }

        return tasksDisplay.toString();
    }
}
