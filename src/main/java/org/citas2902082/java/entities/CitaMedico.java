package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class CitaMedico  extends Cita implements IAgendable{

    private String motivo;
    private String medico;
    private Estados estados;

    
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public String getMedico() {
        return medico;
    }
    public void setMedico(String medico) {
        this.medico = medico;
    }
    public CitaMedico(String motivo, String medico, Estados estados) {
        this.motivo = motivo;
        this.medico = medico;
        this.estados = estados;
    }
    public CitaMedico(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio, String motivo,
            String medico, Estados estados) {
        super(id, fecha, paciente, consultorio);
        this.motivo = motivo;
        this.medico = medico;
        this.estados = estados;
    }
    public CitaMedico(int i, LocalDateTime of, Medico m1, Paciente p1, Consultorio c2, String string,
            Estados agendada) {
        //TODO Auto-generated constructor stub
    }
    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }
    @Override
    public void cancelarCita() {
        this.estados = Estados.CANCELADA;
    }


    @Override
    public void reAgendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }
    public Estados getEstados() {
        return estados;
    }
    public void setEstados(Estados estados) {
        this.estados = estados;
    }
    @Override
    public String toString() {
        return "CitaMedico [motivo=" + motivo + ", medico=" + medico + ", estados=" + estados + "]";
    }

    

    
}
