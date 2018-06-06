import java.sql.*;
import javax.swing.JOptionPane;


public class ConexionMySQL {

    public String db = "bdBoletaje";
    public String url = "jdbc:mysql://localhost/"+db;
    public String user = "root";
    public String pass = "clvprinc";


    public Connection Conectar(){

        Connection link = null;

        try{

            Class.forName("org.gjt.mm.mysql.Driver");

            link = DriverManager.getConnection(this.url, this.user, this.pass);

        }catch(Exception ex){

            JOptionPane.showMessageDialog(null, ex);

        }

        return link;
    }

}