package Operaciones;

import java.sql.*;
import java.util.Vector;

public class Buscar_Noticias {

    private String ID;
    private String Fecha;
    private String Nombre_Noticias;
    private String Codigo;
    private String Cuerpo;
    private String Imagen;

    public Buscar_Noticias(String ID, String Fecha, String Nombre_Noticias, String Codigo, String Cuerpo, String Imagen) {
        this.ID = ID;
        this.Fecha = Fecha.toUpperCase();
        this.Nombre_Noticias = Nombre_Noticias.toUpperCase();
        this.Codigo = Codigo.toUpperCase();
        this.Cuerpo = Cuerpo.toUpperCase();
        this.Imagen = Imagen;
    }

    public static synchronized Vector Buscar(String Nombre_Noticias) throws SQLException {
        Vector Noticias = null;
        DBManager dbm = new DBManager();
        Connection con = dbm.getConnection();

        PreparedStatement st = con.prepareStatement("SELECT ID, Fecha, Titulo,Codigo_Unisinu, Cuerpo, Imagen FROM noticias WHERE Titulo LIKE ?");

        st.setString(1, "%" + Nombre_Noticias + "%");
        ResultSet rs = st.executeQuery();

        Noticias = new Vector();

        while (rs.next()) {
            Noticias.add(new Buscar_Noticias(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
        }

        rs.close();
        st.close();
        dbm.closeConnection(con);
        return Noticias;

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

    public String getNombre_Noticias() {
        return Nombre_Noticias;
    }

    public void setNombre_Noticias(String Nombre_Noticias) {
        this.Nombre_Noticias = Nombre_Noticias;
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
