package compuesto;

import java.util.ArrayList;
import java.util.List;

import Interface.Musica;

public class Playlist implements Musica {
	
	private List<Musica> Canciones = new ArrayList<>();
	private String name;
	
	public Playlist(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void add(Musica e) {
		if (e != null) {
			this.Canciones.add(e);
		}
		
	}

	@Override
	public void remove(Musica e) {
		if (e != null) {
			this.Canciones.remove(e);
		}
		
	}

	@Override
	public List<Musica> getCanciones() {
		return Canciones;
	}
	
}
