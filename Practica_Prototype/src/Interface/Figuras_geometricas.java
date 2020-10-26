
package Interface;

import GUI.Interfaz;

/**
 *
 * @author jorge malaver
 */
public interface Figuras_geometricas{
    
    public void setNombre(String n);
    public String getNombre();
    public void tamaño(int x, int y);
    public void getposicion(Interfaz a);
    public void obtenerArea();
    public Figuras_geometricas clonar();
}
