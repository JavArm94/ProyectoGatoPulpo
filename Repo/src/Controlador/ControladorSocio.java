package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Modelo.Butaca;
import Modelo.Cine;
import Modelo.Cliente;
import Modelo.Funcion;
import Modelo.Pelicula;
import Modelo.Socio;
import Vista.VistaSocio;

public class ControladorSocio implements MouseListener,ActionListener {
	private VistaSocio vc;
	private Butaca Butaca;
	private Cine Cine;
	private Cliente Cliente;
	private Funcion Funcion;
	private Pelicula Pelicula;
	private Socio Socio;
	
	public ControladorSocio() {
		this.setVc(new VistaSocio(this));
		vc.setVisible(true);
		this.setButaca(new Butaca());
		this.setCine(new Cine());
		this.setCliente(new Cliente(null, null, null, null));
		this.setFuncion(new Funcion(null, null, null));
		this.setPelicula(new Pelicula());
		this.setSocio(new Socio(null, null, null, null, null, null));
	}

	public Butaca getButaca() {
		return Butaca;
	}

	public void setButaca(Butaca butaca) {
		Butaca = butaca;
	}

	public VistaSocio getVc() {
		return vc;
	}

	public void setVc(VistaSocio vc) {
		this.vc = vc;
	}

	public Cine getCine() {
		return Cine;
	}

	public void setCine(Cine cine) {
		Cine = cine;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public Funcion getFuncion() {
		return Funcion;
	}

	public void setFuncion(Funcion funcion) {
		Funcion = funcion;
	}

	public Pelicula getPelicula() {
		return Pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		Pelicula = pelicula;
	}

	public Socio getSocio() {
		return Socio;
	}

	public void setSocio(Socio socio) {
		Socio = socio;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
