/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcaplicattion;
 
import java.sql.*;
/**
 *
 * @author Alejandro del Carmen
 */
public class JDBCAplicattion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Carga exitosa");
            String url = "jdbc:postgresql://localhost/marcas?user=marcas&password=marcas";
           Connection conn = DriverManager.getConnection(url);
            System.out.println("Conexion realizada");
            Statement st = conn.createStatement();
            st.execute("insert into "+
                    " marcas (id, nombre, paterno, materno) "+
                    " values (1,'Cris','Ucan','Diaz')");
            conn.close();
            //Repositorio para subir esta practica, tener hasta los pasos 3.2(Ejecutar de consulta)
            //1 de insersion, 1 de borrado, 1 de Select     
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: Controlador");
            System.exit(1);

        } catch (SQLException ex) {
            System.out.println("Error: Conexion");
        ex.printStackTrace();
        }

    }
}
