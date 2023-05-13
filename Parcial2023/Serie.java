package Parcial2023;

public class Serie extends Programa{
    private int cantidadEpisodios;

    public Serie(){
        super();
        this.cantidadEpisodios = 0;
    }

    public Serie(String titulo, String pais, int anio, int cantidadLikes, int cantidadDislikes, int cantidadEpisodios ){
        super(titulo, pais, anio, cantidadLikes, cantidadDislikes);
        this.cantidadEpisodios = cantidadEpisodios;
    }

    public int getCantidadEpisodios() {
        return this.cantidadEpisodios;
    }

    public void setCantidadEpisodios(int cantidadEpisodios) {
        this.cantidadEpisodios = cantidadEpisodios;
    }


    @Override
    public String toString() {
        return super.toString() + " cantidadEpisodios='" + getCantidadEpisodios() + "'";
    }

}
