package com.esteban.nomina.dominio;

public class Freelancer extends Empleado {

    private long valorHora;
    private int horasTrabajadas;


    @Override
    protected long calcularSalario() {
        return valorHora*horasTrabajadas;
    }
    public String getNombre() {
        return super.getNombre();
    }


    public Freelancer(String nombre) {
        super(nombre);
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
    }
}

