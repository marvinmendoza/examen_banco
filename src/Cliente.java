
public class Cliente {
    public String nombre;
    public String DPI;

    public Cliente(String nombre, String DPI) {
        this.nombre = nombre;
        this.DPI = DPI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDPI() {
        return DPI;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }
    
}
