package Lista.punto6;

public class test {
    public static void main(String[] args) {
        Nodo n1 = new Nodo(1);
        Nodo n2 = new Nodo(2);
        Nodo n3 = new Nodo(3);

        Lista l = new Lista();
        l.agregarNodo(n1);
        l.agregarNodo(n2);
        l.agregarNodo(n3);
        
        System.out.println();
        l.invertirLista();
        l.mostrarIndirecta();
    }
}
