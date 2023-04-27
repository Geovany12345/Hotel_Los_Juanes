/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PROYECTOLG;

import ProyectoAD.AccesoDatos;
import ProyectoAD.ReservaAD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectohotel.personas;
import proyectohotel.reserva;

/**
 *
 * @author Yutokiva
 */
public class ReservaLN {
    public String setInserReserva(reserva res) {
        String result = "Error";
       
        ReservaAD ores = new ReservaAD();
      
        ores.setId_habitacion(res.getId_habitacion());
        ores.setIdentificacion(res.getIdentificacion());
        ores.setFecha_actual(res.getFecha_actual());
        ores.setFecha_dereserva(res.getFecha_dereserva());
        ores.setFecha_areserva(res.getFecha_areserva());
        ores.setNumero_dias(res.getNumero_dias());
        ores.setCosto_dia(res.getCosto_dia());
        ores.setCostototal(res.getCostototal());
        ores.setEstador(res.getEstador());
        String strSQL = ores.setSQLInsert();
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
    public List<reserva> getReserva(Integer id) {
        List<reserva> reser= new ArrayList<>();
        ReservaAD opers= new    ReservaAD();
        opers.setId_reserva(id);
        String strSQL = opers.getSQLMostrar();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 1) {
                    try {
                        ResultSet rsper = conexion.getRs();
                        while (rsper.next()) {
                            reserva orese = new reserva();
                            
                            orese.setId_habitacion(rsper.getInt("id_habitacion"));
                            orese.setIdentificacion(rsper.getString("identificacion"));
                                    orese.setFecha_actual(rsper.getString("fecha_actual"));
                            orese.setFecha_dereserva(rsper.getString("fecha_dereserva"));
                            orese.setFecha_areserva(rsper.getString("fecha_areserva"));
                            orese.setNumero_dias(rsper.getLong("numero_dias"));
                            orese.setCosto_dia(rsper.getDouble("costo_dia"));
                            orese.setCostototal(rsper.getDouble("costototal"));
                            orese.setEstador(rsper.getString("estador"));
                            reser.add(orese);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ReservaLN.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return reser;
    }
    
  public List<reserva> mostrarfecha(Integer id) {
        List<reserva> reser= new ArrayList<>();
        ReservaAD opers= new    ReservaAD();
        opers.setId_habitacion(id);
        String strSQL = opers.getSQLMostrarFecha();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 1) {
                    try {
                        ResultSet rsper = conexion.getRs();
                        while (rsper.next()) {
                            reserva orese = new reserva();
                      
                            orese.setFecha_areserva(rsper.getString("fecha_areserva"));
                     
                            reser.add(orese);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ReservaLN.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return reser;
    }
     public List<reserva> getReservaTodos() {
        List<reserva> reser= new ArrayList<>();
        ReservaAD opers= new    ReservaAD();
        
        String strSQL = opers.getSQLMostrarTodas();
        if (!strSQL.equals("")) {
            AccesoDatos conexion = new AccesoDatos();
            if (conexion.Connectar() == 2) {
                if (conexion.EjecutarSQL(strSQL) == 1) {
                    try {
                        ResultSet rsper = conexion.getRs();
                        while (rsper.next()) {
                            reserva orese = new reserva();
                      orese.setId_reserva(rsper.getInt("id_reserva"));
                            orese.setId_habitacion(rsper.getInt("id_habitacion"));
                            orese.setIdentificacion(rsper.getString("identificacion"));
                            orese.setFecha_actual(rsper.getString("fecha_actual"));
                            orese.setFecha_dereserva(rsper.getString("fecha_dereserva"));
                            orese.setFecha_areserva(rsper.getString("fecha_areserva"));
                            
                            orese.setNumero_dias(rsper.getLong("numero_dias"));
                            orese.setCosto_dia(rsper.getDouble("costo_dia"));
                            orese.setCostototal(rsper.getDouble("costototal"));
                            orese.setEstador(rsper.getString("estador"));
                            reser.add(orese);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ReservaLN.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        return reser;
    }
//Modificar Datos
    public String setUpdateReserva(reserva res) {
        String result = "Error";
        ReservaAD ores = new ReservaAD();
        
        ores.setId_reserva(res.getId_reserva());
        ores.setId_habitacion(res.getId_habitacion());
        ores.setIdentificacion(res.getIdentificacion());
        ores.setFecha_dereserva(res.getFecha_dereserva());
        ores.setFecha_areserva(res.getFecha_areserva());
        ores.setNumero_dias(res.getNumero_dias());
        ores.setCosto_dia(res.getCosto_dia());
        ores.setCostototal(res.getCostototal());
        String strSQL = ores.setSQLUpdate();
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
    public String setDeleteReserva(Integer Id) {
        String result = "Error";
        ReservaAD ohabAD = new ReservaAD();
        ohabAD.setId_reserva(Id);
        ohabAD.setEstador("Desactivo");
        
       
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
