package ejer2;

import java.text.DecimalFormat;

public abstract class CuentaBanco {
    
    DecimalFormat df= new DecimalFormat ("#.00");
    protected long noCuenta;
    protected double saldo;
    Cliente cliente;
    
    
    
    public CuentaBanco(){
    noCuenta = 1931954687;
    saldo = 1950.35;
    cliente = new Cliente("","");
    
    }

    public CuentaBanco(long numCuenta, double saldo, Cliente cliente) {
        this.noCuenta = numCuenta;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    
    public void ingresar (double imp){
    saldo =saldo +imp;
    System.out.println("importe ingresado: "+df.format(imp)+ " Quetzales");
    }
    public abstract void retirar (double imp);
    
    
    public void actualizarSaldo(){
    System.out.println("saldo actual : "+df.format(saldo)+ " Quetzales \n");
    //saldo = 0;
    }
     
    public void verSaldoCM(){
    int t=1;
    saldo+=saldo *1.5/100*t; 
    System.out.println("saldo actual :"+df.format(saldo)+" Quetzales \n");
    //saldo=0;
    }
    
    public void verSaldoCA(double vble){
        int t=1;
        saldo+=saldo *vble/100*t;
        System.out.println("saldo actual :"+ df.format(saldo)+ " Quetzales \n ");
    
    }

    public long getNumCuenta() {
        return noCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}

