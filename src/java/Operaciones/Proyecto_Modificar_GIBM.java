package Operaciones;

import java.util.Vector;
import java.sql.*;

public class Proyecto_Modificar_GIBM {

    private String ID;
    private String Nombre_Pro_GIBM;
    private String Grupo;
    private String Estado;

    public static synchronized Vector DatosGIBM(String Pro) throws SQLException {
        Vector Proyectos = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT * FROM proyectos WHERE Grupo='01' AND ID= ?");
        st.setString(1, Pro);
        ResultSet rs = st.executeQuery();
        Proyectos = new Vector();

        if (rs.next()) {
            Proyectos.add(new Proyecto_Modificar_GIBM(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Proyectos;

    }

    public Proyecto_Modificar_GIBM(String ID, String Nombre_Pro_GIBM, String Grupo, String Estado) {
        this.ID = ID;
        this.Nombre_Pro_GIBM = Nombre_Pro_GIBM;
        this.Grupo = Grupo;
        this.Estado = Estado;
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
