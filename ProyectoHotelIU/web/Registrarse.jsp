<%-- 
    Document   : Registrarse
    Created on : 26-nov-2020, 21:28:37
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
            <center>
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

                <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="index.html"><img src="imgs/Logo.png" alt="#" /></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#nav-links" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse text-capitalize" id="nav-links">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item active">
                            <a class="nav-link" href="index.jsp">INICIO <span class="sr-only">(current)</span></a>
                        </li>
                        
                        
                   
            </div>
                </nav>
                <img src="imgs/fondo.jpg" height="100%" width="100%">
                <h1> Formulario de Registro</h1>
           
                <form action="registrar">
 <div div class="form-group"> <!-- Full Name -->
        <label for="full_name_id" class="control-label">Cèdula</label>
        <input type="text" class="form-control" id="cedula" name="identificacionf" placeholder="0104123467">
    </div>    
    <div class="form-group"> <!-- Full Name -->
        <label for="full_name_id" class="control-label">Nombres</label>
        <input type="text" class="form-control" id="nombres" name="nombres" placeholder="John">
    </div>    

    <div class="form-group"> <!-- Street 1 -->
        <label for="street1_id" class="control-label">Apellidos</label>
        <input type="text" class="form-control" id="apellidos" name="apellidos" placeholder="Carrazco">
    </div>                    
                            
    <div class="form-group"> <!-- Street 2 -->
        <label for="street2_id" class="control-label">Dirección</label>
        <input type="text" class="form-control" id="direccion" name="direccion" placeholder="Av. Los Shiris">
    </div>    

    <div class="form-group"> <!-- City-->
        <label for="city_id" class="control-label">Teléfono</label>
        <input type="text" class="form-control" id="telefono" name="telefono" placeholder="22222222">
    </div>                                    
                            
    
    <div class="form-group"> <!-- Zip Code-->
        <label for="zip_id" class="control-label">Correo</label>
        <input type="text" class="form-control" id="correo" name="correo" placeholder="example@gmail.com">
    </div>     
                 <div class="form-group"> <!-- Zip Code-->
        <label for="zip_id" class="control-label">Usuario</label>
        <input type="text" class="form-control" id="usuario" name="usuario" placeholder="Juan">
    </div>        
    
                 <div class="form-group"> <!-- Zip Code-->
        <label for="zip_id" class="control-label">Contraseñaa</label>
        <input type="password" class="form-control" id="contrasenia" name="contrasenia" placeholder="*******">
    </div>        
             <label for="zip_id" class="control-label">privilegio</label>
             <input type="text" class="form-control" id="contrasenia" name="privilegio" value="Cliente" readonly="false">      
                
    </div>     
    <div class="form-group"> <!-- Submit Button -->
        <button type="submit" class="btn btn-primary" id="btningresarcliente" onclick="Guardarcliente()" >Guardar</button>
         
    
     </div>    

</form>
      
                     
    </center>   
    </body>
</html>
