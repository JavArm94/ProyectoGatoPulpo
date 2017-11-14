package Controlador;

import Vista.VistaLoginFinal;

public class MainControlador {

	public static void main(String[] args) {
	      //new Controlador();
		VistaLoginFinal vl = new VistaLoginFinal();
	      ControladorLogin cl = new ControladorLogin(vl);
	      ControladorPelicula cp = new ControladorPelicula();
	}

}
