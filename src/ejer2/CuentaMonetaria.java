
package ejer2;

import java.text.DecimalFormat;


public class CuentaMonetaria extends CuentaBanco {

    DecimalFormat df= new DecimalFormat ("#.00");
    private final double FIJO= 1.5; 
    public CuentaMonetaria(){
    super();
    }
    
    public CuentaMonetaria(long numCuenta, double saldo, Cliente cliente){
        
        super(numCuenta, saldo, cliente);        
    }
    @Override
    public void retirar (double imp){
       
    if (saldo>=imp){
        saldo= saldo- imp;
        System.out.println("importe retirado: "+df.format(imp)+ " Quetzales");    
    }else 
        System.out.println("no se puede realizar la operacion");
        
        }
    
    @Override
        public String toString(){
        return "No. CUENTA: "+noCuenta+
                "\nSaldo: "+df.format(saldo)+" Quetzales\nInteres fijo: "+FIJO+"%";
    
    }
    
}
