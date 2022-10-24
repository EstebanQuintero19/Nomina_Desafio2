package com.esteban.nomina.dominio;

import java.util.ArrayList;
import java.util.List;


    public class Nomina {
        private List<Empleado> empleados;

        public Nomina(List<Empleado> empleados) {
            this.empleados = new ArrayList<>();
        }

        public void agregarEmpleado(Empleado empleado) {
            empleados.add(empleado);
        }


    public List<String> calcularNomina() {
        List<String> nomina = new ArrayList<>();
        String empleado = "";
        for (Empleado empleadito : empleados) {
            empleado = empleadito.getNombre() + "gana esto al mes" + empleadito.calcularSalario();
        }
        return nomina;
    }

    public void listarDirectos(){

    }
    public void listarFrelancers(){

    }
}
