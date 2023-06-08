package Lista.ejercicio;

public class Lista {
    private Nodo lista;
    
    public Lista(){
        this.lista = null;
    }
    public Lista(Nodo n){
        this.lista = n;
    }

    public void agregarNumero(double d){
        String numero = String.valueOf(d);
        int pos = numero.indexOf(".");
        String parteEntera = numero.substring(0, pos);
        String parteDecimal = numero.substring(pos+1);

        agregarNodo(parteEntera.length());
        if (parteEntera.length() < 2) {
            agregarNodo(Integer.parseInt(parteEntera));
        } else {
            
        }

    }

    private void agregarNodo(int valor){
        Nodo n = new Nodo(valor);
        if(lista!=null){
            lista = n;
        }else{
            Nodo p = lista;
            while (p.getSig() != null) {
                p = p.getSig();
            }
            p.setSig(n);

        }
    }
}   
