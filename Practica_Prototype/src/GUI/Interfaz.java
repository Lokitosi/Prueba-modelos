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
	JLabel titulo, desc,circuloimg,cuaimg,altoi,anchoi,radio; 
	JButton circulo,cuadrado,cirOri,cuadOri;
	String sel;
	URL aa,ab;
	Practica_Prototype cliente;
	
	


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
		setTitle("Abstract Factory");
		setBounds(100, 100, 500, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		
		panel = new JPanel();
		alto = new JTextField();
		ancho = new JTextField();
		titulo = new JLabel("Generador de Figuras");
		desc = new JLabel("Seleccione la figura que quiere clonar:");
		titulo.setFont(new Font("arial", Font.PLAIN, 30));
		circulo = new JButton("circulo");
		cuadrado = new JButton("cuadrado");
		cuadOri = new JButton("Ver Original");
		circuloimg = new JLabel();
		cuaimg = new JLabel();
		altoi = new JLabel();
		anchoi = new JLabel();
		radio = new JLabel();
		
		
		//imagen
		try {
			aa = new URL("https://www.ecured.cu/images/a/ac/C%C3%ADrculo.JPG");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageIcon foto1 = new ImageIcon(aa);
        circuloimg.setBounds(10, 20, 100, 100);
        circuloimg.setIcon(new ImageIcon(foto1.getImage().getScaledInstance(circuloimg.getWidth(), circuloimg.getHeight(), Image.SCALE_SMOOTH)));

		
		try {
			ab = new URL("https://www.definicionabc.com/wp-content/uploads/Rect%C3%A1ngulo-450x251.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ImageIcon foto2 = new ImageIcon(ab);
        cuaimg.setBounds(10, 20, 100, 100);
        cuaimg.setIcon(new ImageIcon(foto2.getImage().getScaledInstance(cuaimg.getWidth(), cuaimg.getHeight(), Image.SCALE_SMOOTH)));
		
        
        //Ubicacion:
		titulo.setBounds(50, 10, 400, 35);
		desc.setBounds(10, 70, 350, 20);
		circulo.setBounds(15, 100, 100, 20);
		circuloimg.setBounds(10,140,150,100);
		radio.setBounds(10,250,100,20);
		cuadrado.setBounds(230, 100, 90, 20);
		cuaimg.setBounds(220,140,200,100);
		altoi.setBounds(220,250,100,20);
		anchoi.setBounds(220,270,100,20);
		cuadOri.setBounds(220,290,180,20);
		cuadOri.setVisible(false);
		
		//Actionlisteners
		circulo.addActionListener(this);
		cuadrado.addActionListener(this);
		cuadOri.addActionListener(this);
		
		panel.setLayout(null);
		panel.add(titulo);
		panel.add(desc);
		panel.add(circulo);
		panel.add(cuadrado);
		panel.add(circuloimg);
		panel.add(cuaimg);
		panel.add(altoi);
		panel.add(anchoi);
		panel.add(radio);
		panel.add(cuadOri);
		setContentPane(panel);
		
		
	}



	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource().equals(circulo)) {
            cliente.clonarCirculo();
        }
		if (ae.getSource().equals(cuadrado)) {
			cuadOri.setVisible(true);
			int a = Integer.parseInt(JOptionPane.showInputDialog(null,"inserte nuevo alto"));
			int b = Integer.parseInt(JOptionPane.showInputDialog(null,"inserte nuevo ancho"));
            cliente.clonarRectangulo(a,b);
        }
		if (ae.getSource().equals(cuadOri)) {  
            int alto = cliente.getRectangulo().getPos_y();
			int ancho = cliente.getRectangulo().getPos_x();
            JOptionPane.showMessageDialog(null,"las medidas originales son : \n Alto: "+alto+"\n Ancho: "+ancho);
        }
		// TODO Auto-generated method stub
		
	}

}
