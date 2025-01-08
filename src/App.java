import java.util.Scanner;
import javaPack.task.Task;
import javaPack.todoList.TodoList;

public class App {
    public static void main(String[] args)  throws Exception {
        TodoList todoList = new TodoList();

        todoList.addTask("Apprendre Python !");
        todoList.addTask("Apprendre Js !");
        todoList.addTask("Apprendre Java !");

        Scanner scanner = new Scanner(System.in);
        int choix;

        // Affichage du menu et gestion du choix dans une boucle jusqu'à ce que l'utilisateur choisisse de quitter
        do {
            // Affichage des options
            System.out.println(
                "\n Choisissez une option\n "+
                    "\n1- Ajouter une tâche\n" +
                    "2- Supprimer une tâche\n" +
                    "3- Marquer une tâche comme terminée\n" +
                    "4- Modifier une tâche\n" +
                    "5- Afficher les tâches\n" +
                    "6- Quitter\n" +
                    "Entrez votre choix : ");
            
            // Lire le choix de l'utilisateur
            choix = scanner.nextInt();

            // Traitement en fonction du choix
            switch (choix) {
                case 1:
                Scanner clavier = new Scanner(System.in);

                // Ajouter une tâche
                System.out.println("Entrez la description de la tâche :");
                String description = clavier.nextLine();
                todoList.addTask(description);
                System.out.println("Listes des tâches :");
                System.out.println(todoList.displayTasksList());
                    break;
                case 2:
                // Supprimer une tâche
                System.out.println("Entrez l'identifiant de la tâche à supprimer :");
                int id = scanner.nextInt();
                todoList.deleteTask(id);
                System.out.println("Listes des tâches :");
                System.out.println(todoList.displayTasksList());
                    break;
                case 3:
                // Marquer une tâche comme terminée
                System.out.println("Entrez l'identifiant de la tâche à marquer comme terminée :");
                id = scanner.nextInt();
                todoList.checkStatut(id);
                System.out.println("Listes des tâches :");
                System.out.println(todoList.displayTasksList());
                    break;
                case 4:
                // Modifier les tâches
                System.out.println("Entrez l'identifiant de la tâche à modifier");
                id = scanner.nextInt();
                Scanner console = new Scanner(System.in);
                todoList.affTask(id);
                // Ajouter une tâche
                System.out.println("Entrez la description de la tâche :");
                String descriptionEdit = console.nextLine();
                todoList.editTask(id, descriptionEdit);

                System.out.println("Listes des tâches :");
                System.out.println(todoList.displayTasksList());
                    break;
                case 5:
                // Afficher les tâches
                System.out.println("Listes des tâches :");
                System.out.println(todoList.displayTasksList());
                    break;
                case 6:
                    System.out.println("Quitter le programme");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez entrer un choix entre 1 et 5.");
                    break;
            }
        } while (choix != 6); 

    
        scanner.close();
    }

}
