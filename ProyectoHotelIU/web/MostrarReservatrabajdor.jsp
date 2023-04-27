<%-- 
    Document   : MostrarReservatrabajdor
    Created on : 04-dic-2020, 20:05:52
    Author     : Yutokiva
--%>

<%@page import="servelet.reservaiu"%>
<%@page import="proyectohotel.reservalista"%>
<%@page import="com.google.gson.Gson"%>
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
    <body>
           <!-- Topbar Start -->
    <div class="container-fluid bg-light d-none d-lg-block">
        <div class="row py-2 px-lg-5">
            <div class="col-lg-6 text-left mb-2 mb-lg-0">
                <div class="d-inline-flex align-items-center">
                    <small><i class="fa fa-phone-alt mr-2"></i>+593993816446</small>
                   
                    
                </div>
            </div>
            <div class="col-lg-6 text-right">
                <div class="d-inline-flex align-items-center">
                    <a class="text-primary px-2" href="https://www.facebook.com/hotellosjuanes">
                        <i class="fab fa-facebook-f"></i>
                    </a>
                    
                </div>
            </div>
        </div>
    </div>
    <!-- Topbar End -->

       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
        <title>Hotel Los Juanes</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/fontawesome.min.css">
        <link rel="stylesheet" href="css/style.css">
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
                            <a class="nav-link" href="reservatrabajdorprincipal.jsp">REGRESAR <span class="sr-only">(current)</span></a>
                        </li>
                        
                        
                   
            </div>
                </nav>
                <img src="imgs/fondo.jpg" height="100%" width="100%">
                 <%-- start web service invocation --%><hr/>
                     <%-- start web service invocation --%><hr/>
    <%
    try {
	Gson gson = new Gson();
        String resultfinal;
        hotelws1.NewWebService_Service service = new hotelws1.NewWebService_Service();
	hotelws1.NewWebService port = service.getNewWebServicePort();
	// TODO process result here
	java.lang.String result = port.obtenertodasreservan();

        reservalista personaReporte = gson.fromJson(result,reservalista.class);
        reservaiu per= new reservaiu();
        
        per.setRecursoi(personaReporte.getReservas());
    
        resultfinal = per.toHTML2();
 

out.print(resultfinal);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

            </center></body>
</html>
