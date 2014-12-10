
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
   private int dinero;
   
   public Bebedor(String nombre, int dinero){
       numeroDeCopas = 0;
       borracho = false;
       limite = 100;
       cantidadDeAlcohol = 0;
       this.nombre = nombre;
       this.dinero = dinero;
    }
    /*
     * Metodo que hace al borracho beberse un acopa elegida
     */
   public void bebe (Cubata copa, boolean invitado){
       if(borracho == true){
           System.out.println("No gracias");
        }
        else if(borracho == false && invitado == false){
            if(dinero < copa.getPrecio()){
                System.out.println("No me queda dinero, pide que me inviten!");
            }
            else{
                //Aumentamos la cantidad de copas que se ha tomado
                numeroDeCopas ++;
                //aumentamos la cantidad de alcohol en sangre
                cantidadDeAlcohol = cantidadDeAlcohol + copa.bebe();
                //Hacemos que el borracho se gaste dinero si no le han invitado

                dinero = dinero - copa.getPrecio();

                //Comprobamos si el borracho ya se ha emborrachado
                actualizaEstadoDeEmbriaguez();
            }
        }
        else{
                //Aumentamos la cantidad de copas que se ha tomado
                numeroDeCopas ++;
                //aumentamos la cantidad de alcohol en sangre
                cantidadDeAlcohol = cantidadDeAlcohol + copa.bebe();
                //Comprobamos si el borracho ya se ha emborrachado
                actualizaEstadoDeEmbriaguez();
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
   private void actualizaEstadoDeEmbriaguez(){
       if(cantidadDeAlcohol>limite){
           borracho = true;
        }
    }
   /**
    * Hacemos que los borrachos puedan invitarse entre sí
    */
   public void invita(Bebedor invitado, Cubata copa){
       if(dinero >= copa.getPrecio()){
           invitado.bebe(copa, true);
           dinero = dinero - copa.getPrecio();
        }
       else{
           System.out.println("No puedo invitar, no me queda dinero," + 
                                " que me inviten a mi!!");
        }
       
    }
}
