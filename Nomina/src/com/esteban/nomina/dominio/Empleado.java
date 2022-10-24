package com.esteban.nomina.dominio;


    public abstract class Empleado {
        private String nombre;


        public Empleado(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        protected abstract long calcularSalario();
    }

