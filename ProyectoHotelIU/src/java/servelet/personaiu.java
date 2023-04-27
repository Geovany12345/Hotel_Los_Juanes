package servelet;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import proyectohotel.personas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yutokiva
 */
public class personaiu {
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
                +"<div >"
                +"<table border='1'> <tr>"
                + "<td><h6> IDENTIFICACION</h6></td>"
           
                + "<td><h6>NOMBRES</h6></td>"
                + "<td><h6>APELLIDOS</h6> </td>"
                 + "<td><h6>DIRECCIÓN</h6></td>"
   + "<td><h6>TELÉFONO</h6></td>"
         + "<td><h6>EMAIL</h6></td>"
        + "<td><h6>PRIVILEGIO</h6><td>";
          while (it.hasNext()) {

            personas oRecurso1 = (personas) it.next();
             result += 
                    "<tr>"
                     
                     +"<td>"+oRecurso1.getIdentificacion()+"</td>"
                     +"<td>"+oRecurso1.getNombres()+"</td>"
                     +"<td>"+oRecurso1.getApellidos()+"</td>"
              
                      +"<td>"+oRecurso1.getDireccion()+"</td>"
                  
                    +"<td>"+oRecurso1.getTelefono()+"</td>"
                  
                    +"<td>"+oRecurso1.getEmail()+"</td>"
                  
                      +"<td>"+oRecurso1.getProvolegio()+"</td>"
                    
                    
                     +"</tr>";
        }
            result +="</table>";
           
             
         
          
          
     return result;
         }
}
