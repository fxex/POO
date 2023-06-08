package Arbol;

public class Arbol {
    private Nodo raiz;

    public Arbol(){
        this.raiz = null;
    }

    public void agregarNodo(Nodo n){
        if (raiz == null) {
            this.raiz = n;
        } else {
            Nodo p = this.raiz;
            Nodo ant = null;
            boolean b = false;
            while (p != null && !b) {
                ant = p;
                if (p.getValor() < n.getValor()) {
                    p = p.getDerecha();
                } else if(p.getValor() > n.getValor()){
                    p = p.getIzquierda();
                } else {
                    b = true;
                }
            }
            if (ant.getValor()> n.getValor() && !b) {
                ant.setIzquierda(n);
            } else {
                ant.setDerecha(n);
            }
        }
    }

    public void agregarValor(int num){
        Nodo n = new Nodo(num);
        if (raiz == null) {
            this.raiz = n;
        } else {
            Nodo p = this.raiz;
            Nodo ant = null;
            boolean b = false;
            while (p != null && !b) {
                ant = p;
                if (p.getValor() < n.getValor()) {
                    p = p.getDerecha();
                } else if(p.getValor() > n.getValor()){
                    p = p.getIzquierda();
                } else {
                    b = true;
                }
            }
            if (ant.getValor()> n.getValor() && !b) {
                ant.setIzquierda(n);
            } else {
                ant.setDerecha(n);
            }
        }
    }

    public boolean buscarValor(int valor){
        boolean b = false;
        Nodo p = this.raiz;
        while (p != null && !b) {
            if (p.getValor()> valor) {
                p = p.getIzquierda();
            } else if(p.getValor() < valor){
                p = p.getDerecha();
            } else {
                b = true;
            }
        }

        return b;
    }
    public Nodo buscarNodo(int valor){
        boolean b = false;
        Nodo p = this.raiz;
        while (p != null && !b) {
            if (p.getValor()> valor) {
                p = p.getIzquierda();
            } else if(p.getValor() < valor){
                p = p.getDerecha();
            } else {
                b = true;
            }
        }

        if (b) {
            return p;
        } else {
            return null;
        }
    }

    public void vaciarArbol(){
        this.raiz = null;
    }

    public Nodo buscarPadre(int valor){
        Nodo ant = null;
        Nodo p = this.raiz;
        boolean b = false;
        while (p!=null && !b) {
            ant = p;
            if (valor > p.getValor()) {
                p = p.getDerecha();
            } else if(valor < p.getValor()){
                p = p.getIzquierda();
            } else {
                b = true;
            }
        }

        return ant;
    }

    private Nodo antecesorInmediato(Nodo eliminar){
        Nodo ant = null;
        Nodo p = eliminar.getIzquierda();
        while (p!=null) {
            ant = p;
            p = p.getDerecha();
        }
        return ant;
    }
    public void eliminarNodo(int valor){
        Nodo ant = this.buscarPadre(valor);
        Nodo p = this.buscarNodo(valor);
        if (p == null) {
            System.out.println("No existe");
        } else {
            if (p.esHoja()) {
                if (ant.getDerecha().equals(p)) {
                    ant.setDerecha(null);
                } else {
                    ant.setIzquierda(null);
                }
            } else if(p.tieneUnUnicoHijo()){
                if (ant.getDerecha().equals(p)) {
                    ant.setDerecha(p.getUnicoHijo());
                } else {
                    ant.setIzquierda(p.getUnicoHijo());
                } 
            } else {
                Nodo antecesorInmediato = this.antecesorInmediato(p);
                this.eliminarNodo(antecesorInmediato.getValor());
                if (ant.getDerecha().equals(p)) {
                    ant.setDerecha(antecesorInmediato);
                } else {
                    ant.setIzquierda(antecesorInmediato);
                } 
                antecesorInmediato.setDerecha(p.getDerecha());
                antecesorInmediato.setIzquierda(p.getIzquierda());
            }
        }
    }

    private void inorden(Nodo p){
        if (p !=null) {
            inorden(p.getIzquierda());
            System.out.println(p.getValor());
            inorden(p.getDerecha());
        }
    }
    public void mostrarInorden(){
        this.inorden(this.raiz);
    }

    private void preorden(Nodo p){
        if (p !=null) {
            System.out.println(p.getValor());
            inorden(p.getIzquierda());
            inorden(p.getDerecha());
        }
    }
    public void mostrarPreorden(){
        this.preorden(this.raiz);
    }

    private void posorden(Nodo p){
        if (p !=null) {
            inorden(p.getIzquierda());
            inorden(p.getDerecha());
            System.out.println(p.getValor());
        }
    }
    public void mostrarPosorden(){
        this.posorden(this.raiz);
    }

