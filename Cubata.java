
/**
 * Write a description of class Cubata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cubata
{
    private String nombre;
    private int cantidad;
   public Cubata(String nombre, int cantidad){
       this.nombre = nombre;
       this.cantidad = cantidad;
    }
    /**
     * Metodo que devuelve la cantidad de alcohol que hay en la copa
     */
   public int bebe(){
       return cantidad;
    }
}
