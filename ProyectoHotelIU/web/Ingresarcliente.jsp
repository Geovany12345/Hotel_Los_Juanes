<%-- 
    Document   : Ingresarcliente
    Created on : 27-nov-2020, 18:26:27
    Author     : Yutokiva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Hotel San Carlos</title>
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
                            <a class="nav-link" href="AdministradorCliente.jsp">Regresar<span class="sr-only">(current)</span></a>
                        </li>
                        
                        
                   
            </div>
                </nav>
                <img src="imgs/fondo.jpg" height="100%" width="100%">
                <h1> Formulario de Registro del Cliente</h1>
           
              <form action="registrarse1">
 <div class="form-group"> <!-- Full Name -->
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
        <input type="email" class="form-control" id="correo" name="correo" placeholder="example@gmail.com">
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
