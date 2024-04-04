package org.citas2902082.java;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.citas2902082.java.entities.CitaMedico;
import org.citas2902082.java.entities.Consultorio;
import org.citas2902082.java.entities.Enfermero;
import org.citas2902082.java.entities.Especialidad;
import org.citas2902082.java.entities.Estados;
import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.Paciente;
import org.citas2902082.java.entities.TipoIdentificacion;
import org.citas2902082.java.entities.TipoSangre;

public class Main {
    public static void main(String[] args) {
        Medico m1 = new Medico(1, "cristian", "buitrago", TipoIdentificacion.CC, 102589654L, 121454245, Especialidad.PSICOLOGIA);
        Medico m2 = new Medico(2, "Julián", "Garcia", TipoIdentificacion.CE, 1245785414L, 154214745, Especialidad.ODONTOLOGIA);

        Paciente p1 = new Paciente(1, 
                                    "Jesus", 
                                    "Rodriguez", 
                                    TipoIdentificacion.CC, 
                                    10223569, 
                                    "Jesus@gmail.com", 
                                    310358947, 
                                    LocalDate.of(2000, 12, 15), 
                                    1.72, 
                                    56.42, 
                                    TipoSangre.A, 
                                    '+');
        Paciente p2 = new Paciente(2, "Andres", "Escobar", TipoIdentificacion.PASSPORT, 530420865, "Andres.1@gmail.com", 314045292, LocalDate.of(2015, 05, 16), 1.52, 48.63, TipoSangre.AB, '-');
        Paciente p3 = new Paciente(3, "Ivan", "Bermudez", TipoIdentificacion.TI, 535230865, "bermuIvan@gmail.com", 314236843, LocalDate.of(2012, 03, 02), 1.40, 40.62, TipoSangre.O, '+');
        Paciente p4 = new Paciente(4, "Sara", "Herrera", TipoIdentificacion.CC, 531559625, "sara23@gmail.com", 31321529, LocalDate.of(2008, 05, 19), 1.65, 50.63, TipoSangre.AB, '-');
        Paciente p5 = new Paciente(5, "Juliana", "Garcia", TipoIdentificacion.PASSPORT, 536690865, "JuliGar@gmail.com", 31216529, LocalDate.of(2002, 04, 26), 1.60, 50.89, TipoSangre.AB, '-');

        Enfermero e1 = new Enfermero(1, "julio", "ramos", TipoIdentificacion.CC, 1042894567);
        Enfermero e2 = new Enfermero(2, "maria", "perez", TipoIdentificacion.CE, 1071934996);
        Enfermero e3 = new Enfermero(3, "olga", "suarez", TipoIdentificacion.CC, 1932872556);

        Consultorio C1 = new Consultorio(1, "Cra 156 #125 c 12", 206);
        Consultorio C2 = new Consultorio(2, "Cra 156 #125 c 12", 203);


        CitaMedico cm1 = new CitaMedico(1, 
        LocalDateTime.of(2023, 02, 12, 15, 30, 00), m1, p1, C2, "Gripe", Estados.AGENDADA);
        CitaMedico cm2 = new CitaMedico(2, 
        LocalDateTime.of(2024, 03, 13, 17, 00, 00), m2, p3, C1, "Escopilamina", Estados.REAGENDADA);
            System.out.println("fecha: " + cm1.getFecha() + "|" + "Consultorio: " + C2.getNumero() + "|" + "nombre del medico: " + m1.getNombres() + "|" + "Apellidos médico: " + m1.getApellidos() + "|" + "Nombre Paciente: " + p1.getNombres() + "|" + "Apellidos Paciente: " + p1.getApellidos());
            System.out.println("fecha: " + cm2.getFecha() + "|" + "Consultorio: " + C1.getNumero() + "|" + "nombre del medico: " + m2.getNombres() + "|" + "Apellidos médico: " + m2.getApellidos() + "|" + "Nombre Paciente: " + p3.getNombres() + "|" + "Apellidos Paciente: " + p3.getApellidos());
            
            cm2.cancelarCita();
            System.out.println("Estado: " + cm2.getEstados());
    }
 



}