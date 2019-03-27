<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inventrio Administrador</title>

        <script language=javascript>
            function Insertar (insertar_equipo_admin){
                window.open(insertar_equipo_admin,"Insertar","resizable=no, status=no, scrollbars=yes, directories=no, menubar=no");
            }
            function Modificar (modificar_equipo_admin){
                window.open(modificar_equipo_admin,"Insertar","resizable=no, status=no, scrollbars=yes, directories=no, menubar=no");
            }
            function Eliminar (insertar_equipo_admin){
                window.open(insertar_equipo_admin,"Eliminar","resizable=no, status=no, scrollbars=yes, directories=no, menubar=no");
            }
        </script>

        <script type="text/javascript">
            document.oncontextmenu = function() {
                return false;
            }
        </script>
    </head>
    <body>
        <div>
            <img style="position: relative; top: 10px; left: 10px;
                 " src="/SisphelWeb/Img/LOGO.png" width="496" height="110"/>
            <div style="margin-top: 80px; margin-left: 100px;">
                <table border="1" id="tabla" style="border-collapse: collapse; top:250px; left:100px; width:1150px; border: #979797 2px solid; text-align: center;">
                    <tr  height="30" id="tabla">
                        <td id="col1" width=150>PLACA UNISINU</td>
                        <td id="col1" width=150>PLACA GOBERNACION</td>
                        <td id="col1" width=150>DESCRIPCION</td>
                        <td id="col1" width=150>MARCA</td>
                        <td id="col1" width=150>AREA</td>
                    </tr>
                    <tr height="30" id="tabla">
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
                    </tr>
                    <tr height="30" id="tabla">
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
                    </tr>
                    <tr height="30" id="tabla">
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
                    </tr>
                    <tr height="30" id="tabla">
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
                    </tr>
                    <tr height="30" id="tabla">
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
                    </tr>
                </table>
            </div>
            <a style="text-decoration:none" href="javascript:Insertar('JSP/Insertar_Equipo_Admin.jsp')">
                <input style="position: absolute; top: 600px; left: 100px; font-size: 15px; border-radius: 7px;
                       padding: 3px 15px 3px 15px; text-align: center;" type="submit" value="Insertar"/>
            </a>

            <a style="text-decoration:none" href="javascript:Modificar('JSP/Modificar_Equipo_Admin.jsp')">
                <input style="position: absolute; top: 600px; left: 200px; font-size: 15px; border-radius: 7px;
                       padding: 3px 15px 3px 15px; text-align: center;" type="submit" value="Modificar"/>
            </a>

            <a style="text-decoration:none" href="javascript:Eliminar('JSP/Eliminar_Equipo_Admin.jsp')">
                <input style="position: absolute; top: 600px; left: 310px; font-size: 15px; border-radius: 7px;
                       padding: 3px 15px 3px 15px; text-align: center;" type="submit" value="Eliminar"/>
            </a>
        </div>
    </body>
</html>
