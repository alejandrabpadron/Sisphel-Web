package Operaciones;

import java.util.Vector;
import java.sql.*;

public class Premios_Modificar_GIBM {

    private String ID;
    private String Evento;
    private String Nombre_Pre_GIBM;
    private String Trabajo;
    private String Categoria;
    private String Grupo;

    public static synchronized Vector DatosGIBM(String Pre) throws SQLException {
        Vector Produccion = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT * FROM premios WHERE Grupo='01' AND ID= ?");
        st.setString(1, Pre);
        ResultSet rs = st.executeQuery();
        Produccion = new Vector();

        if (rs.next()) {
            Produccion.add(new Premios_Modificar_GIBM(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Produccion;

    }

    public Premios_Modificar_GIBM(String ID, String Evento, String Nombre_Pre_GIBM, String Trabajo, String Categoria, String Grupo) {
        this.ID = ID;
        this.Evento = Evento.toUpperCase();
        this.Nombre_Pre_GIBM = Nombre_Pre_GIBM.toUpperCase();
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

    public String getNombre_Pre_GIBM() {
        return Nombre_Pre_GIBM;
    }

    public void setNombre_Pre_GIBM(String Nombre_Pre_GIBM) {
        this.Nombre_Pre_GIBM = Nombre_Pre_GIBM;
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
