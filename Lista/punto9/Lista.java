package Lista.punto9;

public class Lista {
    private Nodo lista;

    public Lista(){
        this.lista = null;
    }
    public Lista(Nodo lista){
        this.lista = lista;
    }
    public void insertarElemento(Nodo n){
        if (lista == null) {
            this.lista = n;
        } else if (lista.getPotencia()< n.getPotencia()) {
            n.setSig(this.lista);
            this.lista = n;
        }else {
            Nodo puntero = this.lista;
            boolean b = false;
            while (puntero.getSig() != null && !b) {
                if (n.getPotencia()==puntero.getPotencia()) {
                    puntero.setCoeficiente(puntero.getCoeficiente() + n.getCoeficiente());
                    b = true;
                } else if (n.getPotencia()> puntero.getSig().getPotencia()){
                    n.setSig(puntero.getSig());
                    puntero.setSig(n);
                    b=true;
                } else{
                    puntero = puntero.getSig();
                }
            }
        }
    }

    public void mostrarPolinomio(){
        Nodo p = this.lista;
        while (p!=null) {
            System.out.print(p.getCoeficiente()+"x^"+p.getPotencia()+" ");
            p = p.getSig();
        }
        System.out.println();

    }
}
