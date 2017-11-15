package Modelo;
import java.util.ArrayList;


public class Funcion {
	
	private Pelicula peliculas; // arreglo de peliculas
	private Integer horario;
	private  ArrayList<Butaca> Sala = new ArrayList <Butaca>();
	
	
	public Funcion(Pelicula peliculas, Integer horario, ArrayList<Butaca> sala) {
		super();
		this.peliculas = peliculas;
		this.horario = horario;
		this.setSala(sala);
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

	public ArrayList<Butaca> getSala() {
		return Sala;
	}

	public void setSala(ArrayList<Butaca> sala) {
		Sala = sala;
	}

	
}
