<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Usuario</title>
        <script type="text/javascript">
            document.oncontextmenu = function() {
                return false;
            }
        </script>
    </head>
    <body>
        <div>
            <img src="/SisphelWeb/Img/LOGO.png" width="496" height="110"/>
            <form style="margin-top: 80px; margin-left: 80px;">
                <tr>
                    <td><label for="bus">Buscar Por:</label></td>
                    <td>
                        <select id="bus" style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 3px 12px 3px 12px;">
                            <option>CODIGO</option>
                            <option>USUARIO</option>
                            <option>CONTRASEÑA</option>
                            <option>NOMBRE</option>
                            <option>GRUPO</option>
                            <option>PERMISO</option>
                        </select>
                    </td>
                <input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 30px 5px 30px;"
                       type="text" name="txt_busqueda" value="" />

                <input style="margin-left: 80px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                       type="submit" value="Buscar" name="btn_busequi"/>
                </tr>
            </form>

            <div style="margin-top: 20px; margin-left: 80px;">
                <table border="1" id="tabla" style="border-collapse: collapse; width:1180px; border: #979797 2px solid; text-align: center;">
                    <tr  height="30" id="tabla">
                        <td id="col1" width=150>ID</td>
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
                        <td id="col1" width=150></td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
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
                        <td id="col1" width=150></td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
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
                        <td id="col1" width=150></td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                    </tr>
                </table>
            </div>
            <input style="margin-top: 10px; margin-left: 1178px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                   type="submit" value="Eliminar" name="btn_eliuser"/>
        </div>
    </body>
</html>
