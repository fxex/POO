package Parcial2023;

public class Pelicula extends Programa {
    private int cantidadMinutos;
    private String rubro;

    public Pelicula(){
        super();
        this.cantidadMinutos = 0;
        this.rubro = "";
    }

    public Pelicula(String titulo, String pais, int anio, int cantidadLikes, int cantidadDislikes, int cantidadMinutos, String rubro){
        super(titulo, pais, anio, cantidadLikes, cantidadDislikes);
        this.cantidadMinutos = cantidadMinutos;
        this.rubro = rubro;
    }

    public int getCantidadMinutos() {
        return this.cantidadMinutos;
    }

    public void setCantidadMinutos(int cantidadMinutos) {
        this.cantidadMinutos = cantidadMinutos;
    }

    public String getRubro() {
        return this.rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public String toString() {
        return super.toString() +" cantidadMinutos='" + getCantidadMinutos() + "'" +
            ", rubro='" + getRubro() + "'";
    }

}
