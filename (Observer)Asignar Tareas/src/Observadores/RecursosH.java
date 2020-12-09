package Observadores;

import Interfaces.Observador;

public class RecursosH implements Observador {
	int tipo = 7;

	@Override
	public void actualizador(String Tipo, String recursos, int area) {
		if (area == tipo) {
			System.out.println("Se han enviado: $ " + recursos + " a la division de "+ tipo);
			}else {
				System.out.println("no hay notificaciones nuevas");
			}

	}
}

