import view.VistaRequerimientos;
import java.sql.SQLException;
import view.requerimiento1;
import view.requerimiento2;
import view.requerimiento3;


import java.awt.EventQueue;

public class App {

    public static void main( String[] args ) throws SQLException{

        EventQueue.invokeLater (new Runnable(){
        //Casos de prueba
       public void run(){
          
           try{
                VistaRequerimientos JFrame = new VistaRequerimientos();
                JFrame.setVisible(true);
            
           }catch(Exception e){
                e.printStackTrace();
            }
        }
        
        });
    
    
}
          
}    /*
       
        //Requerimiento 1 - Reto3
        System.out.println();
        VistaRequerimientos.Requerimiento1();
        requerimiento1 reque = new requerimiento1();
        



         //Requerimiento 2 - Reto3
         System.out.println();
         VistaRequerimientos.Requerimiento2();
         requerimiento2 reque2 = new requerimiento2();


        //Requerimiento 5 - Reto3
        System.out.println();
        VistaRequerimientos.Requerimiento3();
        requerimiento3 reque3 = new requerimiento3();
       */

 
