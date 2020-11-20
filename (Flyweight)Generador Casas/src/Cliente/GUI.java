package Cliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class GUI extends JFrame {

	public JPanel contentPane;
	public JLabel lblNewLabel_3, lblNewLabel, lblNewLabel_1;
	public String seleccion = null;
	public Cliente a;
	

	public GUI(Cliente ab) {
		a = ab;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 411);
		setTitle("Flyweight Pattern");
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		
		JLabel lblNewLabel_2 = new JLabel("Seleccione el tipo de vivienda");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 254, 256, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Constructor de Viviendas");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(107, 18, 306, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Seleccione la constructura");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(10, 66, 256, 26);
		contentPane.add(lblNewLabel_5);

		JButton btnNewButton = new JButton("Bolivar");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccion = "Bolivar";
			}
		});
		btnNewButton.setBounds(106, 202, 137, 41);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Marval");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccion = "Marval";
			}

		});
		btnNewButton_1.setBounds(282, 202, 137, 41);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("CBolivar");
		lblNewLabel.setBounds(107, 94, 113, 97);
		contentPane.add(lblNewLabel);
		
		ImageIcon foto1 = new ImageIcon("./CB.png");
		lblNewLabel.setIcon(new ImageIcon(foto1.getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), Image.SCALE_SMOOTH)));

		JLabel lblNewLabel_1 = new JLabel("Marval");
		lblNewLabel_1.setBounds(282, 94, 113, 97);
		contentPane.add(lblNewLabel_1);
		
		ImageIcon foto2 = new ImageIcon("./Marval.png");
		lblNewLabel_1.setIcon(new ImageIcon(foto2.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH)));

		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(10, 11, 76, 55);
		contentPane.add(lblNewLabel_4);
		
		ImageIcon foto3 = new ImageIcon("./casa.png");
		lblNewLabel_4.setIcon(new ImageIcon(foto3.getImage().getScaledInstance(lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), Image.SCALE_SMOOTH)));
		
		JButton btnNewButton_2 = new JButton("Un Piso");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (seleccion != null) {
					int ncasas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantas casa va a crear"));
					a.crearViviendas(ncasas, "Un piso", seleccion);
				}else {
					JOptionPane.showMessageDialog(null,"seleccione una constructora primero");
				}
			}
		});
		btnNewButton_2.setBounds(36, 304, 125, 41);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Dos Pisos");
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (seleccion != null) {
					int ncasas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantas casa va a crear"));
					a.crearViviendas(ncasas, "Dos Pisos", seleccion);
				}else {
					JOptionPane.showMessageDialog(null,"seleccione una constructora primero");
				}
			}
		});
		btnNewButton_3.setBounds(171, 304, 125, 41);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Tres Pisos");
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (seleccion != null) {
					int ncasas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cuantas casa va a crear"));
					a.crearViviendas(ncasas, "Tres Pisos", seleccion);
				}else {
					JOptionPane.showMessageDialog(null,"seleccione una constructora primero");
				}
			}
		});
		btnNewButton_4.setBounds(307, 304, 125, 41);
		contentPane.add(btnNewButton_4);
		
	}
}
