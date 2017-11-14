package Modelo;
import java.util.ArrayList;


public class Funcion {
	
	private Pelicula peliculas; // arreglo de peliculas
	private Integer horario;
	private  ArrayList<Butaca> Cine = new ArrayList <Butaca>();
	
	
	public Funcion(Pelicula peliculas, Integer horario, ArrayList<Butaca> cine) {
		super();
		this.peliculas = peliculas;
		this.horario = horario;
		Cine = cine;
	}
	
	public Pelicula getPeliculas() {
		return peliculas;
	}
	public void setPeliculas(Pelicula peliculas) {
		this.peliculas = peliculas;
	}
	public Integer getHorario() {
		return horario;
	}
	public void setHorario(Integer horario) {
		this.horario = horario;
	}
	public ArrayList<Butaca> getCine() {
		return Cine;
	}
	public void setCine(ArrayList<Butaca> cine) {
		Cine = cine;
	}
	
}
