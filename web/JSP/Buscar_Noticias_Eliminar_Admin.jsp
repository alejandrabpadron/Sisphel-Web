<%@page import="Operaciones.Buscar_Proyectos"%>
<%@page import="java.util.Vector"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <style type="text/css">
        <!--
        * {
            margin:0px;
            padding:0px;
        }

        #header {
            margin:auto;
            width:3000px;
            font-family:'Segoe UI';
            font-size: 16px;


        }

        ul, ol {
            list-style:none;
            background-color:#ECECED;
        }

        .nav {
            width: 2790px;
            margin:0 auto;
            background-color:#ECECED;
        }

        .nav > li {
            width:286px;
            float:left;
        }

        .nav li a {
            color:#000;
            width:233px;
            text-decoration:none;
            padding:25px 55px 25px 55px;
            display:block;
        }

        .menu{
            background-color:#64CCF0;
            text-align: center;
            width: 100%;
            padding: 2px 1px 2px 1px;
        }

        .submenu{
            background-color:#e4e4e5;
            width:350px;
            text-align: center;
            font-size: 13px;
        }
        .submenu:hover{
            background-color:#fff;
        }
        .subsubmenu{
            background-color:#ECECED;
            width:350px;
            text-align: center;
            font-size: 13px;

        }
        .subsubmenu:hover{
            background-color:#fff;

        }
        .nav li ul {

            display:none;
            position:absolute;
            min-width:50px;
        }

        .nav li:hover > ul {
            display: block;
        }

        .nav li ul li {
            position:relative;

        }

        .nav li ul li ul {
            right:-350px;
            top:0px;
        }
        .banner{
            margin-top: 30px;
        }
        .logo{
            margin-left: 100px;
        }
        #home{
            margin-left: 600px;
            margin-top: 10px;
        }
        h2{
            font-family: 'MS Gothic';
            font-size: 16px;
            color: #F58634
        }
        .Menu {
            border: none;
            font-family: Arial;
            color: #ffffff;
            font-size: 0px;
            background-color: transparent;
            text-decoration: none;
            padding: 0px 0px 0px 0px;
        }
        .Opcion{
            font-family:'Segoe UI';
            font-size: 16px;
            background-color:#64CCF0;
            text-align: center;
            border: none;
            padding: 8px 18px 8px 18px;
        }
        .Opcion:hover{
            color: #0000;
            border: 2px solid #AAD7F6;
            border-radius: 4px;


        }
        .Opcion2{
            font-family:'Segoe UI';
            font-size: 13px;
            background-color:#e4e4e5;
            text-align: center;
            border: none;
            padding: 8px 18px 8px 18px;
        }
        .Opcion2:hover{

            background-color:#ffffff;

        }
        .Opcion3{
            font-family:'Segoe UI';
            font-size: 13px;
            background-color:#ECECED;
            text-align: center;
            border: none;
            padding: 8px 18px 8px 18px;
        }
        .Opcion3:hover{

            background-color:#ffffff;

        }
        .div_footer{
            font-family: 'Segoe UI';
            font-size: 15px;
            color: #F58634

        }
        footer{
            background-color:#e4e4e5;
            padding: 20px 0px 20px 0px;
        }
        #obj{
            font-family: 'MS Gothic';
            font-size: 18px;
            color: #F58634
        }
        #obj2{
            font-family: 'MS Gothic';
            font-size: 20px;
            color: #00AFEF
        }
        #tabla{
            border: #979797 2px solid;
            margin-top: 17px;
        }
        .Estilo4 {font-size: 12px}
        .Estilo5 {font-family: 'Segoe UI'; font-weight: bold; }
        .Estilo6 {font-family: 'Segoe UI'}
        .Boton{
            font-family: 'Segoe UI';
            font-size: 16px;
            border-radius: 6px;
            padding: 5px 12px 5px 12px;
        }
        .Boton1 {            font-family: 'Segoe UI';
                             font-size: 16px;
                             border-radius: 6px;
                             padding: 5px 12px 5px 12px;
        }
        .Boton2 {            font-family: 'Segoe UI';
                             font-size: 16px;
                             border-radius: 6px;
                             padding: 5px 12px 5px 12px;
        }
        .Boton11 {font-family: 'Segoe UI';
                  font-size: 16px;
                  border-radius: 6px;
                  padding: 5px 12px 5px 12px;
        }
        .Boton12 {font-family: 'Segoe UI';
                  font-size: 16px;
                  border-radius: 6px;
                  padding: 5px 12px 5px 12px;
        }
        .Boton111 {font-family: 'Segoe UI';
                   font-size: 16px;
                   border-radius: 6px;
                   padding: 5px 12px 5px 12px;
        }
        .Boton21 {font-family: 'Segoe UI';
                  font-size: 16px;
                  border-radius: 6px;
                  padding: 5px 12px 5px 12px;
        }
        .Boton13 {font-family: 'Segoe UI';
                  font-size: 16px;
                  border-radius: 6px;
                  padding: 5px 12px 5px 12px;
        }
        .Boton14 {font-family: 'Segoe UI';
                  font-size: 16px;
                  border-radius: 6px;
                  padding: 5px 12px 5px 12px;
        }
        .Boton131 {font-family: 'Segoe UI';
                   font-size: 16px;
                   border-radius: 6px;
                   padding: 5px 12px 5px 12px;
        }
        .Buscar{margin-left: 90px;}
        -->
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Búsqueda de Noticias</title>
        <link rel="icon" type="image/png" href="Img/ICONO.png"/>
                <SCRIPT language="JavaScript" >
            function verificar( servi ){
                servi.Nombre_Pro_GIETRB.focus();
                if ( servi.Nombre_Pro_GIETRB.value == ""){
                    alert( "Faltan el Proyecto a Buscar");
                    servi.Nombre_Pro_GIETRB.focus();
                    return false;
                }
                return true;
            }
        </SCRIPT>
    </head>
    <body>
        <form name="form1" method="post" action="Servlet_Proyectos_Admin">
            <br>
            <div class="logo">
                <img src="/SisphelWeb/Img/LOGO.png" width="500">
                <label>
                    <img src="/SisphelWeb/Img/INICIO.png" id="home"/>
                    <input  type="submit"  name="VolverInicio" value="."class="Menu"/></label>
            </div>
            <br>
            <div id="header">
                <nav>
                    <ul class="nav">
                        <li class="menu"><input  type="submit"  name="Inicio" value="Inicio" class="Opcion"/></li>
                        <li class="menu"><input  type="submit"  name="Grupos" value="Grupos de Investigación" class="Opcion"/>
                            <ul>
                                <li class="submenu"><input  type="submit"  name="GIBM" value="G. I Biomédicas y Biología Molecular" class="Opcion2"/>
                                    <ul>
                                        <li class="subsubmenu"><input  type="submit"  name="ProyectosGIBM" value="Proyectos de Investigación" class="Opcion3"/></li>
                                        <li class="subsubmenu"><input  type="submit"  name="ProduccionGIBM" value="Producción Científica" class="Opcion3"/></li>
                                        <li class="subsubmenu"><input  type="submit"  name="PonenciasGIBM" value="Ponencias y Eventos" class="Opcion3"/></li>
                                        <li class="subsubmenu"><input  type="submit"  name="PremiosGIBM" value="Premios y Distinciones" class="Opcion3"/></li>
                                    </ul>
                                </li>
                                <li class="submenu"><input  type="submit"  name="GIETRB" value="G. I Enfermedades Tropicales y Resistencia Bacteriana" class="Opcion2"/>
                                    <ul>
                                        <li class="subsubmenu"><input  type="submit"  name="ProyectosGIETRB" value="Proyectos de Investigación" class="Opcion3"/></li>
                                        <li class="subsubmenu"><input  type="submit"  name="ProduccionGIETRB" value="Producción Científica" class="Opcion3"/></li>
                                        <li class="subsubmenu"><input  type="submit"  name="PonenciasGIETRB" value="Ponencias y Eventos" class="Opcion3"/></li>
                                        <li class="subsubmenu"><input  type="submit"  name="PremiosGIETRB" value="Premios y Distinciones" class="Opcion3"/></li>
                                    </ul>
                                </li>
                            </ul>
                        </li>
                        <li class="menu"><input  type="submit"  name="Noticias" value="Noticias" class="Opcion"/>
                            <ul>
                                <li class="subsubmenu"><input  type="submit"  name="VerNoticias" value="Ver Noticias" class="Opcion3"/></li>
                                <li class="subsubmenu"><input  type="submit"  name="NuevaNoticia" value="Nueva Noticia" class="Opcion3"/></li>
                                <li class="subsubmenu"><input  type="submit"  name="EditarNoticia" value="Editar Noticia" class="Opcion3"/></li>
                                <li class="subsubmenu"><input  type="submit"  name="EliminarNoticia" value="Eliminar Noticia" class="Opcion3"/></li>
                            </ul>
                        </li>
                        <li class="menu"><input  type="submit"  name="Contacto" value="Contacto" class="Opcion"/></li>
                    </ul>
                </nav>
            </div>
            <br>
            <div id ="obj">
                <br>
                &nbsp;&nbsp;
                <h1 align="center">ELIMINAR NOTICIA</h1></div>
            <br>
            <div id="obj2">
                <h3 align="center">Búsqueda de Noticia a Eliminar</h3>
            </div><p>&nbsp;</p>

        </form>
        <form name="servi" method="post" action="Servlet_Proyectos_Admin"onSubmit="return verificar(this)">
            <p><span class="Boton1">

                    <label>
                        <div class="Buscar">
                            <span class="Boton12">
                                <span class="Boton111">
                                    <input name="Nombre_Noticias" type="text" class="Boton21" id="Nombre_Noticias" placeholder="Noticia...">
                                </span>
                            </span>
                            <span class="Boton14"><span class="Boton131">
                                    <input name="Buscar_Eliminar" type="submit" id="Buscar_Eliminar" value="Buscar" class="Boton131"/>
                                </span>
                            </span>
                        </div>
                    </label>
                    <div align="center"></div>
                </span></p>
        </form>
    </body>
    <br>
    <footer>
        <div align="center" class="div_footer">

            <h5>Laboratorio de Investigaciones Biomédicas y Biología Molecular - Universidad del Sinú - Elías Bechara Zainúm Seccional Montería</h5>
            <h5>Cra. 1w No. 38-153 Barrio Juan XXIII, Montería Córdoba - PBX: +4 781 1717</h5>
            <h5>email: sisphelsoft@gmail.com</h5>
            <h5></h5>
            <h5> Montería - Colombia</h5>

        </div>
    </footer>
</html>
