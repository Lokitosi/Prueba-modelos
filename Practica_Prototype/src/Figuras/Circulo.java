package Figuras;

import javax.swing.JOptionPane;

import GUI.Interfaz;
import Interface.Figuras_geometricas;

/**
 *
 * @author EdisonGamba(Lokitosi)
 */
public class Circulo implements Figuras_geometricas {
	private String Nombre;
	private int pos_x, pos_y;
	private static Circulo instancia;

	
	public static Circulo getInstancia()
    {
         if (instancia == null) {
             instancia = new Circulo();
        }
        else {
            JOptionPane.showMessageDialog(null,"el circulo ya existe");
        }
         return instancia;
    }
	@Override
	public void setNombre(String n) {
		this.Nombre = n;
	}

	@Override
	public String getNombre() {
		return Nombre;
	}

	@Override
	public void tamaño(int x, int y) {
		pos_x = x;
		pos_y = y;
	}

	@Override
	public void getposicion(Interfaz a) {
		a.getRadio().setText("Radio: " + String.valueOf(this.pos_x));
	}

	@Override
	public void obtenerArea() {
		System.out.println("#xdxdxd");
	}

	@Override
	public Figuras_geometricas clonar() {
		getInstancia();
		Figuras_geometricas geometrica = new Circulo();
		geometrica.setNombre(this.Nombre);
		geometrica.tamaño(this.pos_x, this.pos_y);
		return geometrica;
	}

}
