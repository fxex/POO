package Parcial2023;

public class Programa {
    private String titulo, pais;
    private int anio, cantidadLikes, cantidadDislikes;

    public Programa(){
        this.titulo = "";
        this.pais = "";
        this.anio = 0;
        this.cantidadLikes = 0;
        this.cantidadDislikes = 0;
    }

    public Programa(String titulo, String pais, int anio, int cantidadLikes, int cantidadDislikes){
        this.titulo = titulo;
        this.pais = pais;
        this.anio = anio;
        this.cantidadLikes = cantidadLikes;
        this.cantidadDislikes = cantidadDislikes;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCantidadLikes() {
        return this.cantidadLikes;
    }

    public void setCantidadLikes(int cantidadLikes) {
        this.cantidadLikes = cantidadLikes;
    }

    public int getCantidadDislikes() {
        return this.cantidadDislikes;
    }

    public void setCantidadDislikes(int cantidadDislikes) {
        this.cantidadDislikes = cantidadDislikes;
    }


    @Override
    public String toString() {
        return 
            " titulo='" + getTitulo() + "'" +
            ", pais='" + getPais() + "'" +
            ", anio='" + getAnio() + "'" +
            ", cantidadLikes='" + getCantidadLikes() + "'" +
            ", cantidadDislikes='" + getCantidadDislikes() + "'";
    }

}
