package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class CitaMedico  extends Cita implements IAgendable{

    private String motivo;
    private String medico;
    private Estados estados;

    public CitaMedico(int id, LocalDateTime fecha, String medico, Paciente paciente, Consultorio consultorio,
            String motivo, String medico2) {
        super(id, fecha, medico, paciente, consultorio);
        this.motivo = motivo;
        medico = medico2;
    }
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

    
}
