package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

import practica_prototype.Practica_Prototype;



/**
 *
 * @author EdisonGamba(Lokitosi)
 */
public class Interfaz extends JFrame implements ActionListener{

    JFrame ventana;
	JPanel panel;
	JTextField alto,ancho;
	JLabel titulo, desc,circuloimg,cuaimg,altoi,anchoi,radio,imgfnd; 
	JButton circulo,cuadrado,cirOri,cuadOri,cloncir,cloncuad;
	String sel;
	URL aa,ab,bg;
	Practica_Prototype cliente;
	JLayeredPane contenedor;
	
	


	public JLabel getAnchoi() {
		return anchoi;
	}



	public void setAnchoi(JLabel anchoi) {
		this.anchoi = anchoi;
	}



	public JLabel getAltoi() {
		return altoi;
	}



	public void setAltoi(JLabel altoi) {
		this.altoi = altoi;
	}
	

	public JLabel getRadio() {
		return radio;
	}



	public void setRadio(JLabel radio) {
		this.radio = radio;
	}



	public Interfaz (Practica_Prototype maina){
		cliente = maina;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Prototype+singleton");
		setBounds(100, 100, 500, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JLayeredPane layered = new JLayeredPane();
		alto = new JTextField();
		ancho = new JTextField();
		titulo = new JLabel("Generador de Figuras");
		titulo.setFont(new Font("arial", Font.PLAIN, 30));
		titulo.setForeground(new Color(000000));
		desc = new JLabel("Seleccione la figura que quiere Crear:");
		desc.setForeground(new Color(000000));
		circulo = new JButton("circulo");
		cuadrado = new JButton("cuadrado");
		cloncir = new JButton("clonar");
		cloncuad = new JButton("clonar");
		cuadOri = new JButton("Ver Original");
		circuloimg = new JLabel();
		cuaimg = new JLabel();
		altoi = new JLabel();
		anchoi = new JLabel();
		radio = new JLabel();
		imgfnd = new JLabel();
		
		
		//imagenes 
				try {
					aa = new URL("https://image.flaticon.com/icons/png/512/61/61695.png");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ImageIcon foto1 = new ImageIcon(aa);
		        circuloimg.setBounds(10, 20, 100, 100);
		        circuloimg.setIcon(new ImageIcon(foto1.getImage().getScaledInstance(circuloimg.getWidth(), circuloimg.getHeight(), Image.SCALE_SMOOTH)));

				
				try {
					ab = new URL("https://images.vexels.com/media/users/3/139344/isolated/preview/04f2d79f761a2663177cb6ab3700a484-icono-cuadrado-cuadrado-redondeado-by-vexels.png");
				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ImageIcon foto2 = new ImageIcon(ab);
		        cuaimg.setBounds(10, 20, 100, 100);
		        cuaimg.setIcon(new ImageIcon(foto2.getImage().getScaledInstance(cuaimg.getWidth(), cuaimg.getHeight(), Image.SCALE_SMOOTH)));
		        
		try {
			ab = new URL("https://htmlcolorcodes.com/assets/images/html-color-codes-color-tutorials-hero.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageIcon foto3 = new ImageIcon(ab);        
		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 500, 400);
        fondo.setIcon(new ImageIcon(foto3.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH)));
        
		
		titulo.setBounds(90, 10, 400, 35);
		desc.setBounds(10, 70, 350, 20);
		circulo.setBounds(15, 100, 100, 20);
		circuloimg.setBounds(10,140,150,100);
		radio.setBounds(10,280,100,20);
		cuadrado.setBounds(230, 100, 90, 20);
		cuaimg.setBounds(220,140,200,100);
		altoi.setBounds(220,250,100,20);
		anchoi.setBounds(220,270,100,20);
		cuadOri.setBounds(220,320,180,20);
		cloncir.setBounds(10,300,180,20);
		cloncuad.setBounds(220,300,180,20);
		cuadOri.setVisible(false);
		cloncir.setVisible(false);
		cloncuad.setVisible(false);
		
		circulo.addActionListener(this);
		cuadrado.addActionListener(this);
		cuadOri.addActionListener(this);
		cloncir.addActionListener(this);
		cloncuad.addActionListener(this);
		

		layered.add(fondo, new Integer(1));
		layered.add(titulo, new Integer(2));
		layered.add(desc, new Integer(2));
		layered.add(circulo, new Integer(2));
		layered.add(circuloimg, new Integer(2));
		layered.add(radio, new Integer(2));
		layered.add(cuadrado, new Integer(2));
		layered.add(cuaimg, new Integer(2));
		layered.add(altoi, new Integer(2));
		layered.add(anchoi, new Integer(2));
		layered.add(cuadOri, new Integer(2));
		layered.add(cloncir, new Integer(2));
		layered.add(cloncuad, new Integer(2));
		

		// Se visualiza todo.
		getContentPane().add(layered);

	}



	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource().equals(circulo)) {
			int rad = Integer.parseInt(JOptionPane.showInputDialog(null,"inserte el radio"));
			cliente.crearCirculo(rad);
			cloncir.setVisible(true);
        }
		if (ae.getSource().equals(cuadrado)) {
			int a = Integer.parseInt(JOptionPane.showInputDialog(null,"inserte alto"));
			int b = Integer.parseInt(JOptionPane.showInputDialog(null,"inserte ancho"));
			cliente.crearRectangulo(a, b);
			cloncuad.setVisible(true);
        }
		if (ae.getSource().equals(cuadOri)) {  
            int alto = cliente.getRectangulo().getPos_y();
			int ancho = cliente.getRectangulo().getPos_x();
            JOptionPane.showMessageDialog(null,"las medidas originales son : \n Alto: "+alto+"\n Ancho: "+ancho);
        }
		if (ae.getSource().equals(cloncir)) {
            cliente.clonarCirculo();
        }
		if (ae.getSource().equals(cloncuad)) {
			int a = Integer.parseInt(JOptionPane.showInputDialog(null,"inserte nuevo alto"));
			int b = Integer.parseInt(JOptionPane.showInputDialog(null,"inserte nuevo ancho"));
            cliente.clonarRectangulo(a,b);
            cuadOri.setVisible(true);
        }
		// TODO Auto-generated method stub
		
	}

}
