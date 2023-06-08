package Lista.punto11;

public class Lista {
    private Nodo lista;
    
    public Lista(){
        this.lista = null;
    }
    public Lista(Nodo n){
        this.lista = n;
    }

    public void agregarElemento(Nodo n){
        if (lista == null) {
            n.setSig(n);
            this.lista = n;
        } else {
            n.setSig(this.lista.getSig());
            this.lista.setSig(n);
            this.lista = n;
        }
    }

    public void eliminarElemento(){
        if (this.lista.equals(this.lista.getSig())) {
            this.lista = null;
        }else {
            this.lista.setSig(this.lista.getSig().getSig());
        }
    }
}
