import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Principal extends JFrame implements ActionListener{

    public Principal(){
        this.setSize(400, 200);
        Container contPrinc = this.getContentPane();
        JButton btnConectar = new JButton("Conectar");
        contPrinc.add(btnConectar, BorderLayout.WEST);
        btnConectar.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args){
        Principal Ventana = new Principal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ConexionMySQL mysql = new ConexionMySQL();

        java.sql.Connection cn= mysql.Conectar();


        if(cn!=null){

            JOptionPane.showMessageDialog(null, "Conectado");

            try{

                cn.close();

            }catch(SQLException ex){

                System.out.println("Error al desconectar "+ex);

            }

        }
    }
}

