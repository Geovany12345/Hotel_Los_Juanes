/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTOWS;

import PROYECTOLG.HabitacionLN;
import PROYECTOLG.PersonaLN;
import PROYECTOLG.ReservaLN;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import proyectohotel.habitacion;
import proyectohotel.habitacionlista;

import proyectohotel.personaslista;
import proyectohotel.reserva;
import proyectohotel.reservalista;


import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import proyectohotel.personas;


/**
 *
 * @author Yutokiva
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * HABITACIONES
     * @param data
     * @return 
     */
   
    @WebMethod(operationName = "IngresarHabitacion")
    public String ingresarHabitacion(@WebParam(name = "dese") String descripcion,@WebParam(name = "precio") Double precio, @WebParam(name = "piso") Integer piso,@WebParam(name = "numero_camas") Integer numerocamas, @WebParam(name = "estado") String estado) {
         String resulJSON = "";
        try {
            habitacion hab = new habitacion();
            hab.setId_habitacion(-1);
            hab.setDescripcion(descripcion);
            hab.setPrecio(precio);
            hab.setPiso(piso);
            hab.setNumero_camas(numerocamas);
          
            hab.setEstadoh(estado);
            
            HabitacionLN ohabitacionLN = new HabitacionLN();
       
            String resul;
            resul = ohabitacionLN.setInserHabitaciones(hab);
            
        } catch (JsonSyntaxException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resulJSON;
    }
    /**
     * This is a sample web service operation
     * @param id
     * @return 
     */
    @WebMethod(operationName = "ObtenerHabitacion")
    public String obtenerhabitacion(@WebParam(name = "name") Integer id) {
        List<habitacion> oHabit = new ArrayList<>();
        String asuntoJSON = "";
        try {
            Gson gson = new Gson();
            HabitacionLN oHabLN = new HabitacionLN();
            oHabit = oHabLN.getHabitaciones(id);
            habitacionlista ohabita = new habitacionlista();
            ohabita.setHabitaciones(oHabit);
            
            
                asuntoJSON= gson.toJson(ohabita,habitacionlista.class);
            
        } catch (Exception ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asuntoJSON;
    }
    
    
    
    @WebMethod(operationName = "ObtenerHabitaciones")
    public String obtenerhabitaciones() {
        List<habitacion> oHabit = new ArrayList<>();
        String asuntoJSON = "";
        try {
            Gson gson = new Gson();
            HabitacionLN oHabLN = new HabitacionLN();
            oHabit = oHabLN.getHabitacionesTodasjuntas();
            habitacionlista ohabita = new habitacionlista();
            ohabita.setHabitaciones(oHabit);
            
            
                asuntoJSON= gson.toJson(ohabita,habitacionlista.class);
            
        } catch (Exception ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asuntoJSON;
    }  
       @WebMethod(operationName = "ObtenerTodasHabitacion")
    public String obtenertodashabitacion( ){
        List<habitacion> oHabit = new ArrayList<>();
        String asuntoJSON = "";
        try {
            Gson gson = new Gson();
            HabitacionLN oHabLN = new HabitacionLN();
            oHabit = oHabLN.getHabitacionesTodas();
            habitacionlista ohabita = new habitacionlista();
            ohabita.setHabitaciones(oHabit);
            
            
                asuntoJSON= gson.toJson(ohabita,habitacionlista.class);
            
        } catch (Exception ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asuntoJSON;
    }
    @WebMethod(operationName = "ObtenerTodasHabitacionescocpuadas")
    public String obtenertodashabitacionocupadas( ){
        List<habitacion> oHabit = new ArrayList<>();
        String asuntoJSON = "";
        try {
            Gson gson = new Gson();
            HabitacionLN oHabLN = new HabitacionLN();
            oHabit = oHabLN.getHabitacionesOcupadas();
            habitacionlista ohabita = new habitacionlista();
            ohabita.setHabitaciones(oHabit);
            
            
                asuntoJSON= gson.toJson(ohabita,habitacionlista.class);
            
        } catch (Exception ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asuntoJSON;
    }
    /**
     * This is a sample web service operation
     * @param data
     * @return 
     */
    @WebMethod(operationName = "ModificarHabitacion")
    public String modificarhabitacion(@WebParam(name = "id") Integer id,@WebParam(name = "dese") String descripcion,@WebParam(name = "precio") Double precio, @WebParam(name = "piso") Integer piso,@WebParam(name = "numero_camas") Integer numerocamas, @WebParam(name = "estado") String estado) {
       String resulJSON = "";
        try {
             habitacion hab = new habitacion();
             hab.setId_habitacion(id);
            hab.setDescripcion(descripcion);
            hab.setPrecio(precio);
            hab.setPiso(piso);
            hab.setNumero_camas(numerocamas);
         
            hab.setEstadoh(estado);
            
            HabitacionLN ohabitacionLN = new HabitacionLN();
       
            HabitacionLN oHabitacionLN = new HabitacionLN();

            String resul;
            resul = oHabitacionLN.setUpdateHabitaciones(hab);
            
        } catch (JsonSyntaxException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resulJSON;
    }
    /**
     * This is a sample web service operation
     * @param data
     * @return 
     */
    @WebMethod(operationName = "EliminarHabitacion")
    public String eliminarhabitacion(@WebParam(name = "id") Integer id) {
         String resulJSON = "";
        try {
            Gson gson = new Gson();

           
            HabitacionLN oHabitacionLN = new HabitacionLN();

            String resul;
            resul = oHabitacionLN.setDeleteHabitacion(id);
            if ("Exito".equals(resul)) {
                resulJSON = gson.toJson("Operacines exitosas!!");
            } else {
                resulJSON = gson.toJson("Datos no eliminados");
            }
        } catch (JsonSyntaxException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resulJSON;
    }
    
    
     /**
     * Personas
     * @param data
     * @return 
     */
    @WebMethod(operationName = "Ingresarpersona")
    public String ingresarpersona(@WebParam(name = "id") String identificaci,@WebParam(name = "nombres") String nombre,@WebParam(name = "apellido") String apellido,@WebParam(name = "direccion") String direccion,@WebParam(name = "telefono") String telefono,@WebParam(name = "estado") String  estado,@WebParam(name = "usuario") String usuario,@WebParam(name = "contrasenia") String contrasenia,@WebParam(name = "provolegio") String privilegio,@WebParam(name = "email") String email) {
         String resulJSON = "";
        try {
            
            personas opersona=new personas() ;
            opersona.setIdentificacion(identificaci);
            opersona.setApellidos(apellido);
            opersona.setNombres(nombre);
            opersona.setTelefono(telefono);
            opersona.setDireccion(direccion);
            opersona.setUsuario(usuario);
            opersona.setContrasenia(contrasenia);
            opersona.setEmail(email);
            opersona.setEstadop(estado);
            opersona.setProvolegio(privilegio);
            PersonaLN oPersonaLN = new PersonaLN();
           
            String resul;
            resul = oPersonaLN.setInserPersonas(opersona);
           
        } catch (JsonSyntaxException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resulJSON;
    }
    /**
     * This is a sample web service operation
     * @param per
     * @return 
     */
    @WebMethod(operationName = "Obtenerpersonas")
    public String obtenerpersona(@WebParam(name = "name") String per) {
        List<personas> oper = new ArrayList<>();
        String asuntoJSON = "";
        try {
            Gson gson = new Gson();
            PersonaLN operLN = new PersonaLN();
            oper = operLN.getPersonas(per);
            personaslista opers = new personaslista();
            opers.setPersona(oper);
            
            
                asuntoJSON= gson.toJson(opers,personaslista.class);
            
        } catch (Exception ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asuntoJSON;
    }
    @WebMethod(operationName = "inicarsecion")
    public String inicarsesion(@WebParam(name = "uaurio") String usuario,@WebParam(name = "name") String contrasenia ) {
        List<personas> oper = new ArrayList<>();
        String asuntoJSON = "ERROR";
        try {
            Gson gson = new Gson();
            PersonaLN operLN = new PersonaLN();
            oper = operLN.InicarSecion(usuario,contrasenia);
            personaslista opers = new personaslista();
            opers.setPersona(oper);
            
            
                asuntoJSON= gson.toJson(opers,personaslista.class);
            
        } catch (Exception ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asuntoJSON;
    }
    
    
    @WebMethod(operationName = "Obtenertotadaspersonastrabajadoras")
    public String obtenertotsaspersonatrabajadoras() {
        List<personas> oper = new ArrayList<>();
        String asuntoJSON = "";
        try {
            Gson gson = new Gson();
            PersonaLN operLN = new PersonaLN();
            oper = operLN.getTodasPersonastrabajadoras();
            personaslista opers = new personaslista();
            opers.setPersona(oper);
            
            
                asuntoJSON= gson.toJson(opers,personaslista.class);
            
        } catch (Exception ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asuntoJSON;
    }
    @WebMethod(operationName = "Obtenertotadaspersonas")
    public String obtenertotsaspersona() {
        List<personas> oper = new ArrayList<>();
        String asuntoJSON = "";
        try {
            Gson gson = new Gson();
            PersonaLN operLN = new PersonaLN();
            oper = operLN.getTodasPersonas();
            personaslista opers = new personaslista();
            opers.setPersona(oper);
            
            
                asuntoJSON= gson.toJson(opers,personaslista.class);
            
        } catch (Exception ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asuntoJSON;
    }
    /**
     * This is a sample web service operation
     * @param data
     * @return 
     */
    @WebMethod(operationName = "ModificaPersona")
        public String modificarpersona(@WebParam(name = "id") String identificaci,@WebParam(name = "nombres") String nombre,@WebParam(name = "apellido") String apellido,@WebParam(name = "direccion") String direccion,@WebParam(name = "telefono") String telefono,@WebParam(name = "estado") String  estado,@WebParam(name = "usuario") String usuario,@WebParam(name = "contrasenia") String contrasenia,@WebParam(name = "provolegio") String privilegio,@WebParam(name = "email") String email) {

       String resulJSON = "";
        try {
            Gson gson = new Gson();

           personas opersona=new personas() ;
            opersona.setIdentificacion(identificaci);
            opersona.setApellidos(apellido);
            opersona.setNombres(nombre);
            opersona.setTelefono(telefono);
            opersona.setDireccion(direccion);
            opersona.setUsuario(usuario);
            opersona.setContrasenia(contrasenia);
            opersona.setEmail(email);
            opersona.setEstadop(estado);
            opersona.setProvolegio(privilegio);
            PersonaLN oPersonaLN = new PersonaLN();
            PersonaLN opersonaLN = new PersonaLN();

            String resul;
            resul = opersonaLN.setUpdatePersonas(opersona);
            if ("Exito".equals(resul)) {
                resulJSON = gson.toJson("Operacines exitosas!!");
            } else {
                resulJSON = gson.toJson("Datos no modificados");
            }
        } catch (JsonSyntaxException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resulJSON;
    }
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Eliminarpersonas")
    public String eliminarpersonas(@WebParam(name = "data") String data) {
         String resulJSON = "";
        try {
            Gson gson = new Gson();

           
            PersonaLN oPersonaLN = new PersonaLN();

            String resul;
            resul = oPersonaLN.setDeletePersonas(data);
            if ("Exito".equals(resul)) {
                resulJSON = gson.toJson("Operacines exitosas!!");
            } else {
                resulJSON = gson.toJson("Datos no eliminados");
            }
        } catch (JsonSyntaxException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resulJSON;
    }
     /**
     * Reserva
     * @param identificacion
     * @return 
     */
    @WebMethod(operationName = "IngresarReserva")
    public String ingresarreserva(@WebParam(name = "id") String identificaci,@WebParam(name = "Idhabitacion") Integer id,@WebParam(name = "fechac") String fechaactual,@WebParam(name = "fecha") String fecha,@WebParam(name = "fechaa") String fechaai,@WebParam(name = "cantidad") Long cantidad,@WebParam(name = "costo") Double costo) {
         String resulJSON = "";
        try {
           double cd=costo,ct;
            reserva oreserva = new reserva();
            oreserva.setIdentificacion(identificaci);
            oreserva.setId_habitacion(id);
            oreserva.setFecha_actual(fechaactual);
            oreserva.setFecha_dereserva(fecha);
            oreserva.setFecha_areserva(fechaai);
           
            
            
            oreserva.setNumero_dias(cantidad);
           
            oreserva.setCosto_dia(costo);
            oreserva.setCostototal(cantidad*cd);
            oreserva.setEstador("Activo");
            
            ReservaLN oreservaLN = new ReservaLN();
            
           
            String resul;
            resul = oreservaLN.setInserReserva(oreserva);
           
        } catch (JsonSyntaxException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resulJSON;
    }
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Obtenerreservan")
    public String obtenerreserva(@WebParam(name = "name") Integer id) {
        List<reserva> oHabit = new ArrayList<>();
        String asuntoJSON = "";
        try {
            Gson gson = new Gson();
            ReservaLN oHabLN = new ReservaLN();
            oHabit = oHabLN.getReserva(id);
            reservalista oreser = new reservalista();
            oreser.setReservas(oHabit);
            
            
                asuntoJSON= gson.toJson(oreser,reservalista.class);
            
        } catch (Exception ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asuntoJSON;
    }
    
    
    
      @WebMethod(operationName = "Obtenertodasreservan")
    public String obtenertodasreserva() {
        List<reserva> oHabit = new ArrayList<>();
        String asuntoJSON = "";
        try {
            Gson gson = new Gson();
            ReservaLN oHabLN = new ReservaLN();
            oHabit = oHabLN.getReservaTodos();
            reservalista oreser = new reservalista();
            oreser.setReservas(oHabit);
            
            
                asuntoJSON= gson.toJson(oreser,reservalista.class);
            
        } catch (Exception ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asuntoJSON;
    }
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "Modificarreserva")
    public String modificarreserva(@WebParam(name = "id") Integer identificaci,@WebParam(name = "cedula") String cedula,@WebParam(name = "id_habitacion") Integer id,@WebParam(name = "fecha") String fecha,@WebParam(name = "fechaa") String fechaai,@WebParam(name = "cantidad") Long cantidad,@WebParam(name = "costo") Double costo,@WebParam(name = "idantiguo") Integer ide) {
       String resulJSON = "";
        try {
            Gson gson = new Gson();
            double cd=costo;
            reserva oreserva=new reserva();
            oreserva.setId_reserva(identificaci);
            oreserva.setIdentificacion(cedula);
            oreserva.setId_habitacion(id);
            oreserva.setFecha_dereserva(fecha);
            oreserva.setFecha_areserva(fechaai);
            oreserva.setNumero_dias(cantidad);
            
            oreserva.setCosto_dia(cd);
            oreserva.setCostototal(cantidad*cd);
            oreserva.setEstador("Activo");
            
            
            ReservaLN oreserLN = new ReservaLN();
           
            
            String resul;
            resul = oreserLN.setUpdateReserva(oreserva);
            if ("Exito".equals(resul)) {
                resulJSON = gson.toJson("Operacines exitosas!!");
            } else {
                resulJSON = gson.toJson("Datos no modificados");
            }
        } catch (JsonSyntaxException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resulJSON;
    }
    /**
     * This is a sample web service operation
     */
      @WebMethod(operationName = "Eliminarreserva")
    public String eliminarreserva(@WebParam(name = "id") Integer id, @WebParam(name = "ide") Integer ide) {
         String resulJSON = "";
        try {
            Gson gson = new Gson();

           
            ReservaLN oHabitacionLN = new ReservaLN();
            HabitacionLN hab =new HabitacionLN();
            hab.setUpdateHabitacion(ide);
            String resul;
            resul = oHabitacionLN.setDeleteReserva(id);
            if ("Exito".equals(resul)) {
                resulJSON = gson.toJson("Operacines exitosas!!");
            } else {
                resulJSON = gson.toJson("Datos no eliminados");
            }
        } catch (JsonSyntaxException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resulJSON;
        
        
    }
    
    
      @WebMethod(operationName = "mostrarfecha")
    public String mostrarfecha(@WebParam(name = "id") Integer id) {
         List<reserva> oHabit = new ArrayList<>();
        String asuntoJSON = "";
        try {
            Gson gson = new Gson();
            ReservaLN oHabLN = new ReservaLN();
            oHabit = oHabLN.mostrarfecha(id);
            reservalista oreser = new reservalista();
            oreser.setReservas(oHabit);
            
            
                asuntoJSON= gson.toJson(oreser,reservalista.class);
        } catch (JsonSyntaxException ex) {
            Logger.getLogger(NewWebService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return asuntoJSON;
  
    }
}
