package Lista.punto7;


public class ListaLoca {
    private Nodo lista;

    public ListaLoca(){
        this.lista = null;
    }

    public ListaLoca(Nodo l){
        this.lista = l;
    }

    private int cantidad(){
        int cont = 0;
        Nodo p = this.lista;
        while (p!= null) {
            cont++;
            p = p.getSig();
        }
        return cont;
    }

    public void insertarEn(Nodo n1, int pos){
        Nodo p = this.lista;
        Nodo aux = null;
        int contador = 0;
        boolean b = false;
        if (pos > cantidad()) {
            if (n1.getInfo() < 500) {
                while (p.getSig() != null && !b) {
                    if (p.getSig().getSig() == null) {
                        n1.setSig(p.getSig());
                        p.setSig(n1);
                        b = true;
                    }
                    p = p.getSig();
                }
            } else {
                n1.setSig(p.getSig());
                p.setSig(n1);
            }
        } else {
            while (contador < pos) {
                aux = p;
                p = p.getSig();
                contador++;
            }
            n1.setSig(p);
            aux.setSig(n1);
        }
    }

    public void eliminarEn(int pos){
        Nodo p = this.lista;
        Nodo aux = null;
        int contador = 0;
        if (pos > cantidad()) {
            this.lista = this.lista.getSig();
        } else{
            while (contador < pos) {
                aux = p;
                p = p.getSig();
                contador++;
            }
            aux.setSig(p.getSig());
        }
    }

    public void mostrarListaBucle(){
        Nodo p = lista;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getSig();
        }
    }


}

