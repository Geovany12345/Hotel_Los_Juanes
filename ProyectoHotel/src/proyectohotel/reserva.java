/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectohotel;

/**
 *
 * @author Yutokiva
 */
public class reserva {
    Integer id_reserva;

    Integer id_habitacion;    
    String identificacion;
    String fecha_dereserva;
    String fecha_areserva;
    Long numero_dias;
    Double costo_dia;
    Double costototal;
    String estador;
    String fecha_actual;

    public String getFecha_actual() {
        return fecha_actual;
    }

    public void setFecha_actual(String fecha_actual) {
        this.fecha_actual = fecha_actual;
    }
    

    public Integer getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(Integer id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

  

    public Integer getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(Integer id_reserva) {
        this.id_reserva = id_reserva;
    }

    
  
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFecha_dereserva() {
        return fecha_dereserva;
    }

    public void setFecha_dereserva(String fecha_dereserva) {
        this.fecha_dereserva = fecha_dereserva;
    }

    public String getFecha_areserva() {
        return fecha_areserva;
    }

    public void setFecha_areserva(String fecha_areserva) {
        this.fecha_areserva = fecha_areserva;
    }

    public Long getNumero_dias() {
        return numero_dias;
    }

    public void setNumero_dias(Long numero_dias) {
        this.numero_dias = numero_dias;
    }



    public Double getCosto_dia() {
        return costo_dia;
    }

    public void setCosto_dia(Double costo_dia) {
        this.costo_dia = costo_dia;
    }

    public Double getCostototal() {
        return costototal;
    }

    public void setCostototal(Double costototal) {
        this.costototal = costototal;
    }

    public String getEstador() {
        return estador;
    }

    public void setEstador(String estador) {
        this.estador = estador;
    }

    public void setCosto_dia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
}
