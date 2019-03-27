<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

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
                    <td><label for="cod_uni">Codigo:</label></td>
                    <td><input style="font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                               type="text" placeholder="Escribe Codigo Unisinu" name="txt_hora" value="" id="cod_uni">
                    </td>
                <input style="margin-left: 100px; font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                       type="text" name="txt_hora" value="" />

                <input style="margin-left: 100px; font-family: 'Segoe UI'; font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;"
                       type="text" name="txt_fecha" value="" />
                </tr>
                
                <textarea style="margin-top: 50px; width: 710px; height:200px; font-family: 'Segoe UI';
                          font-size: 12px; border-radius: 8px; padding: 5px 20px 5px 20px;" name="sd">
                </textarea>

                <input style="margin-top: -50px; margin-left: 10px; font-size: 15px; border-radius: 7px; padding: 3px 15px 3px 15px; text-align: center;"
                       type="submit" value="Publicar" name="btn_pubcom"/>
            </form>
        </div>
    </body>
</html>
