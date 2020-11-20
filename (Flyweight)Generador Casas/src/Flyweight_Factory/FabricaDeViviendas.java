package Flyweight_Factory;

import java.util.HashMap;
import java.util.Map;

import Concrete_Flyweight.Vivienda;
import Interface_Flyweight.Vivienda_base;

public class FabricaDeViviendas {
	
	private Map viviendas;
	
	public FabricaDeViviendas() {
		this.viviendas = new HashMap();
	}
	
	public Vivienda_base getVivienda(String tipo) {
		
		if(!viviendas.containsKey(tipo)) {
			viviendas.put(tipo, new Vivienda(tipo));
		}
		return (Vivienda_base) viviendas.get(tipo);
	}
}
