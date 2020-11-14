package ejer2;

public class Problema1 {

public static void main (String[]args){
CuentaMonetaria cc=new CuentaMonetaria();
Cliente p=new Cliente("Christian López","DPI: 7895 45865 0101");
System.out.println(p.toString());
System.out.println(cc.toString());
cc.retirar(600);
cc.actualizarSaldo();
cc.verSaldoCM();

CuentaMonetaria cc2=new CuentaMonetaria();
Cliente p01=new Cliente("Lis Gabriel","DPI: 8956 45689 0101");
System.out.println(p01.toString());
System.out.println(cc2.toString());
cc2.retirar(500);
cc2.actualizarSaldo();
cc2.verSaldoCM();




//Cliente p1=new Cliente("Marvin", "Mendoza", "7395456");
Cliente p1=new Cliente("Marvin Mendoza", "DPI: 2856 76468 0101");
System.out.println(p1.toString());
CuentaAhorro ca=new CuentaAhorro(1564848484,1230.48,p1,3.5,100);
System.out.println(ca.toString());
//por cada operacion actualizo el dato
ca.cambiarInteres(3.5);
ca.retirar(1200);
ca.actualizarSaldo();
ca.retirar(600);
ca.actualizarSaldo();
ca.ingresar(400);
ca.actualizarSaldo();
ca.verSaldoCA(ca.getVariable());



Cliente p2=new Cliente("Salvando Semestre", "DPI: 2020 7658 0101");
System.out.println(p2.toString());
CuentaAhorro car=new CuentaAhorro(78952313,1300.50,p2,4.5,100);
System.out.println(car.toString());
//por cada operacion actualizo el dato
car.cambiarInteres(4.5);
car.retirar(900);
car.actualizarSaldo();
car.retirar(600);
car.actualizarSaldo();
car.ingresar(400);
car.actualizarSaldo();
car.verSaldoCA(car.getVariable());




}    
}
