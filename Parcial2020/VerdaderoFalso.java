package Parcial2020;

public class VerdaderoFalso extends Pregunta{
    private boolean verdadero;

    public VerdaderoFalso(){
        super();
        verdadero = false;
    }

    public VerdaderoFalso(String enun, int num, boolean ver){
        super(enun, num);
        verdadero = ver;
    }


    public boolean isVerdadero() {
        return this.verdadero;
    }

    public boolean getVerdadero() {
        return this.verdadero;
    }

    public void setVerdadero(boolean verdadero) {
        this.verdadero = verdadero;
    }

    public String toString(){
        if (this.verdadero) {
            return super.toString() + "/n respuesta = verdadero";
        } else {
            return super.toString() + "/n respuesta = false";
            
        }
    }

}
