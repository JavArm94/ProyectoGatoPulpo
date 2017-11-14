package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import Modelo.Butaca;
import Modelo.Cine;
import Modelo.Cliente;
import Modelo.Funcion;
import Modelo.Pelicula;
import Modelo.Socio;
import Vista.VistaPrincipalFinal;



public class Controlador implements MouseListener,ActionListener{
	
	private VistaPrincipalFinal vc;
	private Butaca butaca;
	private Cine cine;
	private Cliente cliente;
	private Funcion funcion;
	private Pelicula pelicula;
	private Socio socio;

	public Controlador() {
		this.setVc(new VistaPrincipalFinal(this));
		vc.setVisible(true);
		//wololo
		this.setButaca(new Butaca());
		this.setCine(new Cine());
		this.setCliente(new Cliente(null, null, null, null));
		this.setFuncion(new Funcion(null, null, null));
		this.setPelicula(new Pelicula());
		this.setSocio(new Socio(null, null, null, null, null, null));
	}

	
	public VistaPrincipalFinal getVc() {
		return vc;
	}

	public void setVc(VistaPrincipalFinal vc) {
		this.vc = vc;
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
	JLabel lbl = (JLabel)	arg0.getComponent();
	lbl.setIcon(vc.getButaca_disponible_select());
	System.out.println("funciona");
		
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
		// TODO Auto-generated method stub
		
	}



	
	/*private butacasVista frmButacas;
	private Cine cinePrincipal;
	
	public Controlador() {
     this.setFrmButacas((new butacasVista(this)));
     this.setCinePrincipal(new Cine());     
     for (int i = 0; i < 62; i++) {
		JLabel lblGen = new JLabel("label generico");			
		this.getFrmButacas().getColeccionButacas().add(lblGen);
		this.getFrmButacas().getColeccionButacas().get(0).setBounds(100, 100,100,100);
		this.getFrmButacas().getContentPane().add(getFrmButacas().getColeccionButacas().get(0)); 
		this.getFrmButacas().setVisible(true);	
		}}
	

	public butacasVista getFrmButacas() {
		return 
				frmButacas;
	}

	public void setFrmButacas(butacasVista frmButacas) {
		this.frmButacas = frmButacas;
	}

	public Cine getCinePrincipal() {
		return cinePrincipal;
	}

	public void setCinePrincipal(Cine cinePrincipal) {
		this.cinePrincipal = cinePrincipal;
	}
	
	*/

}
