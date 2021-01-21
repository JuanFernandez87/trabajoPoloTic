<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            HttpSession missesion = request.getSession();
            String usu = (String) request.getSession().getAttribute("usuario");
        if (usu == null){
            response.sendRedirect("Login_error.jsp");
        }
        else{
        %>    
        
        <h1>Hello World!</h1>
        
        <form action="PruebaServlet" method="POST"> 
            
            Nombre: <INPUT type="texto" name="nombre"> <BR><BR>
            Edad: <INPUT type="texto" name="edad">
            
            <INPUT type="submit" name="Enviar">
        
        </form>
        
        <% }
            
        %>
        
    </body>
</html>
