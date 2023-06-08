package Lista.Entrega;

public class Lista {
    private Nodo lista;
    private int cantidad;
    
    public Lista(){
        this.lista = null;
        this.cantidad = 0;
    }
    
    public Lista(Nodo n){
        this.lista = n;
        this.cantidad = 0;
    }

    public void agregarNodo(Nodo n){
        if (this.lista == null) {
            this.lista = n;
        } else {
            Nodo puntero = this.lista;
            while (puntero.getSig()!= null) {
                puntero = puntero.getSig();
            }
            puntero.setSig(n);
            this.cantidad++;
        }
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public Nodo buscarNodo(int pos){
        if (pos> this.cantidad && pos<0) {
            return null;
        } else {
            Nodo puntero = this.lista;
            int cont = 0;
            while (cont < pos) {
                cont++;
                puntero = puntero.getSig();
            }
            return puntero;
        }
    }

    public void subirPasajeros(int np){
        Nodo puntero = this.lista;
        int capacidad = puntero.getCap();
        int cantidad = puntero.getCant();
        while(puntero != null){
            if (capacidad>=(cantidad+np)) { //Pregunta si se puede subir la cantidad de pasajeros en ese vagón
                puntero.setCant(cantidad+np);
                np -= np;
                puntero = null;
            }else if(capacidad != cantidad){ //Pregunta si tiene espacio disponible ese vagón
                puntero.setCant(puntero.getCant() + capacidad-cantidad);
                np -= (capacidad-cantidad);
                puntero = puntero.getSig(); //llena el espacio que tiene y pasa al siguiente vagón
                if (puntero != null) {
                    capacidad = puntero.getCap();
                    cantidad = puntero.getCant();
                }
            } else{ 
                puntero = puntero.getSig(); //Esta lleno el vago por lo que pasa al siguiente
                if (puntero != null) {
                    capacidad = puntero.getCap();
                    cantidad = puntero.getCant();
                }
            }

        }
        if (np > 0) {
            System.out.println("Faltaron subir: " + np + " pasajeros.");
        }
    }

    public void mostrarInfo(){
        Nodo p = this.lista;
        int i = 1;
        while (p != null) {
            System.out.println("El vagon " + i + ": ");
            System.out.println("Tiene una capacidad maxima de  " + p.getCap() + " de pasajeros.");
            System.out.println("Tiene " + p.getCant() + "  pasajeros.");
            System.out.println("Faltan " + (p.getCap()-p.getCant()) + "  pasajeros.");
            System.out.println();
            p = p.getSig();
            i++;
        }
    }

    public void bajarPasajeros(int v, int np){
        Nodo p = this.buscarNodo(v);
        if (p!=null) {
            p.setCant(p.getCant()-np);
        } else{
            System.out.println("El vagón que selecciono no existe.");
        }
    }




}
