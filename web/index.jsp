<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SISPHEL | Inicio de Sesión</title>
        <link rel="icon" type="image/png" href="Img/ICONO.png"/>
        <style type="text/css">
            <!--
            .Menu {
                border: none;
                font-family: Arial;
                color: #ffffff;
                font-size: 0px;
                background-color: transparent;
                text-decoration: none;
                padding: 0px 0px 0px 0px;
            }
            .Ingresar{
                position: absolute; 
                top: 490px;
                left: 570px;
            }
            .Invitado{
                position: absolute;
                top: 470px; left: 730px;
            }
            .Cajas{
                text-align: center;
                font-family: 'MS Gothic';
                font-size: 16px;
                padding: 3px 15px 3px 15px;
            }
            body{
                margin: 0;
                padding: 0;
                width: 100%;
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

        <SCRIPT language="JavaScript" >
            function verificar( servi ){
                servi.login.focus();
                if ( servi.login.value == ""){
                    alert( "Falta el nombre del Usuario");
                    servi.login.focus();
                    return false;
                }
                if ( servi.pwd.value == ""){
                    alert( "Falta la Contraseña" );
                    servi.pwd.focus();
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

    </head>

    <body background="Imagenes/fondo.jpg">
        <form name="servi" method="post" action="VerificaLogin" onSubmit="return verificar(this)">

            <div id="hellobar-bar" class="regular closable">
                <div class="hb-content-wrapper">
                    <div class="hb-text-wrapper">
                        <div class="hb-headline-text">
                            <p><span>Recomendamos utilizar Mozilla Firefox como navegador</span></p>
                        </div>
                    </div>              
                </div>
                <div class="hb-close-wrapper">
                    <a href="javascript:void(0);" class="icon-close" onclick="$('#hellobar-bar').fadeOut()">✖</a>
                </div>
            </div>
            <img style="position: absolute; top: 180px; left: 500px;
                 " src="Img/FRAME.png" width="463" height="446" alt="frame"/>
            <img style="position: absolute; top: 330px; left: 570px;
                 " src="Img/TXT_USER.png" width="336" height="64" alt="txt_user"/>

            <input style="position: absolute; border: none; top: 355px; left: 660px; background-color: #ECECED;
                   " type="text" name="login" id="login" value="" placeholder="Usuario" class="Cajas"/>
            <img style="position: absolute; top: 400px; left: 570px;
                 " src="Img/TXT_PASS.png" width="333" height="63" alt="txt_pass"/>

            <input style="position: absolute; border: none; top: 415px; left: 660px; background-color: #ECECED;
                   " type="password" name="pwd" id="pwd" value="" placeholder="Contraseña" class="Cajas"/>
            <div class="Ingresar">
                <label>
                    <img src="Img/INGRESAR.png"/>
                    <input  type="submit"  name="Submit2" value="."class="Menu"/>
                </label>
            </div>
        </form>
        <form name="servi2" method="post" action="ServletServicios">
            <div class="Invitado">
                <label>
                    <img src="Img/INVITADO.png"/>
                    <input  type="submit"  name="Invitado" value="."class="Menu"/>
                </label>
            </div>
        </form>
    </body>
</html>