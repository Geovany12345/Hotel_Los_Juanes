<%-- 
    Document   : AdministradorReserva
    Created on : 27-nov-2020, 18:11:50
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
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="index.html"><img src="imgs/Logo.png" alt="#" /></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#nav-links" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
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
    </body>
</html>
