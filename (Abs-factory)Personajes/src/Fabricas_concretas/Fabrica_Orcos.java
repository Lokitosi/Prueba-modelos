package Fabricas_concretas;

import Fabricas_abstractas.Asesino;
import Fabricas_abstractas.Factory;
import Fabricas_abstractas.Mago;
import Fabricas_abstractas.Paladin;
import Productos_concretos.Orco_asesino;
import Productos_concretos.Orco_magico;
import Productos_concretos.Orco_paladin;

public class Fabrica_Orcos implements Factory{

	@Override
	public Asesino crearA() {
		// TODO Auto-generated method stub
		return new Orco_asesino();
	}

	@Override
	public Mago crearM() {
		// TODO Auto-generated method stub
		return new Orco_magico();
	}

	@Override
	public Paladin crearP() {
		// TODO Auto-generated method stub
		return new Orco_paladin();
	}

}
