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

    public void agregarPregunta(Pregunta p){
        parcial.addElement(p);
    }

    public void eliminarPregunta(int id){
        Pregunta p;
        for (int i = 0; i < parcial.size(); i++) {
            p = parcial.get(i);
            if (p.getNumero() == id) {
                parcial.remove(i);
                i = parcial.size();
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

    public void listarPreguntasRespPares(){
        for (Pregunta pregunta : parcial) {
            if (pregunta.getNumero() %2 == 0) {
                System.out.println(pregunta.toString());
            }
        }
    }

    public void listarPreguntasRespuesta(){
        for (Pregunta pregunta : parcial) {
            System.out.println(pregunta.toString());
        }
    }

    public int cantidadPreguntasNoVF(){
        int cant = 0;
        for (Pregunta pregunta : parcial) {
            if (!(pregunta instanceof VerdaderoFalso)) {
                cant++;
            }
        }
        return cant;
    }

    public void listarRespuestasTextoLibre(){
        TextoLibre t;
        for (Pregunta pregunta : parcial) {
            if (pregunta instanceof TextoLibre) {
                t = (TextoLibre) pregunta;
                System.out.println(t.getRespuesta());
            }
        }
    }

    public void listarPreguntasRespMultiple(){
        for (Pregunta pregunta : parcial) {
            if (pregunta instanceof OpcionMultiple) {
                System.out.println(pregunta.toString());
            }
        }
    }

    public int cantidadPreguntasLibre(){
        int cant = 0;
        for (Pregunta pregunta : parcial) {
            if (pregunta instanceof TextoLibre) {
                cant++;
            }
        }
        return cant;
    }

    public void listarPreguntasRespVF(){
        for (Pregunta pregunta : parcial) {
            if (pregunta instanceof VerdaderoFalso) {
                System.out.println(pregunta.toString());
            }
        }
    }

    public void mostrarPreguntaResp(int num){
        for (Pregunta pregunta : parcial) {
            if (pregunta.getNumero() == num) {
                pregunta.toString();
            }
        }
    }
}
