<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>

<%--Template obtenido de la pagina bootsnip del usuario ziaazain - https://bootsnipp.com/snippets/zD9xl--%>

<!DOCTYPE html>
<html>
    <head>
        <title>CLINET - Login</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

        <link rel="stylesheet" href="/resources/css/style.css">
        <script type="text/javascript" src="/resources/js/app.js"></script>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/jQuery-Flip/1.0.18/jquery.flip.js"></script>
    </head>

    <body class="main">
    <div class="login-screen"></div>
    <div class="login-center">
        <div class="container min-height" style="margin-top: 20px;">
            <div class="row">
                <div class="col-xs-4 col-md-offset-8">
                    <div class="login" id="card">
                        <div class="front signin_form">
                            <p>Iniciar Sesión</p>
                            <form class="login-form">
                                <div class="form-group">
                                    <div class="input-group">
                                        <input type="email" class="form-control" placeholder="Correo">
                                        <span class="input-group-addon">
                                          <i class="glyphicon glyphicon-user"></i>
                                      </span>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <div class="input-group">
                                        <input type="password" class="form-control" placeholder="Contraseña">
                                        <span class="input-group-addon">
                                          <i class="glyphicon glyphicon-lock"></i>
                                      </span>
                                    </div>
                                </div>
                                <div class="checkbox">
                                    <label><input type="checkbox">Recordar contraseña.</label>
                                </div>

                                <div class="form-group sign-btn">
                                    <input type="submit" class="btn" value="Iniciar sesión">
                                    <p><a href="#" class="forgot">¿No puedes acceder a tu cuenta?</a></p>
                                    <p><strong>¿Nuevo usando Clinet?</strong><br><a href="<s:url value="/create"></s:url>" id="flip-btn" class="signup signup_link">Registrate</a></p>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </body>
</html>