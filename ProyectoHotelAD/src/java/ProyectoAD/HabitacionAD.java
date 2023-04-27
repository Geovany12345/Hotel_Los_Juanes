/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoAD;

import proyectohotel.habitacion;

/**
 *
 * @author Yutokiva
 */
public class HabitacionAD extends habitacion{
      public String setSQLInsert() {
        String result = "Error Sentencia AD";
        
        result = "INSERT INTO habitacion(\n"
                + "descripcion, precio, piso, numero_camas, estadoh)\n"
                + "VALUES ('" + this.getDescripcion() + "', " + this.getPrecio() + ", " + this.getPiso() + "," + this.getNumero_camas() + ",'" + this.getEstadoh() + "');";
        return result;
    }
    
     public String getSQLMostrar() {
         String result = "";

         if (getId_habitacion() != null) {
             result = "SELECT * FROM habitacion WHERE( (id_habitacion = " + this.getId_habitacion()+") and (estadoh ='Activo') )" ; 
         }

         return result;
     }
      
     public String getSQLMostrarTodos() {
         String result = "";


             result = "SELECT * FROM habitacion WHERE( (estadoh ='Activo') )" ; 
 

         return result;
     }
     
      public String getSQLMostrarTodasHabbi() {
         String result = "";


             result = "SELECT * FROM habitacion WHERE( (estadoh ='Desactivo') )" ; 
 

         return result;
     }
      
      
     
      public String getSQLMostrarTodosjuntas() {
         String result = "";


             result = "SELECT * FROM habitacion " ; 
 

         return result;
     }
     public String setSQLUpdate() {

        String result = "Error Sentencia AD";
        result = "  UPDATE habitacion\n"
                + "   SET descripcion='"+this.getDescripcion()+"',precio="+this.getPrecio()+",piso="+this.getPiso()+",numero_camas="+this.getNumero_camas()+" \n"
                + "   where id_habitacion=" + this.getId_habitacion() + " ;";
        return result;

    }
      public String setSQLdelete() {

   String result = "Error Sentencia AD";
        result = "  UPDATE habitacion\n"
                + "   SET estadoh='"+this.getEstadoh()+"' \n"
                + "   where id_habitacion=" + this.getId_habitacion() + " ;";
        return result;
    }
      

    
}
