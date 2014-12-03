
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
   private int numeroDeCopas;
   private boolean borracho;
   private int limite;
   private int cantidadDeAlcohol;
   private String nombre;
   
   public Bebedor(String nombre){
       numeroDeCopas = 0;
       borracho = false;
       limite = 100;
       cantidadDeAlcohol = 0;
       this.nombre = nombre;
    }
    /*
     * Metodo que hace al borracho beberse un acopa elegida
     */
   public void bebe (Cubata name){
       Cubata copa = name;
       //Aumentamos la cantidad de copas que se ha tomado
       numeroDeCopas ++;
       //aumentamos la cantidad de alcohol en sangre
       cantidadDeAlcohol = cantidadDeAlcohol + copa.bebe();
       //Comprobamos si el borracho ya se ha emborrachado
       actualiza();
       if(borracho == true){
           System.out.println("No gracias");
           cantidadDeAlcohol = cantidadDeAlcohol - copa.bebe();
           numeroDeCopas --;
        }
       
       
       
    }
   public void preguntame(String pregunta){
       if((pregunta.contains(nombre)) || (borracho == true)){
           System.out.println(pregunta.toUpperCase() + "!!!!!!");
        }
        else{
            if((pregunta.length()%2) == (0)){
               System.out.println("Si");
            }
           else{
               System.out.println("No");
            }
        }
    }
    /**
     * Metodo privado que actualiza si el borracho ya ha bebido suficiente
     */
   private void actualiza(){
       if(cantidadDeAlcohol>limite){
           borracho = true;
        }
    }
    
}
