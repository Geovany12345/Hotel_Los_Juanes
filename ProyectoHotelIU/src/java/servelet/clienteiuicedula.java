/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import proyectohotel.personas;

/**
 *
 * @author Yutokiva
 */
public class clienteiuicedula {
    private List<personas> recursoi = new ArrayList<>();

    public List<personas> getRecursoi() {
        return recursoi;
    }

    public void setRecursoi(List<personas> recursoi) {
        this.recursoi = recursoi;
    }
    
     public String toHTML2() {
         
         
           Iterator it = recursoi.iterator();

        String result = "";

        result += ""
                +" <div class=\"form-group\"> <!-- Full Name -->\n" 
                +" <label for=\"full_name_id\" class=\"control-label\">Identificación Cliente</label>\n" 
                +" <select  name=\"id\">\n" ;
               
          while (it.hasNext()) {

            personas oRecurso1 = (personas) it.next();
             result +="<option value="+oRecurso1.getIdentificacion()+">"+oRecurso1.getIdentificacion()+"    "+oRecurso1.getNombres()+" "+oRecurso1.getApellidos()+"</option> >";
                     
                   
        }
            result +="</select>"
                    +"</div>";
             
         
          
          
     return result;
         }
}
