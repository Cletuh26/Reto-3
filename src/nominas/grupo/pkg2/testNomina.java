package nominas.grupo.pkg2;

import Sleer1.SLeer1;

public class testNomina {

    //MÉTODO PARA PEDIR SI QUIERE VOLVER A HACER UNA NÓMINA NUEVA
    public static String pideRes() {
        String res = null;
        do {
            res = SLeer1.datoString("¿Deseas introducir otra nómina (S/N)? ").toUpperCase();
        } while (!res.equals("S") & !res.equals("N"));
        return res;
    }

    public static void main(String[] args) {
        String res = null;
        do {
            Nomina n1 = new Nomina();
            n1.calcularNomina();
            n1.imprimeNomina();
            SLeer1.limpiar();
            res = pideRes();
        } while (res.equals("S"));
        System.out.println("Saliendo del programa...");
    }
}
