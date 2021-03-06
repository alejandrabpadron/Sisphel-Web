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
        .Estilo6 {font-family: 'Segoe UI'}
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
        }
        #hellobar-bar {
            font-family: "Open Sans", sans-serif;
            width: 100%;
            margin: 0;
            height: 30px;
            display: table;
            font-size: 20px;
            font-weight: 400;
            padding: .33em .5em;
            -webkit-font-smoothing: antialiased;
            color: #5c5e60;
            position: fixed;
            background-color: white;
            box-shadow: 0 1px 3px 2px rgba(0,0,0,0.15);
        }
        #hellobar-bar.regular {
            height: 30px;
            font-size: 14px;
            padding: .2em .5em;
        }
        .hb-content-wrapper {
            text-align: center;
            text-align: center;
            position: relative;
            display: table-cell;
            vertical-align: middle;
        }
        .hb-content-wrapper p {
            margin-top: 0;
            margin-bottom: 0;
        }
        .hb-text-wrapper {
            margin-right: .67em;
            display: inline-block;
            line-height: 1.3;
        }
        .hb-text-wrapper .hb-headline-text {
            font-size: 1em;
            display: inline-block;
            vertical-align: middle;
        }
        #hellobar-bar .hb-cta {
            display: inline-block;
            vertical-align: middle;
            margin: 5px 0;
            color: #ffffff;
            background-color: #22af73;
            border-color: #22af73
        }
        .hb-cta-button {
            opacity: 1;
            color: #fff;
            display: block;
            cursor: pointer;
            line-height: 1.5;
            max-width: 22.5em;
            text-align: center;
            position: relative;
            border-radius: 3px;
            white-space: nowrap;
            margin: 1.75em auto 0;
            text-decoration: none;
            padding: 0;
            overflow: hidden;
        }
        .hb-cta-button .hb-text-holder {
            border-radius: inherit;
            padding: 5px 15px;
        }
        .hb-close-wrapper {
            display: table-cell;
            width: 1.6em;
        }
        .hb-close-wrapper .icon-close {
            font-size: 14px;
            top: 15px;
            right: 25px;
            width: 15px;
            height: 15px;
            opacity: .3;
            color: #000;
            cursor: pointer;
            position: absolute;
            text-align: center;
            line-height: 15px;
            z-index: 1000;
            text-decoration: none;
        }
        -->
    </style>
    <head>
<SCRIPT language="JavaScript" >
            function verificar( servi ){
                servi.Evento_Ponencia_GIBM.focus();
                if ( servi.Evento_Ponencia_GIBM.value == ""){
                    alert( "Faltan el Evento");
                    servi.Evento_Ponencia_GIBM.focus();
                    return false;
                }
                if ( servi.Ciudad_Ponencia_GIBM.value == ""){
                    alert( "Falta la Ciudad" );
                    servi.Ciudad_Ponencia_GIBM.focus();
                    return false;
                }
                if ( servi.Pais_Ponencia_GIBM.value == ""){
                    alert( "Falta el País" );
                    servi.Pais_Ponencia_GIBM.focus();
                    return false;
                }
                return true;
            }
        </SCRIPT>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script type="text/javascript">
            document.oncontextmenu = function() {
                return false;
            }
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nueva Ponencia o Evento</title>
        <link rel="icon" type="image/png" href="Img/ICONO.png"/>
    </head>
    <body>
        <form name="form1" method="post" action="Servlet_Proyectos_Admin">
            <div id="hellobar-bar" class="regular closable">
                <div class="hb-content-wrapper">
                    <div class="hb-text-wrapper">
                        <div class="hb-headline-text">
                            <p><span>Para una mejor experiencia, recomendamos no utilizar acentos y ñ.</span></p>
                        </div>
                    </div>
                </div>
                <div class="hb-close-wrapper">
                    <a href="javascript:void(0);" class="icon-close" onclick="$('#hellobar-bar').fadeOut()">✖</a>
                </div>
            </div>
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
                <h1 align="center">NUEVA PONENCIA O EVENTO</h1></div>
            <br>
            <div id="obj2">
                <h3 align="center">Grupo de Investigaciones Biomédicas y Biología Molecular</h3>
            </div>
        </form>
        <form name="servi" method="post" action="Servlet_Proyectos_Admin"onSubmit="return verificar(this)">
            <center><div>
                    <p>&nbsp;</p>
                    <p>&nbsp;</p>
                    <table width="1034" height="214" align="center">
                        <tr>
                            <td width="300" height="40" bgcolor="#CCCCCC" class="Estilo6"><div align="center"><strong>EVENTO:</strong></div></td>
                            <td width="250" height="40" class="Estilo6"><label>

                                    <div align="left">
                                        <input name="Evento_Ponencia_GIBM" type="text" id="Evento_Ponencia_GIBM" size="100" maxlength="150" class="Cajas" placeholder="Evento o ponencia...">
                                    </div>
                                </label></td>
                        </tr>
                        <tr>
                            <td width="300" height="40" bgcolor="#CCCCCC" class="Estilo6"><div align="center"><strong>AÑO:</strong></div></td>
                            <td width="250" height="40" class="Estilo6"><label>

                                    <div align="left">
                                        <input name="Ano_Ponencia_GIBM" type="text" class="Cajas" id="Ano_Ponencia_GIBM" size="10" maxlength="4" placeholder="Escribe el año...">
                                    </div>
                                </label></td>
                        </tr>
                        <tr>
                            <td width="300" height="40" bgcolor="#CCCCCC" class="Estilo6"><div align="center"><strong>CIUDAD:</strong></div></td>
                            <td width="250" height="40" class="Estilo6"><label>

                                    <div align="left">
                                        <input name="Ciudad_Ponencia_GIBM" type="text" class="Cajas" id="Ciudad_Ponencia_GIBM" size="30" maxlength="30" placeholder="Escribe la ciudad...">
                                    </div>
                                </label></td>
                        </tr>
                        <tr>
                            <td height="40" bgcolor="#CCCCCC" class="Estilo6"><div align="center"><strong>PAÍS:</strong></div></td>
                            <td height="40" class="Estilo6"><input name="Pais_Ponencia_GIBM" type="text" class="Cajas" id="Pais_Ponencia_GIBM" size="30" maxlength="30" placeholder="Escribe el país..."></td>
                        </tr>
                        <tr>
                            <td height="40" bgcolor="#CCCCCC" class="Estilo6"><div align="center"><strong>GRUPO:</strong></div></td>
                            <td height="40" class="Estilo6"><input name="Grupo_Ponencia_GIBM" type="text" class="Cajas" id="Grupo_Ponencia_GIBM" value="01" size="3" maxlength="3" readonly="readonly"></td>
                        </tr>
                    </table>
                    <p>&nbsp;</p>
                </div>
            </center>
            <p align="center" class="Boton">
                <label><span class="Boton">
                        <input name="Guardar_Ponencia_GIBM" type="submit" id="Guardar_Ponencia_GIBM" value="Guardar" class="Boton" onclick="alert('Nueva ponencia agregada exitosamente')"/>
                    </span></label>
                <label></label>
                <label></label>
            </p>
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
