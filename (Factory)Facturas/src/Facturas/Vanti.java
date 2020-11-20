package Facturas;
import Abstracto.*;

public class Vanti extends Comun{
	private int consumo;
	
	public Vanti(int consuo) {
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
		return (int) (getConsumo()*138.27);
	}

}
