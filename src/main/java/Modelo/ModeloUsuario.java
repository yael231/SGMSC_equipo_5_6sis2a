package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conector.Conexion;
import entidad.musuario;

public class ModeloUsuario {	
	public musuario iniciarSesion(String user, String pass) {
		musuario musuario = null;
		Connection cn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {
			cn = Conexion.getConexion();
			String sql = "SELECT id_usuario, user, pass FROM musuario  WHERE user = ? AND pass = ?";
			pstm = cn.prepareStatement(sql);
			pstm.setString(1, user);
			pstm.setString(2, pass);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				musuario = new musuario();
				musuario.setId_usuario(rs.getInt("id_usuario"));
				musuario.setUser(rs.getString("user"));
				musuario.setPass(rs.getString("pass"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				
				if (pstm != null) {
					pstm.close();
				}
				
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return musuario;
	}
}