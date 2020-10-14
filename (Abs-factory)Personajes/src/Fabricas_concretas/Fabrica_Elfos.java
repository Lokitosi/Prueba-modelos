package Fabricas_concretas;

import Fabricas_abstractas.Asesino;
import Fabricas_abstractas.Factory;
import Fabricas_abstractas.Mago;
import Fabricas_abstractas.Paladin;
import Productos_concretos.Elfo_Asesino;
import Productos_concretos.Elfo_Magico;
import Productos_concretos.Elfo_paladin;

public class Fabrica_Elfos implements Factory {

	@Override
	public Asesino crearA() {
		// TODO Auto-generated method stub
		return new Elfo_Asesino();
	}

	@Override
	public Mago crearM() {
		// TODO Auto-generated method stub
		return new Elfo_Magico();
	}

	@Override
	public Paladin crearP() {
		// TODO Auto-generated method stub
		return new Elfo_paladin();
	}

}
