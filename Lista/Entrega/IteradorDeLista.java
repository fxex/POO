package Lista.Entrega;

public class IteradorDeLista {
    private Nodo puntero;
    
    public IteradorDeLista(Nodo lista){
        this.puntero = lista;
    }
    
    public void proximo(){
        this.puntero = this.puntero.getSig();
    }
    
    public boolean tieneProximo(){
        return this.puntero.getSig() != null;
    }

    public int getCantidad(){
        return this.puntero.getCant();
    }
    public int getCapacidad(){
        return this.puntero.getCap();
    }

}
