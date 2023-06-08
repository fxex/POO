package Lista.punto9;

public class Test {
    public static void main(String[] args) {
        Lista l = new Lista();
        Nodo n1 = new Nodo(7, 8);
        Nodo n2 = new Nodo(6,9 );
        Nodo n3 = new Nodo(9, 7);
        Nodo n4 = new Nodo(8, -3);
        Nodo n5 = new Nodo(3, 7);

        l.insertarElemento(n1);
        l.insertarElemento(n2);
        l.insertarElemento(n3);
        l.insertarElemento(n4);
        l.insertarElemento(n5);
        l.mostrarPolinomio();

    }
}
