package ConexiónBase;

public class Usuario {
	
	private Integer NumJugador;
	private String NombJugador;
	private Integer PuntJugador;
	
	public Usuario(){
		super();
	}
	
	public Usuario(Integer puntaje,String nombre, Integer numero) {
		this.NumJugador=numero;
		this.NombJugador=nombre;
		this.PuntJugador=puntaje;
	}
	
	public String getNombJugador() {
		return NombJugador;
	}
	public void setNombJugador(String nombJugador) {
		NombJugador = nombJugador;
	}
	public Integer getPuntJugador() {
		return PuntJugador;
	}
	public void setPuntJugador(Integer PuntJugador) {
		PuntJugador = this.PuntJugador;
	}
	public Integer getNumJugador() {
		return NumJugador;
	}
	public void setNumJugador(Integer numJugador) {
		NumJugador = numJugador;
	}
	
	
	

}
