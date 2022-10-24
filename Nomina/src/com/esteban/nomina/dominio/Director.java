package com.esteban.nomina.dominio;

public class Director {
    private long salario;
    private static final double APORTE_SALUD = 0.05;
    private static final double APORTE_PENSIONES = 0.065;

    public Director(String nombre, long salario){
        super(nombre);
        this.salario = salario;
    }
    @Override
    protected long calcularSalario() {
        return this.salario - calcularAporte();
    }
    public String getNombre() {
        return super.getNombre();
    }

    public long calcularSalud(){
        return (long) (salario * APORTE_SALUD);
    }
    public long calcularPension(){
        return (long) (salario * APORTE_PENSIONES);
    }

    public long calcularAporte(){
        return  calcularPension() + calcularSalud();
    }
}

