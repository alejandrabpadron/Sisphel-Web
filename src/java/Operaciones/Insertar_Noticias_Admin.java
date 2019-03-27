package Operaciones;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

public class Insertar_Noticias_Admin {

    private String Fecha_Noticia;
    private String Titulo_Noticia;
    private String Codigo_Noticia;
    private String Cuerpo_Noticia;
    private String Fecha_Español;
    private String Imagen_Noticia;

    public static synchronized boolean Noticias(Insertar_Noticias_Admin p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = (Connection) dbm.getConnection();

        PreparedStatement st = (PreparedStatement) con.prepareStatement("INSERT INTO noticias(Fecha, Titulo, Codigo_Unisinu,Cuerpo,Fecha2,Imagen) VALUES (?,?,?,?,?,?)");
        st.setString(1, p.getFecha_Noticia());
        st.setString(2, p.getTitulo_Noticia());
        st.setString(3, p.getCodigo_Noticia());
        st.setString(4, p.getCuerpo_Noticia());
        st.setString(5, p.getFecha_Español());
        st.setString(6, p.getImagen_Noticia());

        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public Insertar_Noticias_Admin(String Fecha_Noticia, String Titulo_Noticia, String Codigo_Noticia, String Cuerpo_Noticia, String Fecha_Español, String Imagen_Noticia) {
        this.Fecha_Noticia = Fecha_Noticia.toUpperCase();
        this.Titulo_Noticia = Titulo_Noticia.toUpperCase();
        this.Codigo_Noticia = Codigo_Noticia.toUpperCase();
        this.Cuerpo_Noticia = Cuerpo_Noticia;
        this.Fecha_Español = Fecha_Español.toUpperCase();
        this.Imagen_Noticia = Imagen_Noticia;

    }

    public String getFecha_Noticia() {
        return Fecha_Noticia;
    }

    public void setFecha_Noticia(String Fecha_Noticia) {
        this.Fecha_Noticia = Fecha_Noticia;
    }

    public String getTitulo_Noticia() {
        return Titulo_Noticia;
    }

    public void setTitulo_Noticia(String Titulo_Noticia) {
        this.Titulo_Noticia = Titulo_Noticia;
    }

    public String getCodigo_Noticia() {
        return Codigo_Noticia;
    }

    public void setCodigo_Noticia(String Codigo_Noticia) {
        this.Codigo_Noticia = Codigo_Noticia;
    }

    public String getCuerpo_Noticia() {
        return Cuerpo_Noticia;
    }

    public void setCuerpo_Noticia(String Cuerpo_Noticia) {
        this.Cuerpo_Noticia = Cuerpo_Noticia;
    }

    public String getFecha_Español() {
        return Fecha_Español;
    }

    public void setFecha_Español(String Fecha_Español) {
        this.Fecha_Español = Fecha_Español;
    }

    public String getImagen_Noticia() {
        return Imagen_Noticia;
    }

    public void setImagen_Noticia(String Imagen_Noticia) {
        this.Imagen_Noticia = Imagen_Noticia;
    }
}
