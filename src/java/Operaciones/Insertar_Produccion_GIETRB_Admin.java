package Operaciones;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

public class Insertar_Produccion_GIETRB_Admin {

    private String Autores_Produccion_GIETRB;
    private String Grupo_Produccion_GIETRB;
    private String Titulo_Produccion_GIETRB;
    private String Revista_Produccion_GIETRB;
    private String Tipo_Produccion_GIETRB;
    private String Año_Produccion_GIETRB;
    private String Url_Produccion_GIETRB;

    public static synchronized boolean ProduccionGIETRB(Insertar_Produccion_GIETRB_Admin p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = (Connection) dbm.getConnection();

        PreparedStatement st = (PreparedStatement) con.prepareStatement("INSERT INTO produccion_cientifica(Autores,Grupo,Titulo,Journal_Revista,Tipo,Year,URL) VALUES (?,?,?,?,?,?,?)");
        st.setString(1, p.getAutores_Produccion_GIETRB());
        st.setString(2, p.getGrupo_Produccion_GIETRB());
        st.setString(3, p.getTitulo_Produccion_GIETRB());
        st.setString(4, p.getRevista_Produccion_GIETRB());
        st.setString(5, p.getTipo_Produccion_GIETRB());
        st.setString(6, p.getAño_Produccion_GIETRB());
        st.setString(7, p.getUrl_Produccion_GIETRB());

        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public Insertar_Produccion_GIETRB_Admin(String Autores_Produccion_GIETRB, String Grupo_Produccion_GIETRB, String Titulo_Produccion_GIETRB, String Revista_Produccion_GIETRB, String Tipo_Produccion_GIETRB, String Año_Produccion_GIETRB, String Url_Produccion_GIETRB) {
        this.Autores_Produccion_GIETRB = Autores_Produccion_GIETRB.toUpperCase();
        this.Grupo_Produccion_GIETRB = Grupo_Produccion_GIETRB.toUpperCase();
        this.Titulo_Produccion_GIETRB = Titulo_Produccion_GIETRB.toUpperCase();
        this.Revista_Produccion_GIETRB = Revista_Produccion_GIETRB.toUpperCase();
        this.Tipo_Produccion_GIETRB = Tipo_Produccion_GIETRB.toUpperCase();
        this.Año_Produccion_GIETRB = Año_Produccion_GIETRB.toUpperCase();
        this.Url_Produccion_GIETRB = Url_Produccion_GIETRB;

    }

    public String getAutores_Produccion_GIETRB() {
        return Autores_Produccion_GIETRB;
    }

    public void setAutores_Produccion_GIETRB(String Autores_Produccion_GIETRB) {
        this.Autores_Produccion_GIETRB = Autores_Produccion_GIETRB;
    }

    public String getGrupo_Produccion_GIETRB() {
        return Grupo_Produccion_GIETRB;
    }

    public void setGrupo_Produccion_GIETRB(String Grupo_Produccion_GIETRB) {
        this.Grupo_Produccion_GIETRB = Grupo_Produccion_GIETRB;
    }

    public String getTitulo_Produccion_GIETRB() {
        return Titulo_Produccion_GIETRB;
    }

    public void setTitulo_Produccion_GIETRB(String Titulo_Produccion_GIETRB) {
        this.Titulo_Produccion_GIETRB = Titulo_Produccion_GIETRB;
    }

    public String getRevista_Produccion_GIETRB() {
        return Revista_Produccion_GIETRB;
    }

    public void setRevista_Produccion_GIETRB(String Revista_Produccion_GIETRB) {
        this.Revista_Produccion_GIETRB = Revista_Produccion_GIETRB;
    }

    public String getTipo_Produccion_GIETRB() {
        return Tipo_Produccion_GIETRB;
    }

    public void setTipo_Produccion_GIETRB(String Tipo_Produccion_GIETRB) {
        this.Tipo_Produccion_GIETRB = Tipo_Produccion_GIETRB;
    }

    public String getAño_Produccion_GIETRB() {
        return Año_Produccion_GIETRB;
    }

    public void setAño_Produccion_GIETRB(String Año_Produccion_GIETRB) {
        this.Año_Produccion_GIETRB = Año_Produccion_GIETRB;
    }

    public String getUrl_Produccion_GIETRB() {
        return Url_Produccion_GIETRB;
    }

    public void setUrl_Produccion_GIETRB(String Url_Produccion_GIETRB) {
        this.Url_Produccion_GIETRB = Url_Produccion_GIETRB;
    }

   
}
