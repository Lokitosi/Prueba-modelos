package Facturas;
import Abstracto.*;


public class Codensa extends Comun {
	private int consumo;
	
	public Codensa(int consuo) {
		consumo = consuo;
	}
	public int getConsumo() {
		return consumo;
	}


	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}


	@Override
	public int valorFactura(){
		return (int) (getConsumo()*538.41);
	}
	

}
