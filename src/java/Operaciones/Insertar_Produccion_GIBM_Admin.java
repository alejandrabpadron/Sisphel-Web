package Operaciones;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;

public class Insertar_Produccion_GIBM_Admin {

    private String Autores_Produccion_GIBM;
    private String Grupo_Produccion_GIBM;
    private String Titulo_Produccion_GIBM;
    private String Revista_Produccion_GIBM;
    private String Tipo_Produccion_GIBM;
    private String Año_Produccion_GIBM;
    private String Url_Produccion_GIBM;

    public static synchronized boolean ProduccionGIBM(Insertar_Produccion_GIBM_Admin p) throws SQLException {

        DBManager dbm = new DBManager();
        Connection con = (Connection) dbm.getConnection();

        PreparedStatement st = (PreparedStatement) con.prepareStatement("INSERT INTO produccion_cientifica(Autores,Grupo,Titulo,Journal_Revista,Tipo,Year,URL) VALUES (?,?,?,?,?,?,?)");
        st.setString(1, p.getAutores_Produccion_GIBM());
        st.setString(2, p.getGrupo_Produccion_GIBM());
        st.setString(3, p.getTitulo_Produccion_GIBM());
        st.setString(4, p.getRevista_Produccion_GIBM());
        st.setString(5, p.getTipo_Produccion_GIBM());
        st.setString(6, p.getAño_Produccion_GIBM());
        st.setString(7, p.getUrl_Produccion_GIBM());

        int res = st.executeUpdate();
        st.close();
        dbm.closeConnection(con);
        return res == 1;
    }

    public Insertar_Produccion_GIBM_Admin(String Autores_Produccion_GIBM, String Grupo_Produccion_GIBM, String Titulo_Produccion_GIBM, String Revista_Produccion_GIBM, String Tipo_Produccion_GIBM, String Año_Produccion_GIBM, String Url_Produccion_GIBM) {
        this.Autores_Produccion_GIBM = Autores_Produccion_GIBM.toUpperCase();
        this.Grupo_Produccion_GIBM = Grupo_Produccion_GIBM.toUpperCase();
        this.Titulo_Produccion_GIBM = Titulo_Produccion_GIBM.toUpperCase();
        this.Revista_Produccion_GIBM = Revista_Produccion_GIBM.toUpperCase();
        this.Tipo_Produccion_GIBM = Tipo_Produccion_GIBM.toUpperCase();
        this.Año_Produccion_GIBM = Año_Produccion_GIBM.toUpperCase();
        this.Url_Produccion_GIBM = Url_Produccion_GIBM;

    }

    public String getAutores_Produccion_GIBM() {
        return Autores_Produccion_GIBM;
    }

    public void setAutores_Produccion_GIBM(String Autores_Produccion_GIBM) {
        this.Autores_Produccion_GIBM = Autores_Produccion_GIBM;
    }

    public String getGrupo_Produccion_GIBM() {
        return Grupo_Produccion_GIBM;
    }

    public void setGrupo_Produccion_GIBM(String Grupo_Produccion_GIBM) {
        this.Grupo_Produccion_GIBM = Grupo_Produccion_GIBM;
    }

    public String getTitulo_Produccion_GIBM() {
        return Titulo_Produccion_GIBM;
    }

    public void setTitulo_Produccion_GIBM(String Titulo_Produccion_GIBM) {
        this.Titulo_Produccion_GIBM = Titulo_Produccion_GIBM;
    }

    public String getRevista_Produccion_GIBM() {
        return Revista_Produccion_GIBM;
    }

    public void setRevista_Produccion_GIBM(String Revista_Produccion_GIBM) {
        this.Revista_Produccion_GIBM = Revista_Produccion_GIBM;
    }

    public String getTipo_Produccion_GIBM() {
        return Tipo_Produccion_GIBM;
    }

    public void setTipo_Produccion_GIBM(String Tipo_Produccion_GIBM) {
        this.Tipo_Produccion_GIBM = Tipo_Produccion_GIBM;
    }

    public String getAño_Produccion_GIBM() {
        return Año_Produccion_GIBM;
    }

    public void setAño_Produccion_GIBM(String Año_Produccion_GIBM) {
        this.Año_Produccion_GIBM = Año_Produccion_GIBM;
    }

    public String getUrl_Produccion_GIBM() {
        return Url_Produccion_GIBM;
    }

    public void setUrl_Produccion_GIBM(String Url_Produccion_GIBM) {
        this.Url_Produccion_GIBM = Url_Produccion_GIBM;
    }
    
}
