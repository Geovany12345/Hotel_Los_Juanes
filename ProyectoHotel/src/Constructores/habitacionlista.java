/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class habitacionlista {
       private List<habitacion> habitaciones= new ArrayList<>();

    public List<habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }


  
    public void setObjHa(habitacion ohabitaciones){
        this.habitaciones.add(ohabitaciones);
    }
}
