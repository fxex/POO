package Parcial2023;
public class Documental extends Programa{
    private int cantidadMinutos;
    private String hechoReal;

    public Documental(){
        super();
        this.cantidadMinutos = 0;
        this.hechoReal = "";
    }

    public Documental(String titulo, String pais, int anio, int cantidadLikes, int cantidadDislikes, int cantidadMinutos, String hechoReal){
        super(titulo, pais, anio, cantidadLikes, cantidadDislikes);
        this.cantidadMinutos = cantidadMinutos;
        this.hechoReal = hechoReal;
    }

    public int getCantidadMinutos() {
        return this.cantidadMinutos;
    }

    public void setCantidadMinutos(int cantidadMinutos) {
        this.cantidadMinutos = cantidadMinutos;
    }

    public String getHechoReal() {
        return this.hechoReal;
    }

    public void setHechoReal(String hechoReal) {
        this.hechoReal = hechoReal;
    }


    @Override
    public String toString() {
        return super.toString() +" cantidadMinutos='" + getCantidadMinutos() + "'" +
            ", hechoReal='" + getHechoReal() + "'";
    }
}
