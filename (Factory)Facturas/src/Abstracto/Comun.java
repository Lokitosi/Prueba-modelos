package Abstracto;

public abstract class Comun {
	private int consumo;
	public Comun() {}
	
	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public abstract int valorFactura();

}
