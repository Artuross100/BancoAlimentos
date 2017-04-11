package Controller;

import Entidades.CondicionFisica;
import Entidades.CondicionSocial;
import Entidades.Enfermedad;
import Entidades.EstadoCivil;
import Entidades.EstadoMujer;
import Entidades.Genero;
import Entidades.GrupoAlimentos;
import Entidades.InfoGeneral;
import Entidades.NivelEscolar;
import Entidades.Pagina;
import Entidades.Parentesco;
import Entidades.Producto;
import Entidades.TipoIdentificacion;
import Entidades.TipoVivienda;
import Entidades.UnidadMedida;
import Negocio.Negocio;
import java.util.ArrayList;

public class Controlador {

    private Negocio negocio;

    public Controlador() {
        this.negocio = new Negocio();
    }

    public String registrarTipoIdentificacion(String tipo) {
        return this.negocio.registrarTipoIdentificacion(tipo);
    }

    public String registrarCondicionFisica(String tipo) {
        return this.negocio.registrarCondicionFisica(tipo);
    }

    public String registrarCondicionSocial(String tipo) {
        return this.negocio.registrarCondicionSocial(tipo);
    }

    public String registrarEnfermedad(String tipo) {
        return this.negocio.registrarEnfermedad(tipo);
    }

    public String registrarEstadoCivil(String tipo) {
        return this.negocio.registrarEstadoCivil(tipo);
    }

    public String registrarEstadoMujer(String tipo) {
        return this.negocio.registrarEstadoMujer(tipo);
    }

    public String registrarGenero(String tipo) {
        return this.negocio.registrarGenero(tipo);
    }

    public String registrarNivelEscolar(String tipo) {
        return this.negocio.registrarNivelEscolar(tipo);
    }

    public String registrarParentesco(String tipo) {
        return this.negocio.registrarParentesco(tipo);
    }

    public String registrarTipoVivienda(String tipo) {
        return this.negocio.registrarTipoVivienda(tipo);
    }

    public ArrayList<CondicionFisica> listarCondicionFisica() {
        return this.negocio.listarCondicionFisica();
    }

    public ArrayList<CondicionSocial> listarCondicionSocial() {
        return this.negocio.listarCondicionSocial();
    }

    public ArrayList<Enfermedad> listarEnfermedad() {
        return this.negocio.listarEnfermedad();
    }

    public ArrayList<EstadoCivil> listarEstadoCivil() {
        return this.negocio.listarEstadoCivil();
    }

    public ArrayList<EstadoMujer> listarEstadoMujer() {
        return this.negocio.listarEstadoMujer();
    }

    public ArrayList<Genero> listarGenero() {
        return this.negocio.listarGenero();
    }

    public ArrayList<NivelEscolar> listarNivelEscolar() {
        return this.negocio.listarNivelEscolar();
    }

    public ArrayList<Parentesco> listarParentesco() {
        return this.negocio.listarParentesco();
    }

    public ArrayList<TipoIdentificacion> listarTipoIdentificacion() {
        return this.negocio.listarTipoIdentificacion();
    }

    public ArrayList<TipoVivienda> listarTipoVivienda() {
        return this.negocio.listarTipoVivienda();
    }

    public boolean insertarMision(String mision) {
        return this.negocio.insertarMision(mision);
    }

    public boolean insertarVision(String vision) {
        return this.negocio.insertarVision(vision);
    }

    public boolean insertarObjetivos(String objetivos) {
        return this.negocio.insertarObjetivos(objetivos);
    }

    public boolean insertarQuienesSomos(String quienesSomos) {
        return this.negocio.insertarQuienesSomos(quienesSomos);
    }

    public boolean insertarBancoDescripcion(String bancoDescripcion) {
        return this.negocio.insertarBancoDescripcion(bancoDescripcion);
    }

    public boolean insertarPrincipios(String principios) {
        return this.negocio.insertarPrincipios(principios);
    }

    public InfoGeneral cargarInfoGeneral() {
        return this.negocio.cargarInfoGeneral();
    }

    public boolean insertarUnidadMedida(String descripcion) {
        return this.negocio.insertarUnidadMedida(descripcion);
    }

    public ArrayList<UnidadMedida> cargarUnidadMedida() {
        return this.negocio.cargarUnidadMedida();
    }

    public boolean insertarGrupoAlimentos(String descripcion) {
        return this.negocio.insertarGrupoAlimentos(descripcion);
    }

    public ArrayList<GrupoAlimentos> cargarGrupoAlimentos() {
        return this.negocio.cargarGrupoAlimentos();
    }

    public boolean registrarProducto(String codigo, long unidad, String nombre,
            float peso, float medida, long grupo) {
        return this.negocio.registrarProducto(codigo, unidad, nombre, peso, medida, grupo);
    }

    public ArrayList<Producto> cargarProductos() {
        return this.negocio.cargarProductos();
    }
    
    public boolean registrarPagina(long carpeta, String ruta, String titulo) {
        return this.negocio.registrarPagina(carpeta, ruta, titulo);
    }
    
    public ArrayList<Pagina> cargarPagina() {
        return this.negocio.cargarPagina();
    }
}
