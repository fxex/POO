package Persistencia.Punto1;

public class test {
    public static void main(String[] args) {
        ArchivosEnteros a = new ArchivosEnteros("data.dat");
        a.mostrarDatos();
        System.out.println();
        a.sumarDosImpares();
        a.mostrarDatos();
    }
}
