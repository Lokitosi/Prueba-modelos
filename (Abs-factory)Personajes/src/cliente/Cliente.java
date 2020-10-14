package cliente;

import java.util.Scanner;

import javax.swing.JOptionPane;


import Fabricas_abstractas.Asesino;
import Fabricas_abstractas.Factory;
import Fabricas_abstractas.Mago;
import Fabricas_abstractas.Paladin;
import Fabricas_concretas.Fabrica_Elfos;
import Fabricas_concretas.Fabrica_Humanos;
import Fabricas_concretas.Fabrica_Orcos;


public class Cliente {

	String sel;
	Cliente ab  = this;
	GUI vent;
	
	public Cliente() {
		hacerVentana();
	}
	
	public String getSel() {
		return sel;
	}
	public void setSel(String sel) {
		this.sel = sel;
	}
	
    public static void Personaje(Factory tipo, GUI vent){
        Asesino a = tipo.crearA();
        Mago m = tipo.crearM();
        Paladin p = tipo.crearP();
        a.saludar(vent);
        m.saludar(vent);
        p.saludar(vent);
       
    }
    
    public void verificar() {
    	if (sel != null) {
    		configuracion();

    	}
    	}
    
    public void hacerVentana() {
		vent = new GUI(this);
		vent.setVisible(true);
		
	}
    
    public void configuracion() {
      
        String seleccion = sel;
        if (seleccion.contains("Elfos")) {
        	Personaje(new Fabrica_Elfos(),vent); 
        } else if (seleccion.contains("Humanos")) {
        	Personaje(new Fabrica_Humanos(),vent);
        } else if (seleccion.contains("Orcos")) {
        	Personaje(new Fabrica_Orcos(),vent);
        }else {
        	JOptionPane.showMessageDialog(null,"inserte una opcion valida");
        }
    }
    
    public static void main(String[] args) {
    	Cliente a = new Cliente();
      }
}
