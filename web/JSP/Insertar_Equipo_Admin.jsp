<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar Nuevo Equipo</title>
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
                <table>
                    <tr>
                        <td><label for="cod_uni">Placa de Inventario Unisinu:</label></td>
                        <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 25px 5px 25px;"
                                   type="text"type="text" placeholder="Escribe Placa Unisinu" id="cod_uni"></td>
                    </tr>

                    <tr>
                        <td><label for="hor_pres">Placa de Inventario Gobernacion:</label></td>
                        <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 25px 5px 25px;"
                                   type="text" placeholder="Escribe Placa Gobernación" id="hor_pres"></td>
                    </tr>

                    <tr>
                        <td><label for="fec_pres">Descripcion del Equipo:</label></td>
                        <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 25px 5px 25px;"
                                   type="text" placeholder="Descripción del Equipo" id="fec_pres"></td>
                    </tr>
                </table>
            </form>

            <form name="form2" style="margin-top: -95px; margin-left: 550px;">
                <table>
                    <tr>
                        <td><label for="equi">Marca:</label></td>
                        <td><input  style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 25px 5px 25px;"
                                    type="text" placeholder="Escribe Marca Del Equipo" id="equi"></td>
                    </tr>
                    <tr>
                        <td><label for="hor_dev">Area:</label></td>
                        <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 25px 5px 25px;"
                                   type="text" placeholder="Escribe Area Del Equipo" id="hor_dev"></td>
                    </tr>
                </table>
            </form>

            <input style="margin-top: -70px; margin-left: 550px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                   type="submit" value="Insertar" name="btn_inequi"/>
            <div style="margin-top: 110px; margin-left: 80px;">
                <table border="1" id="tabla" style="border-collapse: collapse; top:250px; left:100px; width:1160px; border: #979797 2px solid; text-align: center;">
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
                </table>
            </div>
        </div>
    </body>
</html>
