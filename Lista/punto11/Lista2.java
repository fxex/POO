package Lista.punto11;

public class Lista2 {
    private Nodo lista;
    
    public Lista2(){
        this.lista = null;
    }
    public Lista2(Nodo n){
        this.lista = n;
    }

    public void agregarElemento(Nodo n){
        if (lista == null) {
            this.lista = n;
            n.setSig(n);
        } else {
            Nodo p = this.lista;
            do {
                p = p.getSig();
            } while (!(p.getSig().equals(this.lista)));
            n.setSig(this.lista);
            p.setSig(n);
        }
    }

    public void eliminarElemento(){
        if (this.lista.equals(this.lista.getSig())) {
            this.lista = null;
        }else {
            Nodo p = lista;
            do {
                p = p.getSig();
            } while (!(p.getSig().equals(lista)));
            p.setSig(this.lista.getSig());
            this.lista = this.lista.getSig();
        }
    }
}
