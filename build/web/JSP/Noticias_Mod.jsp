<%@page import="Operaciones.Consultar_Noticias"%>
<%@page import="java.util.Vector"%>
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
        .Estilo6 {
            font-family: 'Segoe UI';
            font-size: 12px;
        }
        .Boton{
            font-family: 'Segoe UI';
            font-size: 16px;
            border-radius: 6px;
            padding: 5px 12px 5px 12px;
        }
        .Cajas{
            padding-top: 3px;
            padding-bottom: 3px;
            font-size: 16px;
            font-family: 'Segoe UI'
        }
        #div_noticia{
            width: 1100px;
            outline: 5px double #E9E7E7;
            outline-offset: 8px;
            border-radius: 8px;

        }
        .Estilo7 {font-family: 'Segoe UI'; font-size: 16px; }
        .Estilo8 {
            color: #FF6600;
            font-weight: bold;
        }
        .Estilo9 {font-family: 'Segoe UI'; font-size: 12px; color: #333333; }
        .Estilo11 {color: #FFFFFF}
        .div_footer{
            font-family: 'Segoe UI';
            font-size: 15px;
            color: #F58634

        }
        footer{
            background-color:#e4e4e5;
            padding: 20px 0px 20px 0px;
        }

        -->
    </style>
    <head>
        <title>Noticias</title>
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
            <center>
                <div id="header">
                    <nav>
                        <ul class="nav">
                            <li class="menu"><input  type="submit"  name="Inicio" value="Inicio" class="Opcion"/></li>
                            <li class="menu"><input  type="submit"  name="Grupos" value="Grupos de Investigaci�n" class="Opcion"/>
                                <ul>
                                    <li class="submenu"><input  type="submit"  name="GIBM" value="G. I Biom�dicas y Biolog�a Molecular" class="Opcion2"/>
                                        <ul>
                                            <li class="subsubmenu"><input  type="submit"  name="ProyectosGIBM" value="Proyectos de Investigaci�n" class="Opcion3"/></li>
                                            <li class="subsubmenu"><input  type="submit"  name="ProduccionGIBM" value="Producci�n Cient�fica" class="Opcion3"/></li>
                                            <li class="subsubmenu"><input  type="submit"  name="PonenciasGIBM" value="Ponencias y Eventos" class="Opcion3"/></li>
                                            <li class="subsubmenu"><input  type="submit"  name="PremiosGIBM" value="Premios y Distinciones" class="Opcion3"/></li>
                                        </ul>
                                    </li>
                                    <li class="submenu"><input  type="submit"  name="GIETRB" value="G. I Enfermedades Tropicales y Resistencia Bacteriana" class="Opcion2"/>
                                        <ul>
                                            <li class="subsubmenu"><input  type="submit"  name="ProyectosGIETRB" value="Proyectos de Investigaci�n" class="Opcion3"/></li>
                                            <li class="subsubmenu"><input  type="submit"  name="ProduccionGIETRB" value="Producci�n Cient�fica" class="Opcion3"/></li>
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
            </center>
            <br>
            <div id ="obj">
                <br>
                &nbsp;&nbsp;
                <h1 align="center">NOTICIAS</h1></div>
            <br>

        </form>
        <form name="servi" method="post" action="Servlet_Proyectos_Admin"onSubmit="return verificar(this)">

            <%Vector e;
                        e = (Vector) request.getAttribute("Noticias");

                        for (int i = 0; i < e.size(); i++) {

                            Consultar_Noticias p = (Consultar_Noticias) e.get(i);

            %>
            <div id="sfcsnc87bsbukmn7y7h29e38d639w5422l3"></div>
            <script type="text/javascript" src="https://counter8.freecounter.ovh/private/counter.js?c=snc87bsbukmn7y7h29e38d639w5422l3&down=async" async></script>
            <noscript><a href="" title=""></a></noscript>

            <center><div id="div_noticia">

                    <br>
                    <p align="left" class="Estilo9">Fecha de publicacion: <span class="Estilo8"><%=p.getFecha2()%></span></p>
                    <br>
                    <div id="obj2">
                        <h3 align="left"><%=p.getTitulo()%></h3>
                    </div>
                    <br>
                    <p align="left" class="Estilo6">Escrito por<span class="Estilo8"> <%=p.getCodigo()%></span></p>
                    <br>
                    <br>
                    <center><img src="/SisphelWeb/Img/Imagen.jpg" width=""></center>
                    <br>
                    <br>
                    <p align="justify" class="Estilo7"><%=p.getCuerpo()%></p>
                </div>
            </center>
            <br>
            <br>
            <%            }
            %>
        </form>
    </body>
    <br>
    <footer>
        <div align="center" class="div_footer">

            <h5>Laboratorio de Investigaciones Biom�dicas y Biolog�a Molecular - Universidad del Sin� - El�as Bechara Zain�m Seccional Monter�a</h5>
            <h5>Cra. 1w No. 38-153 Barrio Juan XXIII, Monter�a C�rdoba - PBX: +4 781 1717</h5>
            <h5>email: sisphelsoft@gmail.com</h5>
            <h5></h5>
            <h5> Monter�a - Colombia</h5>

        </div>
    </footer>
</html>
