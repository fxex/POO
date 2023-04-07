package Parcial2020;

public class TextoLibre extends Pregunta{
    private String respuesta;
    public TextoLibre(){
        super();
        this.respuesta = "";
    }

    public TextoLibre(String enun, int num, String res){
        super(enun, num);
        this.respuesta = res;
    }


    public String getRespuesta() {
        return this.respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }


    @Override
    public String toString() {
        return super.toString() +" respuesta='" + getRespuesta() + "'";
    }

}
