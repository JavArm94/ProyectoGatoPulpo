package Modelo;
import java.util.Date;

public class Socio extends Cliente {
	
	private String direccion;
	private Date fecha;

	

public Socio(String nombre, String apellido, Integer dni, Boolean privilegios, String direccion, Date fecha) {
		super(nombre, apellido, dni, privilegios);
		this.direccion = direccion;
		this.fecha = fecha;
	}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public Date getFecha() {
	return fecha;
}


public void setFecha(Date fecha) {
	this.fecha = fecha;
}



}
