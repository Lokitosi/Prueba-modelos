package cliente;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener {
	JFrame ventana;
	JPanel panel;
	JTextField seleccion;
	JLabel titulo, respuesta, respuesta2, respuesta3,txt; 
	JButton ok;
	String sel;
	Cliente juan;

	
	public GUI(Cliente a) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Abstract Factory");
		setBounds(100, 100, 400, 250);
		setLocationRelativeTo(null);
		setResizable(false);
		juan = a;
		
		panel = new JPanel();
		seleccion = new JTextField();
		titulo = new JLabel("Campos de Batalla");
		txt = new JLabel("Seleccione entre las razas Humanos,Orcos o Elfos");
		titulo.setFont(new Font("arial", Font.PLAIN, 40));
		respuesta = new JLabel("");
		respuesta2 = new JLabel("");
		respuesta3 = new JLabel("");
		ok = new JButton("OK");
		
		setContentPane(panel);
		
		titulo.setBounds(10, 10, 350, 50);
		txt.setBounds(10, 70, 350, 20);
		seleccion.setBounds(10, 90, 70, 20);
		ok.setBounds(90, 90, 70, 20);
		respuesta.setBounds(60, 120, 350, 20);
		respuesta2.setBounds(60, 140, 350, 20);
		respuesta3.setBounds(60, 160, 350, 20);
		
		ok.addActionListener(this);
		
		panel.setLayout(null);
		panel.add(titulo);
		panel.add(txt);
		panel.add(seleccion);
		panel.add(ok);
		panel.add(respuesta);
		panel.add(respuesta2);
		panel.add(respuesta3);
		setContentPane(panel);
		
		
	}
	
	public JLabel getRespuesta(){
		return respuesta;
	}
	
	public JLabel getRespuesta2(){
		return respuesta2;
	}
	
	public JLabel getRespuesta3(){
		return respuesta3;
	}


	@Override
	public void actionPerformed(ActionEvent l) {
		juan.setSel(seleccion.getText());
		juan.verificar();
		
	}
}
