<%-- 
    Document   : prueba2
    Created on : 12-dic-2020, 17:05:22
    Author     : Yutokiva
--%>

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


    <!-- Navbar Start -->
    <div class="container-fluid p-0">
        <nav class="navbar navbar-expand-lg bg-white navbar-light py-3 py-lg-0 px-lg-5">
            <a href="index.html" class="navbar-brand ml-lg-3">
                <h1 class="m-0 text-primary"><span class="text-dark">HOTEL</span> LOS JUANES</h1>
            </a>
            <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                <span class="navbar-toggler-icon"></span>
            </button>
              <div class="collapse navbar-collapse text-capitalize" id="nav-links">
                    <ul class="navbar-nav ml-auto">
                       <li class="nav-item active">
                            <button class="nav-link" onclick="location.href='AdministradorReserva.jsp'">RESERVA </button>
                        </li>
                        <li class="nav-item">
                            <button class="nav-link" onclick="location.href='AdministradorCliente.jsp'">CLIENTE</button>
                        </li>
                        <li class="nav-item">
                        <button class="nav-link" onclick="location.href='Aministradorhabitacion.jsp'">HABITACION</button>
                        </li>
                        

                   
                        
                        
                    </ul>
                         <li class="nav-item">
                          
                            <button onclick="location.href='index.jsp'">CERRAR SESION</button>
                        </li>
                </div>
            </div>
        </nav>
    </div>
    <!-- Navbar End -->

      
        <img src="imgs/fondo.jpg" height="100%" width="100%">
        <div id="contenidoDinamico" class="mt-1" height="60%">
            <center><ul>
                <li>
                    <br><br><br><br>
                    <button onclick="location.href='IngresarResrva.jsp'" >Ingresar Reserva</button><br><br>
                        <button onclick="location.href='mostrarreserva.jsp'" >Mostrar Reserva</button><br><br>
                    <button onclick="location.href='modificarreserva1.jsp'">Modificar Reserva</button><br><br>
                    <button onclick="location.href='eliminarreserva1.jsp'">Eliminar Reserva</button>
                    <br><br>
                    <br><br>
                </li>
            </ul>         
            </center>
        </div>
        
        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-12">
                        <a href="index.html" class="logo"></a>
                    </div>
                    <div class="col-lg-9 col-12">
                        <div class="row">
                            <div class="col-md-4 col-12">
                                <i class="fas fa-map-marker-alt fa-2x"></i>
                                <span>Quito, Ecuador </span>
                            </div>
                            <div class="col-md-4 col-12">
                                <i class="fas fa-phone fa-2x"></i>
                                <span>022222222</span>
                            </div>
                            <div class="col-md-4 col-12">
                                <i class="fas fa-envelope fa-2x"></i>
                                <span>hotelsancarlos@gmail.com</span>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-12">
                        <div class="item">
                            <h4 class="text-capitalize">Información General</h4>
                            <p>El hotel San Carlos esta ubicado en la ciudad de Quito, este brinda el servio de hospedaje segun la necesidad de cada cliente.</p>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-12">
                        <div class="item">
                            <h4 class="text-capitalize">Menu</h4>
                            <ul class='text-capitalize main-list'>
                                <li><a href="#home">Inicio</a></li>
                                <li><a href="#about">Quienes Somos</a></li>
                                <li><a href="#service">Servicios</a></li>
                        
                                <li><a href="#contact">Contactos</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-12">
                        <div class="item">
                            <h4 class="text-capitalize">Metas</h4>
                            <ul class="text-capitalize">
                                <li><a href="#">Cliente Satisfecho</a></li>
                                <li><a href="#">Disfrutar momentos increibles</a></li>
                      
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-3 col-md-6 col-12">
                        <div class="item">
                            <h4 class="text-capitalize">Acerca del Hotel</h4>
                            <form>
                                <input type="text" placeholder="Email">
                                <input type="submit" value="Subscribete">
                            </form>
                        </div>
                    </div>
                </div>
                <ul class="social-media">
                    <li><a href="#"><i class="fab fa-facebook-square fa-2x"></i></a></li>
                    <li><a href="#"><i class="fab fa-twitter-square fa-2x"></i></a></li>
                    <li><a href="#"><i class="fab fa-google-plus-square fa-2x"></i></a></li>
                    <li><a href="#"><i class="fab fa-linkedin fa-2x"></i></a></li>
                </ul>
               
            </div>
        </footer> 
             <%
   String ressult;
   ressult="<script>"
           +" alert('Reserva ingresada correctamente');"
       + "</script>";
   out.print(ressult);
    %>
    </body>
</html>
