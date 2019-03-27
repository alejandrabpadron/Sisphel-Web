package Operaciones;

import java.util.Vector;
import java.sql.*;

public class Premios_Modificar_GIETRB {

    private String ID;
    private String Evento;
    private String Nombre_Pre_GIETRB;
    private String Trabajo;
    private String Categoria;
    private String Grupo;

    public static synchronized Vector DatosGIETRB(String Pre) throws SQLException {
        Vector Produccion = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT * FROM premios WHERE Grupo='02' AND ID= ?");
        st.setString(1, Pre);
        ResultSet rs = st.executeQuery();
        Produccion = new Vector();

        if (rs.next()) {
            Produccion.add(new Premios_Modificar_GIETRB(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Produccion;

    }

    public Premios_Modificar_GIETRB(String ID, String Evento, String Nombre_Pre_GIETRB, String Trabajo, String Categoria, String Grupo) {
        this.ID = ID;
        this.Evento = Evento.toUpperCase();
        this.Nombre_Pre_GIETRB = Nombre_Pre_GIETRB.toUpperCase();
        this.Trabajo = Trabajo.toUpperCase();
        this.Categoria = Categoria.toUpperCase();
        this.Grupo = Grupo.toUpperCase();
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEvento() {
        return Evento;
    }

    public void setEvento(String Evento) {
        this.Evento = Evento;
    }

    public String getNombre_Pre_GIETRB() {
        return Nombre_Pre_GIETRB;
    }

    public void setNombre_Pre_GIETRB(String Nombre_Pre_GIETRB) {
        this.Nombre_Pre_GIETRB = Nombre_Pre_GIETRB;
    }

    public String getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        this.Trabajo = Trabajo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

}
