package DaoMySQL;

import Util.Conexion;
import java.io.Serializable;
import java.sql.SQLException;

public class UsuarioDao implements Serializable{
    
    private Conexion conexion;
    
    public UsuarioDao() throws SQLException{
        this.conexion = new Conexion();
    }
    
}
