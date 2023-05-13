package Lista.punto6;


public class Lista {
    private Nodo lista;
    public Lista(){
        this.lista = null;
    }
    public Lista(Nodo nodo){
        this.lista = nodo;
    }
    
    public void agregarNodo(Nodo n){
        if (lista == null) {
            lista = n;
        }
        else if(lista.getInfo() > n.getInfo()){
            n.setSig(lista);
            lista = n;
        } else {
            Nodo puntero;
            puntero = lista;
            boolean bandera = false;
            while (!(puntero.getSig() == null) && !bandera) {
                if (puntero.getSig().getInfo() > n.getInfo()) {
                    bandera = true;
                } else{
                    puntero = puntero.getSig();
                } 
            }
            n.setSig(puntero.getSig());
            puntero.setSig(n);

        }

        
    }

    public void mostrarIndirecta(){
            Nodo puntero = lista;
            mostrar(puntero);
    }

    public void mostrarPrimero(){
        System.out.println(lista.getInfo());
    }

    private void mostrar(Nodo l){
        
        if (l != null) {
            System.out.println(l.getInfo());
            mostrar(l.getSig());
        }
    }

    public void eliminarNodo(int valor){
        Nodo puntero = lista;
        Nodo aux = null;
        boolean bandera = false;
        while(puntero.getSig()!= null && !bandera){
            if (puntero.getInfo() == valor) {
                bandera = true;
            } else{
                aux = puntero;
                puntero = puntero.getSig();   
            }
        }

        if (bandera) {
            if(aux == null){
                lista = lista.getSig();
            } else{
                aux.setSig(puntero.getSig());
            }
        }
    }

    //invertir lista
    public void invertirLista(){
        Nodo puntero = this.lista;
        invertirPrivado(puntero, null);
    }

    private void invertirPrivado(Nodo actual, Nodo anterior){
        if (actual != null) {
            invertirPrivado(actual.getSig(), actual);
            actual.setSig(anterior);
        } else {
            this.lista = anterior;
        }
    }

}
