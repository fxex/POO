package Impresora;

public class Document {
    private String nombre;
    private int cantidadHojas;
    
    public Document(){
        this.nombre = "";
        this.cantidadHojas = 0;
    }

    public Document(String nombre, int cantHojas){
        this.nombre = nombre;
        this.cantidadHojas = cantHojas;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadHojas() {
        return this.cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }

}
