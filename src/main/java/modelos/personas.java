package modelos;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "personas")
public class personas {
    @Id
    @GeneratedValue
    @Column(name = "id_persona")
    private int idPersona;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;

    @Column(name = "numero_documento")
    private String numeroDocumento;
    @Column(name = "correo_electronico")
    private String correo;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    @Column(name = "fecha_actualizacion")
    private Date fechaActualizacion;
    @ManyToOne
    @JoinColumn(name = "id_tipo_documento")
    private tipoDocumento idTipoDocumento;

    @ManyToOne
    @JoinColumn(name = "id_genero")
    private generos idGenero;

    public personas() {
    }

    public personas(int idPersona, String nombre, String apellido, String numeroDocumento, String correo, String telefono, Date fechaCreacion, Date fechaActualizacion, tipoDocumento idTipoDocumento, generos idGenero) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
        this.correo = correo;
        this.telefono = telefono;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.idTipoDocumento = idTipoDocumento;
        this.idGenero = idGenero;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public tipoDocumento getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(tipoDocumento idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public generos getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(generos idGenero) {
        this.idGenero = idGenero;
    }

    @Override
    public String toString() {
        return "personas{" +
                "idPersona=" + idPersona +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", fechaActualizacion=" + fechaActualizacion +
                ", idTipoDocumento=" + idTipoDocumento +
                ", idGenero=" + idGenero +
                '}';
    }
}
