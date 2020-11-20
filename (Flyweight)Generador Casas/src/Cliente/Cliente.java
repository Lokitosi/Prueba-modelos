package Cliente;

import javax.swing.JOptionPane;

import Flyweight_Factory.FabricaDeViviendas;


public class Cliente {
	static String tipo;
	
	public Cliente() {
		GUI a = new GUI(this);
	}
	
	public void crearViviendas(int cantidad,String tipo,String Constructora) {
		FabricaDeViviendas f = new FabricaDeViviendas();
		for (int i = 0;i<cantidad;i++) {
			f.getVivienda(tipo).crear(tipo,Constructora);
			System.out.println(i);
		}
		JOptionPane.showMessageDialog(null,"Se han creado "+cantidad+"\nCasas de tipo : "+tipo+"\n Constructora encargada: "+Constructora);
	}
	public static void main(String args[]){
		Cliente a = new Cliente();
		
	}
}
