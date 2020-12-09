
package Sujeto;

import java.util.ArrayList;
import Interfaces.Observador;
public class Gerente {
    
    private ArrayList <Observador> Lista;
    private String tarea;
    private String recursos; 
    private Integer area;
    
    public Gerente(){
        Lista = new ArrayList<Observador>();
    }
    
    public void adicionarob(Observador n){
        Lista.add(n);
        
    }
    
    public void eliminarob(Observador n){
        Lista.remove(n);
    }
    //
    public void notificacion(){
        for(Observador n:Lista){
            n.actualizador(this.tarea , this.recursos, this.area);
        }
    }
    public void realizarAccion(String t , String r,Integer area){
        this.tarea = t;
        this.recursos = r;
        this.area = area;
        notificacion();
    }
    
    
    
}