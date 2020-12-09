package cliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Ejecutar.Proceso;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField_valor;
	private JTextField textField_tarea;
	private JTextField textField_asignar;
	Proceso cont;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public GUI(Proceso a) {
		this.cont = a;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 464);
		setTitle("Observer");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		JLabel label_asignacion = new JLabel("Digite el n\u00FAmero de la divisi\u00F3n a la cual le asignara la tarea");
		label_asignacion.setBounds(10, 281, 362, 14);
		
		JLabel lblSeleccionACual = new JLabel("Seleccione a cual de las divisiones quiere notificar");
		lblSeleccionACual.setBounds(10, 89, 362, 14);
		
		JLabel label_$ = new JLabel("$");
		label_$.setBounds(118, 373, 12, 17);
		
		JLabel lblGestionDeRecursos = new JLabel("Gestion de Recursos");
		lblGestionDeRecursos.setBounds(15, 29, 320, 49);
		lblGestionDeRecursos.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JLabel lblDigiteLaCantidad = new JLabel("Digite la cantidad de recursos que quiere destinar a esta tarea");
		lblDigiteLaCantidad.setBounds(10, 337, 357, 14);
		
		JLabel label_tarea = new JLabel("Escriba la tarea");
		label_tarea.setBounds(10, 229, 362, 14);
		
		JButton boton_admin = new JButton("1. Administracion");
		boton_admin.setBounds(10, 129, 154, 32);
		
		JButton boton_contaduria = new JButton("2. Contaduria");
		boton_contaduria.setBounds(174, 129, 154, 32);
		
		JButton boton_equipolegal = new JButton("3. Equipo Legal");
		boton_equipolegal.setBounds(333, 129, 154, 32);
		
		JButton boton_investigacion = new JButton("4. Investigaci\u00F3n");
		boton_investigacion.setBounds(497, 129, 154, 32);
		
		JButton boton_marketing = new JButton("5. Marketing");
		boton_marketing.setBounds(10, 172, 154, 32);
		
		JButton boton_produccion = new JButton("6. Producci\u00F3n");
		boton_produccion.setBounds(174, 172, 154, 32);
		
		JButton boton_recursosh = new JButton("8. Recursos Humanos");
		boton_recursosh.setHorizontalAlignment(SwingConstants.LEFT);
		boton_recursosh.setBounds(497, 172, 154, 32);
		
		JButton boton_transporte = new JButton("7. Transporte");
		boton_transporte.setBounds(332, 172, 154, 32);
		
		JButton boton_enviar = new JButton("Enviar recursos");
		boton_enviar.setBounds(441, 370, 128, 23);

		JButton boton_eliminar = new JButton("Eliminar notificacion");
		boton_eliminar.setBounds(441, 277, 154, 23);
		contentPane.setLayout(null);
		
		contentPane.add(label_asignacion);
		contentPane.add(lblSeleccionACual);
		contentPane.add(label_$);
		contentPane.add(lblGestionDeRecursos);
		contentPane.add(lblDigiteLaCantidad);
		contentPane.add(label_tarea);
		contentPane.add(boton_admin);
		contentPane.add(boton_contaduria);
		contentPane.add(boton_equipolegal);
		contentPane.add(boton_investigacion);
		contentPane.add(boton_marketing);
		contentPane.add(boton_produccion);
		contentPane.add(boton_recursosh);
		contentPane.add(boton_transporte);
		contentPane.add(boton_enviar);
		contentPane.add(boton_eliminar);
		
		setContentPane(contentPane);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 254, 149, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(138, 306, 150, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(139, 371, 149, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		setVisible(true);
		
		boton_admin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cont.adicionarob(1);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
				
			}
		});
		
		boton_contaduria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cont.adicionarob(2);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
			}
		});
		
		boton_equipolegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cont.adicionarob(3);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
			}
		});
		
		boton_investigacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cont.adicionarob(4);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
			}
		});
		
		boton_marketing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cont.adicionarob(5);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
			}
		});
		
		boton_produccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cont.adicionarob(6);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
			}
		});
		
		boton_recursosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cont.adicionarob(8);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
			}
		});
		
		boton_transporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					cont.adicionarob(7);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				};
			}
		});
		
		boton_enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Tarea = textField_1.getText();
				String valor = textField_3.getText();
				int area = 0;
				area = Integer.parseInt(textField_2.getText());
				cont.getGerente().realizarAccion(Tarea, valor, area);
			}
		});
		
		boton_eliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(JOptionPane.showInputDialog("inserte el numero de la division a la que quiere eliminar notificaciones"));
				try {
					cont.eliminarob(a);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
	}
}
