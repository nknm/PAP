package cLASSES;

public class clothing_color {
    private int id;
    private String color;
    private String image;

    public clothing_color(int id, String color, String image) {
        this.id = id;
        this.color = color;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}