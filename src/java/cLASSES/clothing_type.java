package cLASSES;

public class clothing_type {

    private int id;
    private int id_clothing;
    private String tipo;

    public clothing_type(int id1, int id_clothing1, String tipo1) {
        id = id1;
        id_clothing = id_clothing1;
        tipo = tipo1;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
