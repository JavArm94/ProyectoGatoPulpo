package Vista;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Controlador.ControladorUsuario;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;

public class VistaUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private ControladorUsuario controlador;
	private JPanel Usuario;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField txtContrasena_usuario;
	private JButton btnGuardar;
	private JButton btnAtras;

	public VistaUsuario(ControladorUsuario controladorUsuario) {
		this.setControlador(controladorUsuario);
		setMinimumSize(new Dimension(800, 480));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Usuario = new JPanel();
		Usuario.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Usuario);
		Usuario.setLayout(null);
		
		JPanel Usuario_Registro = new JPanel();
		Usuario_Registro.setBounds(0, 0, 784, 441);
		Usuario.add(Usuario_Registro);
		Usuario_Registro.setLayout(null);
		
		JLabel label = new JLabel("Usuario:");
		label.setBounds(195, 87, 123, 14);
		Usuario_Registro.add(label);
		label.addMouseListener(getControlador());
		
		JLabel label_1 = new JLabel("Apellido:");
		label_1.setBounds(195, 112, 123, 14);
		label_1.addMouseListener(getControlador());
		Usuario_Registro.add(label_1);
		
		JLabel label_2 = new JLabel("Nombre:");
		label_2.setBounds(195, 137, 123, 14);
		label_2.addMouseListener(getControlador());
		Usuario_Registro.add(label_2);
		
		JLabel label_3 = new JLabel("DNI:");
		label_3.setBounds(195, 162, 123, 14);
		label_3.addMouseListener(getControlador());
		Usuario_Registro.add(label_3);
		
		JLabel label_4 = new JLabel("Fecha de Nacimiento:");
		label_4.setBounds(195, 187, 123, 14);
		label_4.addMouseListener(getControlador());
		Usuario_Registro.add(label_4);
		
		JLabel label_5 = new JLabel("Telefono:");
		label_5.setBounds(195, 212, 123, 14);
		label_5.addMouseListener(getControlador());
		Usuario_Registro.add(label_5);
		
		JLabel label_6 = new JLabel("Direccion:");
		label_6.setBounds(195, 237, 123, 14);
		label_6.addMouseListener(getControlador());
		Usuario_Registro.add(label_6);
		
		textField = new JTextField();
		textField.setBounds(328, 84, 289, 20);
		textField.setColumns(10);
		Usuario_Registro.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(328, 109, 289, 20);
		textField_1.setColumns(10);
		Usuario_Registro.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(328, 159, 289, 20);
		textField_2.setColumns(10);
		Usuario_Registro.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(328, 134, 289, 20);
		textField_3.setColumns(10);
		Usuario_Registro.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(328, 184, 289, 20);
		textField_4.setColumns(10);
		Usuario_Registro.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(328, 234, 289, 20);
		textField_5.setColumns(10);
		Usuario_Registro.add(textField_5);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(146, 336, 89, 23);
		btnAtras.addActionListener(getControlador());
		Usuario_Registro.add(btnAtras);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(535, 336, 89, 23);
		btnGuardar.addActionListener(getControlador());
		Usuario_Registro.add(btnGuardar);
		
		textField_6 = new JTextField();
		textField_6.setBounds(328, 209, 289, 20);
		textField_6.setColumns(10);
		Usuario_Registro.add(textField_6);
		
		txtContrasena_usuario = new JTextField();
		txtContrasena_usuario.setBounds(328, 259, 289, 20);
		Usuario_Registro.add(txtContrasena_usuario);
		txtContrasena_usuario.setColumns(10);
		
		JLabel lblContrasena_user = new JLabel("Contrase\u00F1a:");
		lblContrasena_user.setBounds(195, 262, 100, 14);
		Usuario_Registro.add(lblContrasena_user);
		
		JPanel Busqueda_Usuario = new JPanel();
		Busqueda_Usuario.setBounds(0, 0, 784, 441);
		Usuario.add(Busqueda_Usuario);
		Busqueda_Usuario.setLayout(null);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(89, 27, 86, 20);
		Busqueda_Usuario.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(252, 27, 86, 20);
		Busqueda_Usuario.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(415, 27, 86, 20);
		Busqueda_Usuario.add(textField_9);
		
		JButton button_2 = new JButton("Buscar");
		button_2.setBounds(679, 26, 80, 23);
		button_2.addActionListener(getControlador());
		Busqueda_Usuario.add(button_2);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(543, 27, 86, 20);
		Busqueda_Usuario.add(textField_10);
		
		JLabel label_7 = new JLabel("Apellido:");
		label_7.setBounds(185, 30, 57, 14);
		Busqueda_Usuario.add(label_7);
		
		JLabel label_8 = new JLabel("Nombre:");
		label_8.setBounds(348, 30, 57, 14);
		Busqueda_Usuario.add(label_8);
		
		JLabel label_9 = new JLabel("DNI:");
		label_9.setBounds(511, 30, 22, 14);
		Busqueda_Usuario.add(label_9);
		
		JLabel label_10 = new JLabel("Usuario:");
		label_10.setBounds(22, 30, 57, 14);
		Busqueda_Usuario.add(label_10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 67, 759, 300);
		Busqueda_Usuario.add(scrollPane);
		
		JButton button_3 = new JButton("Modificar");
		button_3.addActionListener(getControlador());
		button_3.setBounds(200, 378, 105, 23);
		Busqueda_Usuario.add(button_3);
		
		JButton button_4 = new JButton("Agregar Nuevo");
		button_4.setBounds(470, 378, 130, 23);
		button_4.addActionListener(getControlador());
		Busqueda_Usuario.add(button_4);
		
		JButton button_5 = new JButton("Borrar");
		button_5.setBounds(339, 378, 86, 23);
		button_5.addActionListener(getControlador());
		Busqueda_Usuario.add(button_5);
	}

	public ControladorUsuario getControlador() {
		return controlador;
	}

	public void setControlador(ControladorUsuario controlador) {
		this.controlador = controlador;
	}
	

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_2 = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_3;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_3 = textField_3;
	}

	public JTextField getTextField_4() {
		return textField_4;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_4 = textField_4;
	}

	public JTextField getTextField_5() {
		return textField_5;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_5 = textField_5;
	}

	public JTextField getTextField_6() {
		return textField_6;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_6 = textField_6;
	}

	public JTextField getTextField_7() {
		return textField_7;
	}

	public void setTextField_7(JTextField textField_7) {
		this.textField_7 = textField_7;
	}

	public JTextField getTextField_8() {
		return textField_8;
	}

	public void setTextField_8(JTextField textField_8) {
		this.textField_8 = textField_8;
	}

	public JTextField getTextField_9() {
		return textField_9;
	}

	public void setTextField_9(JTextField textField_9) {
		this.textField_9 = textField_9;
	}

	public JTextField getTextField_10() {
		return textField_10;
	}

	public void setTextField_10(JTextField textField_10) {
		this.textField_10 = textField_10;
	}

	public JPanel getUsuario() {
		return Usuario;
	}

	public void setUsuario(JPanel usuario) {
		Usuario = usuario;
	}

	public JTextField getTxtContrasena_usuario() {
		return txtContrasena_usuario;
	}

	public void setTxtContrasena_usuario(JTextField txtContrasena_usuario) {
		this.txtContrasena_usuario = txtContrasena_usuario;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JButton getBtnAtras() {
		return btnAtras;
	}

	public void setBtnAtras(JButton btnAtras) {
		this.btnAtras = btnAtras;
	}
	
}
