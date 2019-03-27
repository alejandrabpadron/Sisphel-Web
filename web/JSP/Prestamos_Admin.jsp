<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SISPHEL - [Préstamos]</title>
        <link rel="icon" type="image/png" href="Img/ICONO.png"/>

        <script language=javascript>
            function Equipo (prestar_Equipo_admin){
                window.open(prestar_Equipo_admin,"Equipo","status=no, scrollbars=yes, directories=no, menubar=no");
            }

            function Area (prestar_Area_admin){
                window.open(prestar_Area_admin,"Area","status=no, scrollbars=yes, directories=no, menubar=no");
            }
        </script>

        <script type="text/javascript">
            document.oncontextmenu = function() {
                return false;
            }
        </script>
    </head>
    <body margin: auto>
        <form name="form1" method="post" action="">
            <div>
                <img src="/SisphelWeb/Img/MICROSCOPIO.png" width="64" height="64"/>
                <p style="margin-top: 10px; margin-left: 125px;">¿Que Desea Prestar?</p>

                <a style="text-decoration:none" href="javascript:Equipo('Prestar_Equipo_Admin.jsp')">
                    <input style="margin-top: 5px; margin-left: 80px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                           onClick="javascript:window.close(); Cerrar_Ventana('prestamo_admin')" name="prequi" type="button" value="Equipo">
                </a>

                <a style="text-decoration:none" href="javascript:Area('Prestar_Area_Admin.jsp')">
                    <input style="margin-top: -5px; margin-left: 80px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                           onClick="javascript:window.close(); Cerrar_Ventana('prestamo_admin')" name="prear" type="button" value="Area">
                </a>
            </div>
        </form>
    </body>
</html>
