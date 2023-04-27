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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import proyectohotel.personas;
import proyectohotel.personaslista;

/**
 *
 * @author Yutokiva
 */
@WebServlet(name = "iniciarsecionfinal", urlPatterns = {"/iniciarsecionfinal"})
public class iniciarsecionfinal extends HttpServlet {

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
      response.setContentType("text/html;charset=UTF-8");
         String usuario=request.getParameter("usuario");
      String contra=request.getParameter("contra");
      String result=inicarsecion(usuario,contra);
      
     
      Gson gson=new Gson();
      personaslista per=gson.fromJson(result,personaslista.class);
    iniciarsecioniu per1 = new iniciarsecioniu();
        
        per1.setRecursoi(per.getPersona());
        personas pers=new personas();
        String privilegio=per1.privilegio();
     if (privilegio.equals("Cliente"))
     {
         response.sendRedirect("cliente.jsp");
     }
      else if("Administrador".equals(privilegio))
     {
         response.sendRedirect("administrador.jsp");
     } else if("Error".equals(privilegio)){
          response.sendRedirect("Registrarse.jsp");
      }  

    }

    private String inicarsecion(java.lang.String uaurio, java.lang.String name) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        hotelws1.NewWebService port = service.getNewWebServicePort();
        return port.inicarsecion(uaurio, name);
    }
    
    
}

