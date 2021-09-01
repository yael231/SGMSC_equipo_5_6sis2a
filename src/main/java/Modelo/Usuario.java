package Modelo;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import Modelo.Conexion;
import entidad.BeanUsuario;

public class Usuario {
 
 public static boolean agregarmusuario(BeanUsuario usuario){
  boolean agregado=false;
  try {
   Conexion c=new Conexion();
   Connection con=c.getConexion();
   if(con!=null){
    Statement st;
    st = con.createStatement();
    st.executeUpdate("INSERT INTO musuario(`user`,`pass`) VALUES ('"+usuario.getUser()+"','"+usuario.getPass()+"')");
    agregado=true;
    st.close();
   }
   c.cerrarConexion();
  } catch (SQLException e) {
   agregado=false;
   e.printStackTrace();
  }
  return agregado;
 }
}