package Lista.punto8;

public class Lista {
    private Nodo lista;

    public Lista(){
        this.lista = null;
    }

    public Lista(Nodo lista){
        this.lista = lista;
    }

    public void agregar(Nodo n){
        if (this.lista == null) {
            this.lista = n;
        } else if(n.getInfo()> this.lista.getInfo()){
            n.setSig(this.lista);
            this.lista = n;   
        } else {
            Nodo puntero = this.lista;
        }
    }

    public IteradorDeLista getIterador(){
        return new IteradorDeLista(lista);
    }
}
