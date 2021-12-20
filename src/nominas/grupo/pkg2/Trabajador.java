package nominas.grupo.pkg2;

import Sleer1.SLeer1;

public class Trabajador {

    //----ATRIBUTOS----//
    private String nomtrabajador;
    private String nif;
    private String seguridadsocial;
    private String grupocotizacion;
    private double salarioBase;
    private double plusConvenio;

    //----MÉTODOS----//
    //CONSTRUCTOR
    public Trabajador() {
        nomtrabajador = SLeer1.datoString("Nombre completo del trabajador: ");
        nif = SLeer1.datoString("DNI/NIF del trabajador: ");
        seguridadsocial = SLeer1.datoString("Número de la Seguridad Social del trabajador: ");
        grupocotizacion = SLeer1.datoString("Grupo de Cotización del trabajador: ");
        switch (grupocotizacion) {
            case "a1":
            case "A1":
                salarioBase = 17512.35;
                plusConvenio = 1233.97;
                break;
            case "b1":
            case "B1":
                salarioBase = 16548.44;
                plusConvenio = 1167.21;
                break;
            case "b2":
            case "B2":
                salarioBase = 14705.97;
                plusConvenio = 1037.58;
                break;
            case "c1":
            case "C1":
                salarioBase = 12861.71;
                plusConvenio = 904.95;
                break;
            case "c2":
            case "C2":
                salarioBase = 12204.63;
                plusConvenio = 869.04;
                break;
            case "c3":
            case "C3":
                salarioBase = 11744.46;
                plusConvenio = 836.27;
                break;
            case "d1":
            case "D1":
                salarioBase = 11750.91;
                plusConvenio = 823.04;
                break;
            case "d2":
            case "D2":
                salarioBase = 11542.44;
                plusConvenio = 781.10;
                break;
            case "d3":
            case "D3":
                salarioBase = 11260.18;
                plusConvenio = 761.98;
                break;
            case "e1":
            case "E1":
                salarioBase = 10385.37;
                plusConvenio = 727.32;
                break;
            case "e2":
            case "E2":
                salarioBase = 10307.37;
                plusConvenio = 721.93;
                break;
            case "e3":
            case "E3":
                salarioBase = 10167.70;
                plusConvenio = 712.17;
                break;
        }
    }

    //CALCULAR SALARIO EN LA CLASE NÓMINA
    public double getSalarioBase() {
        return salarioBase;
    }

    //CALCULAR PLUS DE CONVENIO EN LA CLASE NÓMINA
    public double getPlusConvenio() {
        return plusConvenio;
    }
    
    //MOSTRAR EL NOMBRE DEL TRABAJADOR EN LA CLASE NÓMINA
    public String getNombreTrabajador(){
        return nomtrabajador;
    }
    
    //MOSTRAR EL DNI DEL TRABAJADOR EN LA CLASE NÓMINA
    public String getDniTrabajador(){
        return nif;
    }
}
