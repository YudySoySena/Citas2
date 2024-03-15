package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class Cita {

    public int id;
    public LocalDateTime fecha;

    public String medico;
    public Paciente paciente;
    public Consultorio consultorio;
    
    public Cita() {
    }

    public Cita(int id, LocalDateTime fecha, String medico, Paciente paciente, Consultorio consultorio) {
        this.id = id;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
        this.consultorio = consultorio;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(Consultorio consultorio) {
        this.consultorio = consultorio;
    }
    
    

}
