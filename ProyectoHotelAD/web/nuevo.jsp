<%-- 
    Document   : nuevo
    Created on : 06-dic-2020, 14:51:21
    Author     : Yutokiva
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
    try {
       
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(new Date()); 




out.println(fecha);
    
        
 


        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
         
    </body>
</html>
