package Operaciones;

import java.sql.*;
import java.util.Vector;

public class Buscar_Proyectos {

    private String ID;
    private String Nombre_Pro_GIBM;
    private String Estado;
    private String Nombre_Pro_GIETRB;
    private String Grupo;

    public Buscar_Proyectos(String ID, String Nombre_Pro_GIBM, String Estado) {
        this.ID = ID;
        this.Nombre_Pro_GIBM = Nombre_Pro_GIBM;
        this.Estado = Estado;
    }

    public static synchronized Vector BuscarGIBM(String Nombre_Pro_GIBM) throws SQLException {
        Vector Proyectos = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT ID, Nombre,Estado FROM proyectos WHERE Grupo='01' AND Nombre LIKE ?");

        st.setString(1, "%" + Nombre_Pro_GIBM + "%");
        ResultSet rs = st.executeQuery();

        Proyectos = new Vector();

        while (rs.next()) {
            Proyectos.add(new Buscar_Proyectos(rs.getString(1), rs.getString(2), rs.getString(3)));
        }


        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Proyectos;

    }

    public Buscar_Proyectos(String ID, String Nombre_Pro_GIETRB, String Grupo, String Estado) {
        this.ID = ID;
        this.Nombre_Pro_GIETRB = Nombre_Pro_GIETRB;
        this.Grupo = Grupo;
        this.Estado = Estado;
    }

    public static synchronized Vector BuscarGIETRB(String Nombre_Pro_GIETRB) throws SQLException {
        Vector Proyectos = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT * FROM proyectos WHERE Grupo='02' AND Nombre LIKE ?");

        st.setString(1, "%" + Nombre_Pro_GIETRB + "%");
        ResultSet rs = st.executeQuery();

        Proyectos = new Vector();

        while (rs.next()) {
            Proyectos.add(new Buscar_Proyectos(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }


        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Proyectos;

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre_Pro_GIBM() {
        return Nombre_Pro_GIBM;
    }

    public void setNombre_Pro_GIBM(String Nombre_Pro_GIBM) {
        this.Nombre_Pro_GIBM = Nombre_Pro_GIBM;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
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

   
}
