package Ejecutar;

import java.util.Scanner;

import Observadores.*;
import Sujeto.*;
import cliente.GUI;

public class Proceso {
	
	Administracion administracion;
	Contaduria contaduria;
	EquipoLegal equipolegal;
	Investigacion investigacion;
	Marketing market;
	Produccion produccion;
	RecursosH recurHuman;
	Transporte trans;
	Gerente gerente;
	GUI ventana;

	    public Gerente getGerente() {
	    	return gerente;
	    }
public void adicionarob(int x) throws InterruptedException{
        
        boolean listo= true;
        switch(x){
            case 1:
                gerente.adicionarob(administracion);
                break;	
            case 2:
                gerente.adicionarob(contaduria);
                break;
            case 3:
                gerente.adicionarob(equipolegal);
                break;
            case 4:
                gerente.adicionarob(investigacion);
                break;
            case 5:
                gerente.adicionarob(market);
                break;
            case 6:
                gerente.adicionarob(produccion);
                break;
            case 7:
                gerente.adicionarob(recurHuman);
                break;
            case 8:
                gerente.adicionarob(trans);
                break;
            default:
                listo = false;
                System.out.println("OPCION NO VALIDA !!!!!!");
            
        }//fin switch
        
        if(listo) System.out.println("...OBSERVADOR AGREGADO...");
        Thread.sleep(2000);
    }
	
	public void eliminarob(int x) throws InterruptedException{
		
		boolean listo = true;
		switch(x){
        case 1:
            gerente.eliminarob(administracion);
            break;
        case 2:
            gerente.eliminarob(contaduria);
            break;
        case 3:
            gerente.eliminarob(equipolegal);
            break;
        case 4:
            gerente.eliminarob(investigacion);
            break;
        case 5:
            gerente.eliminarob(market);
            break;
        case 6:
            gerente.eliminarob(produccion);
            break;
        case 7:
            gerente.eliminarob(recurHuman);
            break;
        case 8:
            gerente.eliminarob(trans);
            break;
        default:
            listo = false;
            System.out.println("OPCION NO VALIDA !!!!!!");
        
    }
		if(listo) System.out.println("...OBSERVADOR ELIMINADO...");
        Thread.sleep(2000);
	}
	
	 public void ejecutaracciones() throws InterruptedException{
		 	ventana = new GUI(this);
		 	
		 	gerente = new Gerente();
	        administracion = new Administracion();
	        contaduria = new Contaduria();
	        equipolegal = new EquipoLegal();
	        investigacion = new Investigacion();
	        market = new Marketing();
	        produccion = new Produccion();
	        recurHuman = new RecursosH();
	        trans = new Transporte();
	       
	 }
}
