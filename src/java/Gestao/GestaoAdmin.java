package Gestao;

import DB.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestaoAdmin {

    private DatabaseConnection db;

    public GestaoAdmin() {
        this.db = new DatabaseConnection("PrjFinalWeb");
        this.db.ligar();
        if (this.db.getEstado() == DatabaseConnection.NOT_OK) {
            System.out.println("Erro na ligacao à base de dados");
        }
    }

    public void adicionarClothingColor(String color, String hexcode) {

        String sql = "INSERT INTO clothing_color"
                + "(color, image) "
                + "VALUES ('" + color + "', '" + hexcode + "')";
        System.out.print(sql);
        this.db.executaSQL(sql);
    }

    public void adicionarClothingType(String tipo) {

        String sql = "INSERT INTO clothing_type"
                + "(tipo) "
                + "VALUES ('" + tipo + "')";
        System.out.print(sql);
        this.db.executaSQL(sql);
    }

    public void adicionarClothingPicture(String tipo) {

        String sql = "INSERT INTO clothing_picture"
                + "(path) "
                + "VALUES ('" + tipo + "')";
        System.out.print(sql);
        this.db.executaSQL(sql);
    }

    public void adicionarClothingSize(String size) {

        String sql = "INSERT INTO clothing_size"
                + "(size) "
                + "VALUES ('" + size + "')";
        System.out.print(sql);
        this.db.executaSQL(sql);
    }

    public void adicionarClothingDetails(int units) {

        String sql = "INSERT INTO clothing_details"
                + "(units) "
                + "VALUES ('" + units + "')";
        System.out.print(sql);
        this.db.executaSQL(sql);
    }
    
    public void adicionarClothing(String nome, String description, float price) {

        String sql = "INSERT INTO clothing"
                + "(nome,description,price) "
                + "VALUES ('" + nome + "','" + description + "','" + price + "')";
        System.out.print(sql);
        this.db.executaSQL(sql);
    }

}
