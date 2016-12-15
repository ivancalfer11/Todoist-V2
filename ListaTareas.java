import java.util.ArrayList;
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

        
    
}