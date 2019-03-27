<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eliminar Equipo</title>
        <script type="text/javascript">
            document.oncontextmenu = function() {
                return false;
            }
        </script>
    </head>
    <body>
        <div>
            <img style="top: 10px; left: 10px;" src="/SisphelWeb/Img/LOGO.png" width="496" height="110"/>
            <form name="form1" style="margin-top: 80px; margin-left: 80px;">
                <tr>
                    <td><label for="bus">Buscar Por:</label></td>
                    <td>
                        <select id="bus" style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 3px 12px 3px 12px;">
                            <option value="">PLACA UNISINU</option>
                            <option value="">PLACA GOBERNACION</option>
                            <option value="">DESCRIPCION</option>
                            <option value="">MARCA</option>
                            <option value="">AREA</option>
                        </select>
                    </td>
                <input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 3px 12px 3px 12px;"
                       type="text" name="txt_busqueda" value=""/>

                <input style="margin-left: 30px; font-size: 15px; border-radius: 7px;
                   padding: 3px 15px 3px 15px; text-align: center;" type="submit" value="Buscar" name="btn_busequi"/>
                </tr>
            </form>

            
            <div style="margin-top: 50px; margin-left: 80px;">
                <table border="1" id="tabla" style="border-collapse: collapse; top:200px; left:100px; width:1170px; border: #979797 2px solid; text-align: center;">
                    <tr  height="30" id="tabla">
                        <td id="col1" width=150>ID</td>
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
            <input style="margin-top: 60px; margin-left: 1170px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                   type="submit" value="Eliminar" name="btn_eliequi"/>
        </div>
    </body>
</html>
