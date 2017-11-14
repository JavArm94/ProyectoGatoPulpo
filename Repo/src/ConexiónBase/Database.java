package ConexiónBase;
import java.sql.Statement;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
private String url = "jdbc:postgresql://localhost/Cine";
	   static String usuario = "postgres";
	   static String password = "evangelion2015";
	   private static Database db;
	
	private Connection con = null;
	private Statement st = null;
	private ResultSet rs = null;
	
	private Database() {
		try {
			con  = DriverManager.getConnection(url, usuario, password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Database getInstance(){
		if (db == null){
			return new Database();
					
		}
		else{
			return db;
		}
	}
	
	public void GuardarSocio (Integer dni_socio,String apellido_socio,String nombre_socio,Date fecha_nac_socio, 
            String direccion_socio, String correo_socio, Integer telefono_socio){
		
		
		try { Statement consulta=(Statement) con.createStatement();
		
        consulta.executeUpdate("insert into socios(dni_socio, apellido_socio, nombre_socio, fecha_nac_socio, direccion_socio, correo_socio, telefono_socio) values('"+dni_socio+"','"+apellido_socio+"','"+ nombre_socio+"','"+fecha_nac_socio+"','"+direccion_socio+"', '"+correo_socio+"','"+telefono_socio+"')");
					System.out.println();
	  } catch(SQLException e){
		  e.printStackTrace();
          JOptionPane.showMessageDialog(null,"El usuario ya existe"); }
		}
	public void consultarSocio (Integer num_socio){ //Busca socio por el número ingresado
		try {
			Statement consulta = (Statement) con.createStatement();
			rs = consulta.executeQuery("select apellido_socio from socios where id_socio = "+ num_socio);
			while (rs.next()){
				System.out.println(rs.getString(1));
			}
		} catch (Exception e) {
			System.out.println("No se ecnontraron resultados para el socio nro: " + num_socio);
		}
	}
	
	public boolean estaUsuario (Integer dni_usuario, String contrasena_usuario){ //Busca el usuario por número y contraseña ingresados y si se encuentra devuelve TRUE
		try {
			Statement consulta = (Statement) con.createStatement();
			rs = consulta.executeQuery("select dni_usuario, contrasena_usuario from usuarios where dni_usuario = "+ dni_usuario);
			while (rs.next()) {
				if (rs.getInt(1)==dni_usuario) {
					System.out.println("Dni de usuario correcto.");
					if (rs.getString(2).equals(contrasena_usuario)) {
						return true;
					}
					else {
						return false;
					}
				}
				else {
					return false;
				}
			}
			return false;
		} catch (Exception e) {		
			System.out.println("No se ecnontraron resultados para el socio nro: " + dni_usuario);
			return false;
		}
	}
	
	public void agregarUsuario (Integer id_usuario, Integer dni_usuario, String apellido_usuario, String nombre_usuario, Date fecha_nac_usuario, String direccion_usuario, Integer telefono_usuario, boolean es_adim, String contrasena_usuario){
		try {
			Statement consulta = (Statement) con.createStatement();
			consulta.executeUpdate("insert into usuarios(id_usuario, dni_usuario, apellido_usuario, nombre_usuario, fecha_nac_usuario, direccion_usuario, telefono_usuario, es_adim, contrasena_usuario) values('"+id_usuario+"','"+dni_usuario+"','"+ apellido_usuario+"','"+nombre_usuario+"','"+fecha_nac_usuario+"', '"+direccion_usuario+"','"+telefono_usuario+"','"+false+"',+'"+contrasena_usuario+"')");
		System.out.println("Usuario agregado correctamente.");
		} catch (Exception e) {		
			System.out.println("No se agrego el usuario");
		}
	}
	
	public ResultSet consultarDatos(String query){
		try {
			st = con.createStatement();
			return  st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		}
	
	}

