package Operaciones;

import java.util.Vector;
import java.sql.*;

public class Consultar_Proyectos {

    private String Nombre;
    private String Estado;
    private String ID;

    public static synchronized Vector ListarProyectosGIBM() throws SQLException {
        Vector Proyectos = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT Nombre, Estado FROM proyectos WHERE Grupo='01'  ORDER BY  Estado ASC");
        ResultSet rs = st.executeQuery();
        Proyectos = new Vector();

        while (rs.next()) {

            Proyectos.add(new Consultar_Proyectos(rs.getString(1), rs.getString(2)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Proyectos;

    }

    public Consultar_Proyectos(String Nombre, String Estado) {
        this.Nombre = Nombre.toUpperCase();
        this.Estado = Estado.toUpperCase();

    }

    public static synchronized Vector ListarProyectosGIETRB() throws SQLException {
        Vector Proyectos = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT ID, Nombre, Estado FROM proyectos WHERE Grupo='02' ORDER BY  Estado ASC");
        ResultSet rs = st.executeQuery();
        Proyectos = new Vector();

        while (rs.next()) {

            Proyectos.add(new Consultar_Proyectos(rs.getString(1), rs.getString(2), rs.getString(3)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Proyectos;

    }

    public Consultar_Proyectos(String ID,String Nombre, String Estado) {
        this.ID = ID.trim();
        this.Nombre = Nombre.toUpperCase();
        this.Estado = Estado.toUpperCase();

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

  
}
