package Lista.punto8;

public class IteradorDeLista{
    private Nodo actual;
    public IteradorDeLista(Nodo lista){
        this.actual = lista;
    }

    public boolean tieneProximo(){
        return actual.getSig() != null;
    }

    public void proximo(){
        this.actual = this.actual.getSig();
    }

    public int getActual(){
        return actual.getInfo();
    }

}