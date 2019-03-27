package Operaciones;

import java.util.Vector;
import java.sql.*;

public class Consultar_Premios {

    private String ID;
    private String Evento;
    private String Premio;
    private String Trabajo;
    private String Categoria;

    public static synchronized Vector ListarPremiosGIBM() throws SQLException {
        Vector Premios = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT Evento, Premio,Trabajo,Categoria FROM premios WHERE Grupo='01' ORDER BY Categoria ASC");
        ResultSet rs = st.executeQuery();
        Premios = new Vector();

        while (rs.next()) {

            Premios.add(new Consultar_Premios(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Premios;

    }

    public Consultar_Premios(String Evento, String Premio, String Trabajo, String Categoria) {
        this.Evento = Evento.toUpperCase();
        this.Premio = Premio.toUpperCase();
        this.Trabajo = Trabajo.toUpperCase();
        this.Categoria = Categoria.toUpperCase();

    }
    public static synchronized Vector ListarPremiosGIETRB() throws SQLException {
        Vector Premios = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT ID,Evento, Premio,Trabajo,Categoria FROM premios WHERE Grupo='02' ORDER BY Categoria ASC");
        ResultSet rs = st.executeQuery();
        Premios = new Vector();

        while (rs.next()) {

            Premios.add(new Consultar_Premios(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Premios;

    }

    public Consultar_Premios(String ID,String Evento, String Premio, String Trabajo, String Categoria) {
        this.ID=ID.toUpperCase();
        this.Evento = Evento.toUpperCase();
        this.Premio = Premio.toUpperCase();
        this.Trabajo = Trabajo.toUpperCase();
        this.Categoria = Categoria.toUpperCase();

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

    public String getPremio() {
        return Premio;
    }

    public void setPremio(String Premio) {
        this.Premio = Premio;
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

  
}
