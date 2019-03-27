<%@page import="Operaciones.Consultar_Produccion"%>
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
        -->
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Producción Científica</title>
        <link rel="icon" type="image/png" href="Img/ICONO.png"/>
    </head>
    <body>
        <form name="form1" method="post" action="Servlet_Proyectos_Mod">
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
                <h1 align="center">PRODUCCIÓN CIENTÍFICA</h1></div>
            <br>
            <div id="obj2">
                <h3 align="center">Grupo de Investigaciones en Enfermedades Tropicales y Resistencia Bacteriana</h3>
            </div>
            <center><div>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>
                    <table border="1" width=1146 id="tabla" style="border-collapse: collapse">
                        <tr>
                            <td width="199" height="30" bgcolor="#CCCCCC"><div align="center" class="Estilo5">
                                    <div align="center">AUTORES</div>
                          </div></td>
                          <td width="301" height="30" bgcolor="#CCCCCC"><div align="center" class="Estilo5">TÍTULO</div></td>
                            <td width="195" height="30" bgcolor="#CCCCCC"><div align="center" class="Estilo5">
                                    <div align="center">REVISTA-JOURNAL</div>
                          </div></td>
                          <td width="185" height="30" bgcolor="#CCCCCC"><div align="center" class="Estilo5">TIPO DE PUBLICACIÓN</div></td>
                            <td width="95" height="30" bgcolor="#CCCCCC"><div align="center" class="Estilo5">
                                    <div align="center">AÑO</div>
                          </div></td>
                          <td width="129" height="30" bgcolor="#CCCCCC"><div align="center" class="Estilo5">SITIO WEB</div></td>
                        </tr>
                        <%Vector e;
                                    e = (Vector) request.getAttribute("Produccion");

                                    for (int i = 0; i < e.size(); i++) {

                                        Consultar_Produccion p = (Consultar_Produccion) e.get(i);


                        %>
                        <tr>
                            <td><div align="center" class="Estilo6"><span class="Estilo6"><%=p.getAutores()%></span></div></td>
                            <td><div align="center" class="Estilo6"><%=p.getTitulo()%></div></td>
                            <td><div align="center" class="Estilo6"><span class="Estilo6"><%=p.getRevista()%></span></div></td>
                            <td><div align="center" class="Estilo6"><%=p.getTipo()%></div></td>
                            <td><div align="center" class="Estilo6"><span class="Estilo6"><%=p.getAño()%></span></div></td>
                            <td><div align="center" class="Estilo6"><a href="http://<%=p.getUrl()%>">Ver producción</a></div></td>
                        </tr>
                        <%
                                    }
                        %>
                    </table>
                    <p>&nbsp;</p>
                </div>
            </center>
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
