package org.citas2902082.java.entities;

public abstract class Usuario{
    public int id;
    public String nombres;
    public String apellidos;
    public TipoIdentificacion tipoIdentificacion;
    public Long numeroIdentificación ;

    public Usuario() {
    }

    public Usuario(Integer id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificacion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificación = numeroIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Long getNumeroIdentificación() {
        return numeroIdentificación;
    }

    public void setNumeroIdentificación(Long numeroIdentificación) {
        this.numeroIdentificación = numeroIdentificación;
    }

    @Override
    public String toString() {
        return "Usuario [nombres=" + nombres + ", apellidos=" + apellidos + "]";
    }

    


}
