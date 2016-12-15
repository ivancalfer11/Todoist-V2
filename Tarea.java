
/**
 * Write a description of class Tarea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tarea
{
    // instance variables - replace the example below with your own
    private String nombreTarea;
    private Boolean estadoTarea;

    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String nombreTarea)
    {
        this.nombreTarea = nombreTarea;
        estadoTarea = false;
       
    }
   
   public void cambiarEstadoTarea (boolean estadoTarea){
       estadoTarea = true;
   }
   public String getNombreTarea(){
       return  nombreTarea;
      
    }
    
   public void cambiarEstado() {
       
           estadoTarea = true;
        
        
    
   }
}
   
