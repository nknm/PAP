package Gestao;

import DB.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestaoFO {

    private DatabaseConnection db;

    public GestaoFO() {

        this.db = new DatabaseConnection("loja_online");
        this.db.ligar();
        if (this.db.getEstado() == DatabaseConnection.NOT_OK) {
            System.out.println("Erro na ligacao à base de dados");
        }
    }

    public void adicionarAviso(String color, String image){        
        Date data = new Date();
        
        String sql = "INSERT INTO clothing_color "
                + "(color, image) "
                + "VALUES ('" + assunto + "', '" + textoaviso + "', '"+ convertDate(data) + "')";
        System.out.print(sql);
        this.db.executaSQL(sql);
    }
}
