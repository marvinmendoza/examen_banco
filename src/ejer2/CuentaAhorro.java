
package ejer2;

import java.text.DecimalFormat;


public class CuentaAhorro extends CuentaBanco {
    DecimalFormat df= new DecimalFormat ("#.00");
    private double variable;
    private double salMin;
    
     public CuentaAhorro(){
    super();
    }

    public CuentaAhorro(long numCuenta, double saldo, Cliente cliente , double variable , double salMin) {
        super(numCuenta,saldo,cliente);
        this.variable = variable;
        this.salMin = salMin;
    }
    
    public void retirar(double imp){
        double aux =0;
        aux=saldo -imp;
        if (aux>=salMin){
        saldo=saldo-imp;
        
        System.out.println("importe acreditado: "+df.format(imp)+ " Quetzales ");
        }else 
            System.out.println("importe a retirar : "+df.format(imp)+" Quetzales \nNo se puede realizar la operacion");
        }
    //saldo="";
    public void cambiarInteres(double vble){
        
        System .out.println("nuevo interes: "+vble);
    }

    
    public double getVariable() {
        return variable;
    }
     public String toString(){
        return "No. CUENTA: "+noCuenta+
                "\nSaldo: "+df.format(saldo)+" Quetzales\nInteres variable anual: "+variable +"%\nSaldo minimo exigido: "+
                df.format(salMin)+ " Quetzales";
        
    }
     
    
}
