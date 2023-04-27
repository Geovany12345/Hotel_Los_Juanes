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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import proyectohotel.habitacion;
import proyectohotel.reserva;
import proyectohotel.reservalista;

/**
 *
 * @author Yutokiva
 */
@WebServlet(name = "eliminarreserva", urlPatterns = {"/eliminarreserva"})
public class eliminarreserva extends HttpServlet {
public List<reserva> res = new ArrayList<>();

    public List<reserva> getRes() {
        return res;
    }

    public void setRes(List<reserva> res) {
        this.res = res;
    }

  
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ProyectoHotelAD/NewWebService.wsdl")
    private NewWebService_Service service;

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
        Gson gson=new Gson();
        response.setContentType("text/html;charset=UTF-8");
        String codigo1=request.getParameter("id");
        Integer id=Integer.parseInt(codigo1);
        String result=obtenerreservan(id);
          Integer ide=1;
          reservalista habiReporte = gson.fromJson(result,reservalista.class);
                         res=habiReporte.getReservas();
                         Iterator it1 =res.iterator();
                    while (it1.hasNext()) {
                      reserva ohabi = (reserva) it1.next();
                      ide=ohabi.getId_habitacion();
                    }
       
      
        eliminarreserva(id,ide);
response.sendRedirect("AdministradorReserva.jsp");


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

    private String eliminarreserva(java.lang.Integer id, java.lang.Integer ide) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        hotelws1.NewWebService port = service.getNewWebServicePort();
        return port.eliminarreserva(id, ide);
    }

    private String obtenerreservan(java.lang.Integer name) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        hotelws1.NewWebService port = service.getNewWebServicePort();
        return port.obtenerreservan(name);
    }

    
   

  
  


   
  
}
