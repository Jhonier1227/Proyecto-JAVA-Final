
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class BaseDeDatos {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jhonyer";
        String usuario = "root";
        String contraseña = "";
        Connection conexion = null;



        try {
            conexion = DriverManager.getConnection(url,usuario,contraseña);
            System.out.println("conexion exitosa");
        } catch (SQLException e) {
            System.err.println("error al conectar : " + e.getMessage());

        } finally {
            try{
                if(conexion != null){
                    conexion.close();
                    System.out.println("conexion cerrada");
            }
        } catch (SQLException e) {
            System.out.println("error al cerrar la conexion" + e.getMessage());
        }
    }

}
}
   