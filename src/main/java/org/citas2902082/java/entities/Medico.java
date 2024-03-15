package org.citas2902082.java.entities;

public class Medico extends Usuario{
    public int registroMedico;
    public Especialidad especialidad;
    
    public Medico() {
    }

    public Medico(int id, String nombres, String apellidos, TipoIdentificacion tipoIdentificacion,
            Long numeroIdentificación, int registroMedico, Especialidad especialidad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificación = numeroIdentificación;
        this.registroMedico = registroMedico;
        this.especialidad = especialidad;
    }

   
    public int getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(int registroMedico) {
        this.registroMedico = registroMedico;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return
        super.toString() + "Medico [registroMedico=" + registroMedico + ", especialidad=" + especialidad + "]";
    }


}
