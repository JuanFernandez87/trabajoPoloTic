<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Datos ingresados</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->	
	<link rel="icon" type="image/png" href="images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/util.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
</head>
<body>
	
	<div class="limiter">
		<div class="container-login100" style="background-image: url('images/parque.jpg');">
			<div class="wrap-login100 p-t-190 p-b-30">
				<form class="login100-form validate-form" action="VenderEntrada" method="POST">
        <div class="container-login100-form-btn p-t-10">
        <h1 class="login100-form-btn">Se registro el siguiente juego:
        </h1>
        </div>    
        <div class="container-login100-form-btn p-t-10">                            
        <p class="login100-form-btn">Nombre del juego: <%=session.getAttribute("nombreJuego")%> 
        </p>
        </div>
        <div class="container-login100-form-btn p-t-10">
        <p class="login100-form-btn">Hora de inicio: <%=session.getAttribute("inicioJuego")%>
        </p>
        </div>
        <div class="container-login100-form-btn p-t-10">
        <p class="login100-form-btn">Hora de fin: <%=session.getAttribute("finJuego")%>
        </p>
        </div>
        <div class="container-login100-form-btn p-t-10">
        <p class="login100-form-btn">Capacidad: <%=session.getAttribute("capacidadJuego")%>
        </p>
        </div>

					<div class="container-login100-form-btn p-t-10">
						<a class="login100-form-btn" href="MenuPrincipal.jsp" target="_self">
							Volver a pantalla principal
						</a>
					</div>        
                                                                        
				</form>
			</div>
		</div>
	</div>
	
	

	
<!--===============================================================================================-->	
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>
