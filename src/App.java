import java.util.Scanner;

public class App {
    public static void main(String[] args) {
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
                    "4- Afficher les tâches\n" +
                    "5- Quitter\n" +
                    "Entrez votre choix : ");
            
            // Lire le choix de l'utilisateur
            choix = scanner.nextInt();

            // Traitement en fonction du choix
            switch (choix) {
                case 1:
                // Ajouter une tâche
                System.out.println("Entrez la description de la tâche :");
                String description = scanner.next();
                    
                    break;
                case 2:
                // Supprimer une tâche
                System.out.println("Entrez l'identifiant  de la tâche à supprimer :");
                int id = scanner.nextInt();
                    break;
                case 3:
                // Marquer une tâche comme terminée
                System.out.println("Entrez l'identifiant de la tâche à marquer comme terminée :");
                id = scanner.nextInt();
                    break;
                case 4:
                // Afficher les tâches
                System.out.println("Les tâches sont :");
                    break;
                case 5:
                    System.out.println("Quitter le programme");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez entrer un choix entre 1 et 5.");
                    break;
            }
        } while (choix != 5); 

    
        scanner.close();
    }

}
