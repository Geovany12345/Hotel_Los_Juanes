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
public class reservaiu {
     private List<reserva> recursoi = new ArrayList<>();
     public List<habitacion> habit = new ArrayList<>();

    public List<habitacion> getHabit() {
        return habit;
    }

    public void setHabit(List<habitacion> habit) {
        this.habit = habit;
    }

              
 
     

    public List<reserva> getRecursoi() {
        return recursoi;
    }

    public void setRecursoi(List<reserva> recursoi) {
        this.recursoi = recursoi;
    }
    
     public String toHTML2() {
         
         
           Iterator it = recursoi.iterator();
          
           
           

        String result = "";

        result += ""
                +"<div >"
                +"<table border='1'> <tr>"
                + "<td><h6> ID RESERVA</h6></td>"
           + "<td><h6> IDENTIFICACIÓN</h6></td>"
                + "<td><h6>DESCRIPCIÓN DE LA HABITACIÓN</h6></td>"
                + "<td><h6>PISO</h6></td>"
                + "<td><h6>NÚMERO DE CAMAS</h6></td>"
                  + "<td><h6>FECHA DE RESERVA</h6> </td>"
                + "<td><h6>DESDE</h6> </td>"
                 + "<td><h6>HASTA</h6></td>"
   + "<td><h6>NÚMERO DE DIAS</h6></td>"
         + "<td><h6>COSTO DIA</h6></td>"
        + "<td><h6>COSTO TOTAL</h6></td>";
        
        Gson gson = new Gson();
        
          while (it.hasNext()) {

            reserva oRecurso1 = (reserva) it.next();
             result += 
                    "<tr>"
                     +"<td>"+oRecurso1.getId_reserva()+"</td>"
                     +"<td>"+oRecurso1.getIdentificacion()+"</td>";
                     String des="No disponibles";
                     Integer piso=1;
                     Integer numero=1;
                     String result2;
                     result2 = obtenerHabitaciones();
                        habitacionlista habiReporte = gson.fromJson(result2,habitacionlista.class);
                         habit=habiReporte.getHabitaciones();
                        Iterator it1 =habit.iterator();
                    while (it1.hasNext()) {

                     habitacion ohabi = (habitacion) it1.next();
                        if(Objects.equals(ohabi.getId_habitacion(), oRecurso1.getId_habitacion())){
                                des=ohabi.getDescripcion();
                                piso=ohabi.getPiso();
                                numero=ohabi.getNumero_camas();
                                }
                                 }
           
                     result+="<td>"+des+"</td>"
                             +"<td>"+piso+"</td>"
                             +"<td>"+numero+"</td>"
                              +"<td>"+oRecurso1.getFecha_actual()+"</td>"
                     +"<td>"+oRecurso1.getFecha_dereserva()+"</td>"
              
                      +"<td>"+oRecurso1.getFecha_areserva()+"</td>"
                  
                    +"<td>"+oRecurso1.getNumero_dias()+"</td>"
                  
                    +"<td>"+oRecurso1.getCosto_dia()+"</td>"
                  
                      +"<td>"+oRecurso1.getCostototal()+"</td>"
                    
                    
                     +"</tr>";
        }
            result +="</table>";
           
             
         
          
          
     return result;
         }

    private static String obtenerHabitaciones() {
        hotelws1.NewWebService_Service service = new hotelws1.NewWebService_Service();
        hotelws1.NewWebService port = service.getNewWebServicePort();
        return port.obtenerHabitaciones();
    }

   
 
}
