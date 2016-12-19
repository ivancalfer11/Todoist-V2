import java.time.LocalDate;
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
    private int prioridad;
    private LocalDate fecha;
 

    /**
     * Constructor for objects of class Tarea
     */
    public Tarea(String nombreTarea)
    {
        this.nombreTarea = nombreTarea;
        estadoTarea = false;
        prioridad = 0;
       fecha = null;
    }
   
   public void cambiarEstadoTarea (boolean estadoTarea){
       estadoTarea = true;
   }
   public String getNombreTarea(){
       return  nombreTarea;
      
    }
    
   public void cambiarEstado()
   {
           estadoTarea = true;
   }
   
   public String toString(){
       String textoADevolver = "";
       if (estadoTarea == true){
           textoADevolver = textoADevolver  + "Hecha";    
          if (prioridad >= 0 && prioridad <= 5){
           textoADevolver = textoADevolver + " ( " + prioridad + "  ).";
          }
       }  
       textoADevolver += nombreTarea;
       return textoADevolver;
    }
    
   public void cambiarPrioridad (int nuevaPrioridad) {
       prioridad = nuevaPrioridad;
    }
   
    public void establecerFechaVencimiento (int dia , int mes , int año ){
        fecha = LocalDate.of(dia,mes,año);
    }
    
  
        
}

   
