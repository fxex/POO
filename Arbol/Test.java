package Arbol;

public class Test {
    public static void main(String[] args) {
        Arbol a = new Arbol();
        Arbol a2 = new Arbol();
        Arbol a3 = new Arbol();
        boolean bandera = false;

        a.agregarValor(30);
        a.agregarValor(15);
        a.agregarValor(45);
        a.agregarValor(12);
        a.agregarValor(20);
        a.agregarValor(35);
        a.agregarValor(50);

        a2.agregarValor(40);
        a2.agregarValor(10);
        a2.agregarValor(3);
        a2.agregarValor(50);
        a2.agregarValor(20);
        a2.agregarValor(12);

        Iterador i1, i2;

        //Union entre dos arboles
        i1 =a.getIterador();
        while (i1.tieneProximo()) {
            i1.proximo();
            i2 = a2.getIterador();
            i2.proximo();
            bandera = false;
            while (i2.tieneProximo() && !bandera) {
                if (i1.getActual() == i2.getActual()) {
                    bandera = true;
                }
                i2.proximo();
            }
            if (!bandera) {
                a3.agregarValor(i1.getActual());
            }
        }
        i2 = a2.getIterador();
        while (i2.tieneProximo()) {
            i2.proximo();
            a3.agregarValor(i2.getActual());
        }

        a3.mostrarPreorden();


    }
}
