package javaPack.task;

public class Task {

    private static int id = 0;
    private String description;
    private boolean statut;
    
    
    public static int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isStatut() {
        return statut;
    }
    public void setStatut(boolean statut) {
        this.statut = statut;
    }
    public Task(String description) {
        this.id++;
        this.description = description;
        this.statut = false;
    }
}
