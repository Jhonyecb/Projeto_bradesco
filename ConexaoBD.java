import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    public static Connection conectar() {
        try {
            String url = "jdbc:mysql://localhost:3306/sistema_pix";
            String usuario = "root";
            String senha = "250906@Jo";

            return DriverManager.getConnection(url, usuario, senha);

        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            return null;
        }
    }
}
