package Controlador;

import javax.swing.UIManager;

import Vista.VistaLoginFinal;

public class NuevoMainControlador {

	

	public static void main(String[] args) {
	
	try { 
	    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	} catch (Exception e) {
	    e.printStackTrace();
	}
	/* VistaLoginFinal vf = new VistaLoginFinal();
	  ControladorLogin cl = new ControladorLogin(vf);*/
	ControladorNuevo cn = new ControladorNuevo();
}}
