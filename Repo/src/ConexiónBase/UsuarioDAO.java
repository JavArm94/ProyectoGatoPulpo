package ConexiónBase;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ConexiónBase.Conexion;
import ConexiónBase.Usuario;

public class UsuarioDAO {
	
	public void registrarUsuario(Usuario miUsuario)
	{
		Conexion conex= Conexion.getConexion();
		
		try {
			Statement estatuto = conex.getConn().createStatement();
			estatuto.executeUpdate("INSERT INTO usuarios VALUES ('"+miUsuario.getPuntJugador()+"', '"
					+miUsuario.getNombJugador()+"', '"+miUsuario.getNumJugador()+");");
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			System.out.println("No se Registro");
		}
		//barra invertida para no ser interpretado como el cierre de la comilla?
	}

	public Usuario buscarUsuario(String nombre) 
	{
		Conexion conex=  Conexion.getConexion();
		Usuario usuario= new Usuario();
		boolean existe=false;
		try {
			PreparedStatement consulta = conex.getConn().prepareStatement("SELECT * FROM usuarios where NombreJugador = ? ");
			consulta.setString(1, nombre);
			ResultSet res = consulta.executeQuery();
			while(res.next()){
				existe=true;
				usuario.setNumJugador(res.getInt("numero"));
				usuario.setNombJugador(res.getString("nombrejugador"));
				usuario.setPuntJugador(res.getInt("puntaje"));
			 }
			System.out.println("Se ha registrado Exitosamente");

			res.close();
			conex.desconectar();
					
					
			} catch (SQLException e) {
					System.out.println("Error, no se conecto");
					System.out.println(e);
			}
		
			if (existe) {
				return usuario;
			}
			else return null;				
	}

	public void modificarUsuario(Usuario miUsuario) {
		
		Conexion conex= Conexion.getConexion();
		
		try{
			String consulta="UPDATE usuarios SET nombrejugador= ? ,numero = ?,  Puntaje=?  ";
			PreparedStatement estatuto = conex.getConn().prepareStatement(consulta);
			
            estatuto.setInt(1, miUsuario.getNumJugador());
            estatuto.setString(2, miUsuario.getNombJugador());
            estatuto.setInt(3, miUsuario.getPuntJugador());
            estatuto.executeUpdate();

          System.out.println(" Se ha Modificado Correctamente ");
         

        }catch(SQLException	 e){

            System.out.println(e);
            System.out.println("Error al Modificar");

        }
	}

	public void eliminarUsuario(String nombre)
	{
		Conexion conex= Conexion.getConexion();
		try {
			Statement estatuto = conex.getConn().createStatement();
			estatuto.executeUpdate("DELETE FROM usuarios WHERE nombre='"+nombre+"'");
            System.out.println(" Se ha Eliminado Correctamente");
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
            System.out.println(e.getMessage());
			System.out.println("No se Elimino");
		}
	}
}
