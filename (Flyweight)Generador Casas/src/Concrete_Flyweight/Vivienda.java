package Concrete_Flyweight;

import Interface_Flyweight.*;

public class Vivienda implements Vivienda_base{
	private String tipo;
	
	public Vivienda(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String getTipo( ) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crear(String tipo, String constructora) {
		 System.out.println("Se ha creado una vivienda de tipo :"+ tipo + " De la constructora: "+ constructora );
	}
	

}
