
package Figuras;

import GUI.Interfaz;
/**
 *
 * @author jorge malaver
 */
import Interface.Figuras_geometricas;
public class Rectangulo implements Figuras_geometricas{
    private String Nombre;
    private int pos_x, pos_y;
    
    public Rectangulo(){        
    }
    
    
    public int getPos_x() {
		return pos_x;
	}


	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}


	public int getPos_y() {
		return pos_y;
	}


	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
	}


	@Override
    public void setNombre(String n){
     this.Nombre=n;   
    }
    public String getNombre(){
        return Nombre;
    }
     
    @Override
    public void tamaño(int x, int y){
           pos_x = x;
           pos_y = y;
        
    }
    
    @Override
    public void getposicion(Interfaz a){
    	a.getAltoi().setText("alto: "+ String.valueOf(this.pos_y));
    	a.getAnchoi().setText("ancho: "+ String.valueOf(this.pos_x));  
    }
    
    @Override
    public void obtenerArea(){
       System.out.println("Area del rectangulo: " + (this.pos_y*this.pos_x));  
    }
    
    @Override
    public Figuras_geometricas clonar(){
       
        Figuras_geometricas geometrica= new Rectangulo();
        geometrica.setNombre(this.Nombre);
        geometrica.tamaño(this.pos_x, this.pos_y);
        return geometrica;
    }
}
