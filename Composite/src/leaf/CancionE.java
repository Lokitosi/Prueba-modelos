package leaf;

import java.util.List;import Interface.Musica;

public class CancionE implements Musica{
	
	String name;
	
	public CancionE(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void add(Musica e) {
	}

	@Override
	public void remove(Musica e) {
	}

	@Override
	public List<Musica> getCanciones() {
		return null;
	}
	
	@Override
	public String toString() {
		return "añadido" + getName() + "a la lista";
	}

}
