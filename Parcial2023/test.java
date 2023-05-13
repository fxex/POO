package Parcial2023;

public class test {
    public static void main(String[] args) {
        Catalogo c = new Catalogo();
        Pelicula n1 = new Pelicula("Pelicula1", null, 0, 1, 2, 60, null);
        Pelicula n2 = new Pelicula("Pelicula2", null, 0, 3, 2, 150, null);
        Pelicula n3 = new Pelicula("Pelicula3", null, 0, 0, 2, 120, null);
        Pelicula n4 = new Pelicula("Pelicula4", null, 0, 1, 5, 100, null);

        Documental d1 = new Documental("Documental1", null, 0, 0, 0, 100, null);
        Documental d2 = new Documental("Documental2", null, 0, 0, 0, 130, null);
        Documental d3 = new Documental("Documental3", null, 0, 0, 0, 60, null);

        Serie s1 = new Serie("Serie1", "Argentina", 0, 0, 0, 16);
        Serie s2 = new Serie("Serie2", "Bolivia", 0, 0, 0, 20);
        Serie s3 = new Serie("Serie3", "Uruguay", 0, 0, 0, 24);
        Serie s4 = new Serie("Serie4", "Argentina", 0, 0, 0, 10);

        c.agregarPrograma(n1);
        c.agregarPrograma(n2);
        c.agregarPrograma(n3);
        c.agregarPrograma(n4);
        c.agregarPrograma(d1);
        c.agregarPrograma(d2);
        c.agregarPrograma(d3);
        c.agregarPrograma(s1);
        c.agregarPrograma(s2);
        c.agregarPrograma(s3);
        c.agregarPrograma(s4);

        c.listarSeriesPais("Argentina");
        System.out.println(c.contarSeriesMas16Caps());
    }
}
