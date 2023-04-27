/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet;

import hotelws1.NewWebService_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Yutokiva
 */
@WebServlet(name = "modificarcliente", urlPatterns = {"/modificarcliente"})
public class modificarcliente extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        String identificacion=request.getParameter("identificacionf");
      String nombres=request.getParameter("nombres");
      String apellidos=request.getParameter("apellidos");
      String direccion=request.getParameter("direccion");
      String telefono=request.getParameter("telefono");
      String email=request.getParameter("correo");
      String usuario=request.getParameter("usuario");
      String contrasenia=request.getParameter("contrasenia");
      String estadop="Activo";
      String provologio="Cliente";
   
    modificaPersona(identificacion,nombres,apellidos,direccion,telefono,estadop,usuario,contrasenia,provologio,email);
     response.sendRedirect("AdministradorCliente.jsp");
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

    private String modificaPersona(java.lang.String id, java.lang.String nombres, java.lang.String apellido, java.lang.String direccion, java.lang.String telefono, java.lang.String estado, java.lang.String usuario, java.lang.String contrasenia, java.lang.String provolegio, java.lang.String email) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        hotelws1.NewWebService port = service.getNewWebServicePort();
        return port.modificaPersona(id, nombres, apellido, direccion, telefono, estado, usuario, contrasenia, provolegio, email);
    }



}
