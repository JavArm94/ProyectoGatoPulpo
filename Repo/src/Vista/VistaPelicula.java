package Vista;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


import Controlador.ControladorPelicula;

public class VistaPelicula extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel Pelicula;
	private ImageIcon butaca_disponible = new ImageIcon(
			VistaPelicula.class.getResource("/Vista/butaca-disponible.png"));
	private ImageIcon butaca_ocupada = new ImageIcon(VistaPelicula.class.getResource("/Vista/butaca-ocupada.png"));
	private ImageIcon butaca_disponible_select = new ImageIcon(
			VistaPelicula.class.getResource("/Vista/butaca-disponible-select.png"));
	private ImageIcon butaca_ocupada_select = new ImageIcon(
			VistaPelicula.class.getResource("/Vista/butaca-ocupada-select.png"));
	private ImageIcon imgCancelar = new ImageIcon(VistaPelicula.class.getResource("/Vista/icons8-delete.png"));
	private ImageIcon imgModificar = new ImageIcon(VistaPelicula.class.getResource("/Vista/icon-modif.png"));
	private ImageIcon imgRegresar = new ImageIcon(VistaPelicula.class.getResource("/Vista/icon-back.png"));
	private ImageIcon imgAceptar = new ImageIcon(VistaPelicula.class.getResource("/Vista/icon-okay.png"));

	/*
	 * try { Image imgCancelar=
	 * ImageIO.read(getClass().getResource("/Vista/icon-back.png")); } catch
	 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace();
	 * }
	 * 
	 * try { Image imgModificar =
	 * ImageIO.read(getClass().getResource("resources/icon-okay.png")); } catch
	 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace();
	 * } try { Image imgRegresar =
	 * ImageIO.read(getClass().getResource("resources/icons8-delete.png")); }
	 * catch (IOException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } try { Image imgAceptar =
	 * ImageIO.read(getClass().getResource("/Vista/icon-modif.png"));
	 * btnNewButton_1.setIcon(new ImageIcon(imgAceptar)); } catch (IOException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 **/

	private JPanel Cartelera_Usuario;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private ControladorPelicula controlador;
	private JTextField textField_18;
	private JTextField textField_17;
	private JTextField textField_19;
	private JButton button_8;
	private JTextField textField_20;
	private JLabel lblGenero;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel lblPelicula;
	private JScrollPane scrollPane_1;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_34;
	private JLabel label_35;
	private JLabel label_36;
	private JLabel label_37;
	private JLabel label_38;
	private JLabel label_39;
	private JLabel label_40;
	private JLabel label_41;
	private JLabel label_42;
	private JLabel label_43;
	private JLabel label_44;
	private JLabel label_45;
	private JLabel label_46;
	private JLabel label_47;
	private JLabel label_48;
	private JLabel label_49;
	private JLabel label_50;
	private JLabel label_51;
	private JLabel label_52;
	private JLabel label_53;
	private JLabel label_54;
	private JLabel label_55;
	private JLabel label_56;
	private JLabel label_57;
	private JLabel label_58;
	private JLabel label_59;
	private JLabel label_60;
	private JLabel label_61;
	private JLabel label_62;
	private JLabel label_63;
	private JLabel label_64;
	private JLabel label_65;
	private JLabel label_66;
	private JLabel label_67;
	private JLabel label_68;
	private JLabel label_69;
	private JLabel label_70;
	private JLabel label_71;
	private JLabel label_72;
	private JLabel label_73;
	private JLabel label_74;
	private JLabel label_75;
	private JLabel label_76;
	private JLabel label_77;
	private JLabel label_78;
	private JLabel label_79;
	private JLabel label_80;
	private JLabel label_81;
	private JLabel label_82;
	private JLabel label_83;
	private JLabel lblFila;
	private JLabel label_84;
	private JLabel label_85;
	private JButton btnNewButton;
	private JButton btnVender;
	private JButton btnReservar;
	private JButton btnModificar;
	private JLabel lbl_Img_Pelicula;
	private JLabel lbl_Titulo_Pelicula;
	private JLabel lblNewLabel;
	private JButton btnNewButton_1;
	private JButton button;
	private JButton button_1;
	private JLabel lblGneros;
	private JLabel lbl_Descrip_Pelicula;
	private JLabel lblOrigen;
	private JLabel lblReparto;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_2;
	private JPanel Horarios_UsuarioAdministrador;
	private JPanel Butacas_Usuario;
	private JPanel Cartelera_Visualizacion;
	private JLabel TituloPeliculaHorarios;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_1;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel lblLunes;
	private JLabel lblMartes;
	private JLabel lblMiercoles;
	private JLabel label_30;
	private JLabel label_31;
	private JLabel label_32;
	private JLabel label_33;
	private JLabel lbld;

	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try {
	 * 
	 * 
	 * UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
	 * 
	 * VistaPrincipalFinal frame = new VistaPrincipalFinal();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } }
	 * }); }
	 */

	public VistaPelicula(ControladorPelicula controladorPelicula) {

		// this generates an image file

		this.setControlador(controladorPelicula);
		setMinimumSize(new Dimension(800, 480));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Pelicula = new JPanel();
		Pelicula.setToolTipText("Socio");
		Pelicula.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Pelicula);
		Pelicula.setLayout(null);
		ImageIcon img = new ImageIcon("/Vista/GatoPulpo.png");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaPelicula.class.getResource("/Vista/GatoPulpo.jpg")));

		// ImageIcon butaca_disponible = new
		// ImageIcon(butacasVista.class.getResource("/Vista/butaca-disponible.png"));

		Icon butaca_disponible_img = new ImageIcon(
				butaca_disponible.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		Icon butaca_ocupada_img = new ImageIcon(
				butaca_ocupada.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		Icon butaca_disponible_select_img = new ImageIcon(
				butaca_disponible_select.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		Icon butaca_ocupada_select_img = new ImageIcon(
				butaca_ocupada_select.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));

		Object[][] data = {};

		String[] columnNames = { "Id", "Nombre", "Nombre Original", "Fecha Ini", "Fecha Fin", "Genero", "Duración",
				"Puntaje" };

		Butacas_Usuario = new JPanel();
		Butacas_Usuario.setBounds(0, 0, 779, 441);
		Pelicula.add(Butacas_Usuario);
		Butacas_Usuario.addMouseListener(getControladorPelicula());
		Butacas_Usuario.setLayout(null);
		Butacas_Usuario.setVisible(true);
		// ImageIcon butaca_reservada = new
		// ImageIcon(butacasVista.class.getResource("/Vista/butaca-reservada.png"));
		// Icon butaca_reservada_img = new
		// ImageIcon(butaca_disponible.getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(),Image.SCALE_DEFAULT));
		// ImageIcon butaca_ocupada = new
		// ImageIcon(butacasVista.class.getResource("/Vista/butaca-ocupada.png"));
		// Icon butaca_ocupada_img = new
		// ImageIcon(butaca_disponible.getImage().getScaledInstance(lblNewLabel.getWidth(),lblNewLabel.getHeight(),Image.SCALE_DEFAULT));

		// COMIENZO BUTACAS LABELS (21*3)

		label_20 = new JLabel("New label");
		label_20.setBounds(82, 113, 40, 40);
		label_20.setIcon(butaca_disponible_img);
		label_20.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_20);

		label_21 = new JLabel("New label");
		label_21.setBounds(82, 163, 40, 40);
		label_21.setIcon(butaca_disponible_img);
		label_21.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_21);

		label_28 = new JLabel("New label");
		label_28.setIcon(butaca_disponible_img);
		label_28.setBounds(82, 213, 40, 40);
		label_28.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_28);

		label_29 = new JLabel("New label");
		label_29.setIcon(butaca_disponible_img);
		label_29.setBounds(82, 263, 40, 40);
		label_29.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_29);

		label_34 = new JLabel("New label");
		label_34.setIcon(butaca_disponible_img);
		label_34.setBounds(82, 313, 40, 40);
		label_34.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_34);

		label_35 = new JLabel("New label");
		label_35.setIcon(butaca_disponible_img);
		label_35.setBounds(132, 63, 40, 40);
		label_35.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_35);

		label_36 = new JLabel("New label");
		label_36.setIcon(butaca_disponible_img);
		label_36.addMouseListener(getControladorPelicula());
		label_36.setBounds(132, 113, 40, 40);
		Butacas_Usuario.add(label_36);

		label_37 = new JLabel("New label");
		label_37.setIcon(butaca_disponible_img);
		label_37.setBounds(132, 163, 40, 40);
		label_37.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_37);

		label_38 = new JLabel("New label");
		label_38.setIcon(butaca_disponible_img);
		label_38.setBounds(132, 213, 40, 40);
		label_38.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_38);

		label_39 = new JLabel("New label");
		label_39.setIcon(butaca_disponible_img);
		label_39.setBounds(132, 263, 40, 40);
		label_39.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_39);

		label_40 = new JLabel("New label");
		label_40.setIcon(butaca_disponible_img);
		label_40.setBounds(132, 313, 40, 40);
		label_40.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_40);

		label_41 = new JLabel("New label");
		label_41.setIcon(butaca_disponible_img);
		label_41.setBounds(182, 63, 40, 40);
		label_41.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_41);

		label_42 = new JLabel("New label");
		label_42.setIcon(butaca_disponible_img);
		label_42.setBounds(182, 113, 40, 40);
		label_42.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_42);

		label_43 = new JLabel("New label");
		label_43.setIcon(butaca_disponible_img);
		label_43.setBounds(182, 163, 40, 40);
		label_43.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_43);

		label_44 = new JLabel("New label");
		label_44.setIcon(butaca_disponible_img);
		label_44.setBounds(182, 213, 40, 40);
		label_44.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_44);

		label_45 = new JLabel("New label");
		label_45.setIcon(butaca_disponible_img);
		label_45.setBounds(182, 263, 40, 40);
		label_45.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_45);

		label_46 = new JLabel("New label");
		label_46.setIcon(butaca_disponible_img);
		label_46.setBounds(182, 313, 40, 40);
		label_46.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_46);

		label_47 = new JLabel("New label");
		label_47.setIcon(butaca_disponible_img);
		label_47.setBounds(368, 63, 40, 40);
		label_47.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_47);

		label_48 = new JLabel("New label");
		label_48.setIcon(butaca_disponible_img);
		label_48.setBounds(318, 63, 40, 40);
		label_48.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_48);

		label_49 = new JLabel("New label");
		label_49.setIcon(butaca_disponible_img);
		label_49.setBounds(318, 113, 40, 40);
		label_49.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_49);

		label_50 = new JLabel("New label");
		label_50.setIcon(butaca_disponible_img);
		label_50.setBounds(368, 113, 40, 40);
		label_50.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_50);

		label_51 = new JLabel("New label");
		label_51.setIcon(butaca_disponible_img);
		label_51.setBounds(418, 113, 40, 40);
		label_51.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_51);

		label_52 = new JLabel("New label");
		label_52.setIcon(butaca_disponible_img);
		label_52.setBounds(418, 63, 40, 40);
		label_52.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_52);

		label_53 = new JLabel("New label");
		label_53.setIcon(butaca_disponible_img);
		label_53.setBounds(418, 163, 40, 40);
		label_53.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_53);

		label_54 = new JLabel("New label");
		label_54.setIcon(butaca_disponible_img);
		label_54.setBounds(368, 163, 40, 40);
		label_54.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_54);

		label_55 = new JLabel("New label");
		label_55.setIcon(butaca_disponible_img);
		label_55.setBounds(318, 163, 40, 40);
		label_55.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_55);

		label_56 = new JLabel("New label");
		label_56.setIcon(butaca_disponible_img);
		label_56.setBounds(318, 213, 40, 40);
		label_56.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_56);

		label_57 = new JLabel("New label");
		label_57.setIcon(butaca_disponible_img);
		label_57.setBounds(368, 213, 40, 40);
		label_57.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_57);

		label_58 = new JLabel("New label");
		label_58.setIcon(butaca_disponible_img);
		label_58.setBounds(418, 213, 40, 40);
		label_58.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_58);

		label_59 = new JLabel("New label");
		label_59.setIcon(butaca_disponible_img);
		label_59.setBounds(418, 263, 40, 40);
		label_59.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_59);

		label_60 = new JLabel("New label");
		label_60.setIcon(butaca_disponible_img);
		label_60.setBounds(368, 263, 40, 40);
		label_60.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_60);

		label_61 = new JLabel("New label");
		label_61.setBounds(318, 263, 40, 40);
		label_61.setIcon(butaca_disponible_img);
		label_61.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_61);

		label_62 = new JLabel("New label");
		label_62.setBounds(318, 313, 40, 40);
		label_62.setIcon(butaca_disponible_img);
		label_62.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_62);

		label_63 = new JLabel("New label");
		label_63.setBounds(368, 313, 40, 40);
		label_63.setIcon(butaca_disponible_img);
		label_63.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_63);

		label_64 = new JLabel("New label");
		label_64.setIcon(butaca_disponible_img);
		label_64.setBounds(418, 313, 40, 40);
		label_64.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_64);

		label_65 = new JLabel("New label");
		label_65.setIcon(butaca_disponible_img);
		label_65.setBounds(600, 63, 40, 40);
		label_65.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_65);

		label_66 = new JLabel("New label");
		label_66.setIcon(butaca_disponible_img);
		label_66.setBounds(550, 63, 40, 40);
		label_66.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_66);

		label_67 = new JLabel("New label");
		label_67.setIcon(butaca_disponible_img);
		label_67.setBounds(550, 113, 40, 40);
		label_67.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_67);

		label_68 = new JLabel("New label");
		label_68.setIcon(butaca_disponible_img);
		label_68.setBounds(600, 113, 40, 40);
		label_68.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_68);

		label_69 = new JLabel("New label");
		label_69.setIcon(butaca_disponible_img);
		label_69.setBounds(650, 113, 40, 40);
		label_69.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_69);

		label_70 = new JLabel("New label");
		label_70.setDisplayedMnemonic('9');
		label_70.setIcon(butaca_disponible_img);
		label_70.setBounds(650, 63, 40, 40);
		label_70.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_70);

		label_71 = new JLabel("New label");
		label_71.setIcon(butaca_disponible_img);
		label_71.setBounds(650, 163, 40, 40);
		label_71.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_71);

		label_72 = new JLabel("New label");
		label_72.setIcon(butaca_disponible_img);
		label_72.setBounds(600, 163, 40, 40);
		label_72.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_72);

		label_73 = new JLabel("New label");
		label_73.setIcon(butaca_disponible_img);
		label_73.setBounds(550, 163, 40, 40);
		label_73.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_73);

		label_74 = new JLabel("New label");
		label_74.setIcon(butaca_disponible_img);
		label_74.setBounds(550, 213, 40, 40);
		label_74.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_74);

		label_75 = new JLabel("New label");
		label_75.setIcon(butaca_disponible_img);
		label_75.setBounds(600, 213, 40, 40);
		label_75.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_75);

		label_76 = new JLabel("New label");
		label_76.setIcon(butaca_disponible_img);
		label_76.setBounds(650, 213, 40, 40);
		label_76.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_76);

		label_77 = new JLabel("New label");
		label_77.setIcon(butaca_disponible_img);
		label_77.setBounds(650, 263, 40, 40);
		label_77.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_77);

		label_78 = new JLabel("New label");
		label_78.setIcon(butaca_disponible_img);
		label_78.setBounds(600, 263, 40, 40);
		label_78.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_78);

		label_79 = new JLabel("New label");
		label_79.setIcon(butaca_disponible_img);
		label_79.setBounds(550, 263, 40, 40);
		label_79.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_79);

		label_80 = new JLabel("New label");
		label_80.setIcon(butaca_disponible_img);
		label_80.setBounds(550, 313, 40, 40);
		label_80.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_80);

		label_81 = new JLabel("New label");
		label_81.setIcon(butaca_disponible_img);
		label_81.setBounds(600, 313, 40, 40);
		label_81.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_81);

		label_82 = new JLabel("New label");
		label_82.setIcon(butaca_disponible_img);
		label_82.setBounds(650, 313, 40, 40);
		label_82.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_82);

		label_83 = new JLabel("New label");
		label_83.addMouseListener(getControladorPelicula());
		// */
		label_83.setIcon(butaca_disponible_img);
		label_83.setBounds(82, 63, 40, 40);
		Butacas_Usuario.add(label_83);
		lblFila = new JLabel("Fila 1");
		lblFila.setBounds(132, 24, 46, 14);
		Butacas_Usuario.add(lblFila);

		label_84 = new JLabel("Fila 2");
		label_84.setBounds(368, 24, 46, 14);
		label_84.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_84);

		label_85 = new JLabel("Fila 3");
		label_85.setBounds(600, 24, 46, 14);
		label_85.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(label_85);

		btnNewButton = new JButton("Atras");
		btnNewButton.setBounds(118, 364, 89, 23);
		btnNewButton.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(btnNewButton);

		btnVender = new JButton("Vender");
		btnVender.setBounds(259, 364, 89, 23);
		btnVender.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(btnVender);

		btnReservar = new JButton("Reservar");
		btnReservar.setBounds(428, 364, 89, 23);
		btnReservar.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(btnReservar);

		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(560, 364, 89, 23);
		btnModificar.addMouseListener(getControladorPelicula());
		Butacas_Usuario.add(btnModificar);

		Cartelera_Visualizacion = new JPanel();
		Cartelera_Visualizacion.setBounds(0, 0, 779, 441);
		Pelicula.add(Cartelera_Visualizacion);
		Cartelera_Visualizacion.setLayout(null);
		Cartelera_Visualizacion.setVisible(false);

		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(89, 29, 86, 20);
		textField_17.addMouseListener(getControladorPelicula());
		Cartelera_Visualizacion.add(textField_17);

		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(252, 29, 86, 20);
		textField_18.addMouseListener(getControladorPelicula());
		Cartelera_Visualizacion.add(textField_18);

		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(415, 29, 86, 20);
		textField_19.addMouseListener(getControladorPelicula());
		Cartelera_Visualizacion.add(textField_19);

		button_8 = new JButton("Buscar");
		button_8.setBounds(679, 28, 80, 23);
		button_8.addMouseListener(getControladorPelicula());
		Cartelera_Visualizacion.add(button_8);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(543, 29, 86, 20);
		textField_20.addMouseListener(getControladorPelicula());
		Cartelera_Visualizacion.add(textField_20);

		lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(185, 32, 57, 14);
		lblGenero.addMouseListener(getControladorPelicula());
		Cartelera_Visualizacion.add(lblGenero);
		lblGenero.addMouseListener(getControladorPelicula());

		label_18 = new JLabel("Nombre:");
		label_18.addMouseListener(getControladorPelicula());
		label_18.setBounds(348, 32, 57, 14);
		Cartelera_Visualizacion.add(label_18);

		label_19 = new JLabel("DNI:");
		label_19.addMouseListener(getControladorPelicula());
		label_19.setBounds(511, 32, 22, 14);
		Cartelera_Visualizacion.add(label_19);

		lblPelicula = new JLabel("Pelicula:");
		lblPelicula.addMouseListener(getControladorPelicula());
		lblPelicula.setBounds(22, 32, 57, 14);
		Cartelera_Visualizacion.add(lblPelicula);

		JTable table = new JTable(data, columnNames);
		scrollPane_1 = new JScrollPane(table);
		scrollPane_1.setBounds(10, 69, 759, 300);
		scrollPane_1.addMouseListener(getControladorPelicula());
		Cartelera_Visualizacion.add(scrollPane_1);

		button_9 = new JButton("Modificar");
		button_9.setBounds(200, 380, 105, 23);
		button_9.addMouseListener(getControladorPelicula());
		Cartelera_Visualizacion.add(button_9);

		button_10 = new JButton("Agregar Nuevo");
		button_10.setBounds(470, 380, 130, 23);
		button_10.addMouseListener(getControladorPelicula());
		Cartelera_Visualizacion.add(button_10);

		button_11 = new JButton("Borrar");
		button_11.setBounds(339, 380, 86, 23);
		button_11.addMouseListener(getControladorPelicula());
		Cartelera_Visualizacion.add(button_11);

	}

	public ImageIcon getButaca_disponible() {
		return butaca_disponible;
	}

	public void setButaca_disponible(ImageIcon butaca_disponible) {
		this.butaca_disponible = butaca_disponible;
	}

	public ImageIcon getButaca_ocupada() {
		return butaca_ocupada;
	}

	public void setButaca_ocupada(ImageIcon butaca_ocupada) {
		this.butaca_ocupada = butaca_ocupada;
	}

	public ControladorPelicula getControladorPelicula() {
		return controlador;
	}

	public void setControlador(ControladorPelicula controladorPelicula) {
		this.controlador = controladorPelicula;
	}

	public ImageIcon getButaca_disponible_select() {
		return butaca_disponible_select;
	}

	public void setButaca_disponible_select(ImageIcon butaca_disponible_select) {
		this.butaca_disponible_select = butaca_disponible_select;
	}

	public ImageIcon getButaca_ocupada_select() {
		return butaca_ocupada_select;
	}

	public void setButaca_ocupada_select(ImageIcon butaca_ocupada_select) {
		this.butaca_ocupada_select = butaca_ocupada_select;
	}

	public ImageIcon getImgCancelar() {
		return imgCancelar;
	}

	public void setImgCancelar(ImageIcon imgCancelar) {
		this.imgCancelar = imgCancelar;
	}

	public ImageIcon getImgModificar() {
		return imgModificar;
	}

	public void setImgModificar(ImageIcon imgModificar) {
		this.imgModificar = imgModificar;
	}

	public ImageIcon getImgRegresar() {
		return imgRegresar;
	}

	public void setImgRegresar(ImageIcon imgRegresar) {
		this.imgRegresar = imgRegresar;
	}

	public ImageIcon getImgAceptar() {
		return imgAceptar;
	}

	public void setImgAceptar(ImageIcon imgAceptar) {
		this.imgAceptar = imgAceptar;
	}

	public JPanel getCartelera_Usuario() {
		return Cartelera_Usuario;
	}

	public void setCartelera_Usuario(JPanel cartelera_Usuario) {
		Cartelera_Usuario = cartelera_Usuario;
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

	public JTextField getTextField_18() {
		return textField_18;
	}

	public void setTextField_18(JTextField textField_18) {
		this.textField_18 = textField_18;
	}

	public JTextField getTextField_17() {
		return textField_17;
	}

	public void setTextField_17(JTextField textField_17) {
		this.textField_17 = textField_17;
	}

	public JTextField getTextField_19() {
		return textField_19;
	}

	public void setTextField_19(JTextField textField_19) {
		this.textField_19 = textField_19;
	}

	public JButton getButton_8() {
		return button_8;
	}

	public void setButton_8(JButton button_8) {
		this.button_8 = button_8;
	}

	public JTextField getTextField_20() {
		return textField_20;
	}

	public void setTextField_20(JTextField textField_20) {
		this.textField_20 = textField_20;
	}

	public JLabel getLblGenero() {
		return lblGenero;
	}

	public void setLblGenero(JLabel lblGenero) {
		this.lblGenero = lblGenero;
	}

	public JLabel getLabel_18() {
		return label_18;
	}

	public void setLabel_18(JLabel label_18) {
		this.label_18 = label_18;
	}

	public JLabel getLabel_19() {
		return label_19;
	}

	public void setLabel_19(JLabel label_19) {
		this.label_19 = label_19;
	}

	public JLabel getLblPelicula() {
		return lblPelicula;
	}

	public void setLblPelicula(JLabel lblPelicula) {
		this.lblPelicula = lblPelicula;
	}

	public JScrollPane getScrollPane_1() {
		return scrollPane_1;
	}

	public void setScrollPane_1(JScrollPane scrollPane_1) {
		this.scrollPane_1 = scrollPane_1;
	}

	public JButton getButton_9() {
		return button_9;
	}

	public void setButton_9(JButton button_9) {
		this.button_9 = button_9;
	}

	public JButton getButton_10() {
		return button_10;
	}

	public void setButton_10(JButton button_10) {
		this.button_10 = button_10;
	}

	public JButton getButton_11() {
		return button_11;
	}

	public void setButton_11(JButton button_11) {
		this.button_11 = button_11;
	}

	public JLabel getLabel_20() {
		return label_20;
	}

	public void setLabel_20(JLabel label_20) {
		this.label_20 = label_20;
	}

	public JLabel getLabel_21() {
		return label_21;
	}

	public void setLabel_21(JLabel label_21) {
		this.label_21 = label_21;
	}

	public JLabel getLabel_28() {
		return label_28;
	}

	public void setLabel_28(JLabel label_28) {
		this.label_28 = label_28;
	}

	public JLabel getLabel_29() {
		return label_29;
	}

	public void setLabel_29(JLabel label_29) {
		this.label_29 = label_29;
	}

	public JLabel getLabel_34() {
		return label_34;
	}

	public void setLabel_34(JLabel label_34) {
		this.label_34 = label_34;
	}

	public JLabel getLabel_35() {
		return label_35;
	}

	public void setLabel_35(JLabel label_35) {
		this.label_35 = label_35;
	}

	public JLabel getLabel_36() {
		return label_36;
	}

	public void setLabel_36(JLabel label_36) {
		this.label_36 = label_36;
	}

	public JLabel getLabel_37() {
		return label_37;
	}

	public void setLabel_37(JLabel label_37) {
		this.label_37 = label_37;
	}

	public JLabel getLabel_38() {
		return label_38;
	}

	public void setLabel_38(JLabel label_38) {
		this.label_38 = label_38;
	}

	public JLabel getLabel_39() {
		return label_39;
	}

	public void setLabel_39(JLabel label_39) {
		this.label_39 = label_39;
	}

	public JLabel getLabel_40() {
		return label_40;
	}

	public void setLabel_40(JLabel label_40) {
		this.label_40 = label_40;
	}

	public JLabel getLabel_41() {
		return label_41;
	}

	public void setLabel_41(JLabel label_41) {
		this.label_41 = label_41;
	}

	public JLabel getLabel_42() {
		return label_42;
	}

	public void setLabel_42(JLabel label_42) {
		this.label_42 = label_42;
	}

	public JLabel getLabel_43() {
		return label_43;
	}

	public void setLabel_43(JLabel label_43) {
		this.label_43 = label_43;
	}

	public JLabel getLabel_44() {
		return label_44;
	}

	public void setLabel_44(JLabel label_44) {
		this.label_44 = label_44;
	}

	public JLabel getLabel_45() {
		return label_45;
	}

	public void setLabel_45(JLabel label_45) {
		this.label_45 = label_45;
	}

	public JLabel getLabel_46() {
		return label_46;
	}

	public void setLabel_46(JLabel label_46) {
		this.label_46 = label_46;
	}

	public JLabel getLabel_47() {
		return label_47;
	}

	public void setLabel_47(JLabel label_47) {
		this.label_47 = label_47;
	}

	public JLabel getLabel_48() {
		return label_48;
	}

	public void setLabel_48(JLabel label_48) {
		this.label_48 = label_48;
	}

	public JLabel getLabel_49() {
		return label_49;
	}

	public void setLabel_49(JLabel label_49) {
		this.label_49 = label_49;
	}

	public JLabel getLabel_50() {
		return label_50;
	}

	public void setLabel_50(JLabel label_50) {
		this.label_50 = label_50;
	}

	public JLabel getLabel_51() {
		return label_51;
	}

	public void setLabel_51(JLabel label_51) {
		this.label_51 = label_51;
	}

	public JLabel getLabel_52() {
		return label_52;
	}

	public void setLabel_52(JLabel label_52) {
		this.label_52 = label_52;
	}

	public JLabel getLabel_53() {
		return label_53;
	}

	public void setLabel_53(JLabel label_53) {
		this.label_53 = label_53;
	}

	public JLabel getLabel_54() {
		return label_54;
	}

	public void setLabel_54(JLabel label_54) {
		this.label_54 = label_54;
	}

	public JLabel getLabel_55() {
		return label_55;
	}

	public void setLabel_55(JLabel label_55) {
		this.label_55 = label_55;
	}

	public JLabel getLabel_56() {
		return label_56;
	}

	public void setLabel_56(JLabel label_56) {
		this.label_56 = label_56;
	}

	public JLabel getLabel_57() {
		return label_57;
	}

	public void setLabel_57(JLabel label_57) {
		this.label_57 = label_57;
	}

	public JLabel getLabel_58() {
		return label_58;
	}

	public void setLabel_58(JLabel label_58) {
		this.label_58 = label_58;
	}

	public JLabel getLabel_59() {
		return label_59;
	}

	public void setLabel_59(JLabel label_59) {
		this.label_59 = label_59;
	}

	public JLabel getLabel_60() {
		return label_60;
	}

	public void setLabel_60(JLabel label_60) {
		this.label_60 = label_60;
	}

	public JLabel getLabel_61() {
		return label_61;
	}

	public void setLabel_61(JLabel label_61) {
		this.label_61 = label_61;
	}

	public JLabel getLabel_62() {
		return label_62;
	}

	public void setLabel_62(JLabel label_62) {
		this.label_62 = label_62;
	}

	public JLabel getLabel_63() {
		return label_63;
	}

	public void setLabel_63(JLabel label_63) {
		this.label_63 = label_63;
	}

	public JLabel getLabel_64() {
		return label_64;
	}

	public void setLabel_64(JLabel label_64) {
		this.label_64 = label_64;
	}

	public JLabel getLabel_65() {
		return label_65;
	}

	public void setLabel_65(JLabel label_65) {
		this.label_65 = label_65;
	}

	public JLabel getLabel_66() {
		return label_66;
	}

	public void setLabel_66(JLabel label_66) {
		this.label_66 = label_66;
	}

	public JLabel getLabel_67() {
		return label_67;
	}

	public void setLabel_67(JLabel label_67) {
		this.label_67 = label_67;
	}

	public JLabel getLabel_68() {
		return label_68;
	}

	public void setLabel_68(JLabel label_68) {
		this.label_68 = label_68;
	}

	public JLabel getLabel_69() {
		return label_69;
	}

	public void setLabel_69(JLabel label_69) {
		this.label_69 = label_69;
	}

	public JLabel getLabel_70() {
		return label_70;
	}

	public void setLabel_70(JLabel label_70) {
		this.label_70 = label_70;
	}

	public JLabel getLabel_71() {
		return label_71;
	}

	public void setLabel_71(JLabel label_71) {
		this.label_71 = label_71;
	}

	public JLabel getLabel_72() {
		return label_72;
	}

	public void setLabel_72(JLabel label_72) {
		this.label_72 = label_72;
	}

	public JLabel getLabel_73() {
		return label_73;
	}

	public void setLabel_73(JLabel label_73) {
		this.label_73 = label_73;
	}

	public JLabel getLabel_74() {
		return label_74;
	}

	public void setLabel_74(JLabel label_74) {
		this.label_74 = label_74;
	}

	public JLabel getLabel_75() {
		return label_75;
	}

	public void setLabel_75(JLabel label_75) {
		this.label_75 = label_75;
	}

	public JLabel getLabel_76() {
		return label_76;
	}

	public void setLabel_76(JLabel label_76) {
		this.label_76 = label_76;
	}

	public JLabel getLabel_77() {
		return label_77;
	}

	public void setLabel_77(JLabel label_77) {
		this.label_77 = label_77;
	}

	public JLabel getLabel_78() {
		return label_78;
	}

	public void setLabel_78(JLabel label_78) {
		this.label_78 = label_78;
	}

	public JLabel getLabel_79() {
		return label_79;
	}

	public void setLabel_79(JLabel label_79) {
		this.label_79 = label_79;
	}

	public JLabel getLabel_80() {
		return label_80;
	}

	public void setLabel_80(JLabel label_80) {
		this.label_80 = label_80;
	}

	public JLabel getLabel_81() {
		return label_81;
	}

	public void setLabel_81(JLabel label_81) {
		this.label_81 = label_81;
	}

	public JLabel getLabel_82() {
		return label_82;
	}

	public void setLabel_82(JLabel label_82) {
		this.label_82 = label_82;
	}

	public JLabel getLabel_83() {
		return label_83;
	}

	public void setLabel_83(JLabel label_83) {
		this.label_83 = label_83;
	}

	public JLabel getLblFila() {
		return lblFila;
	}

	public void setLblFila(JLabel lblFila) {
		this.lblFila = lblFila;
	}

	public JLabel getLabel_84() {
		return label_84;
	}

	public void setLabel_84(JLabel label_84) {
		this.label_84 = label_84;
	}

	public JLabel getLabel_85() {
		return label_85;
	}

	public void setLabel_85(JLabel label_85) {
		this.label_85 = label_85;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.btnNewButton = btnNewButton;
	}

	public JButton getBtnVender() {
		return btnVender;
	}

	public void setBtnVender(JButton btnVender) {
		this.btnVender = btnVender;
	}

	public JButton getBtnReservar() {
		return btnReservar;
	}

	public void setBtnReservar(JButton btnReservar) {
		this.btnReservar = btnReservar;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public JLabel getLbl_Img_Pelicula() {
		return lbl_Img_Pelicula;
	}

	public void setLbl_Img_Pelicula(JLabel lbl_Img_Pelicula) {
		this.lbl_Img_Pelicula = lbl_Img_Pelicula;
	}

	public JLabel getLbl_Titulo_Pelicula() {
		return lbl_Titulo_Pelicula;
	}

	public void setLbl_Titulo_Pelicula(JLabel lbl_Titulo_Pelicula) {
		this.lbl_Titulo_Pelicula = lbl_Titulo_Pelicula;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public void setLblNewLabel(JLabel lblNewLabel) {
		this.lblNewLabel = lblNewLabel;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public void setBtnNewButton_1(JButton btnNewButton_1) {
		this.btnNewButton_1 = btnNewButton_1;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public JButton getButton_1() {
		return button_1;
	}

	public void setButton_1(JButton button_1) {
		this.button_1 = button_1;
	}

	public JLabel getLblGneros() {
		return lblGneros;
	}

	public void setLblGneros(JLabel lblGneros) {
		this.lblGneros = lblGneros;
	}

	public JLabel getLbl_Descrip_Pelicula() {
		return lbl_Descrip_Pelicula;
	}

	public void setLbl_Descrip_Pelicula(JLabel lbl_Descrip_Pelicula) {
		this.lbl_Descrip_Pelicula = lbl_Descrip_Pelicula;
	}

	public JLabel getLblOrigen() {
		return lblOrigen;
	}

	public void setLblOrigen(JLabel lblOrigen) {
		this.lblOrigen = lblOrigen;
	}

	public JLabel getLblReparto() {
		return lblReparto;
	}

	public void setLblReparto(JLabel lblReparto) {
		this.lblReparto = lblReparto;
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

	public JButton getBtnNewButton_2() {
		return btnNewButton_2;
	}

	public void setBtnNewButton_2(JButton btnNewButton_2) {
		this.btnNewButton_2 = btnNewButton_2;
	}

	public JPanel getHorarios_UsuarioAdministrador() {
		return Horarios_UsuarioAdministrador;
	}

	public void setHorarios_UsuarioAdministrador(JPanel horarios_UsuarioAdministrador) {
		Horarios_UsuarioAdministrador = horarios_UsuarioAdministrador;
	}

	public JPanel getButacas_Usuario() {
		return Butacas_Usuario;
	}

	public void setButacas_Usuario(JPanel butacas_Usuario) {
		Butacas_Usuario = butacas_Usuario;
	}

	public JPanel getCartelera_Visualizacion() {
		return Cartelera_Visualizacion;
	}

	public void setCartelera_Visualizacion(JPanel cartelera_Visualizacion) {
		Cartelera_Visualizacion = cartelera_Visualizacion;
	}

	public JLabel getTituloPeliculaHorarios() {
		return TituloPeliculaHorarios;
	}

	public void setTituloPeliculaHorarios(JLabel tituloPeliculaHorarios) {
		TituloPeliculaHorarios = tituloPeliculaHorarios;
	}

	public JLabel getLblNewLabel_1() {
		return lblNewLabel_1;
	}

	public void setLblNewLabel_1(JLabel lblNewLabel_1) {
		this.lblNewLabel_1 = lblNewLabel_1;
	}

	public JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}

	public void setLblNewLabel_2(JLabel lblNewLabel_2) {
		this.lblNewLabel_2 = lblNewLabel_2;
	}

	public JLabel getLabel_2() {
		return label_2;
	}

	public void setLabel_2(JLabel label_2) {
		this.label_2 = label_2;
	}

	public JLabel getLabel_3() {
		return label_3;
	}

	public void setLabel_3(JLabel label_3) {
		this.label_3 = label_3;
	}

	public JLabel getLabel_4() {
		return label_4;
	}

	public void setLabel_4(JLabel label_4) {
		this.label_4 = label_4;
	}

	public JLabel getLabel_5() {
		return label_5;
	}

	public void setLabel_5(JLabel label_5) {
		this.label_5 = label_5;
	}

	public JLabel getLabel_6() {
		return label_6;
	}

	public void setLabel_6(JLabel label_6) {
		this.label_6 = label_6;
	}

	public JLabel getLabel_7() {
		return label_7;
	}

	public void setLabel_7(JLabel label_7) {
		this.label_7 = label_7;
	}

	public JLabel getLabel_1() {
		return label_1;
	}

	public void setLabel_1(JLabel label_1) {
		this.label_1 = label_1;
	}

	public JLabel getLabel_22() {
		return label_22;
	}

	public void setLabel_22(JLabel label_22) {
		this.label_22 = label_22;
	}

	public JLabel getLabel_23() {
		return label_23;
	}

	public void setLabel_23(JLabel label_23) {
		this.label_23 = label_23;
	}

	public JLabel getLabel_24() {
		return label_24;
	}

	public void setLabel_24(JLabel label_24) {
		this.label_24 = label_24;
	}

	public JLabel getLabel_25() {
		return label_25;
	}

	public void setLabel_25(JLabel label_25) {
		this.label_25 = label_25;
	}

	public JLabel getLabel_26() {
		return label_26;
	}

	public void setLabel_26(JLabel label_26) {
		this.label_26 = label_26;
	}

	public JLabel getLabel_27() {
		return label_27;
	}

	public void setLabel_27(JLabel label_27) {
		this.label_27 = label_27;
	}

	public JLabel getLblLunes() {
		return lblLunes;
	}

	public void setLblLunes(JLabel lblLunes) {
		this.lblLunes = lblLunes;
	}

	public JLabel getLblMartes() {
		return lblMartes;
	}

	public void setLblMartes(JLabel lblMartes) {
		this.lblMartes = lblMartes;
	}

	public JLabel getLblMiercoles() {
		return lblMiercoles;
	}

	public void setLblMiercoles(JLabel lblMiercoles) {
		this.lblMiercoles = lblMiercoles;
	}

	public JLabel getLabel_30() {
		return label_30;
	}

	public void setLabel_30(JLabel label_30) {
		this.label_30 = label_30;
	}

	public JLabel getLabel_31() {
		return label_31;
	}

	public void setLabel_31(JLabel label_31) {
		this.label_31 = label_31;
	}

	public JLabel getLabel_32() {
		return label_32;
	}

	public void setLabel_32(JLabel label_32) {
		this.label_32 = label_32;
	}

	public JLabel getLabel_33() {
		return label_33;
	}

	public void setLabel_33(JLabel label_33) {
		this.label_33 = label_33;
	}

	public JLabel getLbld() {
		return lbld;
	}

	public void setLbld(JLabel lbld) {
		this.lbld = lbld;
	}

}
