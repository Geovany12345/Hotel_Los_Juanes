/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoAD;

import proyectohotel.reserva;

/**
 *
 * @author Yutokiva
 */
public class ReservaAD extends reserva {
    public String setSQLInsert() {
        String result = "Error Sentencia AD";
        result = "INSERT INTO reserva(\n"
                + "id_habitacion,identificacion,fecha_actual,fecha_dereserva,fecha_areserva,numero_dias,costo_dia,costototal, estador)\n"
                + "VALUES (  '" + this.getId_habitacion() + "', '" + this.getIdentificacion() + "','"+this.getFecha_actual()+"','" + this.getFecha_dereserva() + "','" + this.getFecha_areserva() + "'," + this.getNumero_dias() + "," + this.getCosto_dia() + "," + this.getCostototal() + ",'" + this.getEstador()+ "');";
        return result;
    }
    
     public String getSQLMostrar() {
         String result = "";

         if (getId_reserva() != null) {
             result = "SELECT * FROM reserva WHERE( (id_reserva = " + this.getId_reserva() + ") and (estador = 'Activo'))" ; 
         }

         return result;
     }
     
     public String getSQLMostrarTodas() {
         String result = "";

    
             result = "SELECT * FROM reserva WHERE((estador= 'Activo'))" ; 
        
         return result;
     }
     
        public String getSQLMostrarFecha() {
         String result = "";

    
             result = "SELECT fecha_areserva FROM reserva WHERE( (estador='Activo')and(id_habitacion=" + this.getId_habitacion() + "))" ; 
        
         return result;
     }
     public String setSQLUpdate() {

        String result = "Error Sentencia AD";
        result = "  UPDATE reserva\n"
                + "   SET id_habitacion='"+this.getId_habitacion()+"',identificacion='"+this.getIdentificacion()+"',fecha_dereserva='"+this.getFecha_dereserva()+"',fecha_areserva='"+this.getFecha_areserva()+"', numero_dias="+this.getNumero_dias()+",costo_dia="+this.getCosto_dia()+",costototal="+this.getCostototal()+"\n"
                + "   where id_reserva=" + this.getId_reserva() + " ;";
        return result;

    }
      public String setSQLdelete() {

        String result = "Error Sentencia AD";
        result = "  UPDATE reserva\n"
                + "   SET estador='"+this.getEstador()+"' \n"
                + "   where id_reserva=" + this.getId_reserva() + " ;";
        return result;

    }
}
