/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import com.google.gson.Gson;
import hotelws1.NewWebService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import proyectohotel.habitacion;
import proyectohotel.habitacionlista;
import proyectohotel.reserva;
import proyectohotel.reservalista;

/**
 *
 * @author Yutokiva
 */
@WebServlet(name = "modificarreserv", urlPatterns = {"/modificarreserv"})
public class modificarreserv extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ProyectoHotelAD/NewWebService.wsdl")
    private NewWebService_Service service;
 public List<habitacion> habit = new ArrayList<>();

    public List<habitacion> getHabit() {
        return habit;
    }

    public void setHabit(List<habitacion> habit) {
        this.habit = habit;
    }
    
    public List<reserva> res = new ArrayList<>();

    public List<reserva> getRes() {
        return res;
    }

    public void setRes(List<reserva> res) {
        this.res = res;
    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String id=request.getParameter("id_reserva");
           String identificacion=request.getParameter("id");
      String descripcio=request.getParameter("habitacion");
      Integer id_habit=Integer.parseInt(descripcio);
      
      String fecha_actual=request.getParameter("fechaactual");
      String fecha=request.getParameter("fechareserva");
      String fechaa=request.getParameter("fechaareserva");
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
      Date fechad=null;
      Date fechad1=null;
    
         try {
            fechad=sdf.parse(fechaa);
            fechad1=sdf.parse(fecha);
            
        } catch (ParseException ex) {
            Logger.getLogger(ingresarreservafi.class.getName()).log(Level.SEVERE, null, ex);
        }
   
      String resultr=mostrarfecha(id_habit);
      Gson gson=new Gson();
     
      reservalista recursoi = gson.fromJson(resultr,reservalista.class);
    
            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd"); 
      
      fechaiu fechaprueba= new fechaiu();
     fechaprueba.setRecursoi(recursoi.getReservas());
     String fechap=fechaprueba.toHTML2();
     if(!"Error".equals(fechap)){
                 Date fechapr=null;
     try {
            fechapr=sdf1.parse(fechap);
  
            
        } catch (ParseException ex) {
            Logger.getLogger(ingresarreservafi.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    if(!fechad.after(fechapr)){
        response.sendRedirect("IngresarResrva.jsp");
        
    }else{
        long diferencia =fechad.getTime()-fechad1.getTime();
        long tipo1=diferencia/(1000*60*60*24)+1;
        
        String estado="Activo";
        
        Double des=15.00;
        
        
        String result2;
        result2 = obtenerTodasHabitacion();
        habitacionlista habiReporte = gson.fromJson(result2,habitacionlista.class);
        habit=habiReporte.getHabitaciones();
        for (habitacion ohabi : habit) {
            if(Objects.equals(ohabi.getId_habitacion(), id_habit)){
                des=ohabi.getPrecio();
                
            }
        }
        Integer id1=Integer.parseInt(id);
        Gson gson1=new Gson();
       String result=obtenerreservan(id1);
          Integer ide=1;
          reservalista reserReporte = gson1.fromJson(result,reservalista.class);
                         res=reserReporte.getReservas();
                         Iterator it2 =res.iterator();
                    while (it2.hasNext()) {
                      reserva ohabi = (reserva) it2.next();
                      ide=ohabi.getId_habitacion();
                    }
        
         modificarreserva(id1,identificacion,id_habit,fecha,fechaa,tipo1,des,ide);
        response.sendRedirect("AdministradorReserva.jsp");

        
    }
  
     
   
    }
      
      
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String obtenerTodasHabitacion() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        hotelws1.NewWebService port = service.getNewWebServicePort();
        return port.obtenerTodasHabitacion();
    }

   

    private String obtenerreservan(java.lang.Integer name) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        hotelws1.NewWebService port = service.getNewWebServicePort();
        return port.obtenerreservan(name);
    }

    private String modificarreserva(java.lang.Integer id, java.lang.String cedula, java.lang.Integer idHabitacion, java.lang.String fecha, java.lang.String fechaa, java.lang.Long cantidad, java.lang.Double costo, java.lang.Integer idantiguo) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        hotelws1.NewWebService port = service.getNewWebServicePort();
        return port.modificarreserva(id, cedula, idHabitacion, fecha, fechaa, cantidad, costo, idantiguo);
    }

    private String mostrarfecha(java.lang.Integer id) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        hotelws1.NewWebService port = service.getNewWebServicePort();
        return port.mostrarfecha(id);
    }
    

}