    private void busqueda(Nodo p,int valor){
        if (p!=null) {
            if (valor >p.getValor()) {
                busqueda(p.getDerecha(), valor);
            }else if(valor < p.getValor()){
                busqueda(p.getIzquierda(), valor);
            } else {
                System.out.println("Lo encontre");
            }
        }else{
            System.out.println("No lo encontre");
        }
    }
    public void busquedaBinaria(int valor){
        busqueda(raiz ,valor);
    }

    public void mostrarPadre(int valor){
        Nodo ant = null;
        Nodo p = this.raiz;
        boolean b = false;
        while (p!=null && !b) {
            ant = p;
            if (valor > p.getValor()) {
                p = p.getDerecha();
            } else if(valor < p.getValor()){
                p = p.getIzquierda();
            } else {
                b = true;
            }
        }

        if (ant != null) {
            System.out.println("El padre de " + valor + " es " + ant.getValor());
        } else{
            System.out.println("No tiene padre");
        }
    }

    public void mostrarHermano(int valor){
        Nodo ant = null;
        Nodo p = this.raiz;
        boolean b = false;
        while (p!=null && !b) {
            ant = p;
            if (valor > p.getValor()) {
                p = p.getDerecha();
            } else if(valor < p.getValor()){
                p = p.getIzquierda();
            } else {
                b = true;
            }
        }

        if (ant != null) {
            if (ant.getDerecha().equals(p)) {
                System.out.println("El hermano de " + valor + " es" + ant.getIzquierda().getValor());
            } else {
                System.out.println("El hermano de " + valor + " es" + ant.getDerecha().getValor());                
            }
        } else{
            System.out.println("No tiene Hermano");
        }
    }
    public int cantidadHojas(){
        return recursivoCantHojas(this.raiz);
    }

    private int recursivoCantHojas(Nodo p){
        if (p != null) {
            if (p.esHoja()) {
                return 1;
            }
            return recursivoCantHojas(p.getIzquierda()) + recursivoCantHojas(p.getDerecha());
        } else {
            return 0;
        }
    }

    public void familia(int valor){
        Nodo puntero = buscarNodo(valor);
        if (puntero.equals(raiz)) {
            System.out.println("No tiene padre ni hermano");
        }else{
            Nodo padre = buscarPadre(valor);
            System.out.println("El padre es " + padre.getValor());
            if (padre.tieneUnUnicoHijo()) {
                System.out.println("No tiene hermano");
            }else {
                if (padre.getValor()> valor) {
                    System.out.println("El hermano es " + padre.getDerecha().getValor());
                }else {
                    System.out.println("El hermano es " + padre.getIzquierda().getValor());
                }

            }

        }
    }

    // public void agregarArbol(Arbol nuevo){
    //     Nodo p = this.raiz;
    //     if (nuevo.buscarValor(p.getValor())) {
            
    //     }
    //     nuevo.agregarNodo(p);            
    //     while (p!= null) {
    //         if (p.getIzquierda() !=null) {
    //             if (!nuevo.buscarValor(p.getIzquierda().getValor())) {
    //                 nuevo.agregarNodo(p.getIzquierda());            
    //             }
    //         }
    //         if (p.getDerecha() !=null) {
    //             if (!nuevo.buscarValor(p.getDerecha().getValor())) {
    //                 nuevo.agregarNodo(p.getDerecha());
    //             }
    //         }
    //         p = p.getIzquierda();            
    //     }
    //     p = this.raiz.getDerecha();
    //     while (p!=null) {
    //         if (p.getIzquierda() !=null) {
    //             if (!nuevo.buscarValor(p.getIzquierda().getValor())) {
    //                 nuevo.agregarNodo(p.getIzquierda());            
    //             }
    //         }
    //         if (p.getDerecha() !=null) {
    //             if (!nuevo.buscarValor(p.getDerecha().getValor())) {
    //                 nuevo.agregarNodo(p.getDerecha());
    //             }
    //         }
    //         p = p.getDerecha();
    //     }
    // }

    private int sumarRecursivo(Nodo p){
        if (p!=null) {
            return p.getValor() + sumarRecursivo(p.getIzquierda()) + sumarRecursivo(p.getDerecha()); 
        } else {
            return 0;
        }
    }
    public int sumar(){
        return sumarRecursivo(this.raiz);
    }
    
    private int contarHijoIzqRecursivo(Nodo p){
        if (p==null) {
            return 0;
        } else if(p.getIzquierda()!= null){
            return 0 + contarHijoIzqRecursivo(p.getDerecha());
        } else{
            return 1 + contarHijoIzqRecursivo(p.getIzquierda()) + contarHijoIzqRecursivo(p.getDerecha());
        }
    }
    public int contarHijoIzq(){
        return contarHijoIzqRecursivo(this.raiz);
    }

    public Iterador getIterador(){
        return new Iterador(raiz);
    }

}
