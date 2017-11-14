package Modelo;
import java.util.ArrayList;

public class Cine {
	
	private  ArrayList<Funcion> Funciones = new ArrayList <Funcion>();
	private  ArrayList<Cliente> Clientes = new ArrayList <Cliente>();
	
	
	
	public void agregarCliente ( ArrayList<Cliente> a, String nombre, Integer dni, Boolean privi){
		
	}
	
	public ArrayList<Funcion> getFunciones() {
		return Funciones;
	}
	public void setFunciones(ArrayList<Funcion> funciones) {
		Funciones = funciones;
	}
	public ArrayList<Cliente> getClientes() {
		return Clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		Clientes = clientes;
	}
	
}
