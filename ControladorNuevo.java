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
import Vista.VistaNueva;

public class ControladorNuevo  implements MouseListener,ActionListener{

	private Butaca butaca;
	private Cine cine;
	private Cliente cliente;
	private Funcion funcion;
	private Pelicula pelicula;
	private Socio socio;
	private  ArrayList<Butaca> Sala = new ArrayList <Butaca>();
	private VistaNueva vn;
	//private Database db = Database.getInstance();
	private ControladorLogin cl;
	
	public ControladorNuevo () {
		this.setVn(new VistaNueva(this));
		vn.setVisible(true);
	        
		// ACA SE DEBERIA CONTROLAR SI NO TIENE PRIVILEGIOS INICIA ASI
	        /*	System.out.println("tiene privilegios");
			vn.getInforme_Usu().setVisible(true);
			vn.getVenta_Usu().setVisible(true);
			vn.getVentas().setVisible(true);
			vn.getSocio().setVisible(false);
			vn.getPelicula_Cartelera().setVisible(false);
			vn.getPelicula_Butacas().setVisible(false);
			vn.getEntrada().setVisible(false);
			vn.getUsuario_Registro().setVisible(false);
			vn.getUsuario_Busqueda().setVisible(false);
			vn.getInforme().setVisible(false);
			vn.getUsuario_B().setVisible(false);
			vn.getVenta_B().setVisible(false);
			vn.getInformes_B().setVisible(false);
			vn.getPrecio_Entrada_B().setVisible(false);
			vn.getSocio_B().setVisible(false);*/
			
		
		this.setButaca(new Butaca());
		this.setCine(new Cine());		
		this.setCliente(new Cliente(null, null, null, null));
		this.setFuncion(new Funcion(null,null,Sala));
		this.setPelicula(new Pelicula());
		this.setSocio(new Socio(null, null, null, null, null, null));
		
		/*	
		cine.getFunciones().add(funcion);
for (int i = 0; i < 54; i++) {
			funcion.getSala().add(i,butaca);;
			funcion.getSala().get(i).setNumeroButaca(i+1);
		System.out.println(	funcion.getSala().get(i).getNumeroButaca());
		}*/
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
	
		/*Icon butaca_disponible_img = new ImageIcon(
				vn.getButaca_disponible().getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		Icon butaca_disponible_select_img = new ImageIcon(
				vn.getButaca_disponible_select().getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		
		Icon butaca_ocupada_img = new ImageIcon(
				vn.getButaca_ocupada().getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		Icon butaca_ocupada_select_img = new ImageIcon(
				vn.getButaca_ocupada_select().getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		
		JLabel lbl = (JLabel) arg0.getComponent();*/
		
	/*	if (lbl.getName() == "0") {
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
		}*/
	}


	

	@Override
	public void mouseEntered(MouseEvent arg0) {

		
	}


	@Override
	public void mouseExited(MouseEvent arg0) {
	
		
	}


	@Override
	public void mousePressed(MouseEvent arg0) {

		
	}


	@Override
	public void mouseReleased(MouseEvent arg0) {

		
	}


