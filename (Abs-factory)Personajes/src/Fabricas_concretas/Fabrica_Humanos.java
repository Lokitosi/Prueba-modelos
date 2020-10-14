package Fabricas_concretas;

import Fabricas_abstractas.Asesino;
import Fabricas_abstractas.Factory;
import Fabricas_abstractas.Mago;
import Fabricas_abstractas.Paladin;
import Productos_concretos.Humano_Asesino;
import Productos_concretos.Humano_magico;
import Productos_concretos.Humano_paladin;

public class Fabrica_Humanos implements Factory {

	@Override
	public Asesino crearA() {
		// TODO Auto-generated method stub
		return new Humano_Asesino();
	}

	@Override
	public Mago crearM() {
		// TODO Auto-generated method stub
		return new Humano_magico();
	}

	@Override
	public Paladin crearP() {
		// TODO Auto-generated method stub
		return new Humano_paladin();
	}

}
