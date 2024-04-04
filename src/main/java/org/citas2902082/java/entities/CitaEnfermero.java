package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class CitaEnfermero extends Cita implements IAgendable{

    private String procedimiento;
    private String enfermero;

    public CitaEnfermero(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio,
            String procedimiento, String enfermero) {
        super(id, fecha, paciente, consultorio);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
    }

    public String getProcedimiento() {
        return procedimiento;
    }
    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }
    public String getEnfermero() {
        return enfermero;
    }
    public void setEnfermero(String enfermero) {
        this.enfermero = enfermero;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }

    @Override
    public void cancelarCita() {
        System.out.println("CITA DE ENFERMERIA CANCELADA");
    }

    @Override
    public void reAgendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
    }

    

}
