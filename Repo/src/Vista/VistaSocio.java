package Vista;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.ControladorSocio;

public class VistaSocio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ControladorSocio controlador;
	
	public VistaSocio(ControladorSocio controladorSocio) {

		this.setControlador(controladorSocio);
		setMinimumSize(new Dimension(800, 480));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	public ControladorSocio getControlador() {
		return controlador;
	}

	public void setControlador(ControladorSocio controlador) {
		this.controlador = controlador;
	}

}
