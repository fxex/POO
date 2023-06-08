package Lista.ejercicio;

public class Test {
    public static void main(String[] args) {
        double d = 12.1;
        String n = String.valueOf(d);
        int pos = n.indexOf(".");
        String [] parteEntera = n.split(".");
        String parteDecimal = n.substring(pos+1);

    //    System.out.println(parteEntera[0]); -> Me da una excepcion
        System.out.println(12/10);
    }
}
