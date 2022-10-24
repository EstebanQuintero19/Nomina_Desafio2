package com.esteban.nomina.dominio;

public class Vendedor extends Director {
    private long ventasDelMes;
    private static final double COMISION_MAYOR = 0.035;
    private static final double COMISION_MENOR = 0.045;
    private static final double SALARIO_MINIMO = 0.045;


    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        this.ventasDelMes= ventasDelMes;
    }

    @Override
    protected long calcularSalario() {
        return super.calcularSalario() + calcularComision();
    }
    public String getNombre() {
        return super.getNombre();
    }

    public long calcularComision(){

        if (calcularSalario() < SALARIO_MINIMO) {
            return (long) (ventasDelMes * COMISION_MENOR);

        }else{
            return (long) (ventasDelMes * COMISION_MAYOR);

        }
    }
}
