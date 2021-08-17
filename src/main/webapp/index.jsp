<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="author" content="Yinka Enoch Adedokun">
    <style><%@include file="/WEB-INF/css/style.css"%></style>
	<title>Login Page</title>
</head>
<body>
<div class="row">
    <div class="col-md-6 mx-auto p-0">
        <div class="card">
            <div class="login-box">
                <div class="login-snip"> <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Iniciar sesion</label> <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Registrarse</label>
                    <div class="login-space">
                        <div class="login">
                            <div class="group"> <label for="user" class="label">Nombre</label> <input id="user" type="text" class="input" placeholder="nombre completo"> </div>
                            <div class="group"> <label for="pass" class="label">Contraseña</label> <input id="pass" type="password" class="input" data-type="password" placeholder="contraseña"> </div>
                            <div class="group"> <input id="check" type="checkbox" class="check" checked> <label for="check"><span class="icon"></span> Mantener mi sesion abierta</label> </div>
                            <div class="group"> <input type="submit" class="button" value="Sign In"> </div>
                            <div class="hr"></div>
                            <div class="foot"> <a href="#">Olvidaste Tu Contraseña?</a> </div>
                        </div>
                        <div class="sign-up-form">
                            <div class="group"> <label for="user" class="label">Nombre</label> <input id="user" type="text" class="input" placeholder="nombre completo"> </div>
                            <div class="group"> <label for="pass" class="label">contraseña</label> <input id="pass" type="password" class="input" data-type="password" placeholder="contraseña"> </div>
                            <div class="group"> <label for="pass" class="label">Repetir contraseña </label> <input id="pass" type="password" class="input" data-type="password" placeholder="repetir contraseña"> </div>
                            <div class="group"> <label for="pass" class="label">Correo Electronico</label> <input id="pass" type="text" class="input" placeholder="correo electronico"> </div>
                            <div class="group"> <input type="submit" class="button" value="REGISTRARSE"> </div>
                            <div class="hr"></div>
                            <div class="foot"> <label for="tab-1">Hospital</label> </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>