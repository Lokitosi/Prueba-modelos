package Principal;



import javax.swing.JOptionPane;

import Abstracto.Comun;
import Fabrica.fabrica;

public class Practica_Fabrica {

	public static void main(String[] args) {
        Comun Micomun; 
        fabrica Mifabrica; 
        String seleccion = JOptionPane.showInputDialog(null,"Inserte la empresa de servicios publicos:");
        int valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el Consumo:"));
        Mifabrica = new fabrica(seleccion,valor);
        Micomun =  Mifabrica.crear_selecion();
        JOptionPane.showMessageDialog(null,"La factura tiene un precio de:"+"\n"+Micomun.valorFactura());


	}

}
