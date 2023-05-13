package Lista.Entrega;

public class Nodo {
    private int cap, cant;
    private Nodo sig;

    public Nodo(){
        this.cap = 0;
        this.cant = 0;
        this.sig = null;
    }

    public Nodo(int cant){
        this.cap = 0;
        this.cant = cant;
        this.sig = null;
    }


    public Nodo(int cant, Nodo n){
        this.cap = 0;
        this.cant = cant;
        this.sig = n;
    }


    public int getCap() {
        return this.cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public int getCant() {
        return this.cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Nodo getSig() {
        return this.sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

}
