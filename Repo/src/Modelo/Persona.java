package Modelo;

public abstract class Persona {

	
	private String nombre;
	private String apellido;
	private Integer dni;
	private Boolean privilegios;
	



	

	public Persona(String nombre, String apellido, Integer dni, Boolean privilegios) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.privilegios = privilegios;
	}

	public void CalcularEntrada(){}
    
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Boolean getPrivilegios() {
		return privilegios;
	}
	public void setPrivilegios(Boolean privilegios) {
		this.privilegios = privilegios;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
