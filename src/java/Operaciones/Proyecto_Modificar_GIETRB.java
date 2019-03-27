package Operaciones;

import java.util.Vector;
import java.sql.*;

public class Proyecto_Modificar_GIETRB {

    private String ID;
    private String Nombre_Pro_GIETRB;
    private String Grupo;
    private String Estado;

    public static synchronized Vector DatosGIETRB(String Pro) throws SQLException {
        Vector Proyectos = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT * FROM proyectos WHERE Grupo='02' AND ID= ?");
        st.setString(1, Pro);
        ResultSet rs = st.executeQuery();
        Proyectos = new Vector();

        if (rs.next()) {
            Proyectos.add(new Proyecto_Modificar_GIETRB(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Proyectos;

    }

    public Proyecto_Modificar_GIETRB(String ID, String Nombre_Pro_GIETRB, String Grupo, String Estado) {
        this.ID = ID;
        this.Nombre_Pro_GIETRB = Nombre_Pro_GIETRB;
        this.Grupo = Grupo;
        this.Estado = Estado;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre_Pro_GIETRB() {
        return Nombre_Pro_GIETRB;
    }

    public void setNombre_Pro_GIETRB(String Nombre_Pro_GIETRB) {
        this.Nombre_Pro_GIETRB = Nombre_Pro_GIETRB;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

}
