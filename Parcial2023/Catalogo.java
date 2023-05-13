package Parcial2023;

import java.util.Vector;

public class Catalogo {
    Vector<Programa> programas;

    public Catalogo(){
        this.programas = new Vector<Programa>();
    }

    public void agregarPrograma(Programa p){
        programas.add(p);
    }

    public void listarSeriesPais(String pais){
        for (Programa programa : programas) {
            if (programa instanceof Serie) {
                if (pais.equals(programa.getPais())) {
                    System.out.println(programa.toString());
                }
            }
        }
    }

    public int cantidadPeliculasNoMegusta(){
        int contador = 0;
        for (Programa programa : programas) {
            if (programa instanceof Pelicula) {
                if (programa.getCantidadDislikes() > programa.getCantidadLikes()) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public void listarPeliculasYDocumentalesMenorDosHoras(){
        for (Programa programa : programas) {
            if (programa instanceof Pelicula) {
                Pelicula p = (Pelicula) programa; 
                if (p.getCantidadMinutos()<120) {
                    System.out.println(programa.toString());
                }
            } else if(programa instanceof Documental){
                Documental d = (Documental) programa; 
                if (d.getCantidadMinutos()<120) {
                    System.out.println(programa.toString());
                }
            }
        }
    }

    public int contarSeriesMas16Caps(){
        int contador = 0;
        for (Programa programa : programas) {
            if (programa instanceof Serie) {
                Serie s = (Serie) programa;
                if (s.getCantidadEpisodios()>16) {
                    contador++;
                }
            }
        }
        return contador;
    }
}
