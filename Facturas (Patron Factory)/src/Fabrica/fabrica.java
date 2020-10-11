package Fabrica;

import Abstracto.Comun;
import Facturas.Acueducto;
import Facturas.Codensa;
import Facturas.Vanti;

public class fabrica {
	protected String seleccion;
	protected int consumo;
	
	public fabrica(String sel, int valor) {
		seleccion = sel;
		consumo = valor;
	}

	public Comun crear_selecion() {
		if (seleccion.equalsIgnoreCase("Acueducto")) {
			return new Acueducto(consumo);
		} else if (seleccion.equalsIgnoreCase("Codensa")) {
			return new Codensa(consumo);
		} else {
			return new Vanti(consumo);
		}
	}
}
