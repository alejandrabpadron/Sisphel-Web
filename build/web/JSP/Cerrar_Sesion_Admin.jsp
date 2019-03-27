<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SISPHEL - [Cerrar Sesión]</title>
        <script type="text/javascript">
            document.oncontextmenu = function() {
                return false;
            }
        </script>

    </head>
    <body>
        <form name="sesion" method="post" action="ServletServicios">
            <div>
                <img src="/SisphelWeb/Img/LOGO_OUT.png" width="64" height="64"/>
                <p style="margin-top: 10px; margin-left: 125px;">¿Desea cerrar Sesion?</p>

                <input style="margin-top: 5px; margin-left: 100px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                       onClick="javascript:window.close(); Cerrar_Ventana('Cerrar_Sesion_Admin')" type="submit" name="Si" value="Si">

                <input style="margin-top: -5px; margin-left: 100px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                       onClick="javascript:window.close(); Cerrar_Ventana('Cerrar_Sesion_Admin')" type="submit" name="No" value="No">
            </div>
        </form>
    </body>
</html>
