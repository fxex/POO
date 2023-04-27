package BaseDeDatos;

public class Tabla{
    private String nombre;
    public Tabla() {
        this.nombre = nombre;
    }

    public Tabla(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString(){
        return "La tabla se llama: " + this.nombre;
    }

}
