import javaPack.task.Task;
import javaPack.todoList.TodoList;

public class App{
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        TodoList todoList = new TodoList();
        
        todoList.addTask("Apprendre Python !");
        todoList.addTask("Apprendre Js !");
        todoList.addTask("Apprendre Java !");
        
        System.out.println(todoList.displayTasksList());
        todoList.deleteTask(2);
        System.out.println(todoList.displayTasksList());
        todoList.checkStatut(0);
        System.out.println(todoList.displayTasksList());
    }
}
