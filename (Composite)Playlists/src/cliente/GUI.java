package cliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.Color;

public class GUI extends JFrame {

	private JPanel contentPane;
	URL aa;

	public GUI(Cliente a) {
		setTitle("SoundArrange");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setVisible(true);
		JLabel labelLista = new JLabel();
		//Botones
		JButton botonPlaylist = new JButton("Crear nueva Playlist");
		botonPlaylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String nombre;
			nombre = JOptionPane.showInputDialog(null,"Escriba el nombre de su lista de reproduccion");
			labelLista.setVisible(true);
			a.crearPlaylist(nombre);
			labelLista.setText("Lista De reproduccion seleccionada: "+ a.getMusica().getName());
			}
		});
		
		JButton botonVerCancion = new JButton("Ver Canciones");
		botonVerCancion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.verCanciones();
			}
		});
		
		JButton botonCancion = new JButton("Agregar cancion");
		botonCancion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nombreE;
				nombreE = JOptionPane.showInputDialog(null,"Escriba el nombre de su cancion");
				a.addCanciones(nombreE);
				JOptionPane.showMessageDialog(null,"Se ha añadido la cancion:\n"+nombreE+"\n A la playlist:\n"+a.getMusica().getName());
				
			}
		});
		
		JButton botonVerPL = new JButton("Ver Playlists disponibles");
		botonVerPL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.buscarPlaylist();
				labelLista.setText("Lista seleccionada: "+ a.getMusica().getName());
				
			}
		});
		
		
		labelLista.setBounds(30,90, 400, 20);
		contentPane.add(labelLista);
		labelLista.setVisible(false);
		botonVerPL.setBounds(193, 167, 189, 43);
		contentPane.add(botonVerPL);
		botonCancion.setBounds(419, 167, 128, 42);
		contentPane.add(botonCancion);
		botonVerCancion.setBounds(224, 221, 128, 42);
		contentPane.add(botonVerCancion);
		botonPlaylist.setBounds(10, 167, 156, 42);
		contentPane.add(botonPlaylist);
		
		
		JLabel lblNewLabel = new JLabel("Bienvenido a SoundArrange");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(163, 22, 302, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setBackground(Color.DARK_GRAY);
		lblNewLabel_1.setBounds(0, 0, 584, 303);
		
		try {
			aa = new URL("https://images.hdqwalls.com/wallpapers/simple-gray-background-4k-br.jpg");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageIcon foto1 = new ImageIcon(aa);
		lblNewLabel_1.setBounds(0, 0, 584, 303);
		lblNewLabel_1.setIcon(new ImageIcon(foto1.getImage().getScaledInstance(lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), Image.SCALE_SMOOTH)));
		contentPane.add(lblNewLabel_1);


		
	}
}
