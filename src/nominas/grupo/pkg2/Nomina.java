package nominas.grupo.pkg2;

import Sleer1.SLeer1;

public class Nomina {
    //----ATRIBUTOS OBJETO----//
    private Empresa empresa;
    private Trabajador trabajador;
    
    //----ATRIBUTOS----//
    //ATRIBUTOS DEVENGOS
    private double salariobase;
    private double plusconvenio;
    private double totaldevengado;
    //private int dias;
    
    //ATRIBUTOS DEDUCCIONES
    private double contingcomun;
    private double desempleo;
    private double fp;
    private double irpf;
    private double totaldeducciones;
    private int mes;
    
    //ATRIBUTOS FINALES
    private double totalnomina;
    
    //ATRIBUTOS DE EMPRESA
    private double contcomEmpresa;
    private double desempleoEmpresa;
    private double fpEmpresa;
    private double accidenteTrabajo;
    private double fogasa;
    private double totalEmpresa;
    
    //----MÉTODOS----//
    //CONSTRUCTOR
    public Nomina() {
        empresa = new Empresa();
        trabajador = new Trabajador();
        do{
        mes = SLeer1.datoInt("Mes trabajado( (enero) 1 - 12 (diciembre) ): ");
        if (mes <1 || mes >12){
            System.err.println("Error, introduce un número entre 1 y 12...");
        }
        }while (mes<1||mes>12);
        /*do{
        dias = SLeer1.datoInt("Dias trabajados( 1-31 ): ");
        }while (mes<1||mes>31);*/
    }

    //MOSTRAR MES EN IMPRIMENOMINA()
    public String mostrarMes(){
        String tmp = "";
        switch (mes){
            case 1: tmp = "Enero"; break;
            case 2: tmp = "Febrero"; break;
            case 3: tmp = "Marzo"; break;
            case 4: tmp = "Abril"; break;
            case 5: tmp = "Mayo"; break;
            case 6: tmp = "Junio"; break;
            case 7: tmp = "Julio"; break;
            case 8: tmp = "Agosto"; break;
            case 9: tmp = "Septiembre"; break;
            case 10: tmp = "Cctubre"; break;
            case 11: tmp = "Noviembre"; break;
            case 12: tmp = "Diciembre"; break;
        }
        return tmp;
    }
    
    //MÉTODO PARA REDONDEAR VALORES
    public double redondear(double numero, int decimales) {
        return Math.round(numero * Math.pow(10, decimales)) / Math.pow(10, decimales);
    }
    
    //CALCULAR LOS DATOS DE LA NOMINA
    public void calcularNomina() {
        //----DEVENGOS----//
        salariobase = trabajador.getSalarioBase()/12;
        plusconvenio = trabajador.getPlusConvenio()/12;
        totaldevengado = salariobase+plusconvenio;
        
        //----DEDUCCIONES----//
        contingcomun = totaldevengado*0.047;
        desempleo = totaldevengado*0.0155;
        fp = totaldevengado*0.0010;
        irpf = totaldevengado*0.02;
        totaldeducciones = contingcomun+desempleo+fp+irpf;
        
        //----SALARIO FINAL----//
        totalnomina = totaldevengado-totaldeducciones;
        
        //----DEDUCCIONES DE LA EMPRESA----//
        contcomEmpresa = totaldevengado*0.236;
        desempleoEmpresa = totaldevengado*0.055;
        fpEmpresa = totaldevengado*0.006;
        accidenteTrabajo = totaldevengado*0.0015;
        fogasa = totaldevengado*0.02;
        totalEmpresa = contcomEmpresa+fpEmpresa+accidenteTrabajo+fogasa;
        
    }
    
    //MÉTODO ENCARGADO DE FORMATEAR LA NÓMINA PARA QUE SE MUESTRE BONITO
    public void imprimeNomina(){
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("\tNómina de " + trabajador.getNombreTrabajador() + " con DNI " + trabajador.getDniTrabajador() + " del mes de " + mostrarMes() + "\n");
        System.out.println("\t** DEVENGOS **");
        System.out.println("\t\tSalario base: " + redondear(salariobase,2) + " \u20AC");
        System.out.println("\t\tPlus de convenio: " + redondear(plusconvenio,2) + " \u20AC");
        System.out.println("\t\t----------------------------");
        System.out.println("\t\tTotal devengado: " + redondear(totaldevengado,2) + " \u20AC\n");
        System.out.println("\t** DEDUCCIONES **");
        System.out.println("\t\tContigencias comunes: " + redondear(contingcomun,2) + " \u20AC");
        System.out.println("\t\tDesempleo: " + redondear(desempleo,2) + " \u20AC");
        System.out.println("\t\tFormación profesional: " + redondear(fp,2) + " \u20AC");
        System.out.println("\t\tIRPF: " + redondear(irpf,2) + " \u20AC");
        System.out.println("\t\t----------------------------");
        System.out.println("\t\tTotal deducido: " + redondear(totaldeducciones,2) + " \u20AC\n\n");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("\t\tTotal a percibir: " + redondear(totalnomina,2) + " \u20AC\n");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("\t\tAportación de la empresa\n");
        System.out.println("\t\tContingencias comunes: " + redondear(contcomEmpresa,2) + " \u20AC");
        System.out.println("\t\tDesempleo: " + redondear(desempleoEmpresa,2) + " \u20AC");
        System.out.println("\t\tFormación profesional: " + redondear(fpEmpresa,2) + " \u20AC");
        System.out.println("\t\tAT y EP: " + redondear(accidenteTrabajo,2) + " \u20AC");
        System.out.println("\t\tFOGASA: " + redondear(fogasa,2) + " \u20AC");
        System.out.println("\t\t----------------------------");
        System.out.println("\t\tTotal a aportar: " + redondear(totalEmpresa,2) + " \u20AC");
        System.out.println("---------------------------------------------------------------------------------");
    }
}