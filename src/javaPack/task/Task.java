package javaPack.task;

public class Task {

    private int id;
    private static int inc = 1;
    private String description;
    private boolean statut;
    
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
        this.id = this.inc++;
        this.description = description;
        this.statut = false;
    }
}
