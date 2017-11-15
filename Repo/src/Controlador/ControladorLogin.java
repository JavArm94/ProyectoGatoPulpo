package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import ConexiónBase.Database;
import Vista.VistaLoginFinal;
import Vista.VistaPelicula;

public class ControladorLogin implements ActionListener {
	private VistaLoginFinal vl;
	private Database db; //Clase que contiene los métodos que consultan o utilizan la base de datos.
	private ControladorPelicula c; //Controlador de la vista principal.
	
	public ControladorLogin(VistaLoginFinal vl) {
		this.setVl(vl);
		this.vl.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Database db= Database.getInstance();
		if (e.getActionCommand().equals("Aceptar")) {
			if (db.estaUsuario(Integer.valueOf(vl.getTxtUsuario().getText()), vl.getTxtContrasena().getText())){
				//JOptionPane.showMessageDialog(null, "Acceso permitido!");
				VistaPelicula vp = new VistaPelicula(c);
				vp.setVisible(true);
			}
			else {
				JOptionPane.showMessageDialog(null, "¡Usuario o contraseña incorrecto!");
			}
		}
	}
	public VistaLoginFinal getVl() {
		return vl;
	}
	public void setVl(VistaLoginFinal vl) {
		this.vl = vl;
	}

	public Database getDb() {
		return db;
	}

	public void setDb(Database db) {
		this.db = db;
	}

	public ControladorPelicula getC() {
		return c;
	}

	public void setC(ControladorPelicula c) {
		this.c = c;
	}

}
