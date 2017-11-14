package Vista;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Butaca extends JLabel {

	private JLabel butaca;
	private ImageIcon butaca_disponible = new ImageIcon(VistaPrincipalFinal.class.getResource("/Vista/butaca-disponible.png"));
	private ImageIcon butaca_ocupada = new ImageIcon(VistaPrincipalFinal.class.getResource("/Vista/butaca-ocupada.png"));
	private ImageIcon butaca_disponible_select = new ImageIcon(VistaPrincipalFinal.class.getResource("/Vista/butaca-disponible-select.png"));	
	private ImageIcon butaca_ocupada_select = new ImageIcon(VistaPrincipalFinal.class.getResource("/Vista/butaca-ocupada-select.png"));

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Butaca frame = new Butaca();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	 	
	public Butaca() {

		setBounds(100, 100, 450, 300);
		Icon butaca_disponible_img = new ImageIcon(
				butaca_disponible.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		this.setIcon(butaca_disponible_img);
		
	}
	
	public void Ocupada (){
		Icon butaca_ocupada_img = new ImageIcon(
				butaca_ocupada.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		this.setIcon(butaca_ocupada_img);
	}
	public void Ocupada_Seleccionada (){
		Icon butaca_ocupada_img_select = new ImageIcon(
				butaca_ocupada_select.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
		this.setIcon(butaca_ocupada_img_select);
		
	}
	public void Disponible_Seleccionada(){
			Icon butaca_disponible_img_select = new ImageIcon(
					butaca_disponible_select.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
			this.setIcon(butaca_disponible_img_select);
			
		}
	
	

	public JLabel getButaca() {
		return butaca;
	}

	public void setButaca(JLabel butaca) {
		this.butaca = butaca;
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

}
