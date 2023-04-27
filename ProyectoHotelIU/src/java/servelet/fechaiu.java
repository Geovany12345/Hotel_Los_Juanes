/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import proyectohotel.habitacion;
import proyectohotel.habitacionlista;
import proyectohotel.reserva;

/**
 *
 * @author Yutokiva
 */
public class fechaiu {
      private List<reserva> recursoi = new ArrayList<>();


  
   
 
     

    public List<reserva> getRecursoi() {
        return recursoi;
    }

    public void setRecursoi(List<reserva> recursoi) {
        this.recursoi = recursoi;
    }
    
     public String toHTML2() {
         
         
           Iterator it = recursoi.iterator();
          
           
           

        String result = "Error";

       
        
        Gson gson = new Gson();
        
          while (it.hasNext()) {

            reserva oRecurso1 = (reserva) it.next();
             result = oRecurso1.getFecha_areserva();
                    

        }
           
           
             
         
          
          
     return result;
}
}
