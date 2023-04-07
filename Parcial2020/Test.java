package Parcial2020;

import java.util.Vector;

public class Test {
    Vector <Pregunta> parcial;
    
    public Test(){
        this.parcial = new Vector<Pregunta>();
    }

    public Test(int dim){
        parcial = new Vector<Pregunta>(dim);
    }

    public void agregarElemento(Pregunta p){
        parcial.addElement(p);
    }

    public void eliminarElemento(Pregunta p){
        for (Pregunta pregunta : parcial) {
            if (pregunta.equals(p)) {
                parcial.remove(p);
            }
        }
    }

    public int cantidadOpcionesMultiple(){
        int cant = 0;
        for (Pregunta pregunta : parcial) {
            if (pregunta instanceof OpcionMultiple) {
                cant++;
            }
        }
        return cant;
    }

    public void listarPreguntasPares(){
        for (Pregunta pregunta : parcial) {
            if (pregunta.getNumero() %2 == 0) {
                System.out.println(pregunta.toString());
            }
        }
    }
}
