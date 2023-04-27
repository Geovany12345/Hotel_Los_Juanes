<%-- 
    Document   : modificarreserva
    Created on : 30-nov-2020, 18:07:24
    Author     : Yutokiva
--%>

<%@page import="servelet.clienteiuicedula"%>
<%@page import="proyectohotel.personaslista"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="servelet.obtenerhabitacioniu"%>
<%@page import="proyectohotel.habitacionlista"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <meta charset="utf-8">
    <title>HOTEL “LOS JUANES”</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="Free HTML Templates" name="keywords">
    <meta content="Free HTML Templates" name="description">

    <!-- Favicon -->
    <link href="img/l1.jpg" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet">

    <!-- Font Awesome -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/animate/animate.min.css" rel="stylesheet">
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">
    <link href="lib/tempusdominus/css/tempusdominus-bootstrap-4.min.css" rel="stylesheet" />

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
</head>
    <body bgcolor="#C0C0C0">
            <center>
                <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="index.html"><img src="imgs/Logo.png" alt="#" /></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#nav-links" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse text-capitalize" id="nav-links">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="AdministradorReserva.jsp">Regresar<span class="sr-only">(current)</span></a>
                        </li>
                        
                        
                   
            </div>
                </nav>
                <img src="imgs/fondo.jpg" height="100%" width="100%">
        
           
             <form action="modificarreserv">
                  <div class="form-group"> <!-- Full Name -->
        <label for="full_name_id" class="control-label">Id Reserva</label>
        <input type="text" class="form-control" id="descripcion" name="id_reserva" placeholder="1">
    </div> 
                                      <%
    try {
       String result;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(new Date()); 
result="<div class=\"form-group\">" 
       +" <label for=\"street2_id\" class=\"control-label\" >Fecha de Reserva</label>"
       +" <input type=\"String\" class=\"form-control\" readonly=\"false\" id=\"street2_id\" name=\"fechaactual\" value="+fecha+">"
    +"</div>    "  ;
out.println(result);
  
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    
                 
  <%
    try {
	Gson gson = new Gson();
        String resultfinal;
        hotelws1.NewWebService_Service service = new hotelws1.NewWebService_Service();
	hotelws1.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.obtenertotadaspersonas();

        personaslista personaReporte = gson.fromJson(result,personaslista.class);
        clienteiuicedula per= new clienteiuicedula();
        
        per.setRecursoi(personaReporte.getPersona());
    
        resultfinal = per.toHTML2();
 

out.print(resultfinal);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    
            <%
    try {
	Gson gson = new Gson();
        String resultfinal;
        hotelws1.NewWebService_Service service = new hotelws1.NewWebService_Service();
	hotelws1.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.obtenerTodasHabitacion();

        habitacionlista personaReporte = gson.fromJson(result,habitacionlista.class);
        obtenerhabitacioniu per= new obtenerhabitacioniu();
        
        per.setRecursoi(personaReporte.getHabitaciones());
        
        resultfinal = per.toHTML2();
 
       
out.print(resultfinal);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    
    
    
  
                       <%
    try {
       String result;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = sdf.format(new Date()); 
result=
         "<div class=\"form-group\"> "
        +"<label for=\"street2_id\" class=\"control-label\" >Desde</label>"
       +" <input type=\"string\" class=\"form-control\" id=\"street2_id\"  step=\"1\" value='"+fecha+"'  name=\"fechareserva\"  placeholder=\"27/10/2020\">"
    +"</div>" 
       + "<div class=\"form-group\"> "
       + "<label for=\"street2_id\" class=\"control-label\">Hasta</label>"
       + "<input type=\"string\" class=\"form-control\" id=\"street2_id\" value="+fecha+" step=\"1\" name=\"fechaareserva\" >"
    +"</div>"  ;
out.println(result);
  
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    
  


                            
       
                                     
                        

    <div class="form-group"> <!-- Submit Button -->
        <button type="submit" class="btn btn-primary">Guardar</button>
         
    
     </div>  
    </div></form></center>
                 

    </body>
</html>
