package cliente;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Interface.Musica;
import compuesto.Playlist;
import leaf.CancionE;

public class Cliente {
	String nombre;
	Musica ce1,c1;
	ArrayList <Musica >playlist =  new ArrayList<Musica>();
	
	public Cliente() {
		GUI a = new GUI(this);
	}
	
	public void setNombre(String n) {
		this.nombre = n;
	}
	public Musica getMusica() {
		return c1;
	}
	
	public void crearPlaylist(String nombre) {
		c1 = new Playlist(nombre);
		playlist.add(c1);
	}
	
	public void addCanciones(String nombre) {
		ce1 = new CancionE(nombre);
		c1.add(ce1);
		
	}
	
	public void buscarPlaylist() {
		String play ="";
		for(int i = 0;i<playlist.size();i++) {
			play += (i+". "+playlist.get(i).getName())+"\n";
		
		}
		c1 = playlist.get(Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione el numero de la playlist:\n"+play,"Listas Disponibles",JOptionPane.PLAIN_MESSAGE)));
	}
	
	public void verCanciones() {
		List <Musica > patata;
		patata = c1.getCanciones();
		String song = "";
		for(int i = 0;i<patata.size();i++) {
			song += (i+". "+patata.get(i).getName())+"\n";
		
		}
		JOptionPane.showMessageDialog(null,"lista de canciones:\n"+song,"Song List",JOptionPane.PLAIN_MESSAGE);
	}
	
	public static void main(String[] args) {
		Cliente a = new Cliente();
	}

}

