package BaseDeDatos;

public class test {
    public static void main(String[] args) {
        BasedeDatos db = new BasedeDatos("UWU");
        Tabla t1 = new Tabla("uwu1");
        Tabla t2 = new Tabla("uwu2");
        Tabla t3 = new Tabla("uwu3");
        Tabla t4 = new Tabla("uwu4");
        Tabla t5 = new Tabla("uwu5");

        db.abrir();

        try {
            db.agregarTabla(t1);
            db.agregarTabla(t2);
            db.agregarTabla(t3);
            db.agregarTabla(t4);
            db.agregarTabla(t5);
            db.listarTablas();

            db.renameTable("uwu2", "UWU2");
            db.listarTablas();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
