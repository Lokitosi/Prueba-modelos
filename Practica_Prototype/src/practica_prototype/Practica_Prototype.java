
package practica_prototype;

import Figuras.Circulo;
/**
 *
 * @author jorge malaver
 */
import Figuras.Rectangulo;
import GUI.Interfaz;
import java.util.Scanner;
import Interface.Figuras_geometricas;

public class Practica_Prototype {
	int op, posx, posy;
    Interfaz vent;
    Scanner sc= new Scanner(System.in);
    Rectangulo rectangulo;
    Circulo circulo;
    Figuras_geometricas geometrica;
    
    
    public Practica_Prototype() {
    	geometrica  = null;
    	vent = new Interfaz(this);
    	vent.setVisible(true); 
        
    }
	
    
    public Rectangulo getRectangulo() {
		return rectangulo;
	}


	public void setRectangulo(Rectangulo rectangulo) {
		this.rectangulo = rectangulo;
	}


	public Figuras_geometricas getGeometrica() {
		return geometrica;
	}


	public void setGeometrica(Figuras_geometricas geometrica) {
		this.geometrica = geometrica;
	}


	public void clonarRectangulo(int a,int b) {
    	geometrica = rectangulo.clonar();
    	geometrica.tamaño(a, b);
    	geometrica.getposicion(vent);
    }
	
    public void clonarCirculo() {
    	geometrica = circulo.clonar();
    }
    
    public void crearRectangulo(int a , int b) {
    	rectangulo= new Rectangulo();	
        rectangulo.setNombre("Rectangulo");
        rectangulo.tamaño(a, b);
        rectangulo.getposicion(vent);
        
    }
    
    public void crearCirculo(int rad) {
    	circulo = Circulo.getInstancia();
    	circulo.setNombre("hahahah!");
        circulo.tamaño(rad,0);
        circulo.getposicion(vent);
    }
    
    
    public static void main(String[] args) {
        Practica_Prototype a = new Practica_Prototype();
      
    }
    
}
