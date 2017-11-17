package Vista;


import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.ControladorNuevo;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaNueva extends JFrame {
	private static final long serialVersionUID = 1L;
	private ControladorNuevo cn;
	private JPanel Contenedor;
	private JTextField textField;
	private JTextField textField_1;
	private JButton Cerrar_Sesion;
	private JButton Venta_B;
	private JButton Informes_B;
	private JButton Socio_B;
	private JButton Usuario_B;
	private JButton Precio_Entrada_B;
	private JPanel Usuario_Registro;
	private JPanel Entrada;
	private JPanel Socio;
	private JPanel Usuario_Busqueda;
	private JPanel Pelicula_Butacas;
	private JPanel Pelicula_Cartelera;
	private JPanel Informe;
	private JPanel Ventas;
	private JButton Venta_Usu;
	private JButton Informe_Usu;
	private JTextField usuario_Regi;
	private JTextField nombre_Regi;
	private JTextField apellido_Regi;
	private JTextField dni_Regi;
	private JTextField fecha_Nac_Regi;
	private JTextField telefono_Regi;
	private JTextField direccion_Regi;
	private JTextField contraseña_Regi;
	private JLabel Usuario_existe;
	private JLabel numeros_check;
	private JLabel numeros_check_1;
	private JLabel letras_check;
	private JLabel letras_check_1;
	private JButton agregar_usuario_B;
	private JLabel contraseña_Check;
	private JButton atras_Regi;
	private JButton Pelicula_B;
	private JLabel año_pelicula_check;
	private JTextField año_pelicula;
	private JTextField usuario_TextField_UsuarioBusqueda;
	private JTextField nombre_TextField_UsuarioBusqueda;
	private JTextField apellido_TextField_UsuarioBusqueda;
	private JTextField dni_TextField_UsuarioBusqueda;
	private JLabel dni_check_Usuario;
	private JLabel apellido_check_Usuario;
	private JLabel nombre_check_Usuario;
	private JLabel usuario_check_Usuario;
	private JButton buscar_Usuario;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 * @param controladorNuevo 
	 */
	public VistaNueva(ControladorNuevo controladorNuevo) {
		this.setCn(controladorNuevo);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(800, 480));
		setBounds(100, 100, 800, 503);
		Contenedor = new JPanel();
		Contenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Contenedor);
		Contenedor.setLayout(null);
		
		Usuario_Busqueda = new JPanel();
		Usuario_Busqueda.setLayout(null);
		Usuario_Busqueda.setBounds(0, 23, 784, 441);
		Usuario_Busqueda.setVisible(false);
		Contenedor.add(Usuario_Busqueda);
		
		usuario_TextField_UsuarioBusqueda = new JTextField();
		usuario_TextField_UsuarioBusqueda.addFocusListener(getCn());
		usuario_TextField_UsuarioBusqueda.setColumns(10);
		usuario_TextField_UsuarioBusqueda.setBounds(89, 24, 86, 20);
		Usuario_Busqueda.add(usuario_TextField_UsuarioBusqueda);
		
		nombre_TextField_UsuarioBusqueda = new JTextField();
		nombre_TextField_UsuarioBusqueda.addFocusListener(getCn());
		nombre_TextField_UsuarioBusqueda.setColumns(10);
		nombre_TextField_UsuarioBusqueda.setBounds(252, 24, 86, 20);
		Usuario_Busqueda.add(nombre_TextField_UsuarioBusqueda);
		
		apellido_TextField_UsuarioBusqueda = new JTextField();
		apellido_TextField_UsuarioBusqueda.addFocusListener(getCn());
		apellido_TextField_UsuarioBusqueda.setColumns(10);
		apellido_TextField_UsuarioBusqueda.setBounds(415, 24, 86, 20);
		Usuario_Busqueda.add(apellido_TextField_UsuarioBusqueda);
		
		buscar_Usuario = new JButton("Buscar");
		buscar_Usuario.setBounds(679, 23, 80, 23);
		buscar_Usuario.addActionListener(getCn());
		Usuario_Busqueda.add(buscar_Usuario);
		
		dni_TextField_UsuarioBusqueda = new JTextField();
		dni_TextField_UsuarioBusqueda.addFocusListener(getCn());
		dni_TextField_UsuarioBusqueda.setColumns(10);
		dni_TextField_UsuarioBusqueda.setBounds(543, 24, 86, 20);
		Usuario_Busqueda.add(dni_TextField_UsuarioBusqueda);
		
		JLabel label_69 = new JLabel("Apellido:");
		label_69.setBounds(348, 27, 57, 14);
		Usuario_Busqueda.add(label_69);
		
		JLabel label_70 = new JLabel("Nombre:");
		label_70.setBounds(185, 27, 57, 14);
		Usuario_Busqueda.add(label_70);
		
		JLabel label_71 = new JLabel("DNI:");
		label_71.setBounds(511, 27, 22, 14);
		Usuario_Busqueda.add(label_71);
		
		JLabel label_72 = new JLabel("Usuario:");
		label_72.setBounds(22, 27, 57, 14);
		Usuario_Busqueda.add(label_72);
		
		JScrollPane scrollPane_1 = new JScrollPane((Component) null);
		scrollPane_1.setBounds(10, 79, 759, 285);
		Usuario_Busqueda.add(scrollPane_1);
		
		JButton button_18 = new JButton("Modificar");
		button_18.setBounds(200, 375, 105, 23);
		Usuario_Busqueda.add(button_18);
		
		agregar_usuario_B = new JButton("Agregar Nuevo");
		agregar_usuario_B.setBounds(470, 375, 130, 23);
		agregar_usuario_B.addActionListener(getCn());
		Usuario_Busqueda.add(agregar_usuario_B);
		
		JButton button_20 = new JButton("Borrar");
		button_20.setBounds(339, 375, 86, 23);
		Usuario_Busqueda.add(button_20);
		
		dni_check_Usuario = new JLabel("");
		dni_check_Usuario.setForeground(Color.RED);
		dni_check_Usuario.setBounds(511, 54, 153, 14);
		Usuario_Busqueda.add(dni_check_Usuario);
		
		apellido_check_Usuario = new JLabel("");
		apellido_check_Usuario.setForeground(Color.RED);
		apellido_check_Usuario.setBounds(348, 54, 153, 14);
		Usuario_Busqueda.add(apellido_check_Usuario);
		
		nombre_check_Usuario = new JLabel("");
		nombre_check_Usuario.setForeground(Color.RED);
		nombre_check_Usuario.setBounds(185, 55, 153, 14);
		Usuario_Busqueda.add(nombre_check_Usuario);
		
		usuario_check_Usuario = new JLabel("");
		usuario_check_Usuario.setForeground(Color.RED);
		usuario_check_Usuario.setBounds(22, 54, 153, 14);
		Usuario_Busqueda.add(usuario_check_Usuario);
		
		JButton checkButton = new JButton("");
	    
		checkButton.setBounds(639, 23, 22, 23);
		checkButton.setVisible(false);
		Usuario_Busqueda.add(checkButton);
		
	
		
		Pelicula_Cartelera = new JPanel();
		Pelicula_Cartelera.setBounds(0, 23, 784, 441);
		Contenedor.add(Pelicula_Cartelera);
		Pelicula_Cartelera.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(88, 21, 86, 20);
		Pelicula_Cartelera.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(251, 21, 86, 20);
		Pelicula_Cartelera.add(textField_1);
		
		año_pelicula = new JTextField();
		año_pelicula.setColumns(10);
		año_pelicula.addFocusListener(getCn());
		año_pelicula.setBounds(392, 21, 86, 20);
		Pelicula_Cartelera.add(año_pelicula);
		
		JButton button = new JButton("Buscar");
		button.setBounds(624, 31, 80, 23);
		Pelicula_Cartelera.add(button);
		
		JLabel label = new JLabel("Genero:");
		label.setBounds(184, 24, 57, 14);
		Pelicula_Cartelera.add(label);
		
		JLabel lblAo = new JLabel("A\u00F1o:");
		lblAo.setBounds(347, 24, 35, 14);
		Pelicula_Cartelera.add(lblAo);
		
		JLabel label_3 = new JLabel("Pelicula:");
		label_3.setBounds(21, 24, 57, 14);
		Pelicula_Cartelera.add(label_3);
		
		JScrollPane scrollPane = new JScrollPane((Component) null);
		scrollPane.setBounds(10, 77, 759, 300);
		Pelicula_Cartelera.add(scrollPane);
		
		JButton button_1 = new JButton("Modificar");
		button_1.setBounds(200, 388, 105, 23);
		Pelicula_Cartelera.add(button_1);
		
		JButton button_2 = new JButton("Agregar Nuevo");
		button_2.setBounds(470, 388, 130, 23);
		Pelicula_Cartelera.add(button_2);
		
		JButton button_3 = new JButton("Borrar");
		button_3.setBounds(339, 388, 86, 23);
		Pelicula_Cartelera.add(button_3);
		
		año_pelicula_check = new JLabel("");
		año_pelicula_check.setForeground(Color.RED);
		año_pelicula_check.setBounds(347, 52, 120, 14);
		Pelicula_Cartelera.add(año_pelicula_check);
		
		Usuario_Registro = new JPanel();
		Usuario_Registro.setBounds(0, 23, 784, 441);
		Contenedor.add(Usuario_Registro);
		Usuario_Registro.setVisible(false);
		Usuario_Registro.setLayout(null);
		
		JLabel label_61 = new JLabel("Usuario:");
		label_61.setBounds(173, 88, 123, 14);
		Usuario_Registro.add(label_61);
		
		JLabel label_62 = new JLabel("Apellido:");
		label_62.setBounds(173, 138, 123, 14);
		Usuario_Registro.add(label_62);
		
		JLabel label_63 = new JLabel("Nombre:");
		label_63.setBounds(173, 113, 123, 14);
		Usuario_Registro.add(label_63);
		
		JLabel label_64 = new JLabel("DNI:");
		label_64.setBounds(173, 163, 123, 14);
		Usuario_Registro.add(label_64);
		
		JLabel label_65 = new JLabel("Fecha de Nacimiento:");
		label_65.setBounds(173, 188, 123, 14);
		Usuario_Registro.add(label_65);
		
		JLabel label_66 = new JLabel("Telefono:");
		label_66.setBounds(173, 213, 123, 14);
		Usuario_Registro.add(label_66);
		
		JLabel label_67 = new JLabel("Direccion:");
		label_67.setBounds(173, 238, 123, 14);
		Usuario_Registro.add(label_67);
		
		usuario_Regi = new JTextField();
		usuario_Regi.addFocusListener(getCn());
		usuario_Regi.setColumns(10);
		usuario_Regi.setBounds(306, 85, 289, 20);
		Usuario_Registro.add(usuario_Regi);
		
		nombre_Regi = new JTextField();
		nombre_Regi.addFocusListener(getCn());
		nombre_Regi.setColumns(10);
		nombre_Regi.setBounds(306, 110, 289, 20);
		Usuario_Registro.add(nombre_Regi);
		
		dni_Regi = new JTextField();
		dni_Regi.addFocusListener(getCn());
		dni_Regi.setColumns(10);
		dni_Regi.setBounds(306, 160, 289, 20);
		Usuario_Registro.add(dni_Regi);
		
		apellido_Regi = new JTextField();
		apellido_Regi.addFocusListener(getCn());
		apellido_Regi.setColumns(10);
		apellido_Regi.setBounds(306, 135, 289, 20);
		Usuario_Registro.add(apellido_Regi);
		
		fecha_Nac_Regi = new JTextField();
		fecha_Nac_Regi.setColumns(10);
		fecha_Nac_Regi.setBounds(306, 185, 289, 20);
		Usuario_Registro.add(fecha_Nac_Regi);
		
		direccion_Regi = new JTextField();
		direccion_Regi.setColumns(10);
		direccion_Regi.setBounds(306, 235, 289, 20);
		Usuario_Registro.add(direccion_Regi);
		
		atras_Regi = new JButton("Atras");
		atras_Regi.setBounds(145, 336, 89, 23);
		atras_Regi.addActionListener(getCn());
		Usuario_Registro.add(atras_Regi);
		
		JButton button_16 = new JButton("Guardar");
		button_16.setBounds(534, 336, 89, 23);
		Usuario_Registro.add(button_16);
		
		telefono_Regi = new JTextField();
		telefono_Regi.addFocusListener(getCn());
		telefono_Regi.setColumns(10);
		telefono_Regi.setBounds(306, 210, 289, 20);
		Usuario_Registro.add(telefono_Regi);
		
		contraseña_Regi = new JTextField();
		contraseña_Regi.setColumns(10);
		contraseña_Regi.setBounds(306, 260, 289, 20);
		Usuario_Registro.add(contraseña_Regi);
		
		JLabel label_68 = new JLabel("Contrase\u00F1a:");
		label_68.setBounds(173, 263, 100, 14);
		Usuario_Registro.add(label_68);
		
		Usuario_existe = new JLabel("");
		Usuario_existe.setForeground(Color.RED);
		Usuario_existe.setBounds(605, 88, 150, 14);
		Usuario_Registro.add(Usuario_existe);
		
		numeros_check = new JLabel("");
		numeros_check.setForeground(Color.RED);
		numeros_check.setBounds(605, 113, 150, 14);
		Usuario_Registro.add(numeros_check);
		
		numeros_check_1 = new JLabel("");
		numeros_check_1.setForeground(Color.RED);
		numeros_check_1.setBounds(605, 138, 150, 14);
		Usuario_Registro.add(numeros_check_1);
		
		letras_check = new JLabel("");
		letras_check.setForeground(Color.RED);
		letras_check.setBounds(605, 163, 150, 14);
		Usuario_Registro.add(letras_check);
		
		letras_check_1 = new JLabel("");
		letras_check_1.setForeground(Color.RED);
		letras_check_1.setBounds(605, 213, 150, 14);
		Usuario_Registro.add(letras_check_1);
		
		contraseña_Check = new JLabel("");
		contraseña_Check.setForeground(Color.RED);
		contraseña_Check.setBounds(605, 263, 150, 14);
		Usuario_Registro.add(contraseña_Check);
		
		Entrada = new JPanel();
		Entrada.setLayout(null);
		Entrada.setBounds(0, 23, 784, 441);
		Entrada.setVisible(false);
		Contenedor.add(Entrada);
		
		Socio = new JPanel();
		Socio.setBounds(0, 23, 784, 441);
		Socio.setVisible(false);
		Contenedor.add(Socio);
		Socio.setLayout(null);
		
		Pelicula_Butacas = new JPanel();
		Pelicula_Butacas.setBounds(0, 23, 784, 441);
		Contenedor.add(Pelicula_Butacas);
		Pelicula_Butacas.setVisible(false);
		Pelicula_Butacas.setLayout(null);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setBounds(84, 142, 40, 40);
		Pelicula_Butacas.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setBounds(84, 192, 40, 40);
		Pelicula_Butacas.add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setBounds(84, 242, 40, 40);
		Pelicula_Butacas.add(label_6);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setBounds(84, 292, 40, 40);
		Pelicula_Butacas.add(label_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setBounds(84, 342, 40, 40);
		Pelicula_Butacas.add(label_8);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setBounds(134, 92, 40, 40);
		Pelicula_Butacas.add(label_9);
		
		JLabel label_10 = new JLabel("New label");
		label_10.setBounds(134, 142, 40, 40);
		Pelicula_Butacas.add(label_10);
		
		JLabel label_11 = new JLabel("New label");
		label_11.setBounds(134, 192, 40, 40);
		Pelicula_Butacas.add(label_11);
		
		JLabel label_12 = new JLabel("New label");
		label_12.setBounds(134, 242, 40, 40);
		Pelicula_Butacas.add(label_12);
		
		JLabel label_13 = new JLabel("New label");
		label_13.setBounds(134, 292, 40, 40);
		Pelicula_Butacas.add(label_13);
		
		JLabel label_14 = new JLabel("New label");
		label_14.setBounds(134, 342, 40, 40);
		Pelicula_Butacas.add(label_14);
		
		JLabel label_15 = new JLabel("New label");
		label_15.setBounds(184, 92, 40, 40);
		Pelicula_Butacas.add(label_15);
		
		JLabel label_16 = new JLabel("New label");
		label_16.setBounds(184, 142, 40, 40);
		Pelicula_Butacas.add(label_16);
		
		JLabel label_17 = new JLabel("New label");
		label_17.setBounds(184, 192, 40, 40);
		Pelicula_Butacas.add(label_17);
		
		JLabel label_18 = new JLabel("New label");
		label_18.setBounds(184, 242, 40, 40);
		Pelicula_Butacas.add(label_18);
		
		JLabel label_19 = new JLabel("New label");
		label_19.setBounds(184, 292, 40, 40);
		Pelicula_Butacas.add(label_19);
		
		JLabel label_20 = new JLabel("New label");
		label_20.setBounds(184, 342, 40, 40);
		Pelicula_Butacas.add(label_20);
		
		JLabel label_21 = new JLabel("New label");
		label_21.setBounds(370, 92, 40, 40);
		Pelicula_Butacas.add(label_21);
		
		JLabel label_22 = new JLabel("New label");
		label_22.setBounds(320, 92, 40, 40);
		Pelicula_Butacas.add(label_22);
		
		JLabel label_23 = new JLabel("New label");
		label_23.setBounds(320, 142, 40, 40);
		Pelicula_Butacas.add(label_23);
		
		JLabel label_24 = new JLabel("New label");
		label_24.setBounds(370, 142, 40, 40);
		Pelicula_Butacas.add(label_24);
		
		JLabel label_25 = new JLabel("New label");
		label_25.setBounds(420, 142, 40, 40);
		Pelicula_Butacas.add(label_25);
		
		JLabel label_26 = new JLabel("New label");
		label_26.setBounds(420, 92, 40, 40);
		Pelicula_Butacas.add(label_26);
		
		JLabel label_27 = new JLabel("New label");
		label_27.setBounds(420, 192, 40, 40);
		Pelicula_Butacas.add(label_27);
		
		JLabel label_28 = new JLabel("New label");
		label_28.setBounds(370, 192, 40, 40);
		Pelicula_Butacas.add(label_28);
		
		JLabel label_29 = new JLabel("New label");
		label_29.setBounds(320, 192, 40, 40);
		Pelicula_Butacas.add(label_29);
		
		JLabel label_30 = new JLabel("New label");
		label_30.setBounds(320, 242, 40, 40);
		Pelicula_Butacas.add(label_30);
		
		JLabel label_31 = new JLabel("New label");
		label_31.setBounds(370, 242, 40, 40);
		Pelicula_Butacas.add(label_31);
		
		JLabel label_32 = new JLabel("New label");
		label_32.setBounds(420, 242, 40, 40);
		Pelicula_Butacas.add(label_32);
		
		JLabel label_33 = new JLabel("New label");
		label_33.setBounds(420, 292, 40, 40);
		Pelicula_Butacas.add(label_33);
		
		JLabel label_34 = new JLabel("New label");
		label_34.setBounds(370, 292, 40, 40);
		Pelicula_Butacas.add(label_34);
		
		JLabel label_35 = new JLabel("New label");
		label_35.setBounds(320, 292, 40, 40);
		Pelicula_Butacas.add(label_35);
		
		JLabel label_36 = new JLabel("New label");
		label_36.setBounds(320, 342, 40, 40);
		Pelicula_Butacas.add(label_36);
		
		JLabel label_37 = new JLabel("New label");
		label_37.setBounds(370, 342, 40, 40);
		Pelicula_Butacas.add(label_37);
		
		JLabel label_38 = new JLabel("New label");
		label_38.setBounds(420, 342, 40, 40);
		Pelicula_Butacas.add(label_38);
		
		JLabel label_39 = new JLabel("New label");
		label_39.setBounds(602, 92, 40, 40);
		Pelicula_Butacas.add(label_39);
		
		JLabel label_40 = new JLabel("New label");
		label_40.setBounds(552, 92, 40, 40);
		Pelicula_Butacas.add(label_40);
		
		JLabel label_41 = new JLabel("New label");
		label_41.setBounds(552, 142, 40, 40);
		Pelicula_Butacas.add(label_41);
		
		JLabel label_42 = new JLabel("New label");
		label_42.setBounds(602, 142, 40, 40);
		Pelicula_Butacas.add(label_42);
		
		JLabel label_43 = new JLabel("New label");
		label_43.setBounds(652, 142, 40, 40);
		Pelicula_Butacas.add(label_43);
		
		JLabel label_44 = new JLabel("New label");
		label_44.setDisplayedMnemonic('9');
		label_44.setBounds(652, 92, 40, 40);
		Pelicula_Butacas.add(label_44);
		
		JLabel label_45 = new JLabel("New label");
		label_45.setBounds(652, 192, 40, 40);
		Pelicula_Butacas.add(label_45);
		
		JLabel label_46 = new JLabel("New label");
		label_46.setBounds(602, 192, 40, 40);
		Pelicula_Butacas.add(label_46);
		
		JLabel label_47 = new JLabel("New label");
		label_47.setBounds(552, 192, 40, 40);
		Pelicula_Butacas.add(label_47);
		
		JLabel label_48 = new JLabel("New label");
		label_48.setBounds(552, 242, 40, 40);
		Pelicula_Butacas.add(label_48);
		
		JLabel label_49 = new JLabel("New label");
		label_49.setBounds(602, 242, 40, 40);
		Pelicula_Butacas.add(label_49);
		
		JLabel label_50 = new JLabel("New label");
		label_50.setBounds(652, 242, 40, 40);
		Pelicula_Butacas.add(label_50);
		
		JLabel label_51 = new JLabel("New label");
		label_51.setBounds(652, 292, 40, 40);
		Pelicula_Butacas.add(label_51);
		
		JLabel label_52 = new JLabel("New label");
		label_52.setBounds(602, 292, 40, 40);
		Pelicula_Butacas.add(label_52);
		
		JLabel label_53 = new JLabel("New label");
		label_53.setBounds(552, 292, 40, 40);
		Pelicula_Butacas.add(label_53);
		
		JLabel label_54 = new JLabel("New label");
		label_54.setBounds(552, 342, 40, 40);
		Pelicula_Butacas.add(label_54);
		
		JLabel label_55 = new JLabel("New label");
		label_55.setBounds(602, 342, 40, 40);
		Pelicula_Butacas.add(label_55);
		
		JLabel label_56 = new JLabel("New label");
		label_56.setBounds(652, 342, 40, 40);
		Pelicula_Butacas.add(label_56);
		
		JLabel label_57 = new JLabel("New label");
		label_57.setBounds(84, 92, 40, 40);
		Pelicula_Butacas.add(label_57);
		
		JLabel label_58 = new JLabel("Fila 1");
		label_58.setBounds(134, 53, 46, 14);
		Pelicula_Butacas.add(label_58);
		
		JLabel label_59 = new JLabel("Fila 2");
		label_59.setBounds(370, 53, 46, 14);
		Pelicula_Butacas.add(label_59);
		
		JLabel label_60 = new JLabel("Fila 3");
		label_60.setBounds(602, 53, 46, 14);
		Pelicula_Butacas.add(label_60);
		
		JButton button_4 = new JButton("Atras");
		button_4.setBounds(120, 393, 89, 23);
		Pelicula_Butacas.add(button_4);
		
		JButton button_5 = new JButton("Vender");
		button_5.setBounds(261, 393, 89, 23);
		Pelicula_Butacas.add(button_5);
		
		JButton button_6 = new JButton("Reservar");
		button_6.setBounds(430, 393, 89, 23);
		Pelicula_Butacas.add(button_6);
		
		JButton button_7 = new JButton("Modificar");
		button_7.setBounds(562, 393, 89, 23);
		Pelicula_Butacas.add(button_7);
		
		Informe = new JPanel();
		Informe.setLayout(null);
		Informe.setBounds(0, 23, 784, 441);
		Informe.setVisible(false);
		Contenedor.add(Informe);
		
		Ventas = new JPanel();
		Ventas.setLayout(null);
		Ventas.setBounds(0, 23, 784, 441);
		Ventas.setVisible(false);
		Contenedor.add(Ventas);
		
		Cerrar_Sesion = new JButton("Cerrar sesion");
		Cerrar_Sesion.addActionListener(getCn());
		
		Pelicula_B = new JButton("Pelicula");
		Pelicula_B.setBounds(0, 0, 97, 23);
		Pelicula_B.addActionListener(getCn());
		Contenedor.add(Pelicula_B);
		Cerrar_Sesion.setBounds(663, 0, 121, 23);
		Contenedor.add(Cerrar_Sesion);
		
		Venta_B = new JButton("Ventas");
		Venta_B.setBounds(542, 0, 121, 23);
		Venta_B.addActionListener(getCn());
		Contenedor.add(Venta_B);
		
		Informes_B = new JButton("Informes");
		Informes_B.setBounds(422, 0, 121, 23);
		Informes_B.addActionListener(getCn());
		Contenedor.add(Informes_B);
		
		Socio_B = new JButton("Socio");
		Socio_B.setBounds(309, 0, 114, 23);
		Socio_B.addActionListener(getCn());
		Contenedor.add(Socio_B);
		
		Usuario_B = new JButton("Usuario");
		Usuario_B.setBounds(203, 0, 107, 23);
		Usuario_B.addActionListener(getCn());
		Contenedor.add(Usuario_B);
		
		Precio_Entrada_B = new JButton("Precio Entrada");
		Precio_Entrada_B.setBounds(96, 0, 108, 23);
		Precio_Entrada_B.addActionListener(getCn());
		Contenedor.add(Precio_Entrada_B);
		
		Venta_Usu = new JButton("Venta");
		Venta_Usu.setBounds(0, 0, 310, 23);
		Venta_Usu.setVisible(false);
		Venta_Usu.addActionListener(getCn());
		Contenedor.add(Venta_Usu);
		
		Informe_Usu = new JButton("Informe");
		Informe_Usu.setBounds(309, 0, 355, 23);
		Informe_Usu.setVisible(false);
		Informe_Usu.addActionListener(getCn());
		Contenedor.add(Informe_Usu);
	}

	public ControladorNuevo getCn() {
		return cn;
	}

	public void setCn(ControladorNuevo cn) {
		this.cn = cn;
	}

	public JButton getCerrar_Sesion() {
		return Cerrar_Sesion;
	}

	public void setCerrar_Sesion(JButton cerrar_Sesion) {
		Cerrar_Sesion = cerrar_Sesion;
	}

	

	public JButton getInformes_B() {
		return Informes_B;
	}

	public void setInformes_B(JButton informes_B) {
		Informes_B = informes_B;
	}

	public JButton getSocio_B() {
		return Socio_B;
	}

	public void setSocio_B(JButton socio_B) {
		Socio_B = socio_B;
	}

	public JButton getUsuario_B() {
		return Usuario_B;
	}

	public void setUsuario_B(JButton usuario_B) {
		Usuario_B = usuario_B;
	}

	public JButton getPrecio_Entrada_B() {
		return Precio_Entrada_B;
	}

	public void setPrecio_Entrada_B(JButton precio_Entrada_B) {
		Precio_Entrada_B = precio_Entrada_B;
	}

	public JPanel getUsuario_Registro() {
		return Usuario_Registro;
	}

	public void setUsuario_Registro(JPanel usuario_Registro) {
		Usuario_Registro = usuario_Registro;
	}

	public JPanel getEntrada() {
		return Entrada;
	}

	public void setEntrada(JPanel entrada) {
		Entrada = entrada;
	}

	public JPanel getSocio() {
		return Socio;
	}

	public void setSocio(JPanel socio) {
		Socio = socio;
	}

	public JPanel getUsuario_Busqueda() {
		return Usuario_Busqueda;
	}

	public void setUsuario_Busqueda(JPanel usuario_Busqueda) {
		Usuario_Busqueda = usuario_Busqueda;
	}

	public JPanel getPelicula_Butacas() {
		return Pelicula_Butacas;
	}

	public void setPelicula_Butacas(JPanel pelicula_Butacas) {
		Pelicula_Butacas = pelicula_Butacas;
	}

	public JPanel getPelicula_Cartelera() {
		return Pelicula_Cartelera;
	}

	public void setPelicula_Cartelera(JPanel pelicula_Cartelera) {
		Pelicula_Cartelera = pelicula_Cartelera;
	}

	public JPanel getInforme() {
		return Informe;
	}

	public void setInforme(JPanel informe) {
		Informe = informe;
	}

	public JPanel getVentas() {
		return Ventas;
	}

	public void setVentas(JPanel ventas) {
		Ventas = ventas;
	}

	public JButton getVenta_B() {
		return Venta_B;
	}

	public void setVenta_B(JButton venta_B) {
		Venta_B = venta_B;
	}

	public JButton getVenta_Usu() {
		return Venta_Usu;
	}

	public void setVenta_Usu(JButton venta_Usu) {
		Venta_Usu = venta_Usu;
	}

	public JButton getInforme_Usu() {
		return Informe_Usu;
	}

	public void setInforme_Usu(JButton informe_Usu) {
		Informe_Usu = informe_Usu;
	}

	public JTextField getUsuario_Regi() {
		return usuario_Regi;
	}

	public void setUsuario_Regi(JTextField usuario_Regi) {
		usuario_Regi = usuario_Regi;
	}

	public JTextField getNombre_Regi() {
		return nombre_Regi;
	}

	public void setNombre_Regi(JTextField nombre_Regi) {
		nombre_Regi = nombre_Regi;
	}

	public JTextField getApellido_Regi() {
		return apellido_Regi;
	}

	public void setApellido_Regi(JTextField apellido_Regi) {
		apellido_Regi = apellido_Regi;
	}

	public JTextField getDni_Regi() {
		return dni_Regi;
	}

	public void setDni_Regi(JTextField dni_Regi) {
		dni_Regi = dni_Regi;
	}

	public JTextField getFecha_Nac_Regi() {
		return fecha_Nac_Regi;
	}

	public void setFecha_Nac_Regi(JTextField fecha_Nac_Regi) {
		fecha_Nac_Regi = fecha_Nac_Regi;
	}

	public JTextField getTelefono_Regi() {
		return telefono_Regi;
	}

	public void setTelefono_Regi(JTextField telefono_Regi) {
		telefono_Regi = telefono_Regi;
	}

	public JTextField getDireccion_Regi() {
		return direccion_Regi;
	}

	public void setDireccion_Regi(JTextField direccion_Regi) {
		direccion_Regi = direccion_Regi;
	}

	public JTextField getContraseña_Regi() {
		return contraseña_Regi;
	}

	public void setContraseña_Regi(JTextField contraseña_Regi) {
		contraseña_Regi = contraseña_Regi;
	}

	public JLabel getUsuario_existe() {
		return Usuario_existe;
	}

	public void setUsuario_existe(JLabel usuario_existe) {
		Usuario_existe = usuario_existe;
	}

	public JLabel getNumeros_check() {
		return numeros_check;
	}

	public void setNumeros_check(JLabel numeros_check) {
		this.numeros_check = numeros_check;
	}

	public JLabel getNumeros_check_1() {
		return numeros_check_1;
	}

	public void setNumeros_check_1(JLabel numeros_check_1) {
		this.numeros_check_1 = numeros_check_1;
	}

	public JLabel getLetras_check() {
		return letras_check;
	}

	public void setLetras_check(JLabel letras_check) {
		this.letras_check = letras_check;
	}

	public JLabel getLetras_check_1() {
		return letras_check_1;
	}

	public void setLetras_check_1(JLabel letras_check_1) {
		this.letras_check_1 = letras_check_1;
	}

	public JButton getAgregar_usuario_B() {
		return agregar_usuario_B;
	}

	public void setAgregar_usuario_B(JButton agregar_usuario_B) {
		this.agregar_usuario_B = agregar_usuario_B;
	}

	public JLabel getContraseña_Check() {
		return contraseña_Check;
	}

	public void setContraseña_Check(JLabel contraseña_Check) {
		this.contraseña_Check = contraseña_Check;
	}

	public JButton getAtras_Regi() {
		return atras_Regi;
	}

	public void setAtras_Regi(JButton atras_Regi) {
		this.atras_Regi = atras_Regi;
	}

	public JButton getPelicula_B() {
		return Pelicula_B;
	}

	public void setPelicula_B(JButton pelicula_B) {
		Pelicula_B = pelicula_B;
	}

	public JLabel getAño_pelicula_check() {
		return año_pelicula_check;
	}

	public void setAño_pelicula_check(JLabel año_pelicula_check) {
		this.año_pelicula_check = año_pelicula_check;
	}

	public JTextField getAño_pelicula() {
		return año_pelicula;
	}

	public void setAño_pelicula(JTextField año_pelicula) {
		this.año_pelicula = año_pelicula;
	}

	public JTextField getUsuario_TextField_UsuarioBusqueda() {
		return usuario_TextField_UsuarioBusqueda;
	}

	public void setUsuario_TextField_UsuarioBusqueda(JTextField usuario_TextField_UsuarioBusqueda) {
		this.usuario_TextField_UsuarioBusqueda = usuario_TextField_UsuarioBusqueda;
	}

	public JTextField getNombre_TextField_UsuarioBusqueda() {
		return nombre_TextField_UsuarioBusqueda;
	}

	public void setNombre_TextField_UsuarioBusqueda(JTextField nombre_TextField_UsuarioBusqueda) {
		this.nombre_TextField_UsuarioBusqueda = nombre_TextField_UsuarioBusqueda;
	}

	public JTextField getApellido_TextField_UsuarioBusqueda() {
		return apellido_TextField_UsuarioBusqueda;
	}

	public void setApellido_TextField_UsuarioBusqueda(JTextField apellido_TextField_UsuarioBusqueda) {
		this.apellido_TextField_UsuarioBusqueda = apellido_TextField_UsuarioBusqueda;
	}

	public JTextField getDni_TextField_UsuarioBusqueda() {
		return dni_TextField_UsuarioBusqueda;
	}

	public void setDni_TextField_UsuarioBusqueda(JTextField dni_TextField_UsuarioBusqueda) {
		this.dni_TextField_UsuarioBusqueda = dni_TextField_UsuarioBusqueda;
	}

	public JLabel getDni_check_Usuario() {
		return dni_check_Usuario;
	}

	public void setDni_check_Usuario(JLabel dni_check_Usuario) {
		this.dni_check_Usuario = dni_check_Usuario;
	}

	public JLabel getApellido_check_Usuario() {
		return apellido_check_Usuario;
	}

	public void setApellido_check_Usuario(JLabel apellido_check_Usuario) {
		this.apellido_check_Usuario = apellido_check_Usuario;
	}

	public JLabel getNombre_check_Usuario() {
		return nombre_check_Usuario;
	}

	public void setNombre_check_Usuario(JLabel nombre_check_Usuario) {
		this.nombre_check_Usuario = nombre_check_Usuario;
	}

	public JLabel getUsuario_check_Usuario() {
		return usuario_check_Usuario;
	}

	public void setUsuario_check_Usuario(JLabel usuario_check_Usuario) {
		this.usuario_check_Usuario = usuario_check_Usuario;
	}

	public JButton getBuscar_Usuario() {
		return buscar_Usuario;
	}

	public void setBuscar_Usuario(JButton buscar_Usuario) {
		this.buscar_Usuario = buscar_Usuario;
	}
}
