package Operaciones;

import java.util.Vector;
import java.sql.*;

public class Produccion_Modificar_GIBM {

    private String ID;
    private String Autores;
    private String Nombre_Prod_GIBM;
    private String Grupo;
    private String Revista;
    private String Tipo;
    private String Año;
    private String Url;

    public static synchronized Vector DatosGIBM(String Pro) throws SQLException {
        Vector Produccion = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT * FROM produccion_cientifica WHERE Grupo='01' AND ID= ?");
        st.setString(1, Pro);
        ResultSet rs = st.executeQuery();
        Produccion = new Vector();

        if (rs.next()) {
            Produccion.add(new Produccion_Modificar_GIBM(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Produccion;

    }

    public Produccion_Modificar_GIBM(String ID, String Autores, String Grupo, String Nombre_Prod_GIBM, String Revista, String Tipo, String Año, String Url) {
        this.ID = ID.trim();
        this.Autores = Autores.toUpperCase();
        this.Grupo = Grupo;
        this.Nombre_Prod_GIBM = Nombre_Prod_GIBM.toUpperCase();
        this.Revista = Revista.toUpperCase();
        this.Tipo = Tipo.toUpperCase();
        this.Año = Año.toUpperCase();
        this.Url = Url.toUpperCase();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAutores() {
        return Autores;
    }

    public void setAutores(String Autores) {
        this.Autores = Autores;
    }

    public String getNombre_Prod_GIBM() {
        return Nombre_Prod_GIBM;
    }

    public void setNombre_Prod_GIBM(String Nombre_Prod_GIBM) {
        this.Nombre_Prod_GIBM = Nombre_Prod_GIBM;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getRevista() {
        return Revista;
    }

    public void setRevista(String Revista) {
        this.Revista = Revista;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

}
