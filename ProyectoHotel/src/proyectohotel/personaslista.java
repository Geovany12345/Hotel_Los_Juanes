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
public class personaslista {
         private List<personas> persona= new ArrayList<>();

    public List<personas> getPersona() {
        return persona;
    }

    public void setPersona(List<personas> persona) {
        this.persona = persona;
    }
     public void setObjCN(personas opersona){
        this.persona.add(opersona);
    }
}
