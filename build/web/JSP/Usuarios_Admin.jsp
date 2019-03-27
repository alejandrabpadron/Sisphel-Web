<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SISPHEL - [Usuarios]</title>
        <script type="text/javascript">
            document.oncontextmenu = function() {
                return false;
            }
        </script>

        <script language=javascript>
            function Ver (ver_usuarios_admin){
                window.open(ver_usuarios_admin,"Ver","status=no, scrollbars=yes, directories=no, menubar=no");
            }

            function Nuevo (nuevo_usuario_admin){
                window.open(nuevo_usuario_admin,"Nuevo","status=no, scrollbars=yes, directories=no, menubar=no");
            }
            function Modificar (modificar_usuarios_admin){
                window.open(modificar_usuarios_admin,"Modificar","status=no, scrollbars=yes, directories=no, menubar=no");
            }

            function Eliminar (eliminar_usuarios_admin){
                window.open(eliminar_usuarios_admin,"Eliminar","status=no, scrollbars=yes, directories=no, menubar=no");
            }
        </script>
    </head>
    <body>
        <div>
            <img src="/SisphelWeb/Img/USUARIOS.png" width="64" height="64"/>
            <p style="margin-top: 10px; margin-left: 120px;">Opciones de Usuario</p>
            <form action="" method="get">
                <a style="text-decoration:none" href="javascript:Ver('Ver_Usuarios_Admin.jsp')">
                    <input style="margin-top: 5px; margin-left: 10px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                           onClick="javascript:window.close(); Cerrar_Ventana('Usuarios_Admin')" name="verus" type="button" value="Ver">
                </a>

                <a style="text-decoration:none" href="javascript:Nuevo('Nuevo_Usuario_Admin.jsp')">
                    <input style="margin-top: -5px; margin-left: 10px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                           onClick="javascript:window.close(); Cerrar_Ventana('Usuarios_Admin')" name="inus" type="button" value="Insertar">
                </a>

                <a style="text-decoration:none" href="javascript:Modificar('Modificar_Usuario_Admin.jsp')">
                    <input style="margin-top: -5px; margin-left: 10px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                           onClick="javascript:window.close(); Cerrar_Ventana('Usuarios_Admin')" name="modus" type="button" value="Modificar">
                </a>

                <a style="text-decoration:none" href="javascript:Eliminar('Eliminar_Usuario_Admin.jsp')">
                    <input style="margin-top: -5px; margin-left: 10px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                           onClick="javascript:window.close(); Cerrar_Ventana('Usuarios_Admin')" name="elus" type="button" value="Eliminar">
                </a>
            </form>
        </div>
    </body>
</html>
