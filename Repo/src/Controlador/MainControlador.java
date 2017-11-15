package Controlador;

import javax.swing.UIManager;

import Vista.VistaLoginFinal;

public class MainControlador {

	public static void main(String[] args) {
	      //new Controlador();
		/*VistaLoginFinal vl = new VistaLoginFinal();
	      ControladorLogin cl = new ControladorLogin(vl);
	      ControladorPelicula cp = new ControladorPelicula();*/
		try { 
		    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
		    e.printStackTrace();
		}
		  VistaLoginFinal vf = new VistaLoginFinal();
		  ControladorLogin cl = new ControladorLogin(vf);
	  
	      ControladorPelicula cp = new ControladorPelicula();
	      ControladorUsuario cu = new ControladorUsuario();
	}

}
