package BaseDeDatos;

import java.util.Vector;

public class BasedeDatos {
    private Vector<Tabla> tablas;
    private String nombre;
    private boolean abierta;

    public BasedeDatos(){
        this.tablas = new Vector<Tabla>();
        this.nombre = nombre;
        this.abierta = false;
    }

    public BasedeDatos(String nombre){
        this.tablas = new Vector<Tabla>();
        this.nombre = nombre;
        this.abierta = false;
    }

    public Vector<Tabla> getTablas() {
        return this.tablas;
    }

    public void setTablas(Vector<Tabla> tablas) {
        this.tablas = tablas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAbierta() {
        return this.abierta;
    }

    public boolean getAbierta() {
        return this.abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public void abrir(){
        this.abierta = true;
    }
    public void cerrar(){
        this.abierta = false;
    }

    public void agregarTabla(Tabla t) throws DBException, TableException{
        if (!abierta) {
            throw new DBException("La base de datos no esta abierta");
        }

        if (tablas.contains(t)) {
            throw new TableException("Ya existe esta tabla en la base de datos");
        }

        this.tablas.add(t);
    }

    public void eliminarTabla(String n) throws DBException, TableException{
        boolean esta = false;
        Tabla t;
        if (!abierta) {
            throw new DBException("La base de datos no esta abierta");
        }
        for (int i = 0; i < this.tablas.size(); i++) {
            t = tablas.get(i);
                if (n.equals(t.getNombre())) {
                    esta = true;
                    tablas.remove(i);
                }
        }

        if (!esta) {
            throw new TableException("No existe la tabla que intenta eliminar");
        }
    }

    public void listarTablas() throws DBException{
        if (!abierta) {
            throw new DBException("La base de datos no esta abierta");
        }

        for (Tabla tabla : tablas) {
            System.out.println(tabla.toString());
        }
    }

    private int searchName(String n){
        int b = -1;
        Tabla t;
        String nombre = "";
        for (int i = 0; i< tablas.size(); i++) {
            t = tablas.get(i);
            nombre = t.getNombre();
            if (nombre.equals(n)) {
                b = i;
            }
        }
        return b;
    }
    public void renameTable(String n1, String n2) throws DBException, TableException{
        if (!abierta) {
            throw new DBException("La base de datos no esta abierta");
        }
        int posicion = searchName(n1);
        if (posicion == -1) {
            throw new TableException("No existe la tabla con ese nombre");
        }

        if (searchName(n2) != -1) {
            throw new TableException("Ya existe una tabla con ese nombre");
        }

        Tabla t = tablas.get(posicion);
        t.setNombre(n2);
    }

    public Tabla exportTable(String n) throws DBException, TableException{
        Tabla t = null;
        int posicion = searchName(n);
        if (!abierta) {
            throw new DBException("La base de datos no esta abierta");
        }

        if (posicion == -1) {
            throw new TableException("La tabla no existe");
        }

        t = tablas.get(posicion);

        return t;
    }

}
