import java.util.ArrayList;
import java.time.LocalDate;
/**
 * Write a description of class ListaTareas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaTareas
{
    // Coleccion que almacena todas las tareas
    private  ArrayList<Tarea> listaDeTareas;
    

    /**
     * Constructor for objects of class ListaTareas
     */
 public ListaTareas()
    {
        listaDeTareas = new ArrayList<Tarea>();
    }
  
    
  public void addTarea (String nombreTarea){
       Tarea nuevaTarea =  new Tarea(nombreTarea);
         listaDeTareas.add(nuevaTarea);
    } 
  public int verNumeroTareas() {
      return listaDeTareas.size();     
    }
    public void verTareasNumeradas(){
        int contador = 0;
        
        while(contador < listaDeTareas.size()){
            System.out.println( (contador + 1)  + ". " + listaDeTareas.get(contador).getNombreTarea());
            contador  ++;
        }
        
   }
   public void marcarCompletada (int posicion){
       int contador = posicion  ;
       if (contador > 0 && contador <= listaDeTareas.size()){
           listaDeTareas.get(contador - 1).cambiarEstado();
           
        }
    }
   
    public void mostrarCoincidentes (String textoABuscar){
     int posicion = 0;
     while(posicion < listaDeTareas.size()){
         Tarea tareaActual = listaDeTareas.get(posicion);
         if (tareaActual.getNombreTarea().contains(textoABuscar)){
             
             System.out.println((posicion + 1) + " " + " " + tareaActual.toString());
            } 
         posicion++;
        }
        
    }
    
    public void eliminarTarea (int posicion){
        int posicionReal = posicion - 1;
        if(posicionReal >= 0 && posicionReal < listaDeTareas.size()){
            listaDeTareas.remove(posicionReal);
        }
    }
        
   public void establecerNuevaPrioridad (int posicion, int nuevaPrioridad) {
       int posicionReal = posicion -1;
       if (posicionReal >= 0 && posicionReal < listaDeTareas.size()){
           if (nuevaPrioridad >= 0 && nuevaPrioridad <= 5){
              listaDeTareas.get(posicionReal).cambiarPrioridad(nuevaPrioridad); 
            }
        }
       
    }
    
    public void establecerFechaFin(int dia , int mes , int año , int posicion){
       int posicionReal = posicion - 1;
       if(posicionReal >= 0 && posicionReal < listaDeTareas.size()){
           listaDeTareas.get(posicionReal).establecerFechaVencimiento(dia,mes,año);
        }
       
        
    }
   
}