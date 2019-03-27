package Operaciones;

import java.util.Vector;
import java.sql.*;

public class Ponencia_Modificar_GIETRB {

    private String ID;
    private String Nombre_Pon_GIETRB;
    private String Año;
    private String Ciudad;
    private String Pais;
    private String Grupo;

    public static synchronized Vector DatosGIETRB(String Pon) throws SQLException {
        Vector Ponencias = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT * FROM ponencias WHERE Grupo='02' AND ID= ?");
        st.setString(1, Pon);
        ResultSet rs = st.executeQuery();
        Ponencias = new Vector();

        if (rs.next()) {
            Ponencias.add(new Ponencia_Modificar_GIETRB(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Ponencias;

    }

    public Ponencia_Modificar_GIETRB(String ID, String Nombre_Pon_GIETRB, String Año, String Ciudad, String Pais, String Grupo) {
        this.ID = ID;
        this.Nombre_Pon_GIETRB = Nombre_Pon_GIETRB.toUpperCase();
        this.Año = Año.toUpperCase();
        this.Ciudad = Ciudad.toUpperCase();
        this.Pais = Pais.toUpperCase();
        this.Grupo = Grupo.toUpperCase();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre_Pon_GIETRB() {
        return Nombre_Pon_GIETRB;
    }

    public void setNombre_Pon_GIETRB(String Nombre_Pon_GIETRB) {
        this.Nombre_Pon_GIETRB = Nombre_Pon_GIETRB;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }


}
