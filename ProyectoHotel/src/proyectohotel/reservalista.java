/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectohotel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yutokiva
 */
public class reservalista {
        private List<reserva> reservas= new ArrayList<>();

    public List<reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<reserva> reservas) {
        this.reservas = reservas;
    }
         public void setObjReservas(reserva orecerva){
        this.reservas.add(orecerva);
    }
}
