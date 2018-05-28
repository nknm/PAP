package cLASSES;

public class clothing_picture {
    private int id;
    private int id_clothing;
    private String path;

    public clothing_picture(int id, int id_clothing, String path) {
        this.id = id;
        this.id_clothing = id_clothing;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_clothing() {
        return id_clothing;
    }

    public void setId_clothing(int id_clothing) {
        this.id_clothing = id_clothing;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
    
    
}