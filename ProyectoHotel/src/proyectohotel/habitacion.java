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
public class habitacion {
    Integer id_habitacion;
    String descripcion;
    Double precio;
    Integer piso;
    Integer numero_camas;

    String estadoh;

    public Integer getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(Integer id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public Integer getNumero_camas() {
        return numero_camas;
    }

    public void setNumero_camas(Integer numero_camas) {
        this.numero_camas = numero_camas;
    }



    public String getEstadoh() {
        return estadoh;
    }

    public void setEstadoh(String estadoh) {
        this.estadoh = estadoh;
    }
    
        
    
}
