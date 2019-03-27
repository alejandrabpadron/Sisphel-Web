package Operaciones;

import java.util.Vector;
import java.sql.*;

public class Consultar_Noticias {

    private String Fecha;
    private String Titulo;
    private String Codigo;
    private String Cuerpo;
    private String Fecha2;
    private String Imagen;

    public static synchronized Vector ListarNoticias() throws SQLException {
        Vector Noticias = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT noticias.Fecha, noticias.Titulo, usuarios.Nombre, noticias.Cuerpo, noticias.Fecha2, noticias.Imagen FROM noticias, usuarios WHERE noticias.Codigo_Unisinu=usuarios.Codigo ORDER BY noticias.Fecha DESC" );
        ResultSet rs = st.executeQuery();
        Noticias = new Vector();

        while (rs.next()) {

            Noticias.add(new Consultar_Noticias(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Noticias;

    }

    public Consultar_Noticias(String Fecha, String Titulo, String Codigo, String Cuerpo, String Fecha2, String Imagen) {
        this.Fecha = Fecha.toUpperCase();
        this.Titulo = Titulo.toUpperCase();
        this.Codigo = Codigo.toUpperCase();
        this.Cuerpo = Cuerpo;
        this.Fecha2 = Fecha2;
        this.Imagen=Imagen;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCuerpo() {
        return Cuerpo;
    }

    public void setCuerpo(String Cuerpo) {
        this.Cuerpo = Cuerpo;
    }

    public String getFecha2() {
        return Fecha2;
    }

    public void setFecha2(String Fecha2) {
        this.Fecha2 = Fecha2;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

   


}
