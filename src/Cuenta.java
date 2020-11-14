public class Cuenta {

    static long numero_de_cuenta = 100001;
    float DNI;
    float saldo_actual;
    float interes_anual;

    //CONSTRUCTOR POR DEFECTO
    public Cuenta() {
    }

    //CONSTRUCTOR CON DNI, SALDO E INTERÉS
    public Cuenta(float DNI, float saldo_actual, float interes_anual) {
        this.DNI = DNI;
        this.saldo_actual = saldo_actual;
        this.interes_anual = interes_anual;
    }

    //ACCEDENTES
    public static long getNumero_de_cuenta() {
        return numero_de_cuenta++;
    }

    public float getDNI() {
        return DNI;
    }

    public float getSaldo_actual() {
        return saldo_actual;
    }

    public float getInteres_anual() {
        return interes_anual;
    }

    //MUTADORES.... Para el número de cuenta no habrá mutador
    public void setDNI(float DNI) {
        this.DNI = DNI;
    }

    public void setSaldo_actual(float saldo_actual) {
        this.saldo_actual = saldo_actual;
    }

    public void setInteres_anual(float interes_anual) {
        this.interes_anual = interes_anual;
    }

    //actualizarSaldo(): actualizará saldo de la cuenta aplicándole el interés diario
    //(interés anual dividido entre 365 aplicado al saldo actual)
    public float actualizarSaldo() {
        float saldo_nuevo;
        saldo_nuevo = saldo_actual + (saldo_actual * ((interes_anual / 100) / 365));
        return saldo_nuevo;
    }

    //ingresar(double): permitirá ingresar una cantidad en la cuenta
    public double ingresar(double cant_ingresada) {
        double nuevo_monto;
        nuevo_monto = actualizarSaldo() + cant_ingresada;
        return nuevo_monto;
    }

    //retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo)
    public double retirar(double cant_retiro) {
        double nuevo_monto = 0;
        if (this.saldo_actual >= cant_retiro) {
            nuevo_monto = actualizarSaldo() - cant_retiro;
        } else {
            System.out.println("No hay saldo suficiente en su cuenta!!");
        }
        return nuevo_monto;
    }

    //Método que permita mostrar todos los datos de la cuenta. El número de 
    //cuenta se incrementa en 1 por cada cuenta ingresada
    void mostrar(double ing, double ret) {
        System.out.println("Numero de cuenta:" + Cuenta.getNumero_de_cuenta());
        System.out.println("Número de DNI: " + this.DNI);
        System.out.println("Interes anual:" + this.interes_anual);
        System.out.println("Saldo actual:" + actualizarSaldo());
        System.out.println("Saldo despues del ingreso realizado:" + ingresar(ing));
        System.out.println("Saldo despues del retiro realizado:" + retirar(ret));

    }
}
