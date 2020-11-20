package Facturas;
import Abstracto.*;

public class Acueducto extends Comun {
	private int consumo;
	
	public Acueducto(int consuo) {
		consumo = consuo;
	}
	
	public int getConsumo() {
		return consumo;
	}

	@Override
	public int valorFactura(){
		return (int) (getConsumo()*2218.53);
	}
	

}
