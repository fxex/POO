package Arbol;

public class Nodo{
    private Nodo izquierda, derecha;
    private int valor;

    public Nodo(int valor){
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }


    public Nodo getIzquierda() {
        return this.izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return this.derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public boolean esHoja(){
        return (this.izquierda == null && this.derecha == null);
    }

    public boolean tieneUnUnicoHijo(){
        if (this.izquierda == null && this.derecha != null) {
            return true;
        } else if(this.izquierda != null && this.derecha == null){
            return true;
        } else{
            return false;
        }
    }

    public Nodo getUnicoHijo(){
        Nodo p = null;
        if (this.izquierda !=null && this.derecha == null) {
            p = this.izquierda;
        } else if(this.derecha != null && this.izquierda == null){
            p = this.derecha;
        }

        return p;
    }


}