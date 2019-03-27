<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo Usuario</title>
        <script type="text/javascript">
            document.oncontextmenu = function() {
                return false;
            }
        </script>
    </head>
    <body>
        <div>
            <img src="/SisphelWeb/Img/LOGO.png" width="496" height="110"/>
            <form name="form1" style="margin-top: 80px; margin-left: 80px;">
                <table>
                    <tr>
                        <td><label for="cod_uni">Codigo Unisinu:</label></td>
                        <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                                   type="text" placeholder="Escribe Codigo Unisinu" id="cod_uni">
                        </td>
                    </tr>

                    <tr>
                        <td><label for="user">Usuario:</label></td>
                        <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                                   type="text" placeholder="Escribe Tipo De Usuario" id="user">
                        </td>
                    </tr>

                    <tr>
                        <td><label for="pass1">Contraseña:</label></td>
                        <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                                   type="text" placeholder="Escribe Contraseña" id="pass1">
                        </td>

                    </tr>

                    <tr>
                        <td><label for="permi">Permiso:</label></td>
                        <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                                   type="text" placeholder="Escribe Permiso De Usuario" id="permi">
                        </td>
                    </tr> 
                </table>
            </form>

            <form name="form2" style="margin-top: -145px; margin-left: 550px;">
                <table>
                    <tr>
                        <td><label for="grupo">Grupo:</label></td>
                        <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                                   type="text" placeholder="Escribe Grupo De Usuario" id="grupo">
                        </td>
                    </tr>

                    <tr>
                        <td><label for="nombre">Nombre:</label></td>
                        <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                                   type="text" placeholder="Escribe Nombre De Usuario" id="nombre">
                        </td>
                    </tr>

                    <tr>
                        <td></td>
                    </tr>
                    <td><label for="pass2">Contraseña:</label></td>
                    <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                               type="text" placeholder="Confirmar Contraseña" id="pass2">
                    </td>
                </table>
            </form>

            <input style="margin-top: 30px; margin-left: 550px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                   type="submit" value="Insertar" name="btn_inseruser"/>

            <div style="margin-top: 40px; margin-left: 80px;">
                <table border="1" id="tabla" style="border-collapse: collapse; width:1180px; border: #979797 2px solid; text-align: center;">
                    <tr  height="30" id="tabla">
                        <td id="col1" width=150>CODIGO</td>
                        <td id="col1" width=150>USUARIO</td>
                        <td id="col1" width=150>CONTRASEÑA</td>
                        <td id="col1" width=150>NOMBRE</td>
                        <td id="col1" width=150>GRUPO</td>
                        <td id="col1" width=150>PERMISO</td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                    </tr>
                </table>
            </div>
        </div>
    </body>
</html>
