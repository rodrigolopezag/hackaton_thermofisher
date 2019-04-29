<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!-- =======================================================
Theme Name: Medilab
Theme URL: https://bootstrapmade.com/medilab-free-medical-bootstrap-theme/
Author: BootstrapMade.com
Author URL: https://bootstrapmade.com
======================================================= -->
<%--Todos los derechos reservados al autor--%>

<!DOCTYPE html>
<html>
    <head>
        <title>CLINET - Home</title>
        <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Open+Sans|Raleway|Candal">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
        <%--<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">--%>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="/resources/css/style.css">
    </head>

    <body id="myPage" data-spy="scroll" data-target=".navbar" data-offset="60">
    <section id="banner" class="banner">
        <div class="bg-color">
            <nav class="navbar navbar-default navbar-fixed-top">
                <div class="container">
                    <div class="col-md-12">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="#"><img src="https://cdn.discordapp.com/attachments/441657856392036363/572303210233200640/unknown.png" class="img-responsive" style="width: 140px; margin-top: -16px;"></a>
                        </div>
                        <div class="collapse navbar-collapse navbar-right" id="myNavbar">
                            <ul class="nav navbar-nav">
                                <li class="active"><a href="<s:url value="/"></s:url>">Home</a></li>
                                <li class=""><a href="#service">Búsqueda</a></li>
                                <li class=""><a href="#about">Información</a></li>
                                <li class=""><a href="<s:url value="/login"></s:url>">Login</a></li>
                                <li class=""><a href="<s:url value="/create"></s:url>">Register</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </nav>
            <div class="container">
                <div class="row">
                    <div class="banner-info">
                        <div class="banner-logo text-center">
                            <img src="https://cdn.discordapp.com/attachments/441657856392036363/572303210233200640/unknown.png" class="img-responsive" style="width: 500px;">
                        </div>
                        <div class="banner-text text-center">
                            <h1 class="white">Una red de clínicas</h1>
                            <p>Un servicio que te brinda las necesidades que no tienes en tus clínicas.</p>
                            <%--<a href="#contact" class="btn btn-appoint">Make an Appointment.</a>--%>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    </body>
</html>