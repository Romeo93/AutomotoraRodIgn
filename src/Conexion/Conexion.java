/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Bryan
 */
public class Conexion {
    
private Connection conn;
public Conexion()
{
verificar();
conectarse();
}
public boolean verificar()
{
try
{
Class.forName("com.mysql.jdbc.Driver");
return true;
}
catch(ClassNotFoundException ex)
{
    System.out.println("error :c");
return false;
}
}
public boolean conectarse()
{
try
{
conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","" );
return true;

}catch(SQLException a)
{    JOptionPane.showConfirmDialog(null, "No Existe Coneccion hable con los Profesionales","-=Error=-",JOptionPane.ERROR);
    System.out.println(a.getMessage());
return false;

}

}

public PreparedStatement crearSentencia(String consulta)
{


try{ 
return conn.prepareStatement(consulta);
}
catch(SQLException ex)
{
return null;
}
}
}
