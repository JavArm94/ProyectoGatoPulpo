package Controlador;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;

import ConexiónBase.Database;
import Modelo.Butaca;
import Modelo.Cine;
import Modelo.Cliente;
import Modelo.Funcion;
import Modelo.Pelicula;
import Modelo.Socio;
import Vista.VistaPelicula;

public class ControladorPelicula  implements MouseListener,ActionListener{
	private VistaPelicula vp;
	private Butaca butaca;
	private Cine cine;
	private Cliente cliente;
	private Funcion funcion;
	private Pelicula pelicula;
	private Socio socio;
	private  ArrayList<Butaca> Sala = new ArrayList <Butaca>();
	
	public ControladorPelicula () {
		this.setVp(new VistaPelicula(this));
		vp.setVisible(true);
		//wololo
		this.setButaca(new Butaca());
		this.setCine(new Cine());		
		this.setCliente(new Cliente(null, null, null, null));
		this.setFuncion(new Funcion(null,null,Sala));
		this.setPelicula(new Pelicula());
		this.setSocio(new Socio(null, null, null, null, null, null));
		

		cine.getFunciones().add(funcion);
	for (int i = 0; i < 54; i++) {
			funcion.getSala().add(i,butaca);;
			funcion.getSala().get(i).setNumeroButaca(i+1);
		System.out.println(	funcion.getSala().get(i).getNumeroButaca());
		}
	}


	
	
	public VistaPelicula getVc() {
		return vp;
	}

	public void setVc(VistaPelicula vc) {
		this.vp = vc;
	}

	public Butaca getButaca() {
		return butaca;
	}

	public void setButaca(Butaca butaca) {
		this.butaca = butaca;
	}

	public Cine getCine() {
		return cine;
	}

	public void setCine(Cine cine) {
		this.cine = cine;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcion getFuncion() {
		return funcion;
	}

	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}


	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		Icon butaca_disponible_img = new ImageIcon(
				vp.getButaca_disponible().getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		Icon butaca_disponible_select_img = new ImageIcon(
				vp.getButaca_disponible_select().getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		
		Icon butaca_ocupada_img = new ImageIcon(
				vp.getButaca_ocupada().getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		Icon butaca_ocupada_select_img = new ImageIcon(
				vp.getButaca_ocupada_select().getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		
		JLabel lbl = (JLabel) arg0.getComponent();
		
		if (lbl.getName() == "0") {
			lbl.setIcon(butaca_disponible_select_img);
			lbl.setName("1");
			System.out.println("lo pone en true");
			cine.getFunciones().get(0).getSala().get(Integer.parseInt(lbl.getText().substring(7))).setSeleccion(true);
		} else if (lbl.getName() == "1") {
			lbl.setIcon(butaca_disponible_img);
			lbl.setName("0");
			if (cine.getFunciones().get(0).getSala().get(Integer.parseInt(lbl.getText().substring(7)))
					.getSeleccion() == (true)) {
				System.out.println("lo pone en false");
				cine.getFunciones().get(0).getSala().get(Integer.parseInt(lbl.getText().substring(7)))
						.setSeleccion(false);
			}
		}
		else if (cine.getFunciones().get(0).getSala().get(Integer.parseInt(lbl.getText().substring(7)))
				.getEstadoButaca()==true){
			lbl.setIcon(butaca_ocupada_img);
			lbl.setName("3");
			}
		else if (lbl.getName()=="3"){
			lbl.setIcon(butaca_ocupada_select_img);
			lbl.setName("4");
		}
	}


	

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {		
			for  (int i = 0; i <cine.getFunciones().get(0).getSala().size(); i++) {
				if (cine.getFunciones().get(0).getSala().get(i).getSeleccion()==true &&
						cine.getFunciones().get(0).getSala().get(i).getEstadoButaca()==false) {
					cine.getFunciones().get(0).getSala().get(i).setEstadoButaca(true);
				   		System.out.println("vende");}}}

	public VistaPelicula getVp() {
		return vp;
	}

	public void setVp(VistaPelicula vp) {
		this.vp = vp;
	}

	
}
