package cLASSES;

public class clothing_details {
    private int id;
    private int id_clothing;
    private clothing_size id_size;
    private int units;

    public clothing_details(int id, int id_clothing, clothing_size id_size, int units) {
        this.id = id;
        this.id_clothing = id_clothing;
        this.id_size = id_size;
        this.units = units;
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

    public clothing_size getId_size() {
        return id_size;
    }

    public void setId_size(clothing_size id_size) {
        this.id_size = id_size;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }
    
    
}