package cLASSES;

public class clothing {
    
    private int id;
    private clothing_type id_type;
    private String nome;
    private String description;
    private clothing_color id_color;
    private clothing_picture id_picture;
    private float price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public clothing_type getId_type() {
        return id_type;
    }

    public void setId_type(clothing_type id_type) {
        this.id_type = id_type;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public clothing_color getId_color() {
        return id_color;
    }

    public void setId_color(clothing_color id_color) {
        this.id_color = id_color;
    }

    public clothing_picture getId_picture() {
        return id_picture;
    }

    public void setId_picture(clothing_picture id_picture) {
        this.id_picture = id_picture;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    

    
    
            
}
