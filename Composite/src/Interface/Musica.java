package Interface;

import java.util.List;

public interface Musica {
	
	String getName();
	void add(Musica e);
	void remove(Musica e);
	List<Musica> getCanciones();
	

}
