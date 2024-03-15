package org.citas2902082.java.entities;

import java.time.LocalDateTime;

public class CitaEnfermero extends Cita{

    private String procedimiento;
    private String enfermero;
    public CitaEnfermero(int id, LocalDateTime fecha, String medico, Paciente paciente, Consultorio consultorio,
            String procedimiento, String enfermero) {
        super(id, fecha, medico, paciente, consultorio);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
    }
    public CitaEnfermero(String procedimiento, String enfermero) {
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

    

}
