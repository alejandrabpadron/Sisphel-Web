<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SISPHEL | Inicio</title>
        <link rel="icon" type="image/png" href="Img/ICONO.png"/>
        <style type="text/css">
            <!--
            .Estilo2 {
                font-size: 24px;
                color: #666666;
            }
            .Menu {
                border: none;
                font-family: Arial;
                color: #ffffff;
                font-size: 0px;
                background-color: transparent;
                text-decoration: none;
                padding: 0px 0px 0px 0px;
            }
            .Boton{
                font-family: 'MS Gothic';
                font-size: 18px;
                border-radius: 8px;
                padding: 5px 18px 5px 18px;
            }
            .MenuPequeño{
                margin-right: 10px;
                margin-top: -100px;
                margin-left: 1130px;
            }

            .Div_Inv{
                margin-left: 622px;
                margin-top: -324px;
            }

            -->
        </style>

        <script language=javascript>
            function Prestamos (prestamo_admin){
                window.open(prestamo_admin,"Prestamos","resizable=no, toolbar=no, scrollbars=no, menubar=no, status=no, directories=no, top=100, left=450, width=400, height=250");
            }

            function Comentarios (comentario_admin){
                window.open(comentario_admin,"Comentarios","resize=no, toolbar=no, scrollbars=no, menubar=no, status=no, directories=no, top=100, left=450, width=400, height=250");
            }

            function Mis_Prestamos (mis_prestamos_admin){
                window.open(mis_prestamos_admin,"Mis_Prestamos","resize=no, toolbar=no, scrollbars=no, menubar=no, status=no, directories=no, top=100, left=450, width=400, height=250");
            }

            function Nuevo_Usuario (nuevo_usuario_admin){
                window.open(nuevo_usuario_admin,"Nuevo_Usuario","resize=no, toolbar=no, scrollbars=no, menubar=no, status=no, directories=no, top=100, left=450, width=400, height=250");
            }

            function Ayuda (ayuda_admin){
                 window.open ("/SisphelWeb/Ayuda/index.html", "mywindow");
            }

            function Cerrar_Sesion (cerrar_sesion_admin){
                window.open(cerrar_sesion_admin,"Cerrar_Sesion","resize=no, toolbar=no, scrollbars=no, menubar=no, status=no, directories=no, top=100, left=450, width=400, height=250");
            }
        </script>

        <script type="text/javascript">
            document.oncontextmenu = function() {
                return false;
            }
        </script>
    </head>
    <body>
        <form name="form1" method="post" action="">
            <img src="Img/LOGO.png" width="500"/>
            <div class="MenuPequeño">
                <label>
                    <a style="text-decoration:none" href="javascript:Mis_Prestamos('JSP/Mis_Prestamos_Admin.jsp')">
                        <img src="/SisphelWeb/Img/MISPRESTAMOS.png"/>
                        <input  type="submit"  name="MisPrestamos" value="."class="Menu"/>
                    </a>
                </label>

                <label>
                    <a style="text-decoration:none" href="javascript:Nuevo_Usuario('JSP/Usuarios_Admin.jsp')">
                        <img src="/SisphelWeb/Img/USER1.png"/>
                        <input  type="submit"  name="Usuario" value="."class="Menu"/>
                    </a>
                </label>

                <label>
                    <a style="text-decoration:none" href="javascript:Ayuda('Ayuda/index.html')">
                        <img src="Img/AYUDA.png"/>
                        <input  type="submit"  name="Ayuda" value="."class="Menu"/>
                    </a>
                </label>

                <label>
                    <a style="text-decoration:none" href="javascript:Cerrar_Sesion('JSP/Cerrar_Sesion_Admin.jsp')">
                        <img src="Img/SESION.png"/>
                        <input  type="submit"  name="CerrarSesion" value="."class="Menu"/>
                    </a>
                </label>
            </div>


            <div>
                <label>
                    <a style="text-decoration:none" href="javascript:Prestamos('JSP/Prestamos_Admin.jsp')">
                        <img src="Img/PRESTAMOS2.png" style="margin-left: 100px;"/>
                        <input style="margin-top: 320px;" type="submit"  name="Prestamos" value="." class="Menu"/>
                    </a>
                </label>


                <label>
                    <a style="text-decoration:none" href="javascript:Comentarios('JSP/Comentarios_Admin.jsp')">
                        <img src="Img/COMENTARIOS2.png" style="margin-left: 100px;"/>
                        <input style="margin-top: 320px;" type="submit"  name="Comentarios" value="." class="Menu"/>
                    </a>
                </label>
            </div>
        </form>
        <form name="servi2" method="post" target="_blank" action="ServletServicios">
            <div class="Div_Inv">
                <label>
                    <img src="Img/INVENTARIO2.png" style="margin-left: 100px;"/>
                    <input style="margin-top: 320px;" type="submit"  name="Inventario" value="." class="Menu"/>
                </label>

            </div>
        </form>

        <form name="servi" method="post" target="_blank" action="ServletServicios">
            <div>
                <label>
                    <img src="Img/HORARIO2.png" style="margin-left: 100px;"/>
                    <input style="margin-top: 260px;" type="submit"  name="Horario" value="."class="Menu"/>
                </label>

                <label>
                    <img src="Img/PROYECTOS.png" style="margin-left: 100px;"/>
                    <input style="margin-top: 260px;" type="submit"  name="Proyectos" value="."class="Menu"/>
                </label>

                <label>
                    <img src="Img/HVEQUIPOS.png" style="margin-left: 100px;"/>
                    <input style="margin-top: 260px;" type="submit"  name="HV" value="."class="Menu"/>
                </label>
            </div>
        </form>
    </body>
</html>
