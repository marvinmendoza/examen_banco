
package ejer2;


public class Cliente {
    
    
    protected String nombre;
    protected String dpi;
   // protected String nif;

    public Cliente(String nombre, String dpi) {
        this.nombre = nombre;
        this.dpi = dpi;
       // this.nif = nif;
    }
/*public Cliente (){
nombre= "Estuardo Ramírez";
dpi="DPI: 2830 77480 0101";
//n="26314852";
}*/

   
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }
/*
    public String getN() {
        return n;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }*/
/*
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif + '}';
    }*/
    @Override
    public String toString(){
        return "CLIENTE: "+nombre+" "+dpi;
               // "\nNIF: "+nif;
    
    }
    
    
}
