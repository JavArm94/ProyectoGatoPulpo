package ConexiónBase;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mainnnn {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
	
		Database db = Database.getInstance();
			
		    //CONSULTA 
		ResultSet rs = db.consultarDatos("Select *" + "from socios");
			//db.GuardarSocio(36000000, "garay", "rodrigo", Date.valueOf("1991-01-01"), "a", "a", 1);
		System.out.println("Muestra socio 1");
		
			Statement st = null;
			
			
			
			//IMPRESION DE DATOS DE TABLA
		try {
			while (rs.next()){
				
				System.out.println(rs.getInt(1));
				System.out.println(":  ");
				System.out.println(rs.getInt(2));
				System.out.println(":   ");
				System.out.println(rs.getString(3));
				System.out.println(":   ");
				System.out.println(rs.getString(4));
				System.out.println(":   ");
				System.out.println(rs.getString(5));
				System.out.println(":   ");
				System.out.println(rs.getString(6));
				System.out.println(":   ");
				System.out.println(rs.getString(7));
				System.out.println(":   ");
				System.out.println(rs.getString(8));
				System.out.println(":   ");				
			}
			System.out.println("--------------------------------------");
			db.consultarSocio(1000);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
