/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import com.google.gson.Gson;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.script.ScriptEngineManager;
import proyectohotel.habitacion;
import proyectohotel.reserva;
import proyectohotel.reservalista;

/**
 *
 * @author Yutokiva
 */
public class obtenerhabitacioniu {
    private List<habitacion> recursoi = new ArrayList<>();
    public List<reserva> res=new ArrayList();

    public List<reserva> getRes() {
        return res;
    }

    public void setRes(List<reserva> res) {
        this.res = res;
    }
    

    public List<habitacion> getRecursoi() {
        return recursoi;
    }

    public void setRecursoi(List<habitacion> recursoi) {
        this.recursoi = recursoi;
    }
    
     public String toHTML2() {
         
         
           Iterator it = recursoi.iterator();

        String result = "<div class=\"form-group\">"
                +" <label for=\"street1_id\" class=\"control-label\">Descripcion de la habitación</label>"
                +"<select name=\"habitacion\">";

          while (it.hasNext()) {

            habitacion oRecurso1 = (habitacion) it.next();
             result += 
                    "<option value="+oRecurso1.getId_habitacion()+">"+oRecurso1.getDescripcion()+"      Costo $"+oRecurso1.getPrecio()+"</option> ";
                   
        }
            result +="</select>"
                    +"</div>";
          
                        
     
    
                
      
               
            
     return result;
         }

    
    
}
