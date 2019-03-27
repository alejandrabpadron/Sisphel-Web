package Operaciones;

import java.util.Vector;
import java.sql.*;

public class Noticia_Modificar {

    private String ID;
    private String Fecha;
    private String Nombre_Noticia;
    private String Codigo;
    private String Cuerpo;
    private String Imagen;

    public static synchronized Vector Datos(String Not) throws SQLException {
        Vector Noticias = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT ID, Fecha, Titulo, Codigo_Unisinu, Cuerpo, Imagen FROM noticias WHERE ID=?");
        st.setString(1, Not);
        ResultSet rs = st.executeQuery();
        Noticias = new Vector();

        while (rs.next()) {

            Noticias.add(new Noticia_Modificar(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6)));
        }
        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Noticias;

    }

    public Noticia_Modificar(String ID,String Fecha, String Nombre_Noticia, String Codigo, String Cuerpo, String Imagen) {
         this.ID = ID.toUpperCase();
        this.Fecha = Fecha.toUpperCase();
        this.Nombre_Noticia = Nombre_Noticia.toUpperCase();
        this.Codigo = Codigo.toUpperCase();
        this.Cuerpo = Cuerpo;
        this.Imagen=Imagen;

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getNombre_Noticia() {
        return Nombre_Noticia;
    }

    public void setNombre_Noticia(String Nombre_Noticia) {
        this.Nombre_Noticia = Nombre_Noticia;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCuerpo() {
        return Cuerpo;
    }

    public void setCuerpo(String Cuerpo) {
        this.Cuerpo = Cuerpo;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

  
}
