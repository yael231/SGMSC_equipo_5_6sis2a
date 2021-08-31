<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style><%@include file="/WEB-INF/css/style.css"%></style>
<meta charset="UTF-8">
<title>Inicio de Sesión</title>
</head>
<body>
	<form action="musuario" method="post">
		<input type="hidden" name="tipo" value="iniciarSesion" />
		<input type="button" value="Registrarse" />
	
	<div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>CITA<span>MEDICA</span></div>
		</div>
		<br>
		<div class="login">
				<input type="text" placeholder="USUARIO" name="user"><br>
				<input type="password" placeholder="CONTRASEÑA" name="pass"><br>
				<input type="submit" value="Iniciar sesion">
				<a href="Insertar.jsp"><input type="button" value="Registratse"></a>
		</div>
		<div>
			<p>
				<%
					String resultado = (String)request.getAttribute("mensaje");
					String mensaje = "";
					if (resultado != null) {
						mensaje = resultado;
					}
				%>
				<%=mensaje %>
			</p>
		</div>
	</form>
</body>
</html>