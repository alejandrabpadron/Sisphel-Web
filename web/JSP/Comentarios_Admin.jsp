<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SISPHEL - [Comentarios]</title>
        <script language=javascript>
            function Nuevo_Comentario (nuevo_comentario_admin){
                window.open(nuevo_comentario_admin,"Nuevo_Comentario","status=no, scrollbars=yes, directories=no, menubar=no");
            }

            function Ver_Comentarios (ver_comentarios_admin){
                window.open(ver_comentarios_admin,"Ver_Comentarios","status=no, scrollbars=yes, directories=no, menubar=no");
            }
        </script>

        <script type="text/javascript">
            document.oncontextmenu = function() {
                return false;
            }
        </script>
    </head>
    <body>
        <form action="" method="get">
            <div>
                <img src="/SisphelWeb/Img/COMENTARIO.png" width="64" height="64"/>
                <p style="margin-top: 10px; margin-left: 125px;">Opciones de Comentarios</p>

                <a style="text-decoration:none" href="javascript:Nuevo_Comentario('Nuevo_Comentario_Admin.jsp')">
                    <input style="margin-top: 5px; margin-left: 40px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                           onClick="javascript:window.close(); Cerrar_Ventana('Comentarios_Admin')" name="renot" type="button" value="Redactar Nota">
                </a>

                <a style="text-decoration:none" href="javascript:Ver_Comentarios('Ver_Comentarios_Admin.jsp')">
                    <input style="margin-top: -5px; margin-left: 75px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                           onClick="javascript:window.close(); Cerrar_Ventana('Comentarios_Admin')" name="vernot" type="button" value="Ver Muro">
                </a>
            </div>
        </form>
    </body>
</html>
