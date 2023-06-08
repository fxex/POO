package Lista.ejercicio;

public class Nodo {
    private int info;
    private Nodo sig;
    public Nodo(){
        this.info = 0;
        this.sig = null;
    }
    public Nodo(int info){
        this.info = info;
        this.sig = null;
    }
    public Nodo(int info, Nodo n){
        this.info = info;
        this.sig = n;
    }


    public int getInfo() {
        return this.info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getSig() {
        return this.sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

}
