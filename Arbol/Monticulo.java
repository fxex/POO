package Arbol;

public class Monticulo {
    private int dim, numNodos;
    private int [] nodos;

    public Monticulo(){
        this.dim = 51;
        this.numNodos= 0;
        this.nodos = new int[this.dim];
    }

    public void insertar(int nuevo){
        if (this.numNodos < this.dim) {
            this.numNodos++;
            this.nodos[this.numNodos] = nuevo;
            restMontArriba();
        } else {
            System.out.println("El monticulo esta lleno");
        }
    }

    public int eliminar(int indice){
        int aux = nodos[indice];
        nodos[indice] = nodos[numNodos]; // rellena el hueco con la ultimo hoja
        numNodos--;
        restMontAbajo(indice);
        return aux;
    }
    public boolean estaVacio(){
        return numNodos<1;
    }

    public void restMontArriba(){
        int actual, padre, aux;
        boolean ok = false;
        actual = numNodos;
        padre = actual/2;
        while (actual>1 && !ok) {
            if (nodos[padre]>nodos[actual]) {
                ok=true;
            } else {
                aux = nodos[padre];
                nodos[padre] = nodos[actual];
                nodos[actual] = aux;
                actual = padre; 
                padre = actual/2;
            }
        }
    }

    public void restMontAbajo(int indice){
        boolean ok = false;
        int maxHijo, aux;
        int raiz = indice;

        while (raiz*2 <= numNodos && !ok) {
            if (raiz*2 == numNodos) {
                maxHijo = raiz;
            }else{
                if (nodos[raiz*2]>nodos[raiz*2+1]) {
                    maxHijo = raiz * 2;
                }else{
                    maxHijo = raiz * 2 +1;
                }
            }
            if (nodos[raiz] < nodos[maxHijo]) {
                aux = nodos[raiz];
                nodos[raiz] = nodos[maxHijo];
                nodos[maxHijo] = aux;
                raiz = maxHijo;
            }else{
                ok=true;
            }

        }
    }

    public void preorden (int indice) {
        if (indice <= numNodos){ 
        System.out.print(nodos[indice] + " ");
        preorden (indice * 2);
        preorden (indice * 2 + 1);
        }
    }

}
