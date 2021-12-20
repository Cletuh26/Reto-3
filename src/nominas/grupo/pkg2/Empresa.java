package nominas.grupo.pkg2;

import Sleer1.SLeer1;

public class Empresa {
    //----ATRIBUTOS----//
    private String nombreEmpresa;
    private String domicilioEmpresa;
    private String cif;
    private String cccEmpresa;
    
    //----MÉTODOS----//
    //CONSTRUCTOR
    public Empresa(){
        nombreEmpresa = SLeer1.datoString("Nombre de la empresa: ");
        domicilioEmpresa = SLeer1.datoString("Dirección de la empresa: ");
        cif = SLeer1.datoString("CIF de la empresa: ");
        cccEmpresa = SLeer1.datoString("CCC de la empresa: ");
    }
}
