package org.citas2902082.java;

import org.citas2902082.java.entities.Especialidad;
import org.citas2902082.java.entities.Medico;
import org.citas2902082.java.entities.TipoIdentificacion;

public class Main {
    public static void main(String[] args) {
        Medico m1 = new Medico(1, "cristian", "buitrago", TipoIdentificacion.CC, 102589654L, 121454245, Especialidad.PSICOLOGIA);

        System.out.println(m1.toString());



    }
}