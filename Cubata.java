
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
    private int precio;
   public Cubata(String nombre, int cantidad, int precio){
       this.nombre = nombre;
       this.cantidad = cantidad;
       this.precio = precio;
    }
    /**
     * Metodo que devuelve la cantidad de alcohol que hay en la copa
     */
   public int bebe(){
       return cantidad;
    }
   public int getPrecio(){
       return precio;
    }
}
