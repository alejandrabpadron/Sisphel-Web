<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Préstamo De Equipos</title>
        <link rel="icon" type="image/png" href="/SisphelWeb/Img/ICONO.png"/>
        <link rel="stylesheet" href="http://code.jquery.com/jquery-latest.js"></link>
        <link rel="stylesheet" href="http://code.jquery.com/ui/1.10.1/themes/base/jquery-ui.css" />
        <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
        <script src="http://code.jquery.com/ui/1.10.1/jquery-ui.js"></script>
        <script src="js/jquery.min.js"></script>
        <script src="js/jquery.colorbox.js"></script>
        <script type="text/javascript">
            document.oncontextmenu = function() {
                return false;
            }
        </script>

        <script>
            $(function () {
                $("#datepicker").datepicker();
            });
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
                                   type="text" placeholder="Escribe Codigo Unisinu" id="cod_uni"></td>
                    </tr>

                    <tr>
                        <td><label for="hor_pres">Hora Prestamo:</label></td>
                        <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                                   type="text" placeholder="Escribe Hora de Prestamo" id="hor_pres"></td>
                    </tr>

                    <tr>
                        <td><label for="datepicker">Fecha Prestamo:</label></td>
                        <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                                   type="text" name="fecha" id="datepicker"></td>
                    </tr>
                </table>
            </form>

            <form name="form2" style="margin-top: -105px; margin-left: 550px;">
                <table>
                    <tr>
                        <td><label for="equi">Equipo:</label></td>
                        <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                                   type="text" placeholder="Escribe Placa del Equipo" id="equi"></td>
                    </tr>

                    <tr>
                        <td><label for="hor_dev">Hora Devolucion:</label></td>
                        <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                                   type="text" placeholder="Escribe Hora de Devolucion" id="hor_dev"></td>
                    </tr>
                </table>
            </form>

            <input style="margin-top: 30px; margin-left: 550px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                   type="submit" value="Prestar" name="btn_presequi"/>

            <form name="form3" style="margin-top: 30px; margin-left: 80px;">
                <tr>
                    <td><label for="bus">Buscar Por:</label></td>
                    <td>
                        <select id="bus" style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;">
                            <option value="">Equipo</option>
                            <option value="">Area</option>
                        </select>
                    </td>
                <input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                       type="text" name="txt_busqueda" value="" />

                <input style="margin-left: 113px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                       type="submit" value="Buscar" name="btn_busequi"/>
                </tr>
            </form>

            <div style="margin-top: 40px; margin-left: 80px;">
                <table border="1" id="tabla" style="border-collapse: collapse; top:250px; left:100px; width:1170px; border: #979797 2px solid; text-align: center;">
                    <tr  height="30" id="tabla">
                        <td id="col1" width=150>PLACA</td>
                        <td id="col1" width=150>DESCRIPCION</td>
                        <td id="col1" width=150>AREA</td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                    </tr>
                    <tr height="30" id="tabla">
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                        <td id="col1" width=150></td>
                    </tr>
                </table>
            </div>
            <input style="margin-top: 10px; margin-left: 1195px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                   type="submit" value="Ver" name="btn_verequi"/>
        </div>
    </body>
</html>
