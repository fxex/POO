package Lista.punto7;

public class ListaDesordenada {
    private Nodo lista;

    public ListaDesordenada(){
        this.lista = null;
    }

    public ListaDesordenada(Nodo l){
        this.lista = l;
    }

    public void insertarPrimero(Nodo n){
        if (lista == null) {
            lista = n;
        } else{
            n.setSig(lista);
            lista = n;
        }
    }

    public void insertarUltimo(Nodo n){
        Nodo p = lista;
        while(p != null){
            if(p.getSig() == null){
                p.setSig(n);
            }
            p = p.getSig();
        }
    }

    public void mostrarListaBucle(){
        Nodo p = lista;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getSig();
        }
        
    }

    public void mostrarListaRecursivo(){
        Nodo p = lista;
        mostrarPrivado(p);
    }

    private void mostrarPrivado(Nodo l) {
        System.out.println(l.getInfo());
        mostrarPrivado(l.getSig());
    }

    public void buscarBucle(int valor){
        boolean b = false;
        Nodo p = this.lista;
        while (p != null &&!b) {
            if (p.getInfo() == valor) {
                System.out.println("Se encontro");
                b = true;
            }
            p = p.getSig();
        }
    }

    public void buscarRecursiva(int valor){
        Nodo p = this.lista;
        buscar(valor, p, false);
    }

    private void buscar(int valor, Nodo p, boolean b){
        if (b==false) {
            if (valor == p.getInfo()) {
                b = true;
            }
            buscar(valor, p.getSig(), b);
        }else {
            System.out.println("Se encontro");
        }
    }

    public void eliminarElemento(int valor){
        boolean b = false;
        Nodo p = this.lista;
        Nodo aux= null;

        while (p.getSig() != null && !b) {
            if (p.getInfo() == valor) {
                b = true;
            } else {
                aux = p;
                p = p.getSig();
            }
        }

        if(b){
            if (aux == null) {
                this.lista = this.lista.getSig();
            } else {
                aux.setSig(p.getSig());
            }
        }
    }


}
