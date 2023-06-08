package Arbol;

import java.util.Stack;

public class Iterador {
    private Nodo actual;
    private Stack<Nodo> siguiente;

    public Iterador(Nodo raiz){
        siguiente = new Stack<Nodo>();
        this.actual = null;
        if (raiz!=null) {
            siguiente.push(raiz);
        }
    }

    public boolean tieneProximo(){
        return (!siguiente.empty());
    }

    public void proximo(){
        if (!siguiente.empty()) {
            actual = siguiente.pop();
            if (actual.getIzquierda()!=null) {
                siguiente.push(actual.getIzquierda());
            }

            if (actual.getDerecha()!=null) {
                siguiente.push(actual.getDerecha());
            }
        }
    }

    public int getActual(){
        return actual.getValor();
    }

}
