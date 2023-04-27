/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTOLG;

import ProyectoAD.AccesoDatos;

import ProyectoAD.PersonaAD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


import proyectohotel.personas;

/**
 *
 * @author Yutokiva
 */
public class PersonaLN {
    
    public String setInserPersonas(personas per) {
        String result = "Error";
       
        PersonaAD oPer = new PersonaAD();
        oPer.setIdentificacion(per.getIdentificacion());
        oPer.setNombres(per.getNombres());
        oPer.setApellidos(per.getApellidos());
        oPer.setTelefono(per.getTelefono());
        oPer.setEmail(per.getEmail());
        oPer.setUsuario(per.getUsuario());
        oPer.setContrasenia(per.getContrasenia());
        oPer.setDireccion(per.getDireccion());
        oPer.setProvolegio(per.getProvolegio());
        oPer.setEstadop(per.getEstadop());
        String strSQL = oPer.setSQLInsert();
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
    public List<personas> getPersonas(String id) {
        List<personas> oper= new ArrayList<>();
        PersonaAD opers= new PersonaAD();
        opers.setIdentificacion(id);
        String strSQL = opers.getSQLMostrar();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 1) {
                    try {
                        ResultSet rsper = conexion.getRs();
                        while (rsper.next()) {
                            personas operso = new personas();
                            
                            operso.setIdentificacion(rsper.getNString("identificacion"));
                           
                            operso.setNombres(rsper.getString("nombres"));
                            operso.setApellidos(rsper.getString("apellidos"));
                            operso.setTelefono(rsper.getString("telefono"));
                            operso.setEmail(rsper.getString("email"));
                            operso.setUsuario(rsper.getString("usuario"));
                            operso.setContrasenia(rsper.getString("contrasenia"));
                            operso.setEstadop(rsper.getString("estadop"));
                            operso.setProvolegio(rsper.getString("provolegio"));
                            operso.setDireccion(rsper.getString("direccion"));

                            oper.add(operso);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(PersonaLN.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return oper;
    }
    
    
    
    //Cargar Datos
    public List<personas> InicarSecion(String id,String con) {
        List<personas> oper= new ArrayList<>();
        PersonaAD opers= new PersonaAD();
        opers.setUsuario(id);
        opers.setContrasenia(con);
        String strSQL = opers.getSQLInicarsecion();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 1) {
                    try {
                        ResultSet rsper = conexion.getRs();
                        while (rsper.next()) {
                            personas operso = new personas();
                     operso.setIdentificacion(rsper.getString("identificacion"));
                           
                            operso.setNombres(rsper.getString("nombres"));
                            operso.setApellidos(rsper.getString("apellidos"));
                            operso.setTelefono(rsper.getString("telefono"));
                            operso.setDireccion(rsper.getString("direccion"));
                            operso.setTelefono(rsper.getString("telefono"));
                            operso.setEmail(rsper.getString("email"));
                            operso.setUsuario(rsper.getString("usuario"));
                            operso.setContrasenia(rsper.getString("contrasenia"));
                            operso.setEstadop(rsper.getString("estadop"));
                            operso.setProvolegio(rsper.getString("provolegio"));
                            oper.add(operso);
                        }       
                         
                    } catch (SQLException ex) {
                        Logger.getLogger(PersonaLN.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return oper;
    }
    
    public List<personas> getTodasPersonas() {
        List<personas> oper= new ArrayList<>();
        PersonaAD opers= new PersonaAD();
        
        String strSQL = opers.getSQLMostrartodos();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 1) {
                    try {
                        ResultSet rsper = conexion.getRs();
                        while (rsper.next()) {
                            personas operso = new personas();
                            
                            operso.setIdentificacion(rsper.getString("identificacion"));
                           
                            operso.setNombres(rsper.getString("nombres"));
                            operso.setApellidos(rsper.getString("apellidos"));
                            operso.setTelefono(rsper.getString("telefono"));
                            operso.setDireccion(rsper.getString("direccion"));
                            operso.setTelefono(rsper.getString("telefono"));
                            operso.setEmail(rsper.getString("email"));
                            operso.setUsuario(rsper.getString("usuario"));
                            operso.setContrasenia(rsper.getString("contrasenia"));
                            operso.setEstadop(rsper.getString("estadop"));
                            operso.setProvolegio(rsper.getString("provolegio"));
                            oper.add(operso);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(PersonaLN.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return oper;
    }
    
    
     public List<personas> getTodasPersonastrabajadoras() {
        List<personas> oper= new ArrayList<>();
        PersonaAD opers= new PersonaAD();
        
        String strSQL = opers.getSQLMostrartodostrabajadores();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 1) {
                    try {
                        ResultSet rsper = conexion.getRs();
                        while (rsper.next()) {
                            personas operso = new personas();
                            
                            operso.setIdentificacion(rsper.getString("identificacion"));
                           
                            operso.setNombres(rsper.getString("nombres"));
                            operso.setApellidos(rsper.getString("apellidos"));
                            operso.setTelefono(rsper.getString("telefono"));
                            operso.setDireccion(rsper.getString("direccion"));
                            operso.setTelefono(rsper.getString("telefono"));
                            operso.setEmail(rsper.getString("email"));
                            operso.setUsuario(rsper.getString("usuario"));
                            operso.setContrasenia(rsper.getString("contrasenia"));
                            operso.setEstadop(rsper.getString("estadop"));
                            operso.setProvolegio(rsper.getString("provolegio"));
                            oper.add(operso);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(PersonaLN.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return oper;
    }
//Modificar Datos
    public String setUpdatePersonas(personas per) {
        String result = "Error";
        PersonaAD operAD = new PersonaAD();
        operAD.setIdentificacion(per.getIdentificacion());
        operAD.setNombres(per.getNombres());
        operAD.setApellidos(per.getApellidos());
        operAD.setTelefono(per.getTelefono());
        operAD.setEmail(per.getEmail());
        operAD.setUsuario(per.getUsuario());
        operAD.setDireccion(per.getDireccion());
        operAD.setContrasenia(per.getContrasenia());
        operAD.setProvolegio(per.getProvolegio());
        
       
        String strSQL = operAD.setSQLUpdate();
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
    public String setDeletePersonas(String Id) {
        String result = "Error";
        PersonaAD ohabAD = new PersonaAD();
        ohabAD.setIdentificacion(Id);
        ohabAD.setEstadop("Desactivo");
        
       
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
