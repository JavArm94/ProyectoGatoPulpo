package ConexiónBase;

import java.sql.*;


public final class Conexion {
   static String bd = "Cine";
   static String login = "postgres";
   static String password = "evangelion2015";
   static String url = "jdbc:postgresql://localhost/"+bd;

    Connection conn = null;
    	
    public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}

	private static Conexion con =null;
   /** Constructor de DbConnection */
   private Conexion() {
      try{
         //obtenemos la conexiï¿½n
         conn = DriverManager.getConnection(url,login,password);

         if (conn!=null){
            System.out.println("Conectado a base de datos - "+bd+" -  OK");
         }
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   public final static Conexion getConexion (){
	   if(con == null){
		   con = new Conexion();
	   }
	   return con;
	   
   }

   public void desconectar(){
      conn = null;
   }

}