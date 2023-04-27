/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTOLG;

import ProyectoAD.AccesoDatos;
import ProyectoAD.HabitacionAD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectohotel.habitacion;

/**
 *
 * @author Yutokiva
 */
public class HabitacionLN {  
    public String setInserHabitaciones(habitacion hab) {
        String result = "Error";
        //     Docente oasisDocente = this.datosDocente("EIS", "180368940-3");
        HabitacionAD oHab = new HabitacionAD();
        oHab.setId_habitacion(-1);
        oHab.setDescripcion(hab.getDescripcion());
        oHab.setPrecio(hab.getPrecio());
        oHab.setPiso(hab.getPiso());
        oHab.setNumero_camas(hab.getNumero_camas());
      
        oHab.setEstadoh(hab.getEstadoh());
        String strSQL = oHab.setSQLInsert();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 0) {
                    result = "Exito";
                }
            }
        }
        return result;
    }
    //Cargar Datos
    public List<habitacion> getHabitaciones(Integer id) {
        List<habitacion> ohab = new ArrayList<>();
        HabitacionAD oHab= new HabitacionAD();
        oHab.setId_habitacion(id);
        String strSQL = oHab.getSQLMostrar();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 1) {
                    try {
                        ResultSet rshab = conexion.getRs();
                        while (rshab.next()) {
                            habitacion ohabi = new habitacion();
                            
                            ohabi.setId_habitacion(rshab.getInt("id_habitacion"));
                           
                            ohabi.setDescripcion(rshab.getString("descripcion"));
                            ohabi.setPrecio(rshab.getDouble("precio"));
                            ohabi.setPiso(rshab.getInt("piso"));
                            ohabi.setNumero_camas(rshab.getInt("numero_camas"));
                          
                            ohabi.setEstadoh(rshab.getString("estadoh"));
                            

                            ohab.add(ohabi);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(HabitacionLN.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return ohab;
    }
    
    
    //Cargar Datos
    public List<habitacion> getHabitacionesTodas() {
        List<habitacion> ohab = new ArrayList<>();
        HabitacionAD oHab= new HabitacionAD();
        
        String strSQL = oHab.getSQLMostrarTodos();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 1) {
                    try {
                        ResultSet rshab = conexion.getRs();
                        while (rshab.next()) {
                            habitacion ohabi = new habitacion();
                            
                            ohabi.setId_habitacion(rshab.getInt("id_habitacion"));
                           
                            ohabi.setDescripcion(rshab.getString("descripcion"));
                            ohabi.setPrecio(rshab.getDouble("precio"));
                            ohabi.setPiso(rshab.getInt("piso"));
                            ohabi.setNumero_camas(rshab.getInt("numero_camas"));
                        
                            ohabi.setEstadoh(rshab.getString("estadoh"));
                            

                            ohab.add(ohabi);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(HabitacionLN.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return ohab;
    }
        //Cargar Datos
    public List<habitacion> getHabitacionesOcupadas() {
        List<habitacion> ohab = new ArrayList<>();
        HabitacionAD oHab= new HabitacionAD();
        
        String strSQL = oHab.getSQLMostrarTodasHabbi();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 1) {
                    try {
                        ResultSet rshab = conexion.getRs();
                        while (rshab.next()) {
                            habitacion ohabi = new habitacion();
                            
                            ohabi.setId_habitacion(rshab.getInt("id_habitacion"));
                           
                            ohabi.setDescripcion(rshab.getString("descripcion"));
                            ohabi.setPrecio(rshab.getDouble("precio"));
                            ohabi.setPiso(rshab.getInt("piso"));
                            ohabi.setNumero_camas(rshab.getInt("numero_camas"));
                        
                            ohabi.setEstadoh(rshab.getString("estadoh"));
                            

                            ohab.add(ohabi);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(HabitacionLN.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return ohab;
    }
    
    
    
       //Cargar Datos
    public List<habitacion> getHabitacionesTodasjuntas() {
        List<habitacion> ohab = new ArrayList<>();
        HabitacionAD oHab= new HabitacionAD();
        
        String strSQL = oHab.getSQLMostrarTodosjuntas();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 1) {
                    try {
                        ResultSet rshab = conexion.getRs();
                        while (rshab.next()) {
                            habitacion ohabi = new habitacion();
                            
                            ohabi.setId_habitacion(rshab.getInt("id_habitacion"));
                           
                            ohabi.setDescripcion(rshab.getString("descripcion"));
                            ohabi.setPrecio(rshab.getDouble("precio"));
                            ohabi.setPiso(rshab.getInt("piso"));
                            ohabi.setNumero_camas(rshab.getInt("numero_camas"));
                        
                            ohabi.setEstadoh(rshab.getString("estadoh"));
                            

                            ohab.add(ohabi);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(HabitacionLN.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return ohab;
    }
//Modificar Datos
    public String setUpdateHabitaciones(habitacion hab) {
        String result = "Error";
        HabitacionAD ohabAD = new HabitacionAD();
        ohabAD.setId_habitacion(hab.getId_habitacion());
        ohabAD.setDescripcion(hab.getDescripcion());
        ohabAD.setPrecio(hab.getPrecio());
        ohabAD.setPiso(hab.getPiso());
        ohabAD.setNumero_camas(hab.getNumero_camas());
      
       
        String strSQL = ohabAD.setSQLUpdate();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 0) {
                    result = "Exito";
                }
            }
        }
        return result;
    }
   //eliminardatos Datos
    public String setDeleteHabitacion(Integer Id) {
        String result = "Error";
        HabitacionAD ohabAD = new HabitacionAD();
        ohabAD.setId_habitacion(Id);
        ohabAD.setEstadoh("Desactivo");
        
       
        String strSQL = ohabAD.setSQLdelete();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 0) {
                    result = "Exito";
                }
            }
        }
        return result;
    }
    
      public String setUpdateHabitacion(Integer Id) {
        String result = "Error";
        HabitacionAD ohabAD = new HabitacionAD();
        ohabAD.setId_habitacion(Id);
        ohabAD.setEstadoh("Activo");
        
       
        String strSQL = ohabAD.setSQLdelete();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 0) {
                    result = "Exito";
                }
            }
        }
        return result;
    }
    
    
}
