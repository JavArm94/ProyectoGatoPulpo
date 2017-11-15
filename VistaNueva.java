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

public class VistaNueva extends JFrame {
	private static final long serialVersionUID = 1L;
	private ControladorNuevo cn;
	private JPanel Contenedor;
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
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
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
		
		Usuario_Registro = new JPanel();
		Usuario_Registro.setBounds(0, 23, 784, 441);
		Contenedor.add(Usuario_Registro);
		Usuario_Registro.setVisible(false);
		Usuario_Registro.setLayout(null);
		
		JLabel label_61 = new JLabel("Usuario:");
		label_61.setBounds(194, 87, 123, 14);
		Usuario_Registro.add(label_61);
		
		JLabel label_62 = new JLabel("Apellido:");
		label_62.setBounds(194, 112, 123, 14);
		Usuario_Registro.add(label_62);
		
		JLabel label_63 = new JLabel("Nombre:");
		label_63.setBounds(194, 137, 123, 14);
		Usuario_Registro.add(label_63);
		
		JLabel label_64 = new JLabel("DNI:");
		label_64.setBounds(194, 162, 123, 14);
		Usuario_Registro.add(label_64);
		
		JLabel label_65 = new JLabel("Fecha de Nacimiento:");
		label_65.setBounds(194, 187, 123, 14);
		Usuario_Registro.add(label_65);
		
		JLabel label_66 = new JLabel("Telefono:");
		label_66.setBounds(194, 212, 123, 14);
		Usuario_Registro.add(label_66);
		
		JLabel label_67 = new JLabel("Direccion:");
		label_67.setBounds(194, 237, 123, 14);
		Usuario_Registro.add(label_67);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(327, 84, 289, 20);
		Usuario_Registro.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(327, 109, 289, 20);
		Usuario_Registro.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(327, 159, 289, 20);
		Usuario_Registro.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(327, 134, 289, 20);
		Usuario_Registro.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(327, 184, 289, 20);
		Usuario_Registro.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(327, 234, 289, 20);
		Usuario_Registro.add(textField_9);
		
		JButton button_15 = new JButton("Atras");
		button_15.setBounds(145, 336, 89, 23);
		Usuario_Registro.add(button_15);
		
		JButton button_16 = new JButton("Guardar");
		button_16.setBounds(534, 336, 89, 23);
		Usuario_Registro.add(button_16);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(327, 209, 289, 20);
		Usuario_Registro.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(327, 259, 289, 20);
		Usuario_Registro.add(textField_11);
		
		JLabel label_68 = new JLabel("Contrase\u00F1a:");
		label_68.setBounds(194, 262, 100, 14);
		Usuario_Registro.add(label_68);
		
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
		
		Usuario_Busqueda = new JPanel();
		Usuario_Busqueda.setLayout(null);
		Usuario_Busqueda.setBounds(0, 23, 784, 441);
		Usuario_Busqueda.setVisible(false);
		Contenedor.add(Usuario_Busqueda);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(89, 24, 86, 20);
		Usuario_Busqueda.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(252, 24, 86, 20);
		Usuario_Busqueda.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(415, 24, 86, 20);
		Usuario_Busqueda.add(textField_14);
		
		JButton button_17 = new JButton("Buscar");
		button_17.setBounds(679, 23, 80, 23);
		Usuario_Busqueda.add(button_17);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(543, 24, 86, 20);
		Usuario_Busqueda.add(textField_15);
		
		JLabel label_69 = new JLabel("Apellido:");
		label_69.setBounds(185, 27, 57, 14);
		Usuario_Busqueda.add(label_69);
		
		JLabel label_70 = new JLabel("Nombre:");
		label_70.setBounds(348, 27, 57, 14);
		Usuario_Busqueda.add(label_70);
		
		JLabel label_71 = new JLabel("DNI:");
		label_71.setBounds(511, 27, 22, 14);
		Usuario_Busqueda.add(label_71);
		
		JLabel label_72 = new JLabel("Usuario:");
		label_72.setBounds(22, 27, 57, 14);
		Usuario_Busqueda.add(label_72);
		
		JScrollPane scrollPane_1 = new JScrollPane((Component) null);
		scrollPane_1.setBounds(10, 64, 759, 300);
		Usuario_Busqueda.add(scrollPane_1);
		
		JButton button_18 = new JButton("Modificar");
		button_18.setBounds(200, 375, 105, 23);
		Usuario_Busqueda.add(button_18);
		
		JButton button_19 = new JButton("Agregar Nuevo");
		button_19.setBounds(470, 375, 130, 23);
		Usuario_Busqueda.add(button_19);
		
		JButton button_20 = new JButton("Borrar");
		button_20.setBounds(339, 375, 86, 23);
		Usuario_Busqueda.add(button_20);
		
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
		
		Pelicula_Cartelera = new JPanel();
		Pelicula_Cartelera.setBounds(0, 23, 784, 441);
		Contenedor.add(Pelicula_Cartelera);
		Pelicula_Cartelera.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(89, 37, 86, 20);
		Pelicula_Cartelera.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(252, 37, 86, 20);
		Pelicula_Cartelera.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(415, 37, 86, 20);
		Pelicula_Cartelera.add(textField_2);
		
		JButton button = new JButton("Buscar");
		button.setBounds(679, 36, 80, 23);
		Pelicula_Cartelera.add(button);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(543, 37, 86, 20);
		Pelicula_Cartelera.add(textField_3);
		
		JLabel label = new JLabel("Genero:");
		label.setBounds(185, 40, 57, 14);
		Pelicula_Cartelera.add(label);
		
		JLabel label_1 = new JLabel("Nombre:");
		label_1.setBounds(348, 40, 57, 14);
		Pelicula_Cartelera.add(label_1);
		
		JLabel label_2 = new JLabel("DNI:");
		label_2.setBounds(511, 40, 22, 14);
		Pelicula_Cartelera.add(label_2);
		
		JLabel label_3 = new JLabel("Pelicula:");
		label_3.setBounds(22, 40, 57, 14);
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
		Cerrar_Sesion.setBounds(663, 0, 121, 23);
		Contenedor.add(Cerrar_Sesion);
		
		Venta_B = new JButton("Ventas");
		Venta_B.setBounds(531, 0, 133, 23);
		Venta_B.addActionListener(getCn());
		Contenedor.add(Venta_B);
		
		Informes_B = new JButton("Informes");
		Informes_B.setBounds(397, 0, 133, 23);
		Informes_B.addActionListener(getCn());
		Contenedor.add(Informes_B);
		
		Socio_B = new JButton("Socio");
		Socio_B.setBounds(264, 0, 133, 23);
		Socio_B.addActionListener(getCn());
		Contenedor.add(Socio_B);
		
		Usuario_B = new JButton("Usuario");
		Usuario_B.setBounds(132, 0, 133, 23);
		Usuario_B.addActionListener(getCn());
		Contenedor.add(Usuario_B);
		
		Precio_Entrada_B = new JButton("Precio Entrada");
		Precio_Entrada_B.setBounds(0, 0, 133, 23);
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
}
