package Modelo;
import java.sql.*;

public class Conexion {

 private Connection con = null;

 public Conexion() {
  try {
   Class.forName("com.mysql.jdbc.Driver").newInstance();
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/medicos", "root","Juan2003");
  } catch (InstantiationException | IllegalAccessException
    | ClassNotFoundException | SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 }
 
 public Connection getConexion(){
  return con;
 }
 
 public void cerrarConexion(){
  try {
   con.close();
  } catch (SQLException e) {
   e.printStackTrace();
  }
 }
}