	@Override
	public void actionPerformed(ActionEvent e) {	
	// CADA COMTEMPLACION HACE QUE SE SETEEN EN FALSO
		//LAS OTRAS VISTAS, HAY SETEOS INNECESARIOS
		// ASI QUE HAY QUE ARMAR UN SINGLETON O ALGO
		if(e.getSource()==vn.getVenta_B()){
			vn.getVentas().setVisible(true);
			vn.getSocio().setVisible(false);
			vn.getPelicula_Cartelera().setVisible(false);
			vn.getPelicula_Butacas().setVisible(false);
			vn.getEntrada().setVisible(false);
			vn.getUsuario_Busqueda().setVisible(false);
			vn.getUsuario_Registro().setVisible(false);
			vn.getInforme().setVisible(false);
			
		} else if (e.getSource()==vn.getInformes_B()){
				vn.getVentas().setVisible(false);
				vn.getSocio().setVisible(false);
				vn.getPelicula_Cartelera().setVisible(false);
				vn.getPelicula_Butacas().setVisible(false);
				vn.getEntrada().setVisible(false);
				vn.getUsuario_Busqueda().setVisible(false);
				vn.getUsuario_Registro().setVisible(false);
				vn.getInforme().setVisible(true);
			
			}else if (e.getSource()==vn.getPrecio_Entrada_B() && vn.getPrecio_Entrada_B().getText().equals("Precio Entrada")){
				vn.getVentas().setVisible(false);
				vn.getSocio().setVisible(false);
				vn.getPelicula_Cartelera().setVisible(false);
				vn.getEntrada().setVisible(true);
				vn.getUsuario_Busqueda().setVisible(false);
				vn.getUsuario_Registro().setVisible(false);
				vn.getInforme().setVisible(false);
				vn.getPelicula_Butacas().setVisible(false);
				vn.getPrecio_Entrada_B().setText("Pelicula");
				
			}else if (e.getSource()==vn.getUsuario_B()){
				vn.getVentas().setVisible(false);
				vn.getSocio().setVisible(false);
				vn.getPelicula_Cartelera().setVisible(false);
				vn.getPelicula_Butacas().setVisible(false);
				vn.getEntrada().setVisible(false);
				vn.getUsuario_Registro().setVisible(false);
				vn.getUsuario_Busqueda().setVisible(true);
				vn.getInforme().setVisible(false);
			
			}else if (e.getSource()==vn.getSocio_B()){
				vn.getVentas().setVisible(false);
				vn.getSocio().setVisible(true);
				vn.getPelicula_Cartelera().setVisible(false);
				vn.getPelicula_Butacas().setVisible(false);
				vn.getEntrada().setVisible(false);
				vn.getUsuario_Busqueda().setVisible(false);
				vn.getUsuario_Registro().setVisible(false);
				vn.getInforme().setVisible(false);
				
			
			}else if (e.getSource()==vn.getPrecio_Entrada_B() && vn.getPrecio_Entrada_B().getText().equals("Pelicula")){
				vn.getVentas().setVisible(false);
				vn.getSocio().setVisible(false);
				vn.getPelicula_Cartelera().setVisible(true);
				vn.getPelicula_Butacas().setVisible(false);
				vn.getEntrada().setVisible(false);
				vn.getUsuario_Busqueda().setVisible(false);
				vn.getUsuario_Registro().setVisible(false);
				vn.getInforme().setVisible(false);
				vn.getPrecio_Entrada_B().setText("Precio Entrada");
			
			} else if (e.getSource()==vn.getCerrar_Sesion()){
				vn.setVisible(false);
			
			} else if (e.getSource()==vn.getInforme_Usu()){
				vn.getInforme().setVisible(true);
				vn.getVentas().setVisible(false);
				System.out.println("h");
			}else if (e.getSource()==vn.getVenta_Usu()){
				vn.getVentas().setVisible(true);;
				vn.getInforme().setVisible(false);
				System.out.println("h");
			}
 		
		}
	/*	if(e.getSource().equals(vn.getBtnPrecioEntrada())){
			// aca hay que crear un patron, ese que enciende y apaga
		vn.getButacas_Usuario().setVisible(false);
		vn.getCartelera_Visualizacion().setVisible(false);	

		}/*
		
		
		
			/*for  (int i = 0; i <cine.getFunciones().get(0).getSala().size(); i++) {
				if (cine.getFunciones().get(0).getSala().get(i).getSeleccion()==true &&
						cine.getFunciones().get(0).getSala().get(i).getEstadoButaca()==false) {
					cine.getFunciones().get(0).getSala().get(i).setEstadoButaca(true);
				   		System.out.println("vende");}}*/
		


	public VistaNueva getVn() {
		return vn;
	}




	public void setVn(VistaNueva vn) {
		this.vn = vn;
	}




	public ControladorLogin getCl() {
		return cl;
	}




	public void setCl(ControladorLogin cl) {
		this.cl = cl;
	}






	
}