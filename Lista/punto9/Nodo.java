package Lista.punto9;

public class Nodo {
    private int coeficiente, potencia;
    private Nodo sig;

    public Nodo(){
        this.coeficiente = 0;
        this.potencia = 0;
        this.sig = null;
    }

    public Nodo(int coeficiente, int potencia){
        this.coeficiente = coeficiente;
        this.potencia = potencia;
        this.sig = null;
    }
    
    public Nodo(int coeficiente, int potencia, Nodo sig){
        this.coeficiente = coeficiente;
        this.potencia = potencia;
        this.sig = sig;
    }


    public int getCoeficiente() {
        return this.coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public Nodo getSig() {
        return this.sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

}
