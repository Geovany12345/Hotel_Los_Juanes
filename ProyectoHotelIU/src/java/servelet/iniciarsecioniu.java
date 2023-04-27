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
public class iniciarsecioniu {
     private List<personas> recursoi = new ArrayList<>();

    public List<personas> getRecursoi() {
        return recursoi;
    }

    public void setRecursoi(List<personas> recursoi) {
        this.recursoi = recursoi;
    }
    public String privilegio(){
    
     Iterator it = recursoi.iterator();

        String result = "Error";

     
             while (it.hasNext()) {

            personas oRecurso1 = (personas) it.next();
             result =oRecurso1.getProvolegio();
             }
return(result);
}
    
}
