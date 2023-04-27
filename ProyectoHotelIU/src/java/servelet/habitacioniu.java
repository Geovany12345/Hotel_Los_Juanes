/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import proyectohotel.habitacion;

/**
 *
 * @author Yutokiva
 */
public class habitacioniu {
     private List<habitacion> recursoi = new ArrayList<>();

    public List<habitacion> getRecursoi() {
        return recursoi;
    }

    public void setRecursoi(List<habitacion> recursoi) {
        this.recursoi = recursoi;
    }
    
     public String toHTML2() {
         
         
           Iterator it = recursoi.iterator();

        String result = "";

        result += ""
                +"<div >"
                +"<table border='1'> <tr>"
                + "<td><h6>ID HABITACIÓN</h6></td>"
           
                + "<td><h6>Descripción</h6></td>"
                + "<td><h6>PISO</h6> </td>"
                 + "<td><h6>PRECIO</h6></td>"
                   + "<td><h6>NÚMERO DE CAMAS</h6></td>";

          while (it.hasNext()) {

            habitacion oRecurso1 = (habitacion) it.next();
             result += 
                    "<tr>"
                     
                     +"<td>"+oRecurso1.getId_habitacion()+"</td>"
                     +"<td>"+oRecurso1.getDescripcion()+"</td>"
                     +"<td>"+oRecurso1.getPiso()+"</td>"
              
                      +"<td>"+oRecurso1.getPrecio()+"</td>"
                  
                    +"<td>"+oRecurso1.getNumero_camas()+"</td>"
                  
                
                    
                     +"</tr>";
        }
            result +="</table>";
           
             
         
          
          
     return result;
         }
    
}
