package Negocio;

import DaoMySQL.*;
import Entidades.*;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

public class Negocio implements Serializable {

    public Negocio() {

    }

    public String registrarTipoIdentificacion(String tipo) {
        try {
            TipoDocumentoDao t = new TipoDocumentoDao();
            if (t.registrarDocumento(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarCondicionFisica(String tipo) {
        try {
            CondicionFisicaDao t = new CondicionFisicaDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarCondicionSocial(String tipo) {
        try {
            CondicionSocialDao t = new CondicionSocialDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarEnfermedad(String tipo) {
        try {
            EnfermedadDao t = new EnfermedadDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarEstadoCivil(String tipo) {
        try {
            EstadoCivilDao t = new EstadoCivilDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarEstadoMujer(String tipo) {
        try {
            EstadoMujerDao t = new EstadoMujerDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarGenero(String tipo) {
        try {
            GeneroDao t = new GeneroDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarNivelEscolar(String tipo) {
        try {
            NivelEscolarDao t = new NivelEscolarDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarParentesco(String tipo) {
        try {
            ParentescoDao t = new ParentescoDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public String registrarTipoVivienda(String tipo) {
        try {
            TipoViviendaDao t = new TipoViviendaDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public ArrayList<CondicionFisica> listarCondicionFisica() {
        try {
            CondicionFisicaDao c = new CondicionFisicaDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<CondicionSocial> listarCondicionSocial() {
        try {
            CondicionSocialDao c = new CondicionSocialDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<Enfermedad> listarEnfermedad() {
        try {
            EnfermedadDao c = new EnfermedadDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<EstadoCivil> listarEstadoCivil() {
        try {
            EstadoCivilDao c = new EstadoCivilDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<EstadoMujer> listarEstadoMujer() {
        try {
            EstadoMujerDao c = new EstadoMujerDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<Genero> listarGenero() {
        try {
            GeneroDao c = new GeneroDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<NivelEscolar> listarNivelEscolar() {
        try {
            NivelEscolarDao c = new NivelEscolarDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<Parentesco> listarParentesco() {
        try {
            ParentescoDao c = new ParentescoDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<TipoIdentificacion> listarTipoIdentificacion() {
        try {
            TipoDocumentoDao c = new TipoDocumentoDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public ArrayList<TipoVivienda> listarTipoVivienda() {
        try {
            TipoViviendaDao c = new TipoViviendaDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public boolean insertarMision(String mision) {
        try {
            InfoGeneralDao inf = new InfoGeneralDao();
            return inf.insertarMision(mision);

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean insertarVision(String vision) {
        try {
            InfoGeneralDao inf = new InfoGeneralDao();
            return inf.insertarVision(vision);

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean insertarObjetivos(String objetivos) {
        try {
            InfoGeneralDao inf = new InfoGeneralDao();
            return inf.insertarObjetivos(objetivos);

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean insertarQuienesSomos(String quienesSomos) {
        try {
            InfoGeneralDao inf = new InfoGeneralDao();
            return inf.insertarQuienesSomos(quienesSomos);

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean insertarBancoDescripcion(String bancoDescripcion) {
        try {
            InfoGeneralDao inf = new InfoGeneralDao();
            return inf.insertarBancoDescripcion(bancoDescripcion);

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean insertarPrincipios(String principios) {
        try {
            InfoGeneralDao inf = new InfoGeneralDao();
            return inf.insertarPrincipios(principios);

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public InfoGeneral cargarInfoGeneral() {
        try {
            InfoGeneralDao inf = new InfoGeneralDao();
            return inf.cargarInfoGeneral();

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean insertarUnidadMedida(String descripcion) {
        try {
            UnidadMedidaDao inf = new UnidadMedidaDao();
            return inf.registrar(descripcion);

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public ArrayList<UnidadMedida> cargarUnidadMedida() {
        try {
            UnidadMedidaDao inf = new UnidadMedidaDao();
            return inf.cargar();

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean insertarGrupoAlimentos(String descripcion) {
        try {
            GrupoAlimentosDao inf = new GrupoAlimentosDao();
            return inf.registrar(descripcion);

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public ArrayList<GrupoAlimentos> cargarGrupoAlimentos() {
        try {
            GrupoAlimentosDao inf = new GrupoAlimentosDao();
            return inf.cargar();

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean registrarProducto(String codigo, long unidad, String nombre,
            float peso, float medida, long grupo) {
        try {
            Producto p = new Producto(codigo, nombre, peso, medida, 0);
            UnidadMedida u = new UnidadMedida();
            u.setId(unidad);
            GrupoAlimentos g = new GrupoAlimentos();
            g.setId(grupo);
            p.setGrupo(g);
            p.setUnidad(u);
            ProductoDao pro = new ProductoDao();
            return pro.registrar(p);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public ArrayList<Producto> cargarProductos() {
        try {
            ProductoDao pro = new ProductoDao();
            return pro.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean registrarPagina(long carpeta, String ruta, String titulo) {
        try{
            PaginaDao pag = new PaginaDao();
            return pag.registrar(new Pagina(0,carpeta, ruta, titulo));
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<Pagina> cargarPagina() {
        try{
            PaginaDao pag = new PaginaDao();
            return pag.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public String registrarTipoPersona(String tipo) {
        try {
            TipoPersonaDao t = new TipoPersonaDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public ArrayList<TipoPersona> listarTipoPersona() {
        try {
            TipoPersonaDao c = new TipoPersonaDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public String registrarTipoUsuario(String tipo) {
        try {
            TipoUsuarioDao t = new TipoUsuarioDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public ArrayList<TipoUsuario> listarTipoUsuario() {
        try {
            TipoUsuarioDao c = new TipoUsuarioDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public String registrarRol(String tipo) {
        try {
            RolDao t = new RolDao();
            if (t.registrar(tipo)) {
                return "Registro exitoso";
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return "Hubo un error, inténtelo mas tarde";
        }
        return "No se pudo completar la operación";
    }

    public ArrayList<Rol> listarRol() {
        try {
            RolDao c = new RolDao();
            return c.cargar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